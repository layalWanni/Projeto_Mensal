document.querySelector(".hamburguer").addEventListener("click", () =>
    document.querySelector(".container").classList.toggle("show-menu")
);

// var hamburguer = document.querySelector(".hamburguer") // criar uma variavel pro menu hamburguer e para isso vou buscar atraves do documento com a função querySelector e usar o seletor para pegar aquele menu, que usei como classe .hamburguer.

// Agora, a partir da variavel que criamos, vamos adicionar a função addEventListener() que vai escutar um elemento de click, addEventListener("click"),quando acontecer o evento de click ele vai executar essa funçao que vai basicamente pegar a classe container e mostrar ele(a lista das opcoes do menu) com a classe show-menu e se não acontecer o click ele não vai aparecer.
//se tiver a classe show menu ele tira, se nao tiver a classe show menu ele coloca, o show-menu vai informar se o estado do menu é ser exibido ou ser oculto

// resultado:

//var hamburguer = document.querySelector(".hamburguer");
//
//hamburguer.addEventListener("click", function(){
//   document.querySelector"(".container").classList.toggle("show-menu")
//});

//finalizado