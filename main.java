import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int endingPoint = sc.nextInt();
        sc.nextLine();
        System.out.println("No of Snakes:");
        HashMap<Integer,Integer> snake = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String [] s=sc.nextLine().split(" ");
            snake.put(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
        }
        System.out.println("No of Ladders:");
        HashMap<Integer,Integer> ladder = new HashMap<>();
        int p = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<p; i++){
            String [] l=sc.nextLine().split(" ");
            ladder.put(Integer.parseInt(l[0]),Integer.parseInt(l[1]));
        }
        System.out.println("No of Players:");
        Queue<Player> playerTurn = new LinkedList<>();
        int k = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<k; i++){
            String name = sc.nextLine();
            Player p2=new Player(0,name);
            playerTurn.add(p2);
        }
        Dice dice=new Dice();
        Board b = new Board(1,endingPoint,dice,snake,ladder,playerTurn);
        b.game();
    }
}
