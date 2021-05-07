package com.company.java2_8.Mediator;

public class MediatorPatternDemo {
        public static void main(String[] args) {
            User ksenia = new User("Ksenia");
            User nikita = new User("Nikita");

            ksenia.sendMessage("Can you give me password for your wi-fi?");
            nikita.sendMessage("You won't offend my house like that, turn off hearthstone");
        }
    }