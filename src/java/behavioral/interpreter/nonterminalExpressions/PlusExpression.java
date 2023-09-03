package behavioral.interpreter.nonterminalExpressions;

import behavioral.interpreter.Expression;

public class PlusExpression extends AbstractArithmeticExpression{
    public PlusExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return getLeft().interpret()+getRight().interpret();
    }
}
