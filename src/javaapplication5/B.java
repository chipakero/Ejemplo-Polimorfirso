
package javaapplication5;

public class B extends A{
    private int b1;
    public B(int b1, int a1){
    super(a1);
    this.b1=b1;
}
    public void yy(){
        System.out.println("yy");
    }
    
    @Override
    public void xx(){
        System.out.println("En B");
    }
}
