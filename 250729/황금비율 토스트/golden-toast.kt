fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val breadState = readLine()!!.toMutableList()
    var cursor = n
    
    // Please write your code here.
    
    for (i in 0 until m) {
        val tokens = readLine()!!.split(" ")
        when (tokens[0]) {
            "R" -> {
                if(cursor == breadState.size) continue
                cursor++
            }
            "L" -> {
                if(cursor == 0) continue
                cursor--
            }
            "D" -> {
                if(cursor == breadState.size) continue
                breadState.removeAt(cursor)
            }
            "P" -> {
                val a = tokens[1].toCharArray()[0]
                breadState.add(cursor, a)
                cursor++
            }
        }
    }
    println(breadState.joinToString(""))
}