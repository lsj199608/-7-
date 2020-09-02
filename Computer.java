public class Computer extends Calculator{
    @Override
    double areaCircle(double r) { //메소드 오버로딩. Calculator 클래스의 areaCircle 메소드를 재정의 했고, ComputerExample
        //클래스에서 실행을 하면 재정의된 메소드가 호출된다.
        System.out.println("Computer객체의 areaCircle 실행");
        return Math.PI * r * r;
    }
    int plus(int num1, int num2){
        if(num1 + num2 >=10){
            System.out.println("10 이상");
            System.out.println("자식 메소드 plus실행");
            return num1 + num2;
        }else{
            System.out.println("10이하");
            return super.plus(num1,num2); //자식 클래스 내부에서 부모메소드를 호출하려면 super 키워드를 붙여서 호출 가능
        }
    }
}
