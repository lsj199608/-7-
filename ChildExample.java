public class ChildExample { //강제타입 변환의 형식은 자식클래스 변수 = (자식클래스) 부모클래스 타입;
    public static void main(String[] args){
        Parent parent = new Child(); // 자동 타입 변환
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        /*parent.field2 = "data2"; //child 클래스에 있는 변수이기 때문에 불가능하다.
        parent.method3();*/

        Child child = (Child) parent; //강제 타입 변환
        child.field2 = "yyy";
        child.method3();
    }
}
