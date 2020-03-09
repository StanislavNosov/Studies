const squareDigits = (n) => n ** 2;
const sumOfSquareDigits = (n) => {
    let summ = 0;
    for (let value of String(n).split('').map(Number)) {
        summ += squareDigits(value)
    }
    return summ;
}

const isHappyNumber = (n) => {
    for (let i = 0; i < 10; i += 1) {
        if (n === 1) return true;
        n = sumOfSquareDigits(n);
    }
    return false;
}
export default isHappyNumber;