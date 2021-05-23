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