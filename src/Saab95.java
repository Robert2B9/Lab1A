import java.awt.*;

/**
 * A type of Car named Saab95
 */
public class Saab95 extends Car{
    /**
     * Determines if the turbo is on or off
     */
    private boolean turboOn;

    /**
     *Creates a Saab95
     */
    public Saab95(){
        super (2,125,Color.red, "Saab95",6);
    }
    /**
     * turns on the turbo
     */
    public void setTurboOn(){
	    turboOn = true;
    }
    /**
     * turns off the turbo
     */
    public void setTurboOff(){
	    turboOn = false;
    }

    /**
     * Sets the speedFactor used in modifying the current speed
     * @return returns the speedFactor
     */
    protected double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

}
