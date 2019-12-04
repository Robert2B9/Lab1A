import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class CarTest {
    enum DIRECTION {
        NORTH, SOUTH, WEST, EAST
    }

    @Test
    public void getDir() {
        Saab95 car = new Saab95();
        assertTrue(car.getDir() == Car.DIRECTION.NORTH);
    }

    @Test
    public void getNrDoors() {
        Saab95 car = new Saab95();
        assertTrue(car.getNrDoors() == 2);
    }

    @Test
    public void getEnginePower() {
        Saab95 car = new Saab95();
        assertTrue(car.getEnginePower() == 125);
    }

    @Test
    public void getCurrentSpeed() {
        Saab95 car = new Saab95();
        assertTrue(car.getCurrentSpeed() == 0);
    }

    @Test
    public void getColor() {
        Saab95 car = new Saab95();
        assertTrue(car.getColor() == Color.red);
    }

    @Test
    public void setColor() {
        Saab95 car = new Saab95();
        car.setColor(Color.pink);
        assertTrue(car.getColor() == Color.pink);
    }

    @Test
    public void startEngine() {
        Saab95 car = new Saab95();
        car.startEngine();
        assertTrue(car.getCurrentSpeed() == 0.1);
    }

    @Test
    public void stopEngine() {
        Saab95 car = new Saab95();
        car.startEngine();
        car.stopEngine();
        assertTrue(car.getCurrentSpeed() == 0);
    }

    @Test
    public void speedFactor() {
        Saab95 car = new Saab95();
        assertTrue(car.speedFactor() == car.getEnginePower() * 0.01 * 1);
    }

    @Test
    public void getyPos(){
        Saab95 car = new Saab95();
        assertTrue(car.getyPos() == 0);
    }

    @Test
    public void getxPos(){
        Saab95 car = new Saab95();
        assertTrue(car.getxPos() == 0);
    }

    @Test
    public void move() {
        Saab95 car = new Saab95();
        car.move();
         assertTrue(car.getyPos() == car.getCurrentSpeed());
    }

    @Test
    public void turnLeft() {
        Saab95 car = new Saab95();
        car.turnLeft();
        assertTrue(car.getDir() == Car.DIRECTION.WEST);
    }

    @Test
    public void turnRight() {
        Saab95 car = new Saab95();
        car.turnRight();
        assertTrue(car.getDir() == Car.DIRECTION.EAST);
    }

    @Test
    public void gas() {
        Saab95 car = new Saab95();
        car.startEngine();
        car.gas(1);
        assertTrue(car.getCurrentSpeed() == 1.35);

    }

    @Test
    public void brake() {
        Saab95 car = new Saab95();
        car.startEngine();
        car.gas(1);
        car.brake(0.5);
        assertTrue(car.getCurrentSpeed() == (1.35 - 1.25*0.5));
    }

    @Test
    public void changeAngle(){
        Scania car = new Scania();
        car.changeAngle(50);
        assertTrue(car.getBedAngle() >= 50);
    }
}