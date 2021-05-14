let isHappyTicket = (str) => {
    if (isNaN(str) || str["toString"]().length%2!==0) return false;
    let firsthalfStr = str["toString"]().substr(0, str["toString"]().length/2);
    let lasthalfStr = str["toString"]().substr(str["toString"]().length/2)
    return firsthalfStr.split("").reduce((sum, digit) => Number(sum)+Number(digit)) === lasthalfStr.split("").reduce((sum, digit) => Number(sum)+Number(digit));
}
