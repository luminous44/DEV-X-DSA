package main

import "fmt"

func main() {
	var num [4]int
	fmt.Println(len(num))

	var name[3]string
	name[1] = "Akhi"
	fmt.Println(name[1])
	fmt.Println(name)

	isTrue := [5]bool{true,false,true,true,false}
    fmt.Println(isTrue)

    city := [2][2]string{{"dhaka", "cumilla"}, {"ctg", "josor"}}
    fmt.Println(city)

	numbers :=[...]int{1,2,3}
	fmt.Println(len(numbers))
    
	arr := [4]int{1:20, 3:30}
    fmt.Println(arr)

	
}
