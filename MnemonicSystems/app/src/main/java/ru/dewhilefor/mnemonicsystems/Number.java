package ru.dewhilefor.mnemonicsystems;

import java.util.ArrayList;
import java.util.Arrays;

public class Number {
    public static ArrayList<Number> cardsTitles = new ArrayList<>(Arrays.asList(sampleNumber()));

    public String name;
    public String value;
    public MnemonicSystem system;

    Number(String _name, String _value) {
        name = _name;
        value = _value;
        system = MnemonicSystem.NONE;
    }

    Number(String name, String value, MnemonicSystem system) {
        this.name = name;
        this.value = value;
        this.system = system;
    }

    static private Number sampleNumber() {
        return new Number("Номер паспорта", "4515 496881");
    }
}
