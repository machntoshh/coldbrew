//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val neverNull = "Não pode ser nula"


    fun strLength(notNull: String): Int = notNull.length
    
    println(strLength(neverNull))
}