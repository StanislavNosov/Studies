let dnaToRna = (dna) => {
    let rna = null;
    if (/^[GCTA]+$/.test(dna.toString()) || dna === '') {
        rna = '';
        for (char of dna) {
            if (char==="G") rna += "C";
            if (char==="C") rna += "G";
            if (char==="T") rna += "A";
            if (char==="A") rna += "U";
        }
    }
    return rna;
}

console.log(dnaToRna(""))
