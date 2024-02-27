function validarEmail(email) {
    if (email.indexOf('@') === -1 || email.indexOf('@') !== email.lastIndexOf('@')) {
        return false;
    }
    if (email.lastIndexOf('.') < email.indexOf('@')) {
        return false;
    }
    if (email.lastIndexOf('.') === email.length - 1) {
        return false;
    }
    return true;
}

console.log(validarEmail('email@exemplo.com')); 
console.log(validarEmail('email@.com'));
console.log(validarEmail('email@exemplo')); 
console.log(validarEmail('email@exemplo.'));
console.log(validarEmail('email@@exemplo.com')); 
