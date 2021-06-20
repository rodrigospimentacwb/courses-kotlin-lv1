fun main(args: Array<String>) {
    println("Welcome Papper Bank!")
    val customer:String = "Isaac Newton"
    val accountNumber:Int = 1234
    var balance:Double = 0.0

    println("customer $customer")
    println("account number $accountNumber")
    println("balance $balance")

    // IF
    if (balance > 0.0){
        println("balance is positive")
    } else if (balance == 0.0){
        println("balance is neutral")
    } else {
        println("balance is negative")
    }

    // Positive
    balance += 200
    // When
    when {
        balance > 0.0 -> {
            println("balance is positive")
        }
        balance == 0.0 -> {
            println("balance is neutral")
        }
        else -> {
            println("balance is negative")
        }
    }

    // Negative
    balance = -200.0
    // When oneline
    when {
        balance > 0.0 -> println("balance is positive")
        balance == 0.0 -> println("balance is neutral")
        else -> println("balance is negative")
    }
}