import java.util.LinkedList


fun main() {
    val n = readLine()!!.toInt()
    val linkedList = LinkedList<Int>()

    repeat(n) {
        val tokens = readln().split(" ")

        when (tokens[0]) {
            "push_back" -> {
                val a = tokens[1].toInt()
                linkedList.addLast(a)
            }
            "push_front" -> {
                val a = tokens[1].toInt()
                linkedList.addFirst(a)
            }
            "pop_back" -> {
                println(linkedList.removeLast())
            }
            "pop_front" -> {
                println(linkedList.removeFirst())
            }
            "size" -> {
                println(linkedList.size)
            }
            "empty" -> {
                println(if (linkedList.isEmpty()) 1 else 0)
            }
            "front" -> {
                println(linkedList.first())
            }
            "back" -> {
                println(linkedList.last())
            }
        }
    }
    // Please write your code here.
}