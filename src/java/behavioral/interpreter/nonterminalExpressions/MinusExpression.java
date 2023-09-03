package behavioral.interpreter.nonterminalExpressions;

import behavioral.interpreter.Expression;

public class MinusExpression extends AbstractArithmeticExpression{
    public MinusExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return getLeft().interpret()- getRight().interpret();
    }
}
