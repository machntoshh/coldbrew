// arquivo para aprendizado de classes

class Customer // não sou obrigado a colocar como maiusculo a 1 letra, porém é um bom hábito

class Contact(val id: Int , var email: String) // declarando uma classe com 2 props e um contructor com 2 params

fun main() {
    val customer = Customer() // criando uma instância da classe via default, olha q n tem new em
    val contact = Contact(1, "arcanumrunic@mail.com") // instancia com os argumentos

    println(contact.id) // puxando o id em contact e printando na tela
    contact.email = "arcanummagus@mail.com" // alterando o prop mutável
    println(contact.email)

}