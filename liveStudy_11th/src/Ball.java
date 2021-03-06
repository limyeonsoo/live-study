
interface Moveable{
    int move();
    int stop();
}

class Ball implements Moveable {
    int move(){
        System.out.println("공이 움직여요");
    }
    int stop(){
        System.out.println("공이 멈ㅇ춘다");
    }
}
