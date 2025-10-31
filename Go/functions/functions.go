package main

import "fmt"

func add(a int, b int) int{
	return a + b
}
func lang()(string,string,int){
	return "go","lang",12
}

func processIt() func(a int) int{
    
	return func(a int) int {
		return 4;
	}
}

func sum(par ...int) int {
	total := 0

	for _, el := range par{
		total+=el
		
	}
	return total
}

func main() {
	res := add(2, 3)
	fmt.Println(res)
	fmt.Println(lang())
	l1,l2,in1 := lang() //store in variable
	fmt.Println(l1,l2,in1)
	l11,l22,_ := lang()
	fmt.Println(l11,l22) // _ unused variable


	fn := processIt()
	fmt.Println(fn)
   
	 num := []int{2,3,4}
	fmt.Println(sum(1,2,3,4,5))
	fmt.Println(sum(num...))


}