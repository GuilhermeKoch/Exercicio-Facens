function dobro(numero){
    if(numero > 0 ){
        return numero * 2;
    } else {
        return "Só é aceito números positivos maiores que zero"
    }
}

console.log(dobro(2))
console.log(dobro(4))
console.log(dobro(0))
console.log(dobro(-5))