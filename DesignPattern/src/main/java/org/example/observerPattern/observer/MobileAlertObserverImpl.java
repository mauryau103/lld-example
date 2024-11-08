package main.java.org.example.observerPattern.observer;

import main.java.org.example.observerPattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String username;
    StockObservable observable;

    public MobileAlertObserverImpl(String username, StockObservable stockObservable) {
        this.username = username;
        this.observable = stockObservable;
    }

    @Override
    public void update() {
        sendMail(username, "product is in stock hurry up!");
    }

    private void sendMail(String username, String message) {
        System.out.println("mail sent to:" + username + message);
    }
}
