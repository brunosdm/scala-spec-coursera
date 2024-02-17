package recfun

object RecFun extends RecFunInterface:

  def main(args: Array[String]): Unit =
    println("Pascal's Triangle")
    for row <- 0 to 10 do
      for col <- 0 to row do
        print(s"${pascal(col, row)} ")
      println()

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if c == 0 || c == r then 1 else pascal(c-1, r-1) + pascal(c, r-1)


  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceHelper(chars: List[Char], openParen: Int): Boolean =
      if openParen == -1 then false
      else if chars.isEmpty then if openParen != 0 then false else true
      else balanceHelper(chars.tail, openParen + openParenVal(chars.head))

    def openParenVal(char: Char): Int =
      if char == '(' then 1 else if char == ')' then -1 else 0

    balanceHelper (chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def helper(money: Int, cur: Int, coins: List[Int]): Int =
      if cur == money then 1 else if cur > money then 0
      else if coins.isEmpty then 0
      else helper(money, coins.head + cur, coins) + helper(money, cur, coins.tail)

    helper(money, 0, coins)
  }
