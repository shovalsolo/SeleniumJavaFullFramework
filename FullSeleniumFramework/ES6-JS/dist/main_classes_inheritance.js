'use strict';

// This is an example for classes and inheritance

class User{
	
	constructor(username, email, password){					// constructor to initialize the parameters
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	
	static countUsers(){									//when we use the static method we need to call the function with the class name
		console.log('There are 50 users')
	}
	
	register(){												// A method that is printing the username
		console.log(this.username + ' Is now registered');
	}
}


let bob = new User('bob','bob@email.com','12345');			//creating an User object and sending the parameters to the constructor

bob.register();												//this will print the username

User.countUsers();											//Using User class - when we use the static method we need to call the function with the class name this will print the users message


console.log("--------------------------------------------------");


class Member extends User{
	constructor(username, email, password, memberPackage){					// constructor to initialize the parameters
		super(username, email, password);									//super can replace in this case the this initialization  
		this.memberPackage = memberPackage;
	}
	
	getPackage(){
		console.log(this.username +' is subscribed to the '+this.memberPackage + ' package')
	}
}


let mike = new Member('mike','mike@email.com','12345','Top');

mike.getPackage();

mike.register();