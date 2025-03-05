fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) { // Obj recebe qualquer tipo
    when (obj) {
        1 -> println("Um") // se o obj for = a 1, vai imprimir "um"
        "Hello" -> println("Greetings traveler") // se o obj for igual a "Olá" vai imprimir "Greetings traveler"
        is Long -> println("Long") // se for um Long vai imprimir "Long"
        !is String -> println("Não é uma string") //  se não for uma string vai printar "Não é uma string"
        else -> println("Unknown") // se não, printar "Unknown" | Opcional, default para o switch case
    }
}

class MyClass // criada uma class bem meh