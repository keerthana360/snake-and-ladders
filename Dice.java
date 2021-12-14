class Dice{
    public int rollDice(){
    int minimum=1;
    int maximum=6;
    int b=(int)(Math.random() * (maximum - minimum + 1) + minimum);
    return b;
}
}
