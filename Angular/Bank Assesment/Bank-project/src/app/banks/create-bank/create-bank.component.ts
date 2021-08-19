import { Banks } from 'src/app/Banks';
import { Loan } from 'src/app/Loan';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { bank } from 'src/app/bank';



@Component({
  selector: 'app-create-bank',
  template: `
    <div class="container">
    <form #userPost='ngForm' [formGroup]='createBanks' (ngSubmit)='onsubmit(userPost.value)' >
  <div class="form-group">
    <label >Bank Name :</label>
    <input type="text" ngModel formControlName='bname' [(ngModel)]="bank.bankName"  name='bankName' value="" class="form-control" id="bankname" placeholder="Enter bank Name">
    <span class="text-danger" *ngIf="createBanks.get('bname')?.invalid">Bank Name is required</span>
  </div>
  <div class="container" id="loan-form">
    <div class="row" *ngFor="let obj of bank.loans; let i = index">
      <div class="col-10" id='loan'>
      <div class="form-group">
    <label >Loan Name :</label>
    <input type="text" ngModel formControlName='lname' name="loanName{{i}}"  [(ngModel)]='obj.loanName' class="form-control" id="loanname" placeholder="Enter loan Name">
    <span class="text-danger" *ngIf="createBanks.get('lname')?.invalid">Loan Name is required</span>
  </div>
  <div class="form-group">
    <label >Loan Interest :</label>
    <input type="number" ngModel formControlName='linterest' name='loanInterest{{i}}' [(ngModel)]='obj.loanInterest' class="form-control" id="loaninterest"  placeholder="Enter inetrest">
    <span class="text-danger" *ngIf="createBanks.get('linterest')?.invalid">Loan Interest is required</span>
  </div>
      </div>
      <div class="col-2">
        <div id="inc-dec">
        <span id='op'(click)='increment()' > + </span>
        <span id='op' (click)='decrement(i)' *ngIf='i!=0' > -</span>
        </div>
      </div>
    </div>
  </div>
  <button type="submit" id="cbtn" class="btn btn-primary">Submit</button>
</form>
    
    <button class="btn btn-primary"  routerLink='/bank/banks'>
        back
      </button>
      </div>    
  `,
  styles: [
  ]
})
export class CreateBankComponent implements OnInit {
  
bank = new bank();


 bankName = document.getElementById('bankName');

// bankName:string="bankname";

  constructor(private http:HttpClient,private route: ActivatedRoute, private router: Router) { 
    this.bank.loans = [];
    this.bank.loans.push(new Loan());
  }

  ngOnInit(): void {
  
  }

  increment(){
  var loan:Loan = new Loan()
  this.bank.loans.push(loan);
  // this.dataArray.push(this.Loan)
  }

  decrement(index:any){
this.bank.loans.splice(index)
  }

  createBanks=new FormGroup({
    bname : new FormControl('',Validators.required),
    lname : new FormControl('',Validators.required),
    linterest: new FormControl('',Validators.required)
  })

  onsubmit(data:any){
    // console.log(this.dataArray)
    this.http.post("http://localhost:9091/banks",this.bank).subscribe((result)=>{
       console.log("result",result)
       if(this.createBanks.invalid){
         return;
       } else{
         return this.router.navigate(['/banks'],{relativeTo:this.route})
       }
    })
  }

  

}
