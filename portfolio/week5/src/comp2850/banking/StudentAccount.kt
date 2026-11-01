
package comp2850.banking

class StudentAccount(holder: String, var overdraft: Int = 0) : BankAccount(holder) {

    override fun withdraw(amount: Int) {
        balance -= amount
    }
    
    fun withdrawalsAllowed(): Boolean {
        return false
    }
    
    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }
}