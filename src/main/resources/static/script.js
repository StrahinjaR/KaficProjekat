$(document).ready(function(){

    fetch('http://localhost:8080/fetch-data')
        .then(response => response.json())
        .then((json) =>{
            
            var cardMarkup="";

            $.each(json.meni, function(index,meni){
                cardMarkup+=`
                
                <article>
                  <div class="title">
                    <span>${meni.nazivProizvoda}</span>
                    <span class="price">${meni.cenaProizvoda}.00</span>
                  </div>
                </article>
                
                `;
            });
            $("#menu").html(cardMarkup);
        });
    });
