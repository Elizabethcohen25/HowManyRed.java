public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("flower.jpeg");
        plane.showBackGround();

        for (int y = 0; y < 432; y = y + 1) {
            for (int x = 0; x < 1000; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(x, 488 - y);
               // if (red == 228 && green== 36 && blue== 36 ) {
                    plane.setPixelColor(red / 2, green, blue/2);
                //}
              
            }
        }
    }
}


