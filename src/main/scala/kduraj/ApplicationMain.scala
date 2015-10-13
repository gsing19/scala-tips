package kduraj

import java.io.File

object ApplicationMain extends App {

  ScalaRegex("""289 Testing""")
  Parallel(10)
  ScalaString()
  ScalaOption()

  def testCollections(): Unit = {
    val file = new File(getClass.getClassLoader.getResource("test.dat").getPath)
    var count: Int = 0

    println("-------- Lists ------------\n")
    testLists
    println("--------- Maps ------------\n")
    testMaps

    def testLists: Unit = {
      val list = new BasicList(file)
      list.read2List()
      list.read2Seq()
      list.read2Set()
      list.read2ListBuffer()
    }


    def testMaps: Unit = {
      val map = new BasicMaps(file)
      map.read2Map()
      map.read2HashMap()
      map.read2ListMap()
      map.read2TreeMap()
    }
  }
}