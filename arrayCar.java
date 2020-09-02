public class arrayCar {
    Tire[] tires = {new Tire("앞 왼쪽",6), new Tire("앞 오른쪽",2),
            new Tire("뒤 왼쪽",3), new Tire("뒤 오른쪽",4)};
    //앞 왼쪽 타이어부터 뒤 오른쪽 타이어까지 차례로 0~3으로 배열을 지정한다.
    int run(){
        System.out.println("자동차가 달린다");
        for(int i=0; i< tires.length; i++){
            if(tires[i].roll()==false){
                stop(); return (i+1); // 0부터 시작하므로 i+1 을 해준다.
            }
        }
        return 0;
    }
    void stop() {
        System.out.println("자동차가 멈춘다");
    }
}
