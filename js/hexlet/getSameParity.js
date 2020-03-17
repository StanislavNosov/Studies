const getSameParity = (arr) => {
    debugger;
    let parity = arr[0]&1;
    return arr.filter((item)=>(item&1) === parity);
}

getSameParity([2, 2, 8])
getSameParity([1, 2, 3])