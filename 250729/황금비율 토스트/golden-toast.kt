fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val breadState = readLine()!!.toMutableList()
    var cursor = n
    
    // Please write your code here.
    
    for (i in 0 until m) {
        val tokens = readLine()!!.split(" ")
        when (tokens[0]) {
            "L" -> {
                if(cursor == breadState.size) continue
                cursor++
            }
            "R" -> {
                if(cursor == 0) continue
                cursor--
            }
            "D" -> {
                if(cursor == 0) continue
                cursor--
                breadState.removeAt(cursor)
            }
            "P" -> {
                val a = tokens[1].toCharArray()[0]
                breadState.add(cursor, a)
            }
        }
    }
    println(breadState.joinToString(""))
}