package funsets

object Main extends App:
  import FunSets.*
  println(contains(singletonSet(1), 1))
  println(forall(x => x < 1000, y => y > -1500))
