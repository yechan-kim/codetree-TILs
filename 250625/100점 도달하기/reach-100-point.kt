fun main() {
    val score = readLine()!!.toInt()

    for(i in score..100){
        if(i >= 90){
            print("A ")
        } else if(i >= 80){
            print("B ")
        } else if(i >= 70){
            print("C ")
        } else if(i >= 60){
            print("D ")
        } else{
            print("F ")
        }
    }
}