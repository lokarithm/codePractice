/*
    #1114

    Suppose we have a class:

    public class Foo {
        public void first() { print("first"); }
        public void second() { print("second"); }
        public void third() { print("third"); }
    }
    The same instance of Foo will be passed to three different threads. Thread A will call first(), thread B will call second(), and thread C will call third(). Design a mechanism and modify the program to ensure that second() is executed after first(), and third() is executed after second().

    Example 1:
    Input: [1,2,3]
    Output: "firstsecondthird"
    Explanation: There are three threads being fired asynchronously. The input [1,2,3] means thread A calls first(), thread B calls second(), and thread C calls third(). "firstsecondthird" is the correct output.
    
    Example 2:
    Input: [1,3,2]
    Output: "firstsecondthird"
    Explanation: The input [1,3,2] means thread A calls first(), thread B calls third(), and thread C calls second(). "firstsecondthird" is the correct output.

    Note:
    We do not know how the threads will be scheduled in the operating system, even though the numbers in the input seems to imply the ordering. The input format you see is mainly to ensure our tests' comprehensiveness.
*/

public class Foo {
    public Foo() {
        
    }
    
    public boolean firstIsCalled = false;
    public boolean secondIsCalled = false;

    public void first() { print("first"); }
    public void second() { print("second"); }
    public void third() { print("third"); }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstIsCalled=true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(!firstIsCalled){
            Thread.sleep(1);
        }
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        secondIsCalled = true;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(!secondIsCalled){
            Thread.sleep(1);
        }
        
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
    
    public static void main(String[] args) {
        
        int[] testOne = [1,2,3];
    }

    private void PrintAll(int[] orderList){
        for (int order : orderList) {
            switch(order){
                case 1:
                    printFirst();
                    break;
                case 2:
                    printSecond();
                    break;
                case 3:
                    printThird();
                    break;
                default:
                    print("Done.");
            }
        }
    }
}