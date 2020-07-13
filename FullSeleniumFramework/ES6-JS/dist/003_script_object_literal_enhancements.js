// This is an example for object_literal_enhancements


window.onload = function (){
	
	console.log("--------------part 1-----------");
	
	var model = "Mazda";
	
	var color = "black";
	
	var car = {							//car object populating way in es5
			model: model,
			color: color
	};				
	
	console.log("Populating way in es5 ");
	
	console.log(car);
	console.log(car.model);
	console.log(car.color);
	
	console.log("--------------part 2-----------");
	
	car = {model,color}; 				//car object populating way in es6
	
	console.log("Populating way in es6 ");
	
	console.log(car);
	console.log(car.model);
	console.log(car.color);
	
	
	console.log("--------------part 3-----------");
	
	car = {model,color,											//car object populating way in es6
			chop(x){											//A function in the car object that is getting a number and printing the text
				console.log(`Your ${model} car is not clean, you need to clean it ${x} times `)
			}
			}; 				
	
	console.log("Populating way in es6 ");
	
	console.log(car);
	console.log(car.model);
	console.log(car.color);
	console.log(car.chop(7));									//Calling the function in the car object and sending the number to the function
	

}

