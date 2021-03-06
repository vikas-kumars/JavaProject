package java2nvoice;

public class MyDeadlock {
String str1= "Java";
String str2="unix";
Thread trd1 = new Thread("My Thread 1"){
        public void run(){
            while(true){
                synchronized(str1){
                    synchronized(str2){
                        System.out.println(str1 + str2);
                    }
                }
            }
        }
    };     
    Thread trd2 = new Thread("My Thread 2"){
        public void run(){
            while(true){
                synchronized(str2){
                    synchronized(str1){
                        System.out.println(str2 + str1);
                    }
                }
            }
        }
    };     
    public static void main(String a[]) throws InterruptedException{
        MyDeadlock mdl = new MyDeadlock();
        mdl.trd1.start();
        mdl.trd1.join();
        mdl.trd2.start();
    }
}
