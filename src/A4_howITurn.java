

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;

     house();
     plane.teleport(688,272);
     plane.startingAngle(90);
     house();
     plane.teleport(211,643);
     plane.startingAngle(90);
     house();
     plane.teleport(812,639);
     plane.startingAngle(90);
     house();

    }
        public void tri(){ plane.move(100);
            plane.turn(120);
            plane.move(100);
            plane.turn(120);
            plane.move(100);}

    public void square(){ plane.move(100);
        plane.turn(270);
        plane.move(100);
        plane.turn(270);
        plane.move(100);
        plane.turn(270);
        plane.move(100);}
    public void house(){ square();
        plane.startingAngle(370);
        tri();}

    }



