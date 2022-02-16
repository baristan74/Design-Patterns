package creationalPatterns.factory.factoryExample3;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an Sms notification");
    }
}
