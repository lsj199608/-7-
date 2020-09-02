public class InstanceofExample {
    public static void method1(Parent parent){
        if(parent instanceof Child){ //instanceof는 부모 변수가 참조하는 객체가 부모 객체인지 자식 객체인지 확인하는 방법으로 쓰인다.
            //boolean result = 좌항(객체) instanceof 우항(타입)
            Child child = (Child) parent;
            System.out.println("method1 - child로 변환성공");
        }else{
            System.out.println("method1 - child로 변환 실패");
        }
    }
    public static void method2(Parent parent){
        Child child = (Child) parent;
        System.out.println("method2 - child 변환 성공");
    }
    public static void main(String[] args){
        Parent parentA = new Child();
        method1(parentA);
        method2(parentA);

        Parent parentB = new Parent();
        method1(parentB);
        method2(parentB); //예외발생
    }
}
