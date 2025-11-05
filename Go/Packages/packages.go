package main

import (
	"fmt"
	"hello/Packages/auth"
	"hello/Packages/useInfo"
)

func main() {

	auth.LoginWithCredential("coder","123qwe")

	session := auth.GetSession()

	fmt.Println(session)

	user := useInfo.User{

			Email: "akhi@gmail.com",
	        Name: "Akhi",
	}

	fmt.Println(user.Email,user.Name)
	



}
