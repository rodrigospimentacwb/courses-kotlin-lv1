fun main(args: Array<String>) {
    println("Welcome Papper Bank!")

    println()
    println("*** Normal range ***")
    for (i in 1..3) {

        val customer: String = "Isaac Newton $i"
        val accountNumber: Int = 1000 + i
        var balance: Double = i + 10.0

        println("customer $customer")
        println("account number $accountNumber")
        println("balance $balance")
        println()

        //Lessons 1 to 3
        //testConditions(balance)
    }

    println()
    println("*** DownTo range ***")
    for (i in 3 downTo 1) {

        val customer: String = "Isaac Newton $i"
        val accountNumber: Int = 1000 + i
        var balance: Double = i + 10.0

        println("customer $customer")
        println("account number $accountNumber")
        println("balance $balance")
        println()
    }

    println()
    println("*** DownTo range with step and break ***")
    for (i in 5 downTo 1 step 2) {

        if(i == 1){
            break
        }
        val customer: String = "Isaac Newton $i"
        val accountNumber: Int = 1000 + i
        var balance: Double = i + 10.0

        println("customer $customer")
        println("account number $accountNumber")
        println("balance $balance")
        println()
    }

    println()
    println("*** While ***")
    var i = 1
    while (i < 4){
        val customer: String = "Isaac Newton $i"
        val accountNumber: Int = 1000 + i
        var balance: Double = i + 10.0

        println("customer $customer")
        println("account number $accountNumber")
        println("balance $balance")
        println()
        i++
    }
}

fun testConditions(balance: Double) {
    var localbalance = balance

    //Neutral
    localbalance = 0.0
    // IF
    if (localbalance > 0.0) {
        println("balance $localbalance is positive")
    } else if (localbalance == 0.0) {
        println("balance $localbalance is neutral")
    } else {
        println("balance $localbalance is negative")
    }

    // Positive
    localbalance += 200
    // When
    when {
        localbalance > 0.0 -> {
            println("balance $localbalance is positive")
        }
        localbalance == 0.0 -> {
            println("balance $localbalance is neutral")
        }
        else -> {
            println("balance $localbalance is negative")
        }
    }

    // Negative
    localbalance = -200.0
    // When oneline
    when {
        localbalance > 0.0 -> println("balance $localbalance is positive")
        localbalance == 0.0 -> println("balance $localbalance is neutral")
        else -> println("balance $localbalance is negative")
    }
}