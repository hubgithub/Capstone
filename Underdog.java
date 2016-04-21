public class Underdog extends Dog
{
    public void act()
    {
        super.act();
        System.out.print("sleep ");
    }
    
    public void eat()
    {
        super.eat();
        System.out.print("bark ");
    }
}
