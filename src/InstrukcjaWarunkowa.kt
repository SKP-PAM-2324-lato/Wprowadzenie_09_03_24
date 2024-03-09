fun main() {
    println("Podaj liczbę:")
    val number = readln().toInt()
    val result =
        if (number > 0){
            "dodatnia"
        }else if(number == 0){
            "zero"
        }else{
            "ujemna"
        }

    println("Liczba jest $result")

    // parzystosc liczby
    val n = readln().toInt()
    val r = if(n % 2 == 0){
            "parzysta"
        }else{
            "nieparzysta"
        }
    println("Liczba jest $r")

    // Poprość użytkownika o podanie 3 liczb. Znajdź najmniejszą z nich
    println("Podaj 3 liczby")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val min = if(a<b){
        if(a<c){
            a
        }else{
            c
        }
    }else{
        if(b<c){
            b
        }else{
            c
        }
    }

    val min2 = if(a < b && a < c){
        a
    }else if( b < a && b < c){
        b
    }else{
        c
    }

    println("Najmniejsza liczba to $min")
    println("Najmniejsza liczba to $min2")



}
