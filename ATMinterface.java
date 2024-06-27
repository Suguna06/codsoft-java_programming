import java.util.Scanner;
class BankAccount
{
    private double balance;
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
            System.out.println("Money Deposit: " + amount);
        }
        else
        {
            System.out.println("Invalid amount for deposit!");
        }

    }
    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Money withdraw:" +amount);
        }
        else
        {
            System.out.println("Insufficient  funds or invalid amount for withdraw!");
        }
    }
}
class ATM
{
    private BankAccount account;
    private Scanner scanner;
    public ATM(BankAccount account)
    {
        this.account = account;
        scanner = new Scanner(System.in);
    }
    public void showMenu()
    {
        System.out.println("******** WELCOME TO ATM *********");
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit cash");
        System.out.println("3. Withdraw cash");
        System.out.println("4. Exit");

    }
    public void start()
    {
        int choice;
        do{
            showMenu();
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice)
        {
            case 1:
            CheckBalance();
            break;
            case 2:
            deposit();
            break;
            case 3:
            withdraw();
            break;
            case 4:
            System.out.println("Exiting ATM. Thank You!");
            break;
            default:
            System.out.println("Invalid choice. Please selectaa valid option!");
        } 
     }
     while (choice != 4);
    }
    private void CheckBalance()
    {
        System.out.println("Current Balance:"+ account.getBalance());
    }
    private void deposit()
    {
        System.out.println("Enter deposit amount:");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }
    private void withdraw()
    {
        System.out.println("Enter withdrawal amount:");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }

}


                      
