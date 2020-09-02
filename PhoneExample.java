public class PhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
        smartPhone.ringing();
        System.out.println("=======================");

        FolderPhone folderPhone = new FolderPhone("아버지를 아버지라 부르지 못하고");
        folderPhone.ringing();
        System.out.println("=======================");

        Phone phone;
        phone = new SmartPhone("홍길동"); //자동 타입 변환
        phone.ringing(); //재정의된 메소드 호출
        phone = new FolderPhone("아버지를 아버지라 부르지 못하고"); //자동 타입 변환
        phone.ringing();
        System.out.println("=======================");

        PhoneRinging(new SmartPhone("홍길동"));
        PhoneRinging(new FolderPhone("아버지를 아버지라 부르지 못하고"));
    }
    public static void PhoneRinging(Phone phone){
        phone.ringing();
    }
}
