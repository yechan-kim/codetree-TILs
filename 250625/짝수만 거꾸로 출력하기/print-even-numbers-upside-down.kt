fun main() {
    val N = readLine()!!.toInt()
    val input = readLine()!!.split(" ")

    for (i in N - 1 downTo 0) {
        val num = input[i].toInt()
        
        if (num % 2 == 0) {
            print("$num ")
        }
    }
}