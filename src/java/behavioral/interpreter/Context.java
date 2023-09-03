package behavioral.interpreter;

import behavioral.interpreter.nonterminalExpressions.MinusExpression;
import behavioral.interpreter.nonterminalExpressions.PlusExpression;
import behavioral.interpreter.terminalExpressions.NumberExpression;

public class Context {
    /*
    Тут мы формируем 1 общий Expression, который будет состоять
    из рекурсивно вложенных Expression слева, и 1 го NumberExpression справа.
    При вызове метода interpret, эта вложенная цепочка начнет разворачиваться и вызывать методы interpret
    у каждого вложенного туда Expression.
    Поскольку считать выражение мы собираемся слева направо, сворачивать цепочку мы начинаем справа налево
    (что бы когда она начала разворачиваться, она пошла слева направо, сохранив логику вычислений)

     */
    public Expression evaluate(String s){
        int pos = s.length()-1;
        while(pos>0){
            if(Character.isDigit(s.charAt(pos))){
                pos--;
            }
            else {
                Expression left = evaluate(s.substring(0, pos));
                Expression right = new NumberExpression(Integer.parseInt(s.substring(pos+1)));
                char operator = s.charAt(pos);
                switch (operator){
                    case '+':
                        return new PlusExpression(left,right);
                    case '-':
                        return new MinusExpression(left,right);
                }
            }
        }
        return new NumberExpression(Integer.parseInt(s));
    }
}
