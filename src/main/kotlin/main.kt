package ru.netology

fun main() {
    val amount = 21
    declination(amount)
}

fun declination(amount: Int) {
    val stringAmount = amount.toString()
    val result = if (stringAmount.substring(stringAmount.lastIndex) == "1") {
        if (stringAmount.substring(stringAmount.lastIndex - 1) == "11")
            "Понравилось $amount людям"
        else
            "Понравилось $amount человеку"
    } else
        "Понравилось $amount людям"

    print(result)
}