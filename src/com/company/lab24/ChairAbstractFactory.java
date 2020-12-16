package com.company.lab24;

public interface ChairAbstractFactory {
    public FunctionChair createFunctionChair();
    public MagicChair createMagicChair(String material);
    public VictorianChair createVictorianChair(String owner);
}
