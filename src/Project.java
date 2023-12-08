public class Project extends World {

        public int red=100;
        public int blue=0;
        public int green=0;
        public int row;

        public void go() {
                for(int x=0;x<1000;x++) {
                        for(int y=0;y<800;y++){
                                plane.teleport(x,800-y);
                        plane.setPixelColor(0,0,y/4 +50);
                        }
                }


                if(red < 255 && green < 255 && blue < 255){
                       red=255;
                       green=255;
                       blue=255;
                        plane.setPixelColor(red, green, blue);

                }
                plane.trailWidth = 10;
                clam();


                for(int x=0;x<10;x++){
                        plane.teleport((int)(Math.random()*1000), (int)(Math.random()*800));
                        plane.setColor((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));


                        fish();
                }

                        plane.teleport(572, 355);
                fish();
                plane.teleport(80, 400);
                fish();
                plane.teleport(728, 71);
                fish();

        }
                public void clam() {
                plane.teleport(191,184);
                plane.setColor(0,0,0);
                        plane.isTrail = false;
                        plane.pausetime = 0;
                        plane.turn(430);
                        plane.move(200);
                        plane.turn(400);
                        plane.move(200);
                        plane.isTrail = true;
                        plane.circle(.005);
                        plane.isTrail = false;
                        plane.turn(90);
                        plane.move(155);
                        plane.isTrail = true;
                        plane.circle(.005);
                        plane.isTrail = false;
                        plane.turn(35);
                        plane.move(148);
                        plane.isTrail = true;
                        plane.circle(.005);
                        plane.isTrail = false;
                        plane.turn(55);
                        plane.move(157);
                        plane.isTrail = true;
                        plane.circle(.005);
                        plane.isTrail = false;
                        plane.turn(25);
                        plane.move(139);
                        plane.isTrail = true;
                        plane.circle(.005);
                        plane.isTrail = false;
                        plane.turn(100);
                        plane.move(113);
                        plane.isTrail = true;
                        plane.move(160);
                        plane.turn(70);
                        plane.move(160);

                        red = plane.howMuchRed();
                        green = plane.howMuchGreen();
                        blue = plane.howMuchBlue();
                        plane.teleport(-15,488);
                        plane.trailWidth=40;
                        for(int x=0;x<10;x++) {
                                for(int y=0;y<2;y++){
                                        plane.startingAngle(45);
                                        plane.move(100);
                                        plane.turn(90);
                                        plane.move(100);
                                        plane.turn(270);
                                }
                         plane.trailWidth=plane.trailWidth-5;
                        }
        }
        public void fish(){
                plane.isTrail = true;
                plane.trailWidth = 10;
                plane.startingAngle(90);
                plane.circle(30);
                plane.startingAngle(200);
                plane.triangle(70);
        }









                }








