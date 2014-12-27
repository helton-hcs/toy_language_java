package toyLanguage.values;

import java.util.ArrayList;
import java.util.List;

public class ToyList<T extends ToyValue> extends ToyBaseValue<List<T>> {

    public ToyList(List<T> value) {
        super(value);
    }

    public ToyList() {
        this(new ArrayList<>());
    }
}
