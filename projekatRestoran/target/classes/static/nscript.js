
$(document).ready(function(){
// JavaScript to handle the Nes Kafa button click
let nesButton = document.getElementById("nes");
let latteButton = document.getElementById("latte");
let jagodaButton = document.getElementById("jagoda");
let readOnlyInput1 = document.getElementById("readOnlyInput1");
let ukupno = document.getElementById("ukupno");

let clickCount = 0;
let clickCount1 = 0;
let clickCount2 = 0;
let clickCount3 = 0;
let clickCount4 = 0;
let clickCount5 = 0;
let clickCount6 = 0;
let clickCount7 = 0;
let clickCount8 = 0;
let clickCount10 = 0;
let clickCount11= 0;
let clickCount12 =0;
let cena=0;
let ukupnoo=0;
let cena1=0;
let cena2=0;
let cena3=0;
let cena4=0;
let cena5=0;
let cena6=0;
let cena7=0;
let cena8=0;
let cena10=0;
let cena11=0;
let cena12=0;

let nesContent = "";
let latteContent = "";
let jagodaContent = "";
let limunadaContent = "";
let karamelContent = "";
let frapuccinoContent = "";
let amerikanoContent = "";
let cappucinoContent = "";
let bitterContent = "";
let belaContent = "";
let plazmasejkContent = "";
let crnaContent="";
nesButton.addEventListener("click", function() {
    clickCount++;
    cena = cena + 220;
    nesContent = clickCount + "x Nes ........................  " + cena + "rsd";
    updateReadOnlyInput();
    ukupnoo=ukupnoo+220;
    ukupno.value =+ukupnoo;
});

latteButton.addEventListener("click", function() {
    clickCount1++;
    cena1 = cena1 + 280;
    latteContent = clickCount1 + "x Latte ........................  " + cena1 + "rsd";
    updateReadOnlyInput();
    ukupnoo=ukupnoo+280;
    ukupno.value =+ukupnoo;
});

jagodaButton.addEventListener("click", function() {
    clickCount2++;
    cena2 = cena2 + 270;
    jagodaContent = clickCount2 + "x Jagoda ........................  " + cena2 + "rsd";
    updateReadOnlyInput();
    ukupnoo=ukupnoo+270;
    ukupno.value =+ukupnoo;
});

document.getElementById("limunada").addEventListener("click", function() {
    clickCount3++;
    cena3 = cena3 + 250;
    limunadaContent = clickCount3 + "x Limunada ........................  " + cena3 + "rsd";
    updateReadOnlyInput();
    ukupnoo=ukupnoo+250;
    ukupno.value =+ukupnoo;
});


document.getElementById("Cappucino").addEventListener("click", function() {
    clickCount4++;
    cena4 = cena4 + 250;
    cappucinoContent = clickCount4 + "x Cappucino ........................  " + cena4 + "rsd";
    updateReadOnlyInput();
    ukupnoo=ukupnoo+250;
    ukupno.value =+ukupnoo;
});


document.getElementById("bitter").addEventListener("click", function() {
    clickCount5++;
    cena5 = cena5 + 300;
    bitterContent = clickCount5 + "x Bitter ........................  " + cena5 + "rsd";
    updateReadOnlyInput();
    ukupnoo=ukupnoo+300;
    ukupno.value =+ukupnoo;
});


document.getElementById("crna").addEventListener("click", function() {
    clickCount6++;
    cena6 = cena6 + 240;
    crnaContent = clickCount6 + "x Crna ........................  " + cena6 + "rsd";
    updateReadOnlyInput();
    ukupnoo=ukupnoo+240;
    ukupno.value =+ukupnoo;
});


document.getElementById("bela").addEventListener("click", function() {
    clickCount7++;
    cena7 = cena7 + 300;
    belaContent = clickCount7 + "x Bela ........................  " + cena7 + "rsd";
    updateReadOnlyInput();
    ukupnoo=ukupnoo+300;
    ukupno.value =+ukupnoo;
});


document.getElementById("plazmasejk").addEventListener("click", function() {
    clickCount8++;
    cena8 = cena8 + 330;
    plazmasejkContent = clickCount8 + "x Plazmasejk ........................  " + cena8 + "rsd";
    updateReadOnlyInput();
    ukupnoo=ukupnoo+330;
    ukupno.value =+ukupnoo;
});

document.getElementById("karamel").addEventListener("click", function() {
    clickCount10++;
    cena10 = cena10 + 220;
    karamelContent = clickCount10 + "x Karamel ........................  " + cena10 + "rsd";
    updateReadOnlyInput();
    ukupnoo=ukupnoo+220;
    ukupno.value =+ukupnoo;
});

document.getElementById("frapuccino").addEventListener("click", function() {
    clickCount11++;
    cena11 = cena11 + 400;
    frapuccinoContent = clickCount11 + "x Frapuccino ........................  " + cena11 + "rsd";
    updateReadOnlyInput();
    ukupnoo=ukupnoo+400;
    ukupno.value =+ukupnoo;
});

document.getElementById("amerikano").addEventListener("click", function() {
    clickCount12++;
    cena12 = cena12 + 250;
    amerikanoContent = clickCount12 + "x Amerikano ........................  " + cena12 + "rsd";
    updateReadOnlyInput();
    ukupnoo=ukupnoo+250;
    ukupno.value =+ukupnoo;
});



function updateReadOnlyInput() {

        let contentArray = [nesContent, latteContent, jagodaContent,
            limunadaContent, karamelContent, frapuccinoContent,
            amerikanoContent, crnaContent, belaContent, bitterContent, cappucinoContent,plazmasejkContent];
    
        // Filter out empty content
        contentArray = contentArray.filter(content => content !== "");
    
        // Set the textarea content
        readOnlyInput1.value = contentArray.join('\n');
}



 });


