package adapter;

public class MathProfessorAdapter implements Employee{
    private MathProfessor mathProfessor;
    public MathProfessorAdapter(MathProfessor mathProfessor){
        this.mathProfessor = mathProfessor;
    }
    @Override
    public void doWork() {
        mathProfessor.writeComplexMathReport();
    }
}
