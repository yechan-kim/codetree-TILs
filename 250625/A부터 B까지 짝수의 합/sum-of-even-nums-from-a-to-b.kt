fun main() {
    val input = readLine()!!.split(" ")
    val A = input[0].toInt()
    val B = input[1].toInt()

    var sum = 0

    for(i in A..B){
        if(i % 2 == 0) sum += i
    }

    print(sum)
}