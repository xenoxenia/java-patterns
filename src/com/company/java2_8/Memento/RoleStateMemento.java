package com.company.java2_8.Memento;

public class RoleStateMemento {
    private int gold;

    private int attackPower;

    private int defensivePower;

    public RoleStateMemento(int gold, int attackPower, int defensivePower) {
        this.gold = gold;

        this.attackPower = attackPower;

        this.defensivePower = defensivePower;
    }

    public int getGold() { return gold; }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attachPower) {
        this.attackPower = attachPower;
    }

    public int getDefensivePower() {
        return defensivePower;
    }

    public void setDefensivePower(int defensivePower) {
        this.defensivePower = defensivePower;
    }

}

