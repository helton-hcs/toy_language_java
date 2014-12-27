package toyLanguage.values;

public abstract class ToyBaseValue<T> implements ToyValue {
    private T value;

    public ToyBaseValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(getClass().isAssignableFrom(obj.getClass())))
            return false;
        if (obj == this)
            return true;
        ToyBaseValue<T> rhs = (ToyBaseValue<T>) obj;
        return getValue().equals(rhs.getValue());
    }

    @Override
    public int hashCode() {
        return getValue().hashCode();
    }

}
