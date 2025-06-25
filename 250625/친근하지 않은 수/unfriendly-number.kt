fun main() {
    val N = readLine()!!.toInt()
    var cnt = 0

    for (i in 1..N) {
        if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0) continue
        cnt++
    }

    print(cnt)
}