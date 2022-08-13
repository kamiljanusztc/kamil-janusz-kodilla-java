package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface TaskObservable {
    void registerObserver(TaskObserver taskObserver);
    void notifyObservers();
    void removeObserver(TaskObserver taskObserver);
}
