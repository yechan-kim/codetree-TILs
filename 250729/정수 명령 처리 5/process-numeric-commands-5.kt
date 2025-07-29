fun main() {
    val n = readLine()!!.toInt()
    val list = ArrayList<Int>()

    for (i in 0 until n) {
        val parts = readln().split(" ")

        when (parts[0]) {
            "push_back" -> {
                val a = parts[1].toInt()
                list.add(a)
            }
            "pop_back" -> {
                list.removeAt(list.size-1)
            }
            "size" -> {
                System.out.println(list.size)
            }
            "get" -> {
                val a = parts[1].toInt()
                System.out.println(list.get(a-1))
            }
        }
    }
}