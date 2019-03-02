class Item {
	String product;
	int quantity;
	double price;

	Item(String product, String quantity, String price) {
		this.product = product;
		this.quantity = Integer.parseInt(quantity);
		this.price = Double.parseDouble(price);
	}

	Item(String product, String quantity) {
		this.product = product;
		this.quantity = Integer.parseInt(quantity);
	}

	public String toString() {
		return this.product + "," + this.quantity + "," + this.price;
	}
}

class ShoppingCart {
	Item[] catalogue;
	Item[] cart;
	int catalogueSize;
	int cartSize;
    String[] validCoupons = {"IND10","IND20","IND30","IND50"};
	double discount = 0.0;
	boolean couponApplied = false;

	ShoppingCart(){
		catalogue = new Item[20];
		cart = new Item[20];
		catalogueSize = 0;
		cartSize = 0;
	}

	public void addToCatalog(Item item) {
		catalogue[catalogueSize++] = item;
	}

	void addToCart(Item item) {
        if (!inCart(item)) {
            if (checkCatalog(item)) {
                cart[cartSize++] = item;
            }
        }
    }
    boolean inCart(Item item) {
        for (Item s : cart) {
            if (s != null) {
                if (s.equals(item)) {
                    s.quantity = s.quantity + item.quantity;
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkCatalog(Item given) {
        for(Item i : catalogue) {
            if (i != null) {
                if (i.equals(given)) {
                    if (given.quantity <= i.quantity) {
                        i.quantity = i.quantity - given.quantity;
                        return true;
                    }

                }
            }
        }
        return false;
    }


	public double getTotalAmount() {
		double total = 0;
		for (int i = 0; i < cartSize; i++){
			total += cart[i].quantity * getPrice(cart[i]);
		}
		return total;
	}

	public double getPrice(Item item) {
		for (int i = 0; i < catalogue.length; i++) {
			if (catalogue[i].equals(item)) {
				return catalogue[i].price;
			}
		}
		return 0.0;
	}

	public void removeFromCart(Item itemToremove){
		for (int i = 0; i < cart.length; i++) {
			if (itemToremove.equals(cart[i])) {
				cart[i].quantity = cart[i].quantity - itemToremove.quantity;
			}
		}
	}

	public void showCatalog() {
		for (Item each : catalogue) {
			if (each != null) {
				System.out.println(each);
			}
		}
	}

	public void showCart() {
		for (Item e : cart) {
			if (e != null) {
				if(e.quantity != 0) {
					System.out.println(e.product + " " + e.price);
				}
			}
		}
	}

	public void applyCoupon(String coupon){
		boolean valid = false;
		for (String s: validCoupons) {
			if (s.equals(coupon)) {
				valid = true;
			}
		}
		if (!valid) {
			System.out.println("Invalid coupon");
			return;
		}
		if (couponApplied) {
			return;
		}
		for (String s : validCoupons) {
			int n = Integer.parseInt(coupon.substring(3));
			discount = getTotalAmount()/100 * n;
			couponApplied = true;
		}
	}

	public void printInvoice() {
		System.out.println("Name   quantity   Price");
		for (Item s : cart) {
			if (s != null) {
				if (s.quantity != 0) {
					System.out.println(s.product+" "+s.quantity+getPrice(s));
				}
			}
		}

		double total = getTotalAmount();
		double newTotal = total - discount;
		double tax = newTotal * 15/100;
		System.out.println("Total:" + getTotalAmount());
		System.out.println("Disc%:" + discount);
		System.out.println("Tax:" + tax);
		System.out.println("Payable Amount:" + getPayableAmount());
	}

	public double getPayableAmount() {
		double total = getTotalAmount();
		double newTotal = total - total;
		double tax = newTotal *15/100;
		return newTotal + tax;
	}
}

