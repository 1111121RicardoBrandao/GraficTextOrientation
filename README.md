GraficTestOrientation
=====================

Pretende-se uma aplicação gráfica que permita ao utilizador visualizar uma dada string alinhada na horizontal, vertical, diagonal "principal" ou diagonal "secundária", como é ilustrado na figura abaixo. A string e o seu alinhamento são especificados pelo utilizador. A string alinhada é colocada no lado direito da janela e é actualizada imediatamente depois do utilizador selecionar o alinhamento.

![Exemplo funcionamento programa](http://prntscr.com/1dppb0)

A figura seguinte revela o comportamento da janela quando ela é redimensionada. Note-se que o aumento da dimensão da janela resulta no aumento dos intervalos entre as letras da string alinhada e que o tamanho das letras mantém-se.

![Exemplo redimensionamento janela](http://prntscr.com/1dppj0)

Para desenvolver esta aplicação:

1. Elabore o código da aplicação tendo em conta os seguintes aspectos:
	- Os alinhamentos devem ser representados por um tipo enumerado
	- A aplicação, no início, deve mostrar uma string Exemplo alinhada na horizontal
	- A aplicação deve mostrar uma mensagem de erro quando o utilizador selecionar um alinhamento e o campo String estiver vazio