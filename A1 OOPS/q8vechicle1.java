package Assignment1;

interface Vehicle {
 void accelerate();
 void brake();
}

class car1 implements Vehicle {
 @Override
 public void accelerate() {
     System.out.println("Car accelerating...");
 }

 @Override
 public void brake() {
     System.out.println("Car braking...");
 }

 public void accelerate(int speed) {
     System.out.println("Car accelerating at speed: " + speed);
 }

 public void accelerate(int speed, int duration) {
     System.out.println("Car accelerating at speed: " + speed + " for duration: " + duration + " seconds");
 }
}

class Bicycle implements Vehicle {
 @Override
 public void accelerate() {
     System.out.println("Bicycle pedaling faster...");
 }

 @Override
 public void brake() {
     System.out.println("Bicycle applying brakes...");
 }

 public void accelerate(int speed) {
     System.out.println("Bicycle pedaling faster at speed: " + speed);
 }//Vehicle interface

 public void accelerate(int speed, int duration) {
     System.out.println("Bicycle pedaling faster at speed: " + speed + " for duration: " + duration + " seconds");
 }
}

public class q8vechicle1 {
 public static void main(String[] args) {
     car1 car = new car1();
     Bicycle bicycle = new Bicycle();

     car.accelerate();
     car.brake();
     System.out.println();
     bicycle.accelerate();
     bicycle.brake();
     System.out.println();

     car.accelerate(30);
     car.accelerate(60, 5);
     System.out.println();
     bicycle.accelerate(10);
     bicycle.accelerate(20, 3);
 }
}