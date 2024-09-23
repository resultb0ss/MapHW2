fun main() {
    val people = mutableMapOf(1 to "Иван", 2 to "Петр", 3 to "Лида", 4 to "Петр", 5 to "Анна")


    println("Введите значение")
    var input = readln()
    delVal(input,people)

}

fun delVal(input: String, array: MutableMap<Int,String>){
    println(if (input in array.values) array.filter { it.value != input } else "Такого значения нет")
}


