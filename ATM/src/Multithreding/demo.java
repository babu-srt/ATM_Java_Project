package Multithreding;
/*


3:Initalize run method
4: Give run method as Public access modifier
5: Impliment run method
6: call Start method
 */
class Loop extends Thread
{
   public  void run()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Babu");
            try{
                Thread.sleep(2000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }

    }
}
public class demo {
    public static void main(String[] args)
    {
         Loop p=new Loop();
         p.start();
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Bye Babu");
            try{
                Thread.sleep(2000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }

    }
}
