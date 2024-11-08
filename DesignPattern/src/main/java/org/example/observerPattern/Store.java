package main.java.org.example.observerPattern;

import main.java.org.example.observerPattern.observable.IPhoneObservableImpl;
import main.java.org.example.observerPattern.observable.StockObservable;
import main.java.org.example.observerPattern.observer.EmailAlertObserverImpl;
import main.java.org.example.observerPattern.observer.MobileAlertObserverImpl;
import main.java.org.example.observerPattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iPhoneObservable = new IPhoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iPhoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2@gmail.com", iPhoneObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("user_name", iPhoneObservable);

        iPhoneObservable.add(observer1);
        iPhoneObservable.add(observer2);
        iPhoneObservable.add(observer3);

        iPhoneObservable.setStockCount(10);
    }
}
