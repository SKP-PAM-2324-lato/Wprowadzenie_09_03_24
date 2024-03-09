fun main() {
    // policz od 1 do 5
    for(i in 1..5){
        println(i)
    }

    println("--______________--")

    for(i in 5 downTo 1){
        println(i)
    }

    println("--______________--")
    for(i in 1..5 step 2){
        println(i)
    }

    println("--______________--")

    for(i in 5 downTo 1 step 2){
        println(i)
    }

    println("--______________--")

    //iteracja po tekscie
    var tekst = "Kotlin"
    for (litera in tekst){
        println(litera)
    }

    // Poproś użytkownika o podanie dowolnego słowa. Wydrukuj to słowo z pominięciem litery a

    /*
    tekst = readln()
    for (litera in tekst){
        if (litera != 'a' && litera != 'A'){
            print(litera)
        }
    }
    println()

     */
    tekst = readln()
    //tekst = tekst.lowercase()
    for (litera in tekst){
        if (litera.lowercaseChar() != 'a'){
            print(litera)
        }
    }
    println()

}