public class SmartPhone extends Phone{
    public SmartPhone(String owner){
        super(owner);
    }
    public void internetSearch(){
        System.out.println("인터넷 검색을 합니다");
    }

    @Override
    public void ringing() {
        System.out.println("스마트폰 벨이울림");
    }
}
