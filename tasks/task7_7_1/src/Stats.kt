// Task 7.7.1: statistics functions

fun median(list: List<Float>): Float {
    val listSize = list.size
    list.sorted()
    if (listSize %2 == 1) { // odd size
        return list[(listSize + 1) / 2 - 1]
    } else { // even size
        return (listOf(list[listSize / 2], list[(listSize / 2) - 1])).average().toFloat()
    }
}

fun displayStats(list: List<Float>) {
    println("MIN: ${list.min()}")
    println("MAX: ${list.max()}")
    println("MEAN: ${list.average()}")
    println("MEDIAN: ${median(list)}")
}