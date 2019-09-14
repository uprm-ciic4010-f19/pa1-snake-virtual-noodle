package Game.Entities.Static;

import Main.Handler;

/**
 * Created by AlexVR on 7/2/2018.
 */
public class Apple {

    private Handler handler;

    public int xCoord;
    public int yCoord;
    public static boolean isHealthy = true;

    public Apple(Handler handler,int x, int y){
        this.handler=handler;
        this.xCoord=x;
        this.yCoord=y;
    }
    // sets the apple as healthy
    public static boolean isHealthy() {
    	return isHealthy;
    }
    static void setHealthy(boolean isGood) {
    	 isHealthy = isGood;
    }
}
