

const data = new Date( );
const ora = data.getHours( );
const minuti = data.getMinutes( );
const secondi = data.getSeconds( );
const giorno = data.getDate( );
const mese = data.getMonth( );
const anno = data.getFullYear( );



console.log(`Oggi è il ${giorno}/${mese + 1}/${anno} e sono le ${ora}:${minuti}:${secondi}`);

console.log(data.value);