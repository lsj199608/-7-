public class KumhoTire extends Tire{ //타이어 클래스 상속
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }
    @Override
    public boolean roll() {
        ++accumulatedRotation; //사용횟수를 1회 늘림, 메소드 오버로딩
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " KumhoTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " KumhoTire 펑크 ***");
            return false;
        }
    }
}
