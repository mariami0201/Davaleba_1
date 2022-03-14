fun sashualo(nums: Array<Int>): Int {
    var index = 0
    for (i in  nums.indices step 2) {
        if(i == 0) continue
        index += nums[i]
    }
    return index / ((nums.size - 1) / 2)
}

fun palindromi(word: String): Boolean {
    return word == word.reversed()
}

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5 , 6, 7, 8, 9, 10, 11,1,13)
    println(sashualo(numbers))

    println(palindromi("lool"))
    println(palindromi("magazine"))

}