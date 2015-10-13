package kduraj

/**
 * Created by kevin1 on 10/13/15.
 */
object Parallel {

  def apply(i: Int): Unit = {

    // parallel execution
    val data = 1 to i
    val result = data.par.map(parallelCalculation)

  }

  def parallelCalculation(number: Int) = {

    println("calculating ..." + number)
    Thread.sleep(100)
    number * 2
  }
}
