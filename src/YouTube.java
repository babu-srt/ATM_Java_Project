import java.util.*;
class Channel
{
    List<Customer_Subscriber> alsub= new ArrayList<>();
    String Title;
    String ChannelName;
    Channel(String name)
    {
        ChannelName=name;
    }
    void subscribe(Customer_Subscriber sub)
    {
        alsub.add(sub);
    }
    void unsubscribe(Customer_Subscriber un)
    {
        alsub.remove(un);
    }
    public void upload(String Title)
    {
        this.Title=Title;
        notifySubscribers();

    }
    public void  notifySubscribers()
    {
     for(Customer_Subscriber sub: alsub)
     {
         sub.update(Title);
     }

    }
}
class Customer_Subscriber
{


    List<String> lists=new ArrayList<>();
    String Name;


    Customer_Subscriber(String name)
    {
        Name=name;

    }
    void subscribeChannel( Channel c)
    {

        lists.add(c.ChannelName);
    }

    void update(String Title )
    {
        System.out.println("Hello "+Name+" New video  Uploaded : "+Title);
    }

    void showChannels()
    {
        System.out.println(lists);
    }


}



public class YouTube {
    public static void main(String[] args)
    {
        Channel c=new Channel("Carry");

        Customer_Subscriber cs1= new Customer_Subscriber("Babu");
        Customer_Subscriber cs2= new Customer_Subscriber("Ajinkya");
        Customer_Subscriber cs3= new Customer_Subscriber("Ajay");
        Customer_Subscriber cs4= new Customer_Subscriber("Tejas");
        Customer_Subscriber cs5= new Customer_Subscriber("Rahul");


        c.subscribe(cs2);
        c.subscribe(cs3);
        c.subscribe(cs4);
        c.subscribe(cs5);




        cs2.subscribeChannel(c);
        cs3.subscribeChannel(c);
        cs4.subscribeChannel(c);
        cs5.subscribeChannel(c);

        c.upload("India-Maldivs");


        Channel dr=new Channel("Dhru");

        dr.subscribe(cs1);
        cs1.subscribeChannel(dr);
        dr.upload("12th new Syllabus");
        cs1.showChannels();


    }
}
