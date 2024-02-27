var numerosComTracos = '';

for (let i = 1; i <= 10; i++) {
    numerosComTracos += i;
    if (i < 10) {
        numerosComTracos += ' - ';
    }
}

console.log(numerosComTracos);
