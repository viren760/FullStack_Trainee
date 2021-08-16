import { Router, ActivatedRoute } from '@angular/router';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-edit-banks',
  template: `
      <div class="container">
    <form formGroup='editdetail' (ngSubmit)='onSubmit()' >
  <div class="form-group">
    <label >Bank Name :</label>
    <input type="text" formControlName='bname' class="form-control" id="bankname" placeholder="Enter bank Name">
    <span class="text-danger" (ngIf)="editdetail.get('bname')?.invalid">Bank Name is required</span>
  </div>
 
      <div class="form-group">
    <label >Loan Name :</label>
    <input type="text" formControlName='lname' class="form-control" id="loanname" placeholder="Enter loan Name">
    <span class="text-danger" (ngIf)="editdetail.get('lname')?.invalid">Loan Name is required</span>
  </div>
  <div class="form-group">
    <label >Loan Interest :</label>
    <input type="number"  formControlName='linterest' class="form-control" id="loaninterest"  placeholder="Enter inetrest">
    <span class="text-danger" (ngIf)="editdetail.get('linterest')?.invalid">Loan Interest is required</span>
  </div> 
  <button type="submit" id="cbtn" class="btn btn-primary" (click)='update()' >update</button>
</form>
 </div>    
  `,
  styles: [
  ]
})
export class EditBanksComponent implements OnInit {

  constructor(private router:Router, private route :ActivatedRoute, private http:HttpClient) { }

  ngOnInit(): void {
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
    return this.router.navigate(['/bank/banksdetail'],{relativeTo:this.route})
  }
}
