const areBracketsBalanced = (braces) => {
    const regexp = new RegExp('\\(\\)|\\[\\]|\\{\\}');
    while ( braces.match(regexp)) {
        braces = braces.replace(regexp, '');
    }
    return braces.length === 0;
}
export {areBracketsBalanced};