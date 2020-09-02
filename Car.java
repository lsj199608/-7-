public class Car {
    Tire frontLeftTire = new Tire("앞왼쪽",6);
    Tire frontRightTire = new Tire("앞오른쪽",2);
    Tire backLeftTire = new Tire("뒤왼쪽",3);
    Tire backRightTire = new Tire("뒤오른쪽",4);

    int run(){
        System.out.println("자동차가 달린다");
        if(frontLeftTire.roll()==false){
            stop(); return 1; //앞 왼쪽 = 1(CarExample클래스의 case 1)
        }
        if(frontRightTire.roll()==false){
            stop(); return 2; //앞 오른쪽 = 2(CarExample클래스의 case 2)
        }
        if(backLeftTire.roll()==false){
            stop(); return 3;
        }
        if(backRightTire.roll()==false){
            stop(); return 4;
        }
        return 0;
    }
    void stop(){
        System.out.println("자동차가 멈춘다");
    }
}
