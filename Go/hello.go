package main

import (
	"fmt"
	"time"
)
const gender = "Female"
func main() {

	fmt.Println("Welcome to Go Programming Language")
	fmt.Println(1 + 1)
	fmt.Println(true)
	fmt.Println(10.5)
	fmt.Println(10.0/3.0)

	variables

	var name string = "Aklema"

	var name = "Sultana"
	 name := "Akhi"

	var name string
	name = "Akhi" 
	fmt.Println(name)
    constant
	const age = "26"
    fmt.Println(age)

     fmt.Println(gender)

	 const (

		port = 8080

		host = "localhost"
	 )

	 fmt.Println(port,host)

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

	if else

	age := 18

	if age >= 18 {

		fmt.Println("Person is an Adult")
	} else {
		fmt.Println("Person is not an Adult")
	}
	if else-if
	age := 6
	if age >= 18 {

		fmt.Println("Person is an Adult")
	} else if age >= 12 {
		fmt.Println("Person is a Teenager")
	} else {
		fmt.Println("Person is not a Kid")
	}

	user := "Admin"

	hasPermission := false

	if user == "Admin" && hasPermission{
		fmt.Println("Yes")
	}else{
			fmt.Println("No")
	}

	// go doesn't have any ternary operator

	// variable declareation in if block

	if age:=15; age >= 18{
	    fmt.Println("Person is an Adult", age)
	} else if age >= 12 {
		fmt.Println("Person is a Teenager",age)
	} else {
		fmt.Println("Person is not a Kid",age)
	}

	// simple switch

	i := 2
	switch i {
	case 1:
		fmt.Println("one")
	case 2:
		fmt.Println("Two")
	default :
	 fmt.Println("Other")
	}

	// multiple condition switch

	switch time.Now().Weekday(){
	case time.Friday, time.Saturday :
		fmt.Println("It's Weekend")
    default:
		fmt.Println("It's WorkDay")
	}

	whoAmI := func (i interface{})  {

		switch i.(type){
		case int:
			fmt.Println("Integer")
		case bool:
			fmt.Println("Boolean")
		case string:
			fmt.Println("String")
		default:
			fmt.Println("Other")
	 }
	}
	whoAmI(1.0)


}
