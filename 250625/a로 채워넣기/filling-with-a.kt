fun main() {
    val input = readLine()!!.toCharArray()

    input[1] = 'a'
    input[input.size - 2] = 'a'

    print(String(input))
}