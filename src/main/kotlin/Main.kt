open class suitGame(
    var meChoice: String,
    var enemyChoice: String){

    open fun suitFun(){
        while (meChoice == enemyChoice) {
            println("DRAW!")
            println("==========================")
            println("GAME SUIT TERMINAL VERSION")
            println("==========================")
            println("1. Masukkan pemain 1:")
            var meChoice: String = readln().toString().toLowerCase()
            println("2. Masukkan pemain 2:")
            var enemyChoice: String = readln().toString().toLowerCase()
            if (meChoice == "gunting" && enemyChoice == "kertas") {
                println("Pemain 1 MENANG!")
                return
            } else if (meChoice == "kertas" && enemyChoice == "batu") {
                println("Pemain 1 MENANG!")
                return
            } else if (meChoice == "batu" && enemyChoice == "gunting") {
                println("Pemain 1 MENANG!")
                return
            } else if (meChoice == "gunting" && enemyChoice == "batu") {
                println("Pemain 2 MENANG!")
                return
            } else if (meChoice == "kertas" && enemyChoice == "gunting") {
                println("Pemain 2 MENANG!")
                return
            } else if (meChoice == "batu" && enemyChoice == "kertas") {
                println("Pemain 2 MENANG!")
                return
            }
        }
    }
}

fun main() {
    println("==========================")
    println("GAME SUIT TERMINAL VERSION")
    println("==========================")
    println("1. Masukkan pemain 1:")
    var meChoice: String = readln().toString().toLowerCase()
    println("2. Masukkan pemain 2:")
    var enemyChoice: String = readln().toString().toLowerCase()
    if (meChoice == "gunting" && enemyChoice == "kertas") {
        println("Pemain 1 MENANG!")
    } else if (meChoice == "kertas" && enemyChoice == "batu") {
        println("Pemain 1 MENANG!")
    } else if (meChoice == "batu" && enemyChoice == "gunting") {
        println("Pemain 1 MENANG!")
    } else if (meChoice == "gunting" && enemyChoice == "batu") {
        println("Pemain 2 MENANG!")
    } else if (meChoice == "kertas" && enemyChoice == "gunting") {
        println("Pemain 2 MENANG!")
    } else if (meChoice == "batu" && enemyChoice == "kertas") {
        println("Pemain 2 MENANG!")
    }

    val gamE = suitGame(meChoice, enemyChoice).suitFun()
}