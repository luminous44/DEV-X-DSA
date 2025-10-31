package main

import "fmt"

func change(num *int) {

	*num = 5

}

func main() {
	num := 2
    fmt.Println("before change :", num)
	change(&num)
	fmt.Println("After Change :", num)


}