package ru.job4j.di;

import org.springframework.stereotype.Component;

@Component
public class StartUI {

    private final Store store;
    private final ConsoleInput ci;

    public StartUI(Store store, ConsoleInput ci) {
        this.store = store;
        this.ci = ci;
    }

    public void add(String value) {
        store.add(ci.askStr(value));
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
