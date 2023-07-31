package prototype.staticGameObjects;

import prototype.Prototype;

public class Tree implements Prototype {
    private boolean cutDown;

    @Override
    public String toString() {
        return "Tree{" +
                "cutDown=" + cutDown +
                '}';
    }

    public Tree(){
        super();
        setCutDown(false);
    }
    public Tree(Tree tree){
        super();
        setCutDown(tree.isCutDown());
    }
    public boolean isCutDown() {
        return cutDown;
    }

    public void setCutDown(boolean cutDown) {
        this.cutDown = cutDown;
    }

    public void destroy(){
        setCutDown(true);
        System.out.println("Tree is destroyed...");
    }
    @Override
    public Tree copy() {
        return new Tree(this);
    }
}
