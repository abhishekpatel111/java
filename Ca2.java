abstract class A{

    abstract void x();
    abstract int add(int a,int b);

    public int mul(int a,int b){
        return a+b;
    }
     public static void main(String[] args) {
        A o1= new A() {
            void showMessage() {

                    }
            int add(int x, int y) {
                return 0;
              }
        System.out.println(o1.mul(10, 12));
        System.out.println(o1.add(10,12));
    }