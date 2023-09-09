package statebank;

public class StateBank 
{
    public void withdrawMoney(Client x, int money)
    {
        int deposit = x.getDeposit();
        if(deposit > money)
        {
            deposit = deposit - money;
            x.setDeposit(deposit);
            System.out.print("\nWithdrawn amount : " + money);
            System.out.print("\nAvailable Balance : " + deposit);
        }
        else
            System.out.print("\nInsufficient Balance");            
    }
    
    public void depositMoney(Client x, int money)
    {
        int deposit = x.getDeposit();
        deposit = deposit + money;
        x.setDeposit(deposit);
    }
    
    public static void main(String[] args) 
    {
        StateBank sb = new StateBank();
                
        Client ashiq = new Client();
        ashiq.setId(1);
        ashiq.setName("Ashiqur Rahman");
        ashiq.setMobile(171);
        ashiq.setDeposit(0);
        
        Client tomal = new Client();
        tomal.setId(2);
        tomal.setName("Monirul Hasan");
        tomal.setMobile(181);
        tomal.setDeposit(50000);
        
        Client sm = new Client();
        sm.setId(3);
        sm.setName("Shahriar Manzoor");
        sm.setMobile(191);
        sm.setDeposit(100000);
        
        //System.out.print(tomal.getDeposit());
        
        System.out.print("\n" + ashiq.getName() + ":" + ashiq.getDeposit());
        sb.withdrawMoney(ashiq, 3000);        
        System.out.print("\n" + ashiq.getDeposit());
        sb.depositMoney(ashiq, 5000); 
        System.out.print("\n" + ashiq.getDeposit());
        sb.withdrawMoney(ashiq, 3000);        
        System.out.print("\n" + ashiq.getDeposit());
        
        System.out.print("\n" + tomal.getDeposit());
    }    
}