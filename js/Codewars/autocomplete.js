const autocomplete = (input, dictionary) => {
    let r = new RegExp('^'+`${input}`.replace(/[^a-z]/gi,''),'i')
    console.log(r);
    return dictionary.filter(w=>r.test(w)).slice(0,5)
  }