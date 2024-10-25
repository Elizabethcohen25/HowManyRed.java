import java.awt.event.KeyEvent;

public class A1_HowToMove extends World {

    public void go() {




//        System.out.println("Sushi");
//        plane.pausetime = 0;
//        plane.startingAngle(0);
//        plane.setColor(100 ,12, 50 );
//        plane.trailWidth= 9;
//        plane.isTrail = true;
//        plane.move(200);
//        plane.isTrail = false;
//        plane.move(100);
//        plane.turn(170);
//        plane.isTrail = true;
//        plane.move(200);
//        plane.circle(20);
//        plane.teleport(19,15);
//        plane.circle(20);
//        plane.teleport(106,670);
//        plane.circle(20);
//        plane.teleport(906,64);
//        plane.circle(20);
//        plane.teleport(913,729);
//        plane.circle(20);
//        plane.teleport(900,100);
//        square();
        house();
        //  triangle();
        plane.teleport(400,250);
        house();
        plane.trailWidth= plane.trailWidth+1;
        plane.teleport(600,250);
        plane.startingAngle(0);
        house();
        plane.trailWidth= plane.trailWidth+1;
        plane.teleport(800,250);
        //plane.startingAngle(0);
        house();
    }

    public void square () {
        int size= 300;
        plane.startingAngle(0);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
    }
    public void house(){
        plane.pausetime = 10;
        plane.setColor((int)(Math.random()*256),5, 5);
        //   plane.pausetime=0;
        plane.startingAngle(0);
        plane.trailWidth= 9;
        plane.isTrail=true;
        //plane.teleport(500,400);

        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);



        int roofsize = 100;
        plane.turn(30);
        plane.move(roofsize);
        plane.turn(120);
        plane.move(roofsize);
    }
    public void triangle () {
        plane.startingAngle(270);
        plane.move(90);
        plane.turn(-45);
        plane.move(90);
        plane.turn(-90);
        plane.move(70);

    }
    public void row () {
        house();
        // plane.teleport ()
        house();
        // plane.teleport(300,200)


    }
};