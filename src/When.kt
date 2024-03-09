fun main() {
    val a: Double
    val b: Double
    println("Podaj dwie liczby")
    a = readln().toDouble()
    b = readln().toDouble()

    println("Wpisz operator +, -, * /")
    val opertor = readln()

    // 1) wersja na if
    /*
    val wynik = if(opertor == "+"){
        a+b
    }else if(opertor == "-"){
        a-b
    }else if(opertor == "*"){
        a*b
    }else{
        a/b
    }
     */

    // 2) wersja z when
    /*
    val wynik = when(opertor){
        "+" -> a+b
        "-" -> a-b
        "*" -> a*b
        else -> a/b
    }

    println("$a $opertor $b = $wynik")
     */

    when(opertor){
        "+" -> println(a+b)
        "-" -> println(a-b)
        "*" -> println(a*b)
        "/" -> if (b == 0.0){
            println("Nie dziel przez zero")
        }else{
            println(a/b)
        }
    }


}