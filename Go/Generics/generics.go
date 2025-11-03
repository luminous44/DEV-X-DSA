package main

import "fmt"

func printSlice[T comparable, V string  ](items []T, name V) { // we can use comparable or any or interface{} 
// or for specific some type  int | string 
	for _, item := range items {
		fmt.Println(item)
	}
}
type stack [T any] struct{
	elements[]T
}
func main() {
    
	names := []string{"going", "typescript"}
	printSlice(names, "akhi")

	myS := stack[string]{
		 elements: []string{"golang"},
	}

	fmt.Println(myS)
}