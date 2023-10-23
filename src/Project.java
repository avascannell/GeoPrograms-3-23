public class Project extends World {
    public void go() {
        plane.trailWidth=15;
        plane.setColor(255, 0, 0);
      clam();
      plane.teleport(387,717);
      plane.setColor(255,0,0);
      clam();




    }

    public void clam(){
        plane.isTrail= false;
        plane.pausetime= 0;
        plane.turn(430);
        plane.move(200);
        plane.turn(400);
        plane.move(200);
        plane.isTrail=true;
        plane.circle(.005);
        plane.isTrail= false;
        plane.turn(90);
        plane.move(155);
        plane.isTrail=true;
        plane.circle(.005);
        plane.isTrail=false;
        plane.turn(35);
        plane.move(148);
        plane.isTrail=true;
        plane.circle(.005);
        plane.isTrail=false;
        plane.turn(55);
        plane.move(157);
        plane.isTrail=true;
        plane.circle(.005);
       plane.isTrail=false;
       plane.turn(25);
       plane.move(139);
       plane.isTrail= true;
       plane.circle(.005);
       plane.isTrail=false;
       plane.turn(100);
       plane.move(113);
       plane.isTrail=true;
       plane.move(160);
       plane.turn(70);
       plane.move(160);


    }
}
