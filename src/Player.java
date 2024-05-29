public class Player {

    public int cardsValue;
    public Card[] hand;

    public String name;
    public Boolean isPlayer;
    public  int numCards;
    public boolean dealerTurn;


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
            System.out.println("You have " + cardsValue + " points.");

            //TODO: Print my hand
            for(int i = 0; i < hand.length; i++){
                hand[i].print();
            }
            if (cardsValue>21){
                System.out.println("Bust!");
                isPlayer = false;
            }

        }
        else{

                System.out.println("Dealer info:");
                System.out.println("the dealer has " + hand[0].value + " points.");
                hand[0].print();


        }

        if(dealerTurn == true){
            System.out.println("the dealer has " + cardsValue + " points.");

        }

    }
    public void addCard( Card c){
        if(numCards>=2){
            //TODO: make an array that is 1 larger than the hand array
            Card [] moreCards = new Card[hand.length + 1];
            //TODO: copy over all the values in hand array to the new array.
            for(int i = 0; i < hand.length; i++){
                moreCards[i] = hand[i];
            }
            hand = moreCards;
        }

        hand[numCards] = c;
        numCards = numCards + 1;
        cardsValue = cardsValue + c.value;


    }

//    public void dealerTurn(){
//        if(isPlayer = false){
//            hand = new Card[4];
//            System.out.println("the dealer has " + hand[3+4].value+ " points.");
//        }
//    }
}
