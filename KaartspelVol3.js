const Spel = (function() {

    
  const beeldjes = "harten klaveren ruiten schoppen".split(" ");
  const waarden = "twee drie vier vijf zes zeven acht negen tien boer dame koning aas".split(" ");

  const kaart = function(waarde, beeld) {
    return {waarde: waarde, beeld: beeld};
  };
  
  const creëer = function() {
    return waarden.flatMap(function(waarde) {
      return beeldjes.map(function(beeld) {
        return kaart(waarde, beeld);
        
      });
    });
  };
  return {
     creëer: creëer
  };

})();

const kaarten = Spel.creëer();


//Algoritme van Fisher-Yates
Array.prototype.shuffle = function(){
var i = this.length, j, temp;
while(--i > 0){
      //Hier hebben we gebruik moeten maken van impure functions, door de math.random te gebruiken. We hadden namelijk een willekeurig cijfer nodig om het kaart volgens willekeurige indexen te shufflen
    j = Math.floor(Math.random() * (i+1));
    temp = this[j];
    this[j] = this[i];
    this[i] = temp;
}
return this;
}

const shuffledKaarten = kaarten.shuffle();

console.log(shuffledKaarten);
