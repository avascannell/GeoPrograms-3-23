public class Project extends World {

        public int red=100;
        public int blue=0;
        public int green=0;
        public int row;

        public void go() {


                if(red < 255 && green < 255 && blue < 255){
                       red=255;
                       green=255;
                       blue=255;
                        plane.setPixelColor(red, green, blue);

                }
                plane.trailWidth = 10;
                clam();
        }
                public void clam() {
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








                }







