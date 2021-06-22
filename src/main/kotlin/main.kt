fun main(args: Array<String>) {
    println("Welcome Papper Bank!")
    var accountNewton = Account()
    accountNewton.customer = "Isaac Newton"
    accountNewton.accountNumber = 1000
    accountNewton.balance = 100.0

    val accountCurrie = Account()
    accountCurrie.customer = "Marie Curie"
    accountCurrie.accountNumber = 1001
    accountCurrie.balance = 350.0

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
    if(accountNewton.transfer(50.0,accountCurrie)){
        println("Transfer made")
    }else{
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

class Account {
    var customer:String = ""
    var accountNumber:Int = 0
    var balance: Double = 0.0

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
            destiny.balance += value
            return true
        }
        return false
    }
}
