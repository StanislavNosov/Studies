const makeCensored = (sentence, stopWords) => {
    let resault = [];
    const words = sentence.split(' ');
    for (const word of words) {
        const newWord = stopWords.includes(word) ? '$#%!' : word;
        resault.push(newWord)
    }
    return resault.join(' ')
  }
  let s = 'When you play the game of thrones, you win or you game'
  let st = ['play', 'game']

  makeCensored (s, st)