fun main() {
    words("Carpenter", "Plumber", "Mechanic", "Tailor")
    capital()
    sums()
    sentence("Melinda, Sarah, Benjamin")
}
fun words(x: String, y: String, z: String, p: String){
 var names = arrayOf(x, y, z, p)
    println(names.contentToString())
}
fun capital() {
    var cities = arrayOf("Harare", "mumbai", "dodoma", "jakarta")
    for (city in cities ) {
    println(city.capitalize())
    }

}
fun sums() {
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1] + numbers[4]
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun sentence(name: String):String{
    var sentences = arrayOf(String)
    return sentences.contentToString()


}
