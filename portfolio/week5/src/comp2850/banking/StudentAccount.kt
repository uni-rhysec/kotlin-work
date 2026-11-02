
package comp2850.banking

class StudentAccount(holder: String) : BankAccount(holder) {
    var overdraft: Int = 0
    set(value) {
        if (value !in 0..100) {
            throw IllegalArgumentException()
        } else {
            field = value
        }
    }
    

    override fun withdraw(amount: Int) {
        if (amount <= 0) {
            throw IllegalArgumentException("Withdrawal amount must be greater than 0")
        }
        if (balance - amount < 0 - overdraft) {
            throw IllegalArgumentException("Insufficient funds for withdrawal")
        }
        balance -= amount
        
    }
    
    fun withdrawalsAllowed(): Boolean {
        if (balance <= 0 - overdraft) {
            return false
        }
        return true
    }
    
    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }
}