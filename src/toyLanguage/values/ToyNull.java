package toyLanguage.values;

public class ToyNull extends ToyBaseValue<Void> {

    public ToyNull() {
        super(null);
    }

    @Override
    public String toString() {
        return "<null>";
    }
}
