import { Router, ActivatedRoute } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-signin',
  template: `
    <div class="container" id="sign" >
      <div class="sign-h"> <h2> SIGN-UP FORM </h2> </div>
      <form #userPost="ngForm"  [formGroup]="signup" (ngSubmit)="onsubmit(userPost.value)" novalidate>
        <div class="form-group">
          <label for="exampleInputEmail1">Full Name</label>
          <input
            type="text"
            class="form-control"
            id="name"
            ngModel
            formControlName="name"
            placeholder="Enter Name"
          />
          <span class="text-danger"  *ngIf="signup.get('name')?.invalid" >Name is invalid</span>
        </div>
        <div class="form-group">
          <label for="exampleInputEmail1">Email address</label>
          <input
            type="email"
            class="form-control"
            id="email"
            ngModel
            formControlName="email"
            placeholder="Enter email"
          />
          <span class="text-danger"  *ngIf="signup.get('email')?.invalid" >Email is invalid</span>
        </div>
        <div class="form-group">
          <label for="exampleInputPassword1">Password</label>
          <input
            type="password"
            class="form-control"
            id="password"
            ngModel
            formControlName="password"
            placeholder="Password"
          />
          <span class="text-danger"  *ngIf="signup.get('password')?.invalid" >Enter Strong password using  eg:'A/a/1/@'</span>
        </div>
        <div class="form-group">
          <label for="exampleInputPassword1">Phone Number</label>
          <input
            type="text"
            class="form-control"
            id="phone"
            ngModel
            formControlName="phone"
            placeholder="Enter phone number"
          />
          <span class="text-danger"  *ngIf="signup.get('phone')?.invalid" >Mobile Number is invalid</span>
        </div>
        <button
          type="submit"
          class="btn btn-primary"
          style="    margin-top: 10px;
    margin-left: 48%;"
        >
          Submit
        </button>
      </form>
      <div>
        <span class="sign-b" routerLink="/login">
          Already Have an Account ...</span
        >
      </div>
    </div>
  `,
  styles: [],
})
export class SigninComponent implements OnInit {
 
  SignData:any
  
  constructor(private router :Router, private route :ActivatedRoute, private http:HttpClient) {}

  ngOnInit(): void {}

  signup = new FormGroup({
    name: new FormControl('', Validators.required),
    email: new FormControl('', [Validators.required, Validators.email]),
    password: new FormControl('', [
      Validators.required,
      Validators.pattern(
        '(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!#^~%*?&,.<>"\'\\;:{\\}\\[\\]\\|\\+\\-\\=\\_\\)\\(\\)\\`\\/\\\\\\]])[A-Za-z0-9d$@].{7,}'
      ),
    ]),
    phone: new FormControl('',[Validators.required, Validators.pattern("^((\\+91-?)|0)?[0-9]{10}$")]),
  });
 
  onsubmit(data: any){
    this.http.post("http://localhost:9091/login/signup",data).subscribe((result)=>{
      console.log('result',result)
      this.SignData= JSON.stringify(result)
      if(this.signup.invalid){
        return alert('Failed to submit');
      }
      else{
        return this.router.navigate(['/login'],{relativeTo:this.route})
      }
    })

  }

  signinRequest(r:any){
    if(r.status == 200){
      return  this.router.navigate(['/login'], { relativeTo: this.route });
    }else{
      return alert(r.message);
    }
  }
 
}
