package main.java.org.example.observerPattern.observer;

import main.java.org.example.observerPattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StockObservable observable;


    public EmailAlertObserverImpl(String mail, StockObservable stockObservable) {
        this.emailId = mail;
        this.observable = stockObservable;
    }

    @Override
    public void update() {
        sendMail(emailId, "product is in stock hurry up!");
    }

    private void sendMail(String emailId, String message) {
        System.out.println("mail sent to:" + emailId + message);
    }
}
