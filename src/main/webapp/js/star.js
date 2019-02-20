/**
 * 
 */
    var n1=0;
	var n2=0;
	var n3=0;
$(function(){
    	$("#s1").click(function(){
    		$("#s1").css("color","red");
    		$("#s2").css("color","#CCC");
    		$("#s3").css("color","#CCC");
    		$("#s4").css("color","#CCC");
    		$("#s5").css("color","#CCC");
    		n1=1;
    	})
    	$("#s2").click(function(){
    		$("#s1").css("color","red");
    		$("#s2").css("color","red");
    		$("#s3").css("color","#CCC");
    		$("#s4").css("color","#CCC");
    		$("#s5").css("color","#CCC");
    		n1=2;
    	})
    	$("#s3").click(function(){
    		$("#s1").css("color","red");
    		$("#s2").css("color","red");
    		$("#s3").css("color","red");
    		$("#s4").css("color","#CCC");
    		$("#s5").css("color","#CCC");
    		n1=3;
    	})
    	$("#s4").click(function(){
    		$("#s1").css("color","red");
    		$("#s2").css("color","red");
    		$("#s3").css("color","red");
    		$("#s4").css("color","red");
    		$("#s5").css("color","#CCC");
    		n1=4;
    	})
    	$("#s5").click(function(){
    		$("#s1").css("color","red");
    		$("#s2").css("color","red");
    		$("#s3").css("color","red");
    		$("#s4").css("color","red");
    		$("#s5").css("color","red");
    		n1=5;
    	})
    	
    	
    	$("#s6").click(function(){
    		$("#s6").css("color","red");
    		$("#s7").css("color","#CCC");
    		$("#s8").css("color","#CCC");
    		$("#s9").css("color","#CCC");
    		$("#s10").css("color","#CCC");
    		n2=1;
    	})
    	$("#s7").click(function(){
    		$("#s6").css("color","red");
    		$("#s7").css("color","red");
    		$("#s8").css("color","#CCC");
    		$("#s9").css("color","#CCC");
    		$("#s10").css("color","#CCC");
    		n2=2;
    	})
    	$("#s8").click(function(){
    		$("#s6").css("color","red");
    		$("#s7").css("color","red");
    		$("#s8").css("color","red");
    		$("#s9").css("color","#CCC");
    		$("#s10").css("color","#CCC");
    		n2=3;
    	})
    	$("#s9").click(function(){
    		$("#s6").css("color","red");
    		$("#s7").css("color","red");
    		$("#s8").css("color","red");
    		$("#s9").css("color","red");
    		$("#s10").css("color","#CCC");
    		n2=4;
    	})
    	$("#s10").click(function(){
    		$("#s6").css("color","red");
    		$("#s7").css("color","red");
    		$("#s8").css("color","red");
    		$("#s9").css("color","red");
    		$("#s10").css("color","red");
    		n2=5;
    	})
    	
    	
    	$("#s11").click(function(){
    		$("#s11").css("color","red");
    		$("#s12").css("color","#CCC");
    		$("#s13").css("color","#CCC");
    		$("#s14").css("color","#CCC");
    		$("#s15").css("color","#CCC");
    		n3=1;
    	})
    	$("#s12").click(function(){
    		$("#s11").css("color","red");
    		$("#s12").css("color","red");
    		$("#s13").css("color","#CCC");
    		$("#s14").css("color","#CCC");
    		$("#s15").css("color","#CCC");
    		n3=2;
    	})
    	$("#s13").click(function(){
    		$("#s11").css("color","red");
    		$("#s12").css("color","red");
    		$("#s13").css("color","red");
    		$("#s14").css("color","#CCC");
    		$("#s15").css("color","#CCC");
    		n3=3;
    	})
    	$("#s14").click(function(){
    		$("#s11").css("color","red");
    		$("#s12").css("color","red");
    		$("#s13").css("color","red");
    		$("#s14").css("color","red");
    		$("#s15").css("color","#CCC");
    		n3=4;
    	})
    	$("#s15").click(function(){
    		$("#s11").css("color","red");
    		$("#s12").css("color","red");
    		$("#s13").css("color","red");
    		$("#s14").css("color","red");
    		$("#s15").css("color","red");
    		n3=5;
    	})
    	
    	
    })

function check(){
	var n=(n1+n2+n3)/3;
	$("#levels").val(n);
}



