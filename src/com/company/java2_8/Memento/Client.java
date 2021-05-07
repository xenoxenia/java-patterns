package com.company.java2_8.Memento;

public class Client {
    public static void main(String[] args) {
// Перед битвой с боссом

// Инициализация начального состояния: все характеристики равны 100

        GameRole gameRole = new GameRole();

        gameRole.initialState();

        gameRole.displayState();

// Сохраняем информацию о прогрессе

        RoleStateCaretaker caretaker = new RoleStateCaretaker();

        caretaker.setMemento(gameRole.saveState());

// Фаза битвы

        gameRole.fight();

        gameRole.displayState();

// После битвы, возврат состояния

        gameRole.recoveryState(caretaker.getMemento());

        gameRole.displayState();
    }
}
