const fizzBuzz = (start, end) => {
    for (start; end>=start; start+=1) {
        if (start%3===0 && start%5===0) {
            console.log("FizzBuzz");
            continue;
        };
        if (start%3===0) {
            console.log("Fizz");
            continue;
        };
        if (start%5===0) {
            console.log("Buzz");
            continue;
        };
        console.log(start);
    }
}