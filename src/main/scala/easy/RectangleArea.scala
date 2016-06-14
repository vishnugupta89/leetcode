package easy


class RectangleArea {


  def distance(a: Int, b: Int) = b - a

  def computeArea(a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int) = {
    val firstHeight = (d - b)
    val firstWidth = (c - a)
    val firstSquare = firstHeight * firstWidth
    val secondHeight = (h - f)
    val secondWidth = (g - e)
    val secondSquare = secondHeight * secondWidth
    val intersectHeight = (firstHeight + secondHeight) - (d - f)
    val intersectWidth = (firstWidth + secondWidth) - (g - a)

    firstSquare + secondSquare - (intersectHeight * intersectWidth)
  }

  def test = {
    assert(distance(0, 6) == 6)
    assert(distance(-3, 3) == 6)
    assert(computeArea(-3, 0, 3, 4, 0, -1, 9, 2) == 45)
  }

}
