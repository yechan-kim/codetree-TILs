fun main() {
    val input = readLine()!!.split(" ")

    val A = input[0]
    val B = input[1]
    val sizeA = A.length
    val sizeB = B.length

    if(sizeA > sizeB){
        print("${A} ${sizeA}")
    } else if (sizeA == sizeB){
        print("same")
    } else {
        print("${B} ${sizeB}")
    }
}