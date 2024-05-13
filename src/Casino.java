import java.util.Scanner;

public class Casino {

    public Card [] deck;
    public Boolean isHit = false; //help us keep track of hit or stay

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

        Player p = new Player();
        p.print();

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String Username = scan.nextLine();
        System.out.println(Username);
        p.name = Username;
        p.print();

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
        p.hand deck[0];



    }

    }


