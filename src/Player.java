public class Player {

    public int cardsValue;
    public Card[] hand;

    public String name;
    public Boolean isPlayer;


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

    }

    public void print(){

        //TODO: Print my hand
        if(isPlayer) {
            System.out.println("Hi " + name + "!");
            System.out.println("You have " + cardsValue + " points");
        }
        else{
            System.out.println("Dealer info");
        }
    }

}
