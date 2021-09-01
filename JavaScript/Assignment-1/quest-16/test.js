function create(){
    var r= document.getElementById("r").value;
    var c= document.getElementById("c").value;
    document.write('<table border=2>');
    for(i=0;i<r;i++){
        document.write("<tr>");
        for(j=0;j<c;j++){
            document.write("<td>");
            document.write(i+","+j);
            document.write("</td>");
        }
        document.write("</tr>");
    }
    document.write("</table>");
}
