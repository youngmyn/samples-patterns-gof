package behavioral.interpreter.nonterminalExpressions;

import behavioral.interpreter.Expression;

public abstract class AbstractArithmeticExpression implements Expression {
    private Expression left;
    private Expression right;

    public AbstractArithmeticExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

}
