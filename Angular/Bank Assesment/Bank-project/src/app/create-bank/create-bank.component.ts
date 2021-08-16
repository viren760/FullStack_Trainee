import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-create-bank',
  template: `
    <div class="container">
    <form #userPost='ngForm' [formGroup]='createBanks' (ngSubmit)='onsubmit(userPost.value)' >
  <div class="form-group">
    <label >Bank Name :</label>
    <input type="text" ngModel formControlName='bname' class="form-control" id="bankname" placeholder="Enter bank Name">
    <span class="text-danger" *ngIf="createBanks.get('bname')?.invalid">Bank Name is required</span>
  </div>
  <div class="container" id="loan-form">
    <div class="row">
      <div class="col-10" id='loan'>
      <div class="form-group">
    <label >Loan Name :</label>
    <input type="text" ngModel formControlName='lname' class="form-control" id="loanname" placeholder="Enter loan Name">
    <span class="text-danger" *ngIf="createBanks.get('lname')?.invalid">Loan Name is required</span>
  </div>
  <div class="form-group">
    <label >Loan Interest :</label>
    <input type="number" ngModel formControlName='linterest' class="form-control" id="loaninterest"  placeholder="Enter inetrest">
    <span class="text-danger" *ngIf="createBanks.get('linterest')?.invalid">Loan Interest is required</span>
  </div>
      </div>
      <div class="col-2">
        <div id="inc-dec">
        <span id='op'(click)='increment()' > + </span>
        <span id='op' (click)='decrement()' > -</span>
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

  constructor(private http:HttpClient,private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
  }

  increment(){

  }

  decrement(){

  }

  createBanks=new FormGroup({
    bname : new FormControl('',Validators.required),
    lname : new FormControl('',Validators.required),
    linterest: new FormControl('',Validators.required)
  })

  onsubmit(data:any){
    this.http.post("http://localhost:9091/banks",data).subscribe((result)=>{
       console.log("result",result)
       if(this.createBanks.invalid){
         return;
       } else{
         return this.router.navigate(['/banks'],{relativeTo:this.route})
       }
    })
  }

}
