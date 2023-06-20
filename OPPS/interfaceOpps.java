package OPPS;

public class interfaceOpps {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();
    }
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("Queen : up,down,left,right,diagonal(In all 4 direction");
    }
}
class King implements chessPlayer{
    public void moves(){
        System.out.println("King : up,down,left,right,diagonal(In 1 direction");
    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("Rook : up,down,left,right");
    }
}
