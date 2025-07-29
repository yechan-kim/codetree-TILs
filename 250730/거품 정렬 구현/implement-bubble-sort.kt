fun main() {
    val n = readLine()!!.toInt()
    val arr = readln().split(" ").map { it.toInt() }.sorted()
    // Please write your code here.

    for(i in 0 until n){
        print("${arr[i]} ")
    }
}