package com.company.java2_8.Memento;

public class GameRole {
    private int gold;

    private int attackPower;

    private int defensivePower;

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensivePower() {
        return defensivePower;
    }

    public void setDefensivePower(int defensivePower) {
        this.defensivePower = defensivePower;

    }

    public void displayState() {
        System.out.println("Характеристики игрока: ");

        System.out.println(String.format("голда: %d", gold));

        System.out.println(String.format("атака: %d", attackPower));

        System.out.println(String.format("защита: %d", defensivePower));

    }

    public void initialState() {
        this.gold = 100;

        this.attackPower = 100;

        this.defensivePower = 100;

    }

    public void fight() {
        this.gold = 0;

        this.attackPower = 0;

        this.defensivePower = 0;

    }

    public RoleStateMemento saveState() {
        return new RoleStateMemento(this.gold, this.attackPower, this.defensivePower);
    }

    public void recoveryState(RoleStateMemento memento) {
        this.gold = memento.getGold();

        this.attackPower = memento.getAttackPower();

        this.defensivePower = memento.getDefensivePower();
    }
}
