package toyLanguage.values;

import org.antlr.v4.runtime.tree.ParseTree;
import toyLanguage.core.Environment;
import toyLanguage.core.Interpreter;

public class ToyFunction implements ToyValue {

    private ToyList<ToyString> parameters;
    private ParseTree functionBody;

    public ToyFunction(ToyList<ToyString> parameters, ParseTree functionBody) {
        this.parameters = parameters;
        this.functionBody = functionBody;
    }

    public ToyValue call(ToyList<ToyValue> arguments, Environment innerEnvironment) {
        if (parameters.getValue().size() != arguments.getValue().size())
            throw new IllegalArgumentException(String.format("Expect %d arguments but got %d", parameters.getValue().size(), arguments.getValue().size()));

        Environment environment = new Environment(innerEnvironment);
        for (int i = 0; i < parameters.getValue().size(); i++) {
            environment.storeValue(parameters.getValue().get(i), arguments.getValue().get(i));
        }

        return new Interpreter(environment).visit(functionBody);
    }

    @Override
    public String toString() {
        return "@Function<" + parameters.getValue().toString() + ">";
    }

}
