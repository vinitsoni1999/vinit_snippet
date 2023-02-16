fun removeElement(arr: Array<String>, itemIndex: Int): Array<String> {
    val arrList = arr.toMutableList()
    
    arrList.removeAt(itemIndex)
    
    return arrList.toTypedArray()
}

fun main() {
	var fruits = arrayOf<String>("Apple", "Banana", "Orange", "Papaya")
    
    // Remove second element from array
    fruits = removeElement(fruits, 1)
    
    println(fruits.contentToString())
}
