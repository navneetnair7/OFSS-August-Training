package org.example;
// Innovate 5 classes which are unique in the class
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        BankAccount newAccount = new BankAccount(1001, "Tejas", 0);
        newAccount.ShowAccount();
        newAccount.Deposit(1000f);
        newAccount.withdrawDepost(500f);
        newAccount.ShowAccount();
    }
}
//
//class Bank {
//
//}
//
//class CurrentAcc {
//
//}
//
//class CustomerDetails {
//
//}

//class EmployeeDetails {
//    int EmpNo;
//    String EmpName;
//    String Dept;
//    int Sal;
//
//    public EmployeeDetails(int empNo, String empName, String dept, int sal) {
//        EmpNo = empNo;
//        EmpName = empName;
//        Dept = dept;
//        Sal = sal;
//    }
//
//    public void showDetails() {
//        System.out.println("Employee Number: " + EmpNo);
//        System.out.println("Employee Name: " + EmpName);
//        System.out.println("Department: " + Dept);
//        System.out.println("Salary: " + Sal);
//    }
//
//    public void updateDetails(int empNo, String empName, String dept, int sal) {
//        this.EmpNo = empNo;
//        this.EmpName = empName;
//        this.Dept = dept;
//        this.Sal = sal;
//    }
//}
//
//class GoldLoan {
//    int loanAmount;
//    int kgs;
//    int roi;
//    int years;
//
//    public GoldLoan (int kgs, int roi, int years) {
//        this.kgs = kgs;
//        loanAmount = kgs / 10 * 103630;
//        this.roi = roi;
//        this.years = years;
//    }
//
//    public void payInstallment (int installment) {
//        loanAmount -= installment;
//        System.out.println("Remaining amount " + loanAmount);
//    }
//}
//
//class EducationLoan {
//    int loanAmount;
//    int kgs;
//    int roi;
//
//    public EducationLoan (int kgs, int roi) {
//        this.kgs = kgs;
//        loanAmount = kgs / 10 * 103630;
//        this.roi = roi;
//    }
//
//    public void payInstallment (int installment) {
//        loanAmount -= installment;
//        System.out.println("Remaining amount " + loanAmount);
//    }
//}
//
//class BranchDetails {
//    int branchId;
//    int branchManager;
//    int city;
//    int state;
//}

class tShirt {
    String size;
    String colour;
    String brand;
    int cost;

    public tShirt(String size, String colour, String brand, int cost) {
        this.size = size;
        this.colour = colour;
        this.brand = brand;
        this.cost = cost;
    }
}

class Bottle {
    int capacity;
    String material;
    int company;

    public Bottle(int capacity, String material, int company) {
        this.capacity = capacity;
        this.material = material;
        this.company = company;
    }

    public void Fill(int fillAmount) {
        if(fillAmount > capacity) {
            System.out.println("Overflow");
        } else {
            capacity -= fillAmount;
            System.out.println(capacity + "ml left");
        }
    }
}

class Yacht {
    String name;
    int capacity;
    String facilities;

    public Yacht(String name, int capacity, String facilities) {
        this.name = name;
        this.capacity = capacity;
        this.facilities = facilities;
    }

    public void Book() {
        if (capacity == 0) {
            System.out.println("Full!");
        } else {
            capacity -= 1;
            System.out.println("Booked Successfully");
        }
    }
}

class Spectacles {
    int leftPower;
    int rightPower;
    String frameColour;
    String brand;

    public Spectacles(int leftPower, int rightPower, String frameColour, String brand) {
        this.leftPower = leftPower;
        this.rightPower = rightPower;
        this.frameColour = frameColour;
        this.brand = brand;
    }
}

class Headphones {
    String brand;
    int price;
    String features;

    public Headphones(String brand, int price, String features) {
        this.brand = brand;
        this.price = price;
        this.features = features;
    }
}

class BankAccount {
    int AccountNo;
    String HolderName;
    float Balance;

    public BankAccount(int accountNo, String holderName, int balance) {
        this.AccountNo = accountNo;
        this.HolderName = holderName;
        this.Balance = balance;
    }

    public float withdrawDepost(float amount) {
        System.out.println("Withdrawing " + amount);
        if (Balance >= amount) {
            Balance -= amount;
        } else {
            System.out.println("Error!");
        }
        return Balance;
    }

    public float Deposit(float amount) {
        System.out.println("Depositing" + amount);
        if (amount <= 0) {
            System.out.println("Error!");
        } else {
            Balance += amount;
        }
        return Balance;
    }

    public void ShowAccount() {
        System.out.println("AccountNo. " + AccountNo);
        System.out.println("HolderName " + HolderName);
        System.out.println("Balance " + Balance);
    }
}