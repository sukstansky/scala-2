import org.scalatest.{FunSuite, Matchers}

class ChangeTest extends FunSuite with Matchers {
  test("single coin change") {
    Change.findFewestCoins(25, List(1, 5, 10, 25, 100)) should be (Some(List(25)))
  }

  test("multiple coin change") {
    pending
    Change.findFewestCoins(15, List(1, 5, 10, 25, 100)) should be (Some(List(5, 10)))
  }

  test("change with Lilliputian Coins") {
    pending
    Change.findFewestCoins(23, List(1, 4, 15, 20, 50)) should be (Some(List(4, 4, 15)))
  }

  test("change with Lower Elbonia Coins") {
    pending
    Change.findFewestCoins(63, List(1, 5, 10, 21, 25)) should be (Some(List(21, 21, 21)))
  }

  test("large target values") {
    pending
    Change.findFewestCoins(999, List(1, 2, 5, 10, 20, 50, 100)) should
      be (Some(List(2, 2, 5, 20, 20, 50, 100, 100, 100, 100, 100, 100, 100, 100, 100)))
  }

  test("no coins make 0 change") {
    pending
    Change.findFewestCoins(0, List(1, 5, 10, 21, 25)) should be (Some(List()))
  }

  test("error testing for change smaller than the smallest of coins") {
    pending
    Change.findFewestCoins(3, List(5, 10)) should be (None)
  }

  test("cannot find negative change values") {
    pending
    Change.findFewestCoins(-5, List(1, 2, 5)) should be (None)
  }
}

