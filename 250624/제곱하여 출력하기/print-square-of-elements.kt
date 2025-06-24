fun main() {
    val N = readLine()!!.toInt()
    val input = readLine()!!.split(" ")

    for (i in 0..N-1) {
        val number = input[i].toInt()
        print("${number * number} ")
    }
}