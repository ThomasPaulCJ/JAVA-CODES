import java.util.*;
class Table{
    synchronized void display(int n){
        for(int i=1;i<10;i++){
            System.out.println(n+" x "+i+" = "+(i*n));
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }

        }
    }

}
class Thread1 extends Thread{
    Table t;
    int n;
    Thread1(Table t,int n){
        this.t=t;
        this.n=n;
    }
    public void run(){
        t.display(n);
    }
}
class Thread2 extends Thread{
    int n;
    Table t;
    Thread2(Table t,int n){
        this.t=t;
        this.n=n;
    }
    public void run(){
        t.display(n);
    }
}
public class ThreadSync{
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        System.out.println("enter first number");
        int n1=in.nextInt();
        System.out.println("enter second number");
        int n2=in.nextInt();
        System.out.println();
        Table t= new Table();
        Thread1 t1=new Thread1(t,n1);
        Thread2 t2=new Thread2(t,n2);
        t1.start();
        System.out.println();
        t2.start();
    }
}