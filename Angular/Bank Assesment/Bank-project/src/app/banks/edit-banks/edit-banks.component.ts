import { BanksService } from './../../banks.service';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-edit-banks',
  template: `
    <div class="container" *ngIf="banks != undefined">
    <form  (ngSubmit)='onSubmit()'  >
  <div class="form-group">
    <label >Bank Name :</label>
    <input type="text" name = "bankName"  [(ngModel)]="banks.bankName"  class="form-control" id="bankname" placeholder="Enter bank Name">
  </div>
 <br>
 <br>
  <h3>Loans</h3>
  <div *ngFor="let loan of banks.loans; let i=index" >
    <div class="row">
            <div class="form-group col-md-6">
    <label >Loan Name :</label>
    <input type="text"[(ngModel)]="loan.loanName" name="loanName{{i}}" class="form-control" id="loanname" placeholder="Enter loan Name">
  </div>
  <div class="form-group col-md-6">
    <label >Loan Interest :</label>
    <input type="number"   [(ngModel)]="loan.loanInterest" name="loanInterest{{i}}" class="form-control" id="loaninterest"  placeholder="Enter inetrest">
  </div>
  </div> 
  </div>
  <button type="submit" id="cbtn" class="btn btn-primary" (click)='update()' >update</button>
</form>
 </div>    
  `,
  styles: [
  ]
})
export class EditBanksComponent implements OnInit {

 id:any;
 banks:any;

  constructor(private cdr: ChangeDetectorRef,private router:Router, private route :ActivatedRoute, private http:HttpClient, private bankService: BanksService) { 
   
  }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.banks = this.getBankById();
    
  }

  

  onSubmit(){
      return this.router.navigate(['/bank/banksdetail'],{relativeTo:this.route})
  }

  ngAfterContentChecked(): void {
    this.cdr.detectChanges();
 } 

  update(){
    this.http.put("http://localhost:9091/banks/",this.banks).subscribe((updatedData)=>{
      console.log("updated data : ",updatedData)
    })
    return this.router.navigate(['/bank/banksdetail'],{relativeTo:this.route})
  }

  getBankById(){
    var res;
    this.http.get("http://localhost:9091/banks/"+this.id).subscribe(s => {
    console.log('response  :'+JSON.stringify(s));
    this.banks=s;
    res = s;
    });
    return res;
  }
}
