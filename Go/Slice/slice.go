package main

import (
	"fmt"
	"slices"
)

func main() {

	fmt.Println("Slice") 
	var num []int
	fmt.Println(num)
	fmt.Println(len(num))
	fmt.Println(num == nil)

	var nums = make([]int, 3,5)
	fmt.Println(len(nums))
	fmt.Println("Capacity",cap(nums))

	nums = append(nums, 1)
	nums = append(nums, 2)
	nums = append(nums, 3)
	nums = append(nums, 4)
	nums = append(nums, 5)
	fmt.Println(nums)
	fmt.Println(len(nums))
	fmt.Println("Capacity",cap(nums))

	var arr = make([]int, 0,5)
	arr = append(arr, 1)
	arr = append(arr, 2)
	arr = append(arr, 3)

	var arr = make([]int,2,5)
	arr[0] = 3
	fmt.Println(arr)

	// copy slice
	arr := make([]int,0,5)
	arr = append(arr, 1)
	arr1 := arr
	
	fmt.Println(arr,arr1)

	//slice operator
    
	 var op = []int{1,2,3,4,5}
	 fmt.Println(op[0:4])
	 fmt.Println(op[:3])
	 fmt.Println(op[1:])

	 arr := []int{1,2}
	 arr1 := []int{1,2}
	 arr2 := []int{2,3}
	 fmt.Println(slices.Equal(arr,arr1))
	 fmt.Println(slices.Equal(arr,arr2))
   
	// 2d slice

	var num = [][] int {{1,2,3},{3,4,5}}

	fmt.Println(num)

	

}