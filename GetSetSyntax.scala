import fiddle.Fiddle, Fiddle.println
import scalajs.js

@js.annotation.JSExportTopLevel("ScalaFiddle")
object ScalaFiddle {
  // $FiddleStart
  class Point {
    private var _x = 0
    private var _y = 0
    private val bound = 100
  
    def x = _x
    // _=는 Setter를 정의한다. 그래서 띄어서 쓰면안된다.
    // Unit은 자바의 void와 같다고 생각하면된다.
    def x_= (newValue: Int): Unit = {
      if (newValue < bound) _x = newValue else printWarning
    }
  
    def y = _y
    def y_= (newValue: Int): Unit = {
      if (newValue < bound) _y = newValue else printWarning
    }
  
    private def printWarning = println("WARNING: Out of bounds")
  }
  
  val point1 = new Point
  point1.x = 99
  point1.y = 101 // prints the warning
  // $FiddleEnd
}
