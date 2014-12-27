package toyLanguage.values;

import java.util.HashMap;
import java.util.Map;

public class ToyMap<K extends ToyValue, V extends ToyValue> extends ToyBaseValue<Map<K, V>> {

    public ToyMap() {
        super(new HashMap<>());
    }

}
