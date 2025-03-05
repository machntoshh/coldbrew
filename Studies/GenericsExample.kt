// Generic Classes

class MutableStack<E>(vararg items: E) {

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

// ---------------------------------------------------------------------------------------------
// Generic Functions

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun stacking() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}

// ---------------------------------------------------------------------------------------------
// DeepSeek example for better understanding

class Caixa<T>(var conteudo: T) {
    fun getConteudo(): T {
        return conteudo
    }
}

fun main() {
    val caixaDeInt = Caixa(42) // Tipo inferido como Int
    val caixaDeString = Caixa("Olá") // Tipo inferido como String

    println(caixaDeInt.getConteudo()) // 42
    println(caixaDeString.getConteudo()) // Olá
}