public class DMBCellPhoneExample {
    public static void main(String[] args){
        DmbCellphone DmbCellPhone = new DmbCellphone("자바폰","검정",10);

        System.out.println("모델 : "+DmbCellPhone.model);
        System.out.println("색깔 : "+DmbCellPhone.color);

        System.out.println("채널 : "+ DmbCellPhone.channel);

        DmbCellPhone.powerOn();
        DmbCellPhone.bell();
        DmbCellPhone.sendVoice("여보세요");
        DmbCellPhone.turnOnDmb();
        DmbCellPhone.changeChannelDmb(15);
        DmbCellPhone.turnOffDmb();
    }
}
