fun main() {
    val N = readLine()!!.toInt()
    var sum = 0

    for (i in 1..N) {
        sum += i

        if(sum >= N){
            print(i)

            return
        }
    }
}