import java.util.Random;
public class Multi_Thread{
    public static void main(String args[]){
        Threada t1=new Threada();
        t1.start();
    }
}
class Threada extends Thread{
 public synchronized void run(){
        Threadb t2=new Threadb();
         Threadc t3=new Threadc();
    for(int i=0;i<10;i++){
        Random r=new Random();
        int n=r.nextInt(100);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(n%2==0)
            t2.run(n);
        else
            t3.run(n);
    }
    }
}
class Threadb extends Thread{
     synchronized void run(int n){
        System.out.println("number generated ="+n+"\n the square =");
        System.out.println(n*n);
    }
}
class Threadc extends Thread{
     synchronized void run(int n){
        System.out.println("number generated ="+n+"\n the cube =");
        System.out.println(n*n*n);
    }
}