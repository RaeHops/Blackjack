public class Player {

    public int cardsValue;
    public Card[] hand;

    public String name;
    public Boolean isPlayer;
    public  int numCards;


    //current value of cards
    //what cards yoy have - hand
    //player name
    //is dealer or player
    //Chose to hit
    //chose to stay

    public Player (){
        cardsValue = 0;
        name = "Player";
        isPlayer = true;
        hand = new Card[2];
        numCards = 0;

    }

    public void print(){




        if(isPlayer) {
            System.out.println("Hi " + name + "!");
            System.out.println("You have " + cardsValue + " points");

            //TODO: Print my hand
            for(int i = 0; i < hand.length; i++){
                hand[i].print();
            }

        }
        else{
            System.out.println("Dealer info:");
            System.out.println("the dealer has " + hand[0].value + " points.");
            hand[0].print();
        }

    }
    public void addCard( Card c){
        hand[numCards] = c;
        numCards = numCards + 1;
        cardsValue = cardsValue + c.value;

    }
}
