public class HankookTire extends Tire{ //타이어 클래스를 상속
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() { //메소드 오버로딩
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation){
            System.out.println(location + " HankookTire 수명 : "+(maxRotation - accumulatedRotation) + "회");
            return true;
        }else{
            System.out.println("*** "+location + " HankookTire 펑크 ***");
            return false;
        }
    }
}
