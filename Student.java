public class Student extends People{
    public int studentNo;

    public Student(String name, String ssn,int studentNo) {
        super(name, ssn); // 매개값의 타입과 일치하는 부모 생성자를 호출. 만약 매개값의 타입과 일치하는 부모 생성자가 없을
        //경우 컴파일 오류 발생.
        this.studentNo = studentNo;
    }
}
