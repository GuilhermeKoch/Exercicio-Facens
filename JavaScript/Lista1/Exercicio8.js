function contarVogais(str) {
    str = str.toLowerCase();
    let contadorVogais = 0;
    
    for (let i = 0; i < str.length; i++) {
        if (str[i] === 'a' || str[i] === 'e' || str[i] === 'i' || str[i] === 'o' || str[i] === 'u') {
            contadorVogais++;
        }
    }
    return contadorVogais;
}

console.log(contarVogais("Teste de Vogais"));