import java.util.Scanner;

public class Casino {

    public Card [] deck;
    public int numCardsDealt = 0;
    public Boolean isHit = false; //help us keep track of hit or stay
    public Player p;
    public Player dealer;
    public Boolean isTurn = true;
    public Scanner scan = new Scanner(System.in);
    public Boolean AnotherRound = true;

    public static void main(String[] args) {
        Casino c = new Casino();

    }

    public Casino() {
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
     //   deal();

        System.out.println("it is " + p.isPlayer + " that the player is a player.");
        System.out.println("it is " + dealer.isPlayer + " that the dealer is a player.");
        System.out.println("");

        dealer.isPlayer = false;
      //  dealer.print();


        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String Username = scan.nextLine();
        System.out.println(Username);
        p.name = Username;

        while (numCardsDealt < deck.length && AnotherRound) {

            deal();
            p.print();
            playRound();

        }

        System.out.println("The deck is exhausted. Thank you for playing!");
    }


        public void playRound() {

        dealer.print();
        p.print();
            isTurn = true;

            String descision = "";
            // stop when the user stands or when the user busts
            while (!descision.equals("stand") && p.cardsValue <= 21) {

                System.out.println();
                System.out.println("Do you want to hit or stand?");
                descision = scan.nextLine();
                if (descision.equals("hit")) {
                    isHit = true;
                    System.out.println("you decided to hit");
                } else {
                    isHit = false;
                    System.out.println("you decided to stand");
                    isTurn = false;
                }

                if (isHit) {
                    //take a card from the deck
                    //add it to hand and update value(points)
                    p.addCard(deck[numCardsDealt]);
                    numCardsDealt++;
                    p.print();

                } else {
                    isTurn = false;
                    System.out.println("");
                    System.out.println("Dealer's Turn");
                    for (int i = 0; i < dealer.hand.length; i++) {
                        dealer.hand[i].print();
                        if (dealer.cardsValue < 17) {
                            dealer.addCard(deck[numCardsDealt]);
                            numCardsDealt++;

                        }
                    }

                    System.out.println("The dealer has " + dealer.cardsValue + " points.");
                    if (dealer.cardsValue > 21 && p.cardsValue < 21) {
                        System.out.println("Dealer Bust! " + p.name + " wins!");
                    } else if (p.cardsValue > 21 && dealer.cardsValue < 21) {
                        System.out.println("Player Bust! Dealer wins!");
                    } else if (p.cardsValue > 21 && dealer.cardsValue > 21) {
                        System.out.println("Tie! Both busted");
                    }

                    if (p.cardsValue > dealer.cardsValue && p.cardsValue <= 21) {
                        System.out.println("You have a higher value, " + p.name + " wins!");

                    } else if (p.cardsValue < dealer.cardsValue && dealer.cardsValue <= 21) {
                        System.out.println("You have a lower value, dealer wins!");
                    }


                }

                Scanner scan = new Scanner(System.in);
                System.out.println("Do you want to play again?");
                String PlayAgain;
                PlayAgain = scan.nextLine();
                if (PlayAgain.equals("Yes")) {
                    resetHands();
                    AnotherRound = true;
                } else {
                    System.out.println("Good Game! I hope you had a great time at Gigi's Casino! See you next time!");
                    AnotherRound = false;
                }
            }
        }



    public void resetHands () {
        p.reset();
        dealer.reset();
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
        p.addCard(deck[numCardsDealt]);
        numCardsDealt++;
        p.addCard(deck[numCardsDealt]);
        numCardsDealt++;

        dealer.addCard(deck[numCardsDealt]);
        numCardsDealt++;
        dealer.addCard(deck[numCardsDealt]);
        numCardsDealt++;
        dealer.print();
        p.print();
       // numCardsDealt = 4;
    }



    }


