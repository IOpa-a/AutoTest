let inputs = document.querySelector('#name');
let button = document.querySelector('#loginBtn');
let h2 = document.querySelector('h2');

button.addEventListener('click', function(e){
    e.preventDefault();
    h2.innerText = "Welcome " + inputs.value;
});