package ru.dewhilefor.mnemonicsystems;

public class Number {
    public String name;
    public String value;
    public MnemonicSystem system;

    public void MnemonicSystem(String name, String value) {
        this.name = name;
        this.value = value;
        this.system = MnemonicSystem.NONE;
    }

    public void MnemonicSystem(String name, String value, MnemonicSystem system) {
        this.name = name;
        this.value = value;
        this.system = system;
    }
}
