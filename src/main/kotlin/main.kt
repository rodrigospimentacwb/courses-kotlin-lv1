fun main(args: Array<String>) {
    println("Welcome Papper Bank!")
    var accountNewton = Account()
    accountNewton.customer = "Isaac Newton"
    accountNewton.accountNumber = 1000
    accountNewton.balance = 100.0

    val accountCurrie = Account()
    accountCurrie.customer = "Marie Curie"
    accountCurrie.accountNumber = 1001
    accountCurrie.balance = 350.20

    println(accountNewton.customer)
    println(accountNewton.accountNumber)
    println(accountNewton.balance)

    println(accountCurrie.customer)
    println(accountCurrie.accountNumber)
    println(accountCurrie.balance)
}

class Account {
    var customer:String = ""
    var accountNumber:Int = 0
    var balance: Double = 0.0
}
