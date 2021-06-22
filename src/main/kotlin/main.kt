fun main(args: Array<String>) {
    println("Welcome Papper Bank!")
    var accountNewton = Account()
    accountNewton.customer = "Isaac Newton"
    accountNewton.accountNumber = 1000
    accountNewton.setBalance(100.0)

    val accountCurrie = Account()
    accountCurrie.customer = "Marie Curie"
    accountCurrie.accountNumber = 1001
    accountCurrie.setBalance(350.0)

    println(accountNewton.customer)
    println(accountNewton.accountNumber)
    println(accountNewton.getBalance())

    println(accountCurrie.customer)
    println(accountCurrie.accountNumber)
    println(accountCurrie.getBalance())

    println()
    println("Depositing to Newton's account")
    accountNewton.deposit(50.0)
    println("New balance ${accountNewton.getBalance()}")
    println("Withdraw money to Newton's account")
    accountNewton.withdraw(100.0)
    println("New balance ${accountNewton.getBalance()}")
    println("Transfer from Newton's account to Currie's account")
    if(accountNewton.transfer(50.0,accountCurrie)){
        println("Transfer made")
    }else{
        println("Fail transfer")
    }
    println("New balance ${accountNewton.getBalance()}")

    println("Depositing to Currie's account")
    accountCurrie.deposit(100.0)
    println("New balance ${accountCurrie.getBalance()}")
    println("Withdraw money to Currie's account")
    accountCurrie.withdraw(200.0)
    println("New balance ${accountCurrie.getBalance()}")
}

class Account {
    var customer:String = ""
    var accountNumber:Int = 0
    private var balance: Double = 0.0

    fun deposit(value:Double){
        balance += value
    }

    fun withdraw(value: Double){
        if(balance >= value){
            balance -= value
        }
    }

    fun transfer(value:Double, destiny:Account): Boolean {
        if(balance >= value){
            balance -= value
            destiny.deposit(value)
            return true
        }
        return false
    }

    fun getBalance(): Double {
        return balance
    }

    fun setBalance(value: Double) {
        if(balance >= 0){
            balance = value
        }
    }
}
