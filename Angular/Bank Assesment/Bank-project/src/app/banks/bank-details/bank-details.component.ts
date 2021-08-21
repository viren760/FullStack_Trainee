import { Router, ActivatedRoute } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { JsonpClientBackend, HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-bank-details',
  template: `
        <div class="container"*ngIf="myData != undefined" >
       <div class="card">
         <h3 class="text-center">Bank Detail</h3>
         <div class="card-body">
             <table class="table table-stripped" >
                 <thead>
                   <th> Id </th>
                   <th> Bank Name</th>
                   <th> Loan Name </th>
                   <th> Loan Interest </th>
                   </thead>
                   <tbody *ngFor="let loan of myData.loans; let i=index" > 
                      <tr>
                        <td>
                        {{myData.bankId}}
                        </td>
                        <td >
                        {{myData.bankName}}
                        </td>  
                        <td>
                        {{myData.loans[i].loanName}}
                        </td> 
                        <td>
                        {{myData.loans[i].loanInterest}}
                        </td> 
                      </tr>  
                   </tbody>
             </table>
         </div>
         <button class="btn btn-success"  (click)='edit(myData.bankId)'>Edit</button>
         <button class="btn btn-primary" (click)="back()" >back</button>
       </div>
  `,
  styles: [
  ]
})
export class BankDetailsComponent implements OnInit {
  id:any= this.route.snapshot.params['id'];

  myData:any = this.getBankById();

 

 putData='http://localhost:9091/banks';

  constructor(private router:Router, private route:ActivatedRoute, private http:HttpClient) { }
    
  ngOnInit(): void {
    console.log(localStorage.getItem('BankData'))
  }

 edit(id:any){
  this.router.navigate(['/bank/editbanks',id],{relativeTo:this.route})
 }

 back(){
   this.router.navigate(['/bank/showbanks'],{relativeTo:this.route})
 }

 
  getBankById(){
    var res;
    this.http.get("http://localhost:9091/banks/"+this.id).subscribe(s => {
    console.log('response  :'+JSON.stringify(s));
    this.myData=s;
    res = s;
    });
    return res;
  }

}
