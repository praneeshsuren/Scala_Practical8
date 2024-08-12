@main def main2(): Unit = {
    print("Enter an integer: ");
    val num = scala.io.StdIn.readInt();

    val multipleOfBoth = (n: Int) => n % 3 == 0 && n % 5 == 0
    val multipleOfThree = (n: Int) => n % 3 == 0
    val multipleOfFive = (n: Int) => n % 5 == 0

    num match{
        case n if multipleOfBoth(n) => println("Multiple of Both Three and Five")
        case n if multipleOfThree(n) => println("Multiple of Three")
        case n if multipleOfFive(n) => println("Multiple of Five")
        case _ => println("Not a Multiple of Three or Five")
    }
}