package command;

public class SMSJob implements Job{
    private SMS sms;

    public void setSms(SMS sms) {
        this.sms = sms;
    }
    @Override
    public void run() {
        if(sms != null) {
            sms.sendSMS();
        }
    }
}
