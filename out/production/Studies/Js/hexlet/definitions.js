const definitions = (v) => {
    let str = [];
    for (const item of v) {
      str.push(`<dt>${item[0]}</dt><dd>${item[1]}</dd>`);
    }
    str = str.join('');
    return str.length === 0 ? '' : `<dl>${str}</dl>`;
  };
  export default definitions;