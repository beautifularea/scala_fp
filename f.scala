object helloworld {
    def fib(n: Int): Int = {
        def go(n: Int): Int = 
            if(n <= 2) return 1
            else return go(n-1) + go(n-2)

        go(n)
    }

    def main(args: Array[String]) {
        println(fib(10))
    }
}

