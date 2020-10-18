package ru.netology

fun main() {
    val amount = 61
    declination(amount)
}

fun declination(amount: Int) {
    val stringAmount = amount.toString()
    val result = if (stringAmount.substring(stringAmount.lastIndex) == "1") "Понравилось $amount человеку" else "Понравилось $amount людям"

    print(result)
}