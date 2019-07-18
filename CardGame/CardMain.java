package Ex200.CardGame;

public class CardMain {
    public static void main(String[] args) {

        for (int i = 0; i <CardUtil.SUIT.length ; i++) {
            for (int j = 0; j <CardUtil.VALU.length ; j++) {
                Card card = new Card();
                System.out.print(card.toString()+"\t");
            }
            System.out.println();
        }

    }
}
