const getTotalAmount = (wallet, curency) => {
    if (wallet.length === 0) return null;
    const r = new RegExp(`${curency + '\\s'}`);
    let summ = 0;
    for (const money of wallet) {
      if (money.match(r)) {
        summ += Number(money.replace(r, ''));
      }
    }
    return summ;
  };

  getTotalAmount(['eur 10', 'usd 1', 'eur 5', 'rub 100', 'eur 20', 'eur 100', 'rub 200'], 'eur')