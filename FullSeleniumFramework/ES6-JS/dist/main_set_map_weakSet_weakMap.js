'use strict';

// This is an example for set map weakSet and weakMap

console.log('-------------ARRAY------------');

let myArray = [11,22,34,65,34];
let mySet = new Set(myArray);

mySet.add('100');											//Adding a string to this array that has integers will look like this {11, 22, 34, 65, "100"}

mySet.add({a:1, b:2});										//Adding an object to this array that has integers and strings {11, 22, 34, 65, "100", {a: 1, b: 2}}

mySet.delete(22);											//Deleting an integer from the array

//mySet.clear();											//This will clear the array

console.log('The size of the array is: '+ mySet.size);		//Will print the size of the array

console.log(mySet);

mySet.forEach(function(val){								//A for each that will loop on the array
	console.log(val);
});


console.log('-----------MAP---------------');


let myMap = new Map([['a1','hello'],['b2', 'Goodbye']]);

myMap.set('c3' , 'Foo');

//myMap.delete('a1');										//This will delete the key and value of a1

console.log('The size of the map is: '+ myMap.size);		//Will print the size of the map

console.log(myMap);											//is an list array object that has a combination of key and value pair ('key','value')

console.log('------------weakSet--------------');

let carWeakSet = new WeakSet();								//Creating a WeakSet

let car1 = {												//Creating an array and populating it
		make: 'Honda',
		model: 'Civic'
}

let car2 = {												//Creating an array and populating it
		make: 'Toyota',
		model: 'Rav4'
}

carWeakSet.add(car1);										//Adding the array to the WeakSet

carWeakSet.add(car2);										//Adding the array to the WeakSet

//carWeakSet.delete(car2);									//Deleting car2 array from the WeakSet

console.log(carWeakSet);

console.log('------------weakMap--------------');

let phoneWeakMap = new WeakMap();

let key1 = {												//Creating an array and populating it
		id: 1
}

let phone1 = {												//Creating an array and populating it
		make: 'Apple',
		model: 'Iphone10'
}


let key2 = {												//Creating an array and populating it
		id: 1
}

let phone2 = {												//Creating an array and populating it
		make: 'Google',
		model: 'Nexus4'
}


phoneWeakMap.set(key1, phone1);								//Set is adding the array it is populating with key and value arrays

phoneWeakMap.set(key2, phone2);								//Set is adding the array it is populating with key and value arrays

//phoneWeakMap.delete(key2);								//Deleting phone2 array from the WeakMap using key2

console.log(phoneWeakMap);
