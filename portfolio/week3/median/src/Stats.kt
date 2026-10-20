// Task 7.7.1: statistics functions

fun median(list: List<Float>): Float {
    val listSize = list.size
    if (listSize == 0) { // 0 size
        throw IllegalArgumentException()
    }
    val sortedList = list.toMutableList()
    sortedList.sort()

    if (listSize %2 == 1) { // odd size
        return sortedList[(listSize + 1) / 2 - 1]
    } else { // even size
        return (sortedList[listSize / 2] + sortedList[(listSize / 2) - 1]) / 2f
    }
}

fun displayStats(list: List<Float>) {
    println("MIN: ${list.min()}")
    println("MAX: ${list.max()}")
    println("MEAN: ${list.average()}")
    println("MEDIAN: ${median(list)}")
}