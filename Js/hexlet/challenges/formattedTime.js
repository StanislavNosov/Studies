let formattedTime = (num) => {
    const now = new Date();
    const midnight = new Date(now.getFullYear(), now.getMonth(), now.getDate(), 00, 00, 00, `${num*60*1000}`);
    const hours = `${midnight.getHours()}` >= 10 ? `${midnight.getHours()}` : "0" + `${midnight.getHours()}`;
    const minutes = `${midnight.getMinutes()}` >= 10 ? `${midnight.getMinutes()}` : "0" + `${midnight.getMinutes()}`;
    return `${hours}:${minutes}`;
}