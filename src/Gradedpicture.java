public class Gradedpicture extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.pausetime = 0;
        plane.trailWidth = 1000;
        plane.isTrail = true;
        plane.setColor(0, 0, 200);
        plane.teleport(0,0);
        plane.move(500);


        plane.loadBackGround("flower.jpeg");
        plane.showBackGround();


        for (int y = 0; y < 225; y = y + 1) {
            for (int x = 0; x < 225; x = x + 1) {
                plane.teleport(x, y);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red >= 240 && green >= 240 && blue >= 240) {
                    plane.setPixelColor(red / 2, green, blue / 2);
                }
            }
        }

        for (int y = 0; y < 700; y = y + 50) {
            for (int x = 0; x < 800; x = x + 50) {
                plane.trailWidth = 1;
                plane.teleport(x * 5, y);
                plane.setColor(0, 50, 100);

                System.out.println("x: " + x);
                plane.square(100);

            }
        }
        for (int y = 0; y < 700; y = y + 50) {
            flower();
        }

        for(int x=0; x<700; x = x +50){
            plane.teleport(x, 606);
            house();
        }

    }
    public void flower() {
        plane.setColor(150, 255, 255);
        plane.teleport(255,(int)(Math.random()*256));

        // plane.teleport(500, 500);
        //  plane.move(500);
        plane.isTrail = true;
        plane.trailWidth = 1;
        plane.pausetime = 0;
        plane.fillCircle(1);
    }
    public void house(){
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




//for (int y=0; y < 10; y = y+1)

    //  {plane.setColor(80, 90, 80);
    // plane.fillCircle(50);
}

