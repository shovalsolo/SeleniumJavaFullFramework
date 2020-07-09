'use strict';

// This is an example for promises


//Immediately Resolved promise

console.log('------Immediately Resolved promise-----');

var myPromise = Promise.resolve('Foo');

myPromise.then((res) => console.log(res));


console.log('------Timed Resolved promise-----');



var myPromise1 = new Promise(function(resolve, reject){
	setTimeout(()=> resolve(4, 2000));
});

myPromise1.then((res) => {
	res +=3;
	console.log(res);
});

console.log('------Returned data Resolved promise-----');

function getData(method, url){
	return new Promise(function(resolve, reject){
		var xhr = new XMLHttpRequest();
		xhr.open(method, url);
		xhr.onload = function(){
			if(this.status >= 200 && this.status< 300){
				resolve(xhr.response);
		}else {
			reject({
				status: this.status,
				statusText: xhr.statusText
			});
		}
		};
		xhr.onerror = function(){
			reject({
				status: this.status,
				statusText: xhr.statusText
			});
		};
		xhr.send();
	});
}


getData('GET', 'https://jsonplaceholder.typicode.com/todos').then(function(data){
	console.log(data);
	let todos = JSON.parse(data);
	let output = '';
	for(let todo of todos){
		output +=`
		<li>
			<h3>${todo.title}</h3>
			<p>Completed: ${todo.completed}</p>
		</li>`;
	}
	
	document.getElementById('template').innerHTML = output;
	
}).catch(function(err){
	console.log(err)
});