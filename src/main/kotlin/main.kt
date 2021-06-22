fun main(args: Array<String>) {
    println("Welcome Papper Bank!")
    var accountNewton = Account("Isaac Newton", 1000)
    accountNewton.deposit(100.0)

    val accountCurrie = Account("Marie Curie", 1001)
    accountCurrie.deposit(350.0)

    println(accountNewton.customer)
    println(accountNewton.accountNumber)
    println(accountNewton.balance)

    println(accountCurrie.customer)
    println(accountCurrie.accountNumber)
    println(accountCurrie.balance)

    println()
    println("Depositing to Newton's account")
    accountNewton.deposit(50.0)
    println("New balance ${accountNewton.balance}")
    println("Withdraw money to Newton's account")
    accountNewton.withdraw(100.0)
    println("New balance ${accountNewton.balance}")
    println("Transfer from Newton's account to Currie's account")
    if (accountNewton.transfer(50.0, accountCurrie)) {
        println("Transfer made")
    } else {
        println("Fail transfer")
    }
    println("New balance ${accountNewton.balance}")

    println("Depositing to Currie's account")
    accountCurrie.deposit(100.0)
    println("New balance ${accountCurrie.balance}")
    println("Withdraw money to Currie's account")
    accountCurrie.withdraw(200.0)
    println("New balance ${accountCurrie.balance}")
}

class Account(var customer: String,
              var accountNumber: Int) {

    // Constructor already declares variables using var
//    var customer:String = customer
//    var accountNumber:Int = accountNumber

    var balance: Double = 0.0
        private set(value) {
            //word 'field' is a reserved name that indicates the internal value of an existing attribute in the class.
            field = value
        }

    // Secondary Builder, May contain too much logic
//    constructor(customer:String, accountNumber: Int){
//        this.customer = customer
//        this.accountNumber = accountNumber
//    }

    init {
        //Run some logic during the primary builder
    }

    fun deposit(value: Double) {
        balance += value
    }

    fun withdraw(value: Double) {
        if (balance >= value) {
            balance -= value
        }
    }

    fun transfer(value: Double, destiny: Account): Boolean {
        if (balance >= value) {
            balance -= value
            destiny.deposit(value)
            return true
        }
        return false
    }
}
