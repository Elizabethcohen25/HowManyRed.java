public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 1;
        plane.pausetime = 0;
for(int x=0; x<800; x=x+1) {
        rowOfSquares(x);
    }
}
//        for(int x=0;x<5;x=x+1) {
//            plane.setColor(0,250,x*2);
//            plane.teleport(x*150, 50);
//            System.out.println("x: "+ x);
//            plane.square(100);
//        }
//        for(int x=0;x<5;x=x+1) {
//            plane.setColor(0,250,x*2);
//            plane.teleport(x*150, 200);
//            System.out.println("x: "+ x);
//            plane.square(100);
//        }
//        for(int x=0;x<5;x=x+1) {
//            plane.setColor(0,250,x*2);
//            plane.teleport(x*150, 350);
//            System.out.println("x: "+ x);
//            plane.square(100);
//        }




    public void rowOfSquares(int y) {
        for (int x = 0; x < 800; x = x + 1) {
            plane.setColor(0, 250, x  / 4);
            plane.teleport(x , y);
            System.out.println("x: " + x);
            plane.square(1);
        }
    }
}
