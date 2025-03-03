

fun main() {
    fun describeString(maybeString: String?): String { // talvez string 🤔
        if (maybeString != null && maybeString.length > 0) {
            return "String tem o tamanho de ${maybeString.length} caractéres"
        } else {
            return "Vazio"
        }
    }

    println(describeString("Olá tudo bem com você?")) // vai retornar o tamanho
    println(describeString(null)) // vai retornar vazio
}