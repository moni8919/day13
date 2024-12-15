class a implements Runnable{
    public void run()
    {
        System.out.println("hello i'am thread");

    }
}
public class main1{
    public static void main(String[] args){
        a r=new a();
        Thread s=new Thread(r);
        s.start();  
        s.run(); 
    }
}
/*hello i'am thread
hello i'am thread */