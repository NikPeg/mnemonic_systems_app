package ru.dewhilefor.mnemonicsystems;

import java.util.ArrayList;
import java.util.Arrays;
import ru.dewhilefor.mnemonicsystems.R;

public class Number {
    public static ArrayList<Number> numbers = new ArrayList<>(Arrays.asList(sampleNumber()));

    public String name;
    public String value;
    public MnemonicSystem system;

    public String phrase;

    public Number(String _name, String _value) {
        name = _name;
        value = _value;
        system = MnemonicSystem.NONE;
        phrase = "";
    }

    public Number(String name, String value, MnemonicSystem system) {
        this.name = name;
        this.value = value;
        this.system = system;
        phrase = "";
    }

    static private Number sampleNumber() {
        return new Number("Номер паспорта", "4515 496881");
    }

    public String title() {
        return name + "\n" + value;
    }
}
