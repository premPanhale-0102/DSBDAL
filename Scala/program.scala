// nano word_count.scala
val data=sc.textFile("input.txt")
data.collect;
val splitdata = data.flatMap(line => line.split(" "));
splitdata.collect;
val mapdata = splitdata.map(word => (word,1));
mapdata.collect;
val reducedata = mapdata.reduceByKey(_+_);
reducedata.collect;




// nano factorial.scala
def factorial(n: Int): Int = {
  if (n == 0) 1 else n * factorial(n - 1)
}
val num = 5
println("Factorial = " + factorial(num))




// nano bubblesort.scala
def bubbleSort(arr: Array[Int]): Array[Int] = {
  val n = arr.length
  for (i <- 0 until n) {
    for (j <- 0 until n - i - 1) {
      if (arr(j) > arr(j + 1)) {
        val temp = arr(j)
        arr(j) = arr(j + 1)
        arr(j + 1) = temp
      }
    }
  }
  arr
}

val arr = Array(5, 2, 9, 1, 3)
val sorted = bubbleSort(arr)

println("Sorted Array: " + sorted.mkString(", "))
