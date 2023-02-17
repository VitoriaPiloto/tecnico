<?php
$hoje=date("w");
$diaSemana[0] ="Domingo";
$diaSemana[1] ="Segunda Feira";
$diaSemana[2] ="Terça Feira";
$diaSemana[3] ="Quarta Feira";
$diaSemana[4] ="Quinta Feira";
$diaSemana[5] ="Sexta Feira";
$diaSemana[6] ="Sabado";
/**
Os dia da semana ai

*/
$pratoDia[0] ="Lasanha a 4 queijos";
$pratoDia[1] ="Frango com quiabo";
$pratoDia[2] ="Arroz á grega";
$pratoDia[3] ="Feijoada";
$pratoDia[4] ="Cozido";
$pratoDia[5] ="Feijão Branco";
$pratoDia[6] ="Bacalhau ao Forno";
/*
Os prato bixo
*/
$preco[0]=35;
$preco[01]=45;
$preco[2]=38;
$preco[3]=50;
$preco[4]=65;
$preco[5]=55;
$preco[6]=85;
/*
Os preço
*/
print "A variavel <strong>Hoje contém : $hoje</strong><br>";
print "Hoje é <strong>$diaSemana[$hoje]</strong><br>";
print "Nossa sugestão para hoje é: <strong>$pratoDia[$hoje]</strong><br>";

$escolha=$_GET["prato"];
$aux="";
$achou=false;
$i=0;

while($i<=6 && $achou==false){
	if($pratoDia[$i]==$escolha){
		$achou=true;
	}else{
		$i++;
	}
}

if($achou==false){
	print "<font color='red'> prato não é servido</font>";
	}
	else{
		print"<font color='blue'>";
		print"$escolha é servido no dia $diaSemana[$i]<br>";
		print "O valor é $preco[$i]";
	}

	

	
for($i=0;$i<=5;$i++){
	for($j=$i+1;$j<=6;$j++){
		if($pratoDia[$i]>$pratoDia[$j]){
		$aux=$pratoDia[$i];
		$pratoDia[$i]=$pratoDia[$j];
		$pratoDia[$j]=$aux;
	}}
}
print "Prato do dia em ordem alfabetica;<br>";
for($a=0;$a<=6;$a++){
	print "<strong>$pratoDia[$a]</strong><br>";
}
?>