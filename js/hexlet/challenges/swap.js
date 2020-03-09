const swap = (arr, index) => {
    if (index === 0 || index === arr.length - 1) return arr;
    let p = index - 1;
    let n = index + 1;
    let tmp = arr[p];
    arr[p] = arr[n];
    arr[n] = tmp;
    return arr;
  }