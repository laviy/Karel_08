/**
 * A BoxTopRacer is a Racer that can jump over hurdles of any width.
 * 
 * @author <...>
 * @version <...>
 *
 */
public class BoxTopRacer extends Racer {
	
	public BoxTopRacer(int y) {
      super(y);
	}
	
	@Override
	public void jumpRight() {
		int m = 0;
      turnLeft();
      while(!rightIsClear()) {
         move();
         m++;
      }
      turnRight();
      move();
      while(!rightIsClear()) {
         move();
      }
      turnRight();
      for(int k=0; k < m; k++) 
         move();
      turnLeft();
	}

}
