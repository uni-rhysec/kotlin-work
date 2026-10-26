// Task 12.1: program that uses a Point object

fun main() {
    val p = Point(5.0,10.0)

    p.x = 1.0

    println(p.x)
    println(p.y)

    println(p.distance())
    val p2 = Point(4.5,7.0)
    println(p.distanceTo(p2))


}