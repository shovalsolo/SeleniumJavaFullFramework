'use strict';

// This is an example for template literals

function upperCase(word){										//This function will get a word and will convert to upper case and return
	return word.toUpperCase();
}

let name = 'John';

let template = `<h1>${upperCase('Hello')}, ${name}</h1><p>This is a simple template in JavaScript</p>`;	//populating with html content we can use params like ${name} in the string but we need to use `` backticks 

document.getElementById('template').innerHTML = template;		//This will display the template param content in the div with the template id
