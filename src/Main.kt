fun main() {
    //println("Hello World!")
    //println("Witaj świecie")
    // bez znaku nowej lini
    print("hello world! ")
    print("witaj świecie\n")

    //zmienne i stałe
    val popcorn = 5 //mam 5 pudełek popcornu
    val hotdog = 7 //mam 7 hotdogow
    var customers = 10 //10 kliemtow w kolejce

    customers = 8
    println(customers)

    //customers = customers+3
    customers+3
    customers += 3
    customers -= 3
    customers *= 3
    customers /= 3

    println("Jest $customers klientow w kolejce")
    println("Jest ${customers+1} klientow w kolejce")
    println("Jest $customers klientow w kolejce")
}