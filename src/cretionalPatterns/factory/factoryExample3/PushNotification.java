package cretionalPatterns.factory.factoryExample3;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending a push notification");
    }
}