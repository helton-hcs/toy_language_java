package toyLanguage.core;

import toyLanguage.values.ToyMap;
import toyLanguage.values.ToyString;
import toyLanguage.values.ToyValue;

import java.util.Map;

public class Environment {
    private ToyMap<ToyString, ToyValue> namespace;

    public Environment() {
        this.namespace = new ToyMap<>();
    }

    public Environment(Environment innerEnvironment) {
        this();
        for (Map.Entry<ToyString, ToyValue> entry : innerEnvironment.getNamespace().getValue().entrySet()) {
            storeValue(entry.getKey(), entry.getValue());
        }
    }

    public ToyMap<ToyString, ToyValue> getNamespace() {
        return namespace;
    }

    public void storeValue(ToyString name, ToyValue value) {
        namespace.getValue().put(name, value);
    }

    public ToyValue getValue(ToyString name) {
        return namespace.getValue().get(name);
    }

    public boolean hasValue(ToyString name) {
        return namespace.getValue().containsKey(name);
    }

}
