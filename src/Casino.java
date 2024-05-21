import java.util.Scanner;

public class Casino {

    public Card [] deck;
    public int numCardsDealt;
    public Boolean isHit = false; //help us keep track of hit or stay
    public Player p;
    public Player dealer;

    public static void main(String[] args) {
        Casino c = new Casino();

    }

    public Casino(){
        System.out.println("Welcome to Gigi's Casino!");
        makeDeck();

       //shuffle first
        shuffle();
        // then distribute cards
        printDeck();

        System.out.println("");
        System.out.println("");


        p = new Player();
        dealer = new Player();
        deal();

        System.out.println("it is " + p.isPlayer + " that the player is a player.");
        System.out.println("it is " + dealer.isPlayer + " that the dealer is a player.");
        System.out.println("");

        dealer.isPlayer = false;
        dealer.print();



        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String Username = scan.nextLine();
        System.out.println(Username);
        p.name = Username;
        p.print();

        System.out.println();
        System.out.println("Do you want to hit or stand?");
        String descision = scan.nextLine();
        if(descision.equals("hit")){
            isHit = true;
            System.out.println("you decided to hit");
        }else{
            isHit = false;
            System.out.println("you decided to stand");
        }

        if(isHit){
            //take a card from the deck
            //add it to hand and update value(points)
            p.addCard(deck[numCardsDealt]);
            numCardsDealt++;
            p.print();
        }else{
            //dealer has to play
            //dealer hits until 17 or greater
            //use add card to do this
        }

    }

    public void makeDeck(){
        deck = new Card[52];
        int count = 0;


        //fill our deck with cards
        for(int t = 0; t < 13; t++){
            for(int s = 0; s < 4; s++){
                deck[count] = new Card(t, s);
                deck[count].print();
                count++;

            }
        }
    }

    public void shuffle(){
        //for loop
        for(int x = 0; x < 52; x++){
            //grab random card and swap with current index (x)
            int randomIndex = (int)(Math.random()* 52); //generate 0-51
            Card randomCard = deck[randomIndex];

            //swap
            Card temp = deck[x];
            deck[x] = randomCard;
            deck[randomIndex] = temp;
        }
    }

        public void printDeck(){
        for (int i = 0; i<deck.length; i++){
            deck[i].print();
            }
        }
    public void deal(){
        //first and second card to player
//        p.hand[0] = deck[0];
//        p.hand[1] = deck [1];
        p.addCard(deck[0]);
        p.addCard(deck[1]);

        dealer.addCard(deck[2]);
        dealer.addCard(deck[3]);
        numCardsDealt = 4;
    }



    }


