/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {
    // Put your own methods here
    
  public void setupBowling(){
  
  hop();
  turn(RIGHT);
  diagonalone();
  diagonal();
  diagonal();
  diagonal();
  turn(RIGHT);
  turn(RIGHT);
  hopHop();
  turn(RIGHT);
  hopHop();
  hopHop();
  turn(RIGHT);
  diagonal();
  diagonal();
  diagonal();
  turn(LEFT);
  hopHop();
  diagonal();
  diagonalthree();
  hop();
}




public void diagonalone(){
  
  hopPlant();
  hop();
  turn(LEFT);
}
 
public void diagonal(){
  hopPlant();
  turn(RIGHT);
  hop();
  turn(LEFT);
}

public void diagonalthree(){
  turn(RIGHT);
  hop();
  plant();
  turn(RIGHT);
  hop();
  turn(RIGHT);
  hopPlant();
}

public void hopPlant(){
  hop();
  plant();
}

public void hopHop(){
  hop();
  hop();
}
    
    
    
    
    
    

    // Do NOT touch the following code.
    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
