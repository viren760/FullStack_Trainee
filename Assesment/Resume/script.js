
 const signUp = e =>{

    var fname = document.getElementById("loginname").value;
    var  femail = document.getElementById("loginemail").value;
    var   fnumber = document.getElementById("loginnumber").value;
    var  faddress = document.getElementById("loginaddress").value;
    var  flinkedin = document.getElementById("loginlinkedin").value;



     //  regex
      var namecheck = /^[a-zA-Z]+[\-'\s]?[a-zA-Z ]+$/;
      
      var emailcheck =  /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
      
      var mobilecheck = /^[789][0-9]{9}$/;  
      
      var  addresscheck =/^([a-zA-z0-9/\\''(),-\s]{2,255})$/;

      var linkedcheck= /^[a-zA-Z0-9]([._](?![._])|[a-zA-Z0-9]){6,18}[a-zA-Z0-9]$/;

      if(namecheck.test(fname)){
           document.getElementById('message1').innerHTML=" ";
      }else{
          document.getElementById('message1').innerHTML="** Name is Invalid **";
          return false;
      }
      
      if(emailcheck.test(femail)){
          document.getElementById('message2').innerHTML=" ";
     }else{
         document.getElementById('message2').innerHTML="** Email Address is Invalid **";
         return false;
     }

      if(mobilecheck.test(fnumber)){
          document.getElementById('message3').innerHTML=" ";
     }else{
         document.getElementById('message3').innerHTML="** Mobile Number is Invalid **";
         return false;
     }

     if(addresscheck.test(faddress)){
          document.getElementById('message4').innerHTML=" ";
     }else{
         document.getElementById('message4').innerHTML="** Fill the Address **";
         return false;
     }

   

     if(linkedcheck.test(flinkedin)){
          document.getElementById('message5').innerHTML=" ";
     }else{
         document.getElementById('message5').innerHTML="** Linkedin ID is Invalid **";
         return false;
     }

     // for setting local storage ...
     localStorage.setItem('formdata', JSON.stringify({fname,fnumber,femail,faddress,flinkedin}));
     // this is used to prevent auto submit form ..
     e.preventdefault();
 }


 function dispdata(){
    let obj = JSON.parse(localStorage.getItem('formdata'));
   
    let dispname =  document.getElementById('name');
    dispname.innerHTML = `${obj.fname}`;
    let dispemail = document.getElementById('mail');
    dispemail.innerHTML = `${obj.femail}`;
    let dispnumber = document.getElementById('number');
    dispnumber.innerHTML = `${obj.fnumber}`;
    let dispaddress = document.getElementById('address');
    dispaddress.innerHTML = `${obj.faddress}`;
    let displinkedin =  document.getElementById('linkedin');
    displinkedin.innerHTML =`${obj.flinkedin}`; 

 }

 dispdata();

 
   // creating an array
    var array = new Array();


 function add(){
      var comments = document.getElementById('inputcomment').value
      
     // push value to array ... 
      array.push(comments);
      
      var val="";

      // creating a loop for entering the array ...
      for(i=0; i<array.length; i++){
           val = val+array[i] + "<br/> <hr/>"; 
      }



      document.getElementById('outputcomment').innerHTML= val;

 }


 