package Ex200.CardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardCase {
    private List<Card> cards = new ArrayList<>();

    public CardCase() {
        cards.clear(); //내용지우기
    }

    //List 반환
    public List<Card> getCards() {
        return cards;
    }

    //List에 저장된Card의 개수
    public int count() {
        return cards.size(); //저장된 card의 개수
    }

    //List의 index번째 Card
    public Card getCard(int index) {
        return cards.get(index);
    }

    //서로 다른 카드20장 만들기
    public void make() {
        cards.clear();
        int suit = CardUtil.SUIT.length; //2
        int valu = CardUtil.VALU.length; //10
        int count = 0;
        //서로 다른 20개의 카드를 만든다.
        while (count != valu * suit) {
            Card c = new Card();
            if (!cards.contains(c)) {
                cards.add(c);
                count++;
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void print() {
        int valu = CardUtil.VALU.length;
        for (int i = 0; i < cards.size(); i++) {
            Card c = cards.get(i);
            System.out.print(c.toString());
            if ((i + 1) % valu == 0) {
                System.out.println();
            }
        }
    }

    public void sort() {
        cards.sort(new CardComp());
        //Collections.sort(cards,new CardComp());
    }

    public void rsort() {
        cards.sort(new CardRomp());
        //Collections.sort(cards,new CardRomp());
    }
}
