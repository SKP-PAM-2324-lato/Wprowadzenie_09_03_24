fun main() {


    for(i in 1..10){
        if (i == 4){
            break
        }
        println(i)
    }

    //użytkownik podaje liczby tak długo dopóki nie poda 0, na koniec wyswietlana jest suma wprowadzonych liczb
    var suma = 0
    while (true){
        val dane = readln().toInt()
        suma += dane
        if(dane == 0){
            break
        }
    }
    println(suma)

    for(i in 10 downTo  1){
        if(i == 5)
            continue
        println(i)
    }
}