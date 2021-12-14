class Player{
    private int playerPos;
    private String playerName;
    public Player(int playerPos,String playerName){
        this.playerPos=playerPos;
        this.playerName=playerName;
    }
    public int getPlayerPos(){
        return playerPos;
    }
    public String getPlayerName(){
        return playerName;
    }
    public void setPlayerPos(int value){
        playerPos = value;
    }
}

