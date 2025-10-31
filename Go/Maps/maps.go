package main

import (
	"fmt"
	"maps"
)

func main() {

	mp := make(map[string]string)
	mp["name"] = "Lily"
	fmt.Println(mp["name"])


	// IMP note : if key doesn't exist in map then it's return zero value like for string -> nil, int -> 0, bool -> false
	m := map[string]int{"age":20}
    m["price"] = 50
	fmt.Println("Phone : ",m["phone"])
	fmt.Println(len(m))
	delete(m,"age")
	fmt.Println(m)
	clear(m)
	fmt.Println(m)

	info := map[string]int{"price":30,"phone":56}
	info2 := map[string]int{"price":30,"phone":56}
	v, ok := info["phones"]
    fmt.Println(v)
	if ok {
		fmt.Println("item exist")
	}else{
		fmt.Println("item not exist")
	}

	fmt.Print(maps.Equal(info,info2))

	for i, el := range info {
    fmt.Println(i, el)

	for i := range info2{
		fmt.Println(i)
	}

	for i, v := range "golang" {
		fmt.Println(i,v)
	}
}


} 

