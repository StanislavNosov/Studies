let isPerfect = (num) => {
    if (isNaN(num) || num === 0) return false;
    let sum = 0;
    for (let i = 1; i<num; i+=1) {
        if (num%i===0) sum+=i;
    }
    return num === sum;
}