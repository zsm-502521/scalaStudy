/**
 * 参数
 */
object parameter {
  def main(args: Array[String]): Unit = {
    //可变参数
    def f1(name: String*): Unit = {
      println(name)
    }
    f1("bob")
    f1("21", "alice", "bob")

    //可变参数 放到参数最后
    def f2(a: String, b: String*): Unit = {
      println("a " + a + "\tb " + b)
    }
    f2("bob")
    f2("1212", "121", "234")

    //参数默认值
    def f3(c:String = "默认",d :Int = 1):Unit={
      println(s"c\t${c}\t d\t${d}")
    }
    f3("hello scala",9877)

    //带名参数

  }
}
