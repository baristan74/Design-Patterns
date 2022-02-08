package cretionalPatterns.factory.factoryExample3;

public class Client {
    public static void main(String[] args) {
        NotificationFactory notificationFactory= new NotificationFactory();
        Notification notification = notificationFactory.createNatification("SMS");
        notification.notifyUser();
    }
}
