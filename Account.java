
package coe318.lab4;

/**
 *
 * @author clfernan
 */
public class Account {
    private final int accountNum;
    private double initialBal, depositAmnt, withdrawAmnt;
    private final String name;
    public Account (String name, int accountNum, double initialBal){
        this.name = name;
        this.accountNum = accountNum;
        this.initialBal = initialBal;
    }
    
    public String getName () {
        return name;
    }
    
    public double getBalance() {
        return initialBal;
    }
    
    public int getNumber () {
        return accountNum;
    }
    
    public boolean deposit (double depositAmnt) {
        if (depositAmnt <= 0.00) {
            return false;
    }
        else {
            initialBal += depositAmnt;
            return true;
    }
    }
    
    public boolean withdraw (double withdrawAmnt) {
        if (withdrawAmnt > initialBal) {
            return false;
        }
        else if (withdrawAmnt <= 0.00) {
            return false;
        }
        else {
            initialBal -= withdrawAmnt;
            return true;
        }
    }
    
    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
        String.format("$%.2f", getBalance()) + ")";
    }
    
}
