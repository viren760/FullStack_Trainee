import { BanksService } from './../../banks.service';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-edit-banks',
  template: `
    <div class="container">
    <form [formGroup]=" editdetail" (ngSubmit)='onSubmit()'  >
  <div class="form-group">
    <label >Bank Name :</label>
    <input type="text" formControlName='bname' [(ngModel)]="banks.bankName"  class="form-control" id="bankname" placeholder="Enter bank Name">
    <span class="text-danger" *ngIf="editdetail.get('bname')?.invalid">Bank Name is required</span>
  </div>
 <br>
 <br>
  <h3>Loans</h3>
  <div *ngFor="let loan of banks.loans" >
    <div class="row">
            <div class="form-group col-md-6">
    <label >Loan Name :</label>
    <input type="text" formControlName='lname' [(ngModel)]="loan.loanName" class="form-control" id="loanname" placeholder="Enter loan Name">
    <span class="text-danger" *ngIf="editdetail.get('lname')?.invalid">Loan Name is required</span>
  </div>
  <div class="form-group col-md-6">
    <label >Loan Interest :</label>
    <input type="number"  formControlName='linterest' [(ngModel)]="loan.loanInterest" class="form-control" id="loaninterest"  placeholder="Enter inetrest">
    <span class="text-danger" *ngIf="editdetail.get('linterest')?.invalid">Loan Interest is required</span>
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

 id:any= this.route.snapshot.params['id'];
//  bank:any 
 public banks:any = this.getBankById();
 data:any


  constructor(private router:Router, private route :ActivatedRoute, private http:HttpClient, private bankService: BanksService) { 
 
  }

  ngOnInit(): void {
    // this.bankService.getBanks().subscribe((data:Banks[])=>{
    //   console.log(data);
    //   this.banks=data;
    // })
  }

  editdetail= new FormGroup({
    bname: new FormControl('',Validators.required),
    lname:new FormControl('',Validators.required),
    linterest: new FormControl('',Validators.required)
  })

  onSubmit(){
    if(this.editdetail.invalid){
      return
    }else{
      return this.router.navigate(['/bank/banksdetail'],{relativeTo:this.route})
    }
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
