package toyLanguage.utils;

import toyLanguage.values.*;

public class ToyValueConverter {

    public static Double toNumber(ToyValue toyValue) {
        return ((ToyNumber)toyValue).getValue();
    }

    public static ToyNumber toToyNumber(double value) {
        return new ToyNumber(value);
    }

    public static ToyNumber toToyNumber(String text) {
        return new ToyNumber(Double.valueOf(text));
    }

    public static ToyString toToyString(String text) {
        return new ToyString(text);
    }

    public static ToyBoolean toToyBoolean(String text) {
        return new ToyBoolean(Boolean.valueOf(text));
    }

    public static <T extends ToyValue> ToyList<T> toToyList(ToyValue value) {
        return (ToyList<T>)value;
    }

    public static ToyBoolean toToyBoolean(ToyValue value) {
        return (ToyBoolean)value;
    }

    public static boolean toBoolean(ToyValue toyValue) {
        return ((ToyBoolean)toyValue).getValue();
    }

    public static ToyValue toToyBoolean(boolean value) {
        return new ToyBoolean(value);
    }
}
