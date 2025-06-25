fun main() {
    val N = readLine()!!.toInt()
    val input = readLine()!!.split(" ").map { it.toInt() }.sorted()

    for (i in 0 until N) {
        val num = input[i]
        
        if (num % 2 == 0) {
            print("$num ")
        }
    }
}