const diff = (a, b) => {

    let big = null;
    let small = null;
    let result1 = null;
    let result2 = null;
  
    if (a >= b) {
      big = a;
      small = b;
    }
    else {
      big = b;
      small = a;
    }
  
    result1 = big - small;
    result2 = 360 - big + small;
  
    if (result1 > result2)
      return result2;
    return result1;
  };