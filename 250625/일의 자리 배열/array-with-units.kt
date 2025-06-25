fun main() {
    val input = readLine()!!.split(" ")

    var num1 = input[0].toInt()
    var num2 = input[1].toInt()

    print("${num1} ${num2} ")

    for (i in 2..9) {
        var tmp = num2
        num2 = (num2 + num1) % 10
        num1 = tmp
        print("${num2} ")
    }
}