public class OuterClass {
    public int x = 10;

    public class InnerClass {
        public int y = 5;
        void sum() {
            System.out.println(x + y);
        }
    }

    void sum() {
        System.out.println(x + new InnerClass().y);
    }

//    static class InnerClass{
//        int y = 5;
//    }

//    class InnerClass{
//        public int myInnerMethod() {
//            return x;
//        }
//    }
}
