const invertCase = (string) => {
    let newString = "";
    for (char of string) {
        if (char === char.toLowerCase()) {
            newString += char.toUpperCase();
        } else 
            newString += char.toLowerCase()
    }
    return newString;
}