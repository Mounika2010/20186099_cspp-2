public class CardCatalog {

	int maxcards;
	int size;
	Card[] cards;
	

	CardCatalog(int maxcards) {
		this.maxcards = 0;
		cards = new Card[10];
		size = 0;

	}

	public int addACard(Card c1) {
		for (int i = 0; i < cards.length; i++) {
			if(cards[i] == null) {
				c1.toString();
				cards[i] = c1;
				size++;
				return i;
			}			
		}
		return -1;

	}

	public Card getCardByTitle(String bookTitle) {
		for (int i = 0; i < size; i++) {
			
			if (cards[i].getTitle().equals(bookTitle)) {
				return cards[i];
				
			}
		}
		return null;
	}

	public int sizeOfCatalog() {
		return size;
	}

	public void removeCard(String bookTitle) {
		for (int i = 0; i < size; i++) {
			if(cards[i] != null) {
				if (cards[i].getTitle().equals(bookTitle)) {
					cards[i] = null;
					size--;
				}

			}
		}
	}

	public void clear() {
		size = 0;
	}
}