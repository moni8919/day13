class TBA implements Runnable {
    int avt=5;
    public void run()
    {
        String name=Thread.currentThread().getName();
        synchronized(this){
            System.out.println(name+"you are trying to book the ticket for PUSHPA2");
            if(avt>0)
            {
                try{
                    Thread.sleep(5000);
                }catch(InterruptedException e)
                {
                    System.out.println(name+" "+e);
                }
                avt--;
                System.out.println(name+"your ticket is booked for PUSHPA2");
            }else{
                System.out.println(name+"Sorry go and ask Allu Arjun");

            }

        }
    }
    
}
class main4{
    public static void main(String args[]){
        TBA g=new TBA();
        Thread t1=new Thread(g,"amar");
        Thread t2=new Thread(g,"allu");
        Thread t3=new Thread(g,"arjun");
        Thread t4=new Thread(g,"sneha");
        Thread t5=new Thread(g,"reddy");
        Thread t6=new Thread(g,"arha");
        Thread t7=new Thread(g,"ayan");
        Thread t8=new Thread(g,"ram");
        Thread t9=new Thread(g,"charan");
        Thread t10=new Thread(g,"upasana");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        
    }
}
