public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.startingAngle(90);
        plane.trailWidth = 10;
        // plane.isTrail=true;
        plane.pausetime = 0;

        for (int x = 10; x < 20; x = x + 1) {
            System.out.println(x);
            plane.setColor(x * 10, 5 / 10, 0);

            for (int a = 10; a > 0; a--) {
                System.out.println("hi");
                //plane.setColor(x * 10, 5 / 10, 0);
                //for (int j = 1; j < 10; j = j + 1) {
                    plane.setColor (a*15, 40, 255/x);
                    //plane.setColor(x * 10, 5 / 10, 0);
                    //plane.teleport(plane.xpos + 40, 300);
                    plane.teleport(a * 20, x * 20);
                    plane.square(20);

                    for (int i=0; i<5; i++){
                        //System.out.println("Sprint " + i);
                    for (int h=0;h<15; h++){
                        System.out.println("pushyup " + h);
                    }
                        System.out.println("Sprint " + i);

                    }

                }


            }
        }
    }



