public class FolderPhone extends Phone{
    public FolderPhone(String owner){
        super(owner);
    }

    @Override
    public void ringing() {
        System.out.println("폴더폰 벨이 울림");
    }
}
