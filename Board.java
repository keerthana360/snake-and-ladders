class Board{
    private int startingPoint;
    private int endingPoint;
    private Dice dice;
    private HashMap<Integer,Integer> snakePos;
    private HashMap<Integer,Integer> ladderPos;
    private Queue<Player> playerTurn;
    public Board(int startingPoint,int endingPoint,Dice dice,HashMap<Integer,Integer> snakePos,HashMap<Integer,Integer> ladderPos,Queue<Player> playerTurn){
        this.startingPoint=startingPoint;
        this.endingPoint=endingPoint;
        this.dice=dice;
        this.snakePos=snakePos;
        this.ladderPos=ladderPos;
        this.playerTurn=playerTurn;
    }
    public void game(){
        int i=0;
        while(i==0){
        Player p1=playerTurn.poll();
        int oldPos=p1.getPlayerPos();
        int newPos=oldPos+dice.rollDice();
        if(newPos==endingPoint){
            System.out.println(p1.getPlayerName()+" "+"Won the Game");
            break;
        }
        else if(snakePos.containsKey(newPos)){
            newPos = newPos-snakePos.get(newPos);
            System.out.println(p1.getPlayerName()+" "+oldPos+" "+newPos);
            p1.setPlayerPos(newPos);
        }
        else if(ladderPos.containsKey(newPos)){
            newPos = newPos+ladderPos.get(newPos);
            System.out.println(p1.getPlayerName()+" "+oldPos+" "+newPos);
            p1.setPlayerPos(newPos);
        }
        else if(newPos>endingPoint){
            System.out.println(p1.getPlayerName()+" Try Again");
        }
        else{
            System.out.println(p1.getPlayerName()+" "+oldPos+" "+newPos);
            p1.setPlayerPos(newPos);
        }
        playerTurn.add(p1);
       }
    }
}
