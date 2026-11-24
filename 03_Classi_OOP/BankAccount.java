



public class BankAccount{
    private double balance; // variabile di istanza

    public BankAccount(double amount){
        if (amount < 0){
            System.out.println("errore saldo conto negativo");
            balance = 0;

        }
        else{
            balance = amount;

        }


    }
    

    public void deposit (double amount){
        balance += amount;
        
    }

    public void withdraw (double amount){
        if(amount>balance){
            System.out.println("non hai abbastanza soldi");
        }
        else{
            balance -= amount;

        }
        
    }
    
    public double getBalance(){

        return balance;
    }








}





// firma: public void deposit(double amount o public double getBalance);


// static non serve oggetto public void ciao(parametri espliciti. per es. double amount)

// private double balance = 0; invece di costruttore
// o private double balance;




