function ePalindromo(palindromo) {
    palindromo = palindromo.toLowerCase().replace(/\s/g, '');
    
    let inicio = 0;
    let fim = palindromo.length - 1;
    
    while (inicio < fim) {
        if (palindromo[inicio] !== palindromo[fim]) {
            return false;
        }
        inicio++;
        fim--;
    }
    return true;
}

console.log(ePalindromo("arara"));
console.log(ePalindromo("reviver"));
console.log(ePalindromo("roma é amor"));
console.log(ePalindromo("javascript"));