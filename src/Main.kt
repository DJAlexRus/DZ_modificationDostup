fun main() {
//Задание 1
    val registration = Registration("test@ya.ru")
    println(registration.getEmail())
    registration.pass = "ldrk44g"
    println(registration.pass)
    println()
//Задание 2
    val matrix: Array<Array<Int>> = Array(4){Array(4){(10..90).random()}}
    print2DArr(matrix)

    val matrixTemp =searchEvenNumArr(matrix)
    println("Четных чисел ${matrixTemp.size}: ${matrixTemp.contentToString()}")
//Задание 3
    println()
    val matrixTwo = create2DArr()
    print2DArr(matrixTwo)
//Задание 4
    println()
    println("Четные числа: ${searchEvenNumArr(matrixTwo).contentToString()}")
}
fun searchEvenNumArr(arr2DNum: Array<Array<Int>>): Array<Int>{
    var arrEven = Array(0){0}
    var count = 0
    for (i in arr2DNum.indices){
        for (j in arr2DNum[0].indices) {
            if (arr2DNum[i][j] % 2 == 0) {
                arrEven += arrayOf(arr2DNum[i][j])
            }
        }
    }
    return arrEven
}
fun print2DArr(arr2DNum: Array<Array<Int>>){
    for (row in arr2DNum){
        for (element in row){
            print("${element}\t")
        }
        println()
    }
}
fun create2DArr():Array<Array<Int>>{
    val tempArr: Array<Array<Int>> = Array(4){Array(4){(1..16).random()}}
    return tempArr
}

