package main

import "fmt"
const gender = "Female"
func main() {

	// fmt.Println("Welcome to Go Programming Language")
	// fmt.Println(1 + 1)
	// fmt.Println(true)
	// fmt.Println(10.5)
	// fmt.Println(10.0/3.0)

	// variables

	//var name string = "Aklema"

	//var name = "Sultana"
	//  name := "Akhi"

	// var name string
	// name = "Akhi" 
	// fmt.Println(name)
    // constant
	// const age = "26"
    // fmt.Println(age)

    //  fmt.Println(gender)

	//  const (

	// 	port = 8080

	// 	host = "localhost"
	//  )

	//  fmt.Println(port,host)

	loop --> for is the only construct in go

     while loop
	i := 0

	for i<=3 {
		fmt.Println(i)
		i++
	}

	// for loop
	for i := 0; i < 3; i++ {
	  if i == 2 {
		continue
	  }
       fmt.Println(i)
	}

	// infinity loop

	for {
		 fmt.Println("i")
	}

	for i := range 11 {

	   fmt.Println(i)
	}


}
