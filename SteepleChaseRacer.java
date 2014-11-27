/**
 * A SteepleChaseRacer is a Racer that can jump over hurdles of any height.
 * 
 * @author <...>
 * @version <...>
 *
 */
public class SteepleChaseRacer extends Racer {
	
   public SteepleChaseRacer(int y) {
      super(y);
   }   

	@Override
	public void jumpRight() {
		turnLeft();
      while(!rightIsClear()) {
         move();
      }
      turnRight();
      move();
      turnRight();
      move();
      while(frontIsClear()) {
         move();
      }
      turnLeft();
	}

}
