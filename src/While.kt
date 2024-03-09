fun main() {
    var i = 1

    while(i <= 5){
        println(i)
        i++
    }

    println("Koniec odliczania")

    // oblicz sume liczb od 0 do 100
    i = 0
    var suma = 0
    while(i <= 100){
        suma += i
        i++
    }
    println(suma)

    // oblicz sumę liczb parzystych od 0 do 100
    i = 0
    suma = 0
    while(i <= 100){
        if(i%2==0 ){
            suma += i
        }
        i++
    }
    println(suma)
}