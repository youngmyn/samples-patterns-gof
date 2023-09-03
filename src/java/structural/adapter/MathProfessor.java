package structural.adapter;

public class MathProfessor {
    public int getRoundPiNumber(){
        return 3;
    }
    public void calcAndPrintSumOfTwoRandomNumbers(){
        int firstNum = (int) (Math.random()*100);
        int secondNum = (int)(Math.random()*100);
        System.out.println(firstNum+" + "+ secondNum +" = "+(firstNum+secondNum));
    }
    public void writeComplexMathReport(){
        System.out.println("Writing a very complex report...x*y/z +1,23123%*(1/3)*exp[]>8/2123....");
    }

}
