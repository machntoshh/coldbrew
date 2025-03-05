fun main() {
    println(whenAssign("Hello")) // printe a função whenAssign com o Any obj como "Hello"
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MinhaClass()))
}

fun whenAssign(obj: Any): Any { // função whenAssign que recebe qualquer obj como parametro e retorna qualquer coisa
    val result = when (obj) {   // váriavel result vai ser atribuida quando o obj...
        1 -> "one"              // se o obj for 1 vai receber "One"
        "Hello" -> 1            // se o obj for "Hello" vai receber 1
        is Long -> false        // se for um Long vai receber false
        else -> 42              // se não (default) vai receber 42
    }
    return result               // retorna o resultado da variável
}

class MinhaClass