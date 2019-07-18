package Ex200.CardGame;

public class Card {
    private String cardVal;

    public String getCardVal(){
        return cardVal;
    }

    public Card(){
        int suit = (int)(Math.random()*CardUtil.SUIT.length);
        int valu = (int)(Math.random()*CardUtil.VALU.length);
        cardVal = CardUtil.SUIT[suit]+CardUtil.VALU[valu];
    }

    public Card(String s){
        this.cardVal = s;
    }
    public Card(Card c){
        this.cardVal = c.cardVal;
    }
    @Override
    public String toString(){
        return "["+cardVal+"]";
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime*result+((cardVal ==null)?0:cardVal.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        Card cb = (Card)obj;
        if (cardVal.equals(cb.getCardVal())) {
            return true;
        }else {
            return false;
        }
    }
}
