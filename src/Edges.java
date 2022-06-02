public class Edges {

    boolean inGame = true;
    public int[] x = new int[GameField.MAX_DOTS];
    public int[] y = new int[GameField.MAX_DOTS];
    public int dots;

    public Edges() {
        checkEdges();
    }

    public void checkEdges() {
        if(x[0]>GameField.SIZE){
            inGame = false;
        }
        if(x[0]<0){
            inGame = false;
        }
        if(y[0]>GameField.SIZE){
            inGame = false;
        }
        if(y[0]<0){
            inGame = false;
        }
    }
}
