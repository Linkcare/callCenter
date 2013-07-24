<%String idIncomingCall = (String)session.getAttribute("idIncomingCall"); 
Integer hits = (Integer)session.getAttribute("hits");
%>
<%=hits.toString()%>
<%if(idIncomingCall!=null && idIncomingCall.length()>0){
%>
<span style="background-color:#f00000;color:white;white-space:nowrap;">Esta trucant el <%=idIncomingCall%> !!!!!!!!!!!!!!!!!!!!!!!!!!!!!</span>
<%}%>
