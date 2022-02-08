package cretionalPatterns.factory.factoryExample3;

public class NotificationFactory {
    public Notification createNatification(String channel){
        if(channel == null || channel.isEmpty())
            return null;
        if ("SMS".equals(channel)) {
            return new SmsNotification();
        }
        else if ("EMAIL".equals(channel)) {
            return new EmailNotification();
        }
        else if ("PUSH".equals(channel)) {
            return new PushNotification();
        }
        return null;
    }
}
