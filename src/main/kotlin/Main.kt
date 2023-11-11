fun main() {
    println("Введите первое число:")
    val num1 = readLine()?.toIntOrNull()

    println("Введите второе число:")
    val num2 = readLine()?.toIntOrNull()

    if (num1 != null && num2 != null && num1 != num2) {
        val result = if ((num1 + num2) % 2 != 0) {
            "Из введенных чисел можно создать нечетное число."
        } else {
            "Создать нечетное число невозможно."
        }
        println(result)
    } else {
        println("Некорректный ввод. Пожалуйста, введите два различных числа.")
    }
}
