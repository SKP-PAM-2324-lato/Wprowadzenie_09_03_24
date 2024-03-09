fun main() {

    //użytkownik podaje liczby tak długo dopóki nie poda 0, na koniec wyswietlana jest suma wprowadzonych liczb

    var suma = 0
    var liczba: Int

    do {
        println("Podaj liczbę")
        liczba = readln().toInt()
        suma += liczba
    }while(liczba != 0)

    println(suma)

    // Proś użytkownika o podanie dowolnego słowa tak długo dopóki nie wpisze słowa kabanos
    // lub jeśli 10 razy wpisał złe słowo
    var slowo: String
    var licznik = 0
    do{
        println("Podaj slowo")
        slowo = readln()
        licznik ++
    }while (slowo != "kabanos" && licznik < 10)

    if(slowo == "kabanos"){
        println("Wygrałeś")
    }else{
        println("Przegrałeś")
    }

}