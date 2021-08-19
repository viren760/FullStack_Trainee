import { BanksService } from 'src/app/banks.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import {User} from '../user';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  template: `
    <div class="container" id="login">
      <div class="login-h"><h2>LOGIN FORM</h2></div>
      <form [formGroup]="loginForm" (ngSubmit)="onsubmit()" novalidate>
        <div class="form-group">
          <label>Email address</label>
          <input
            type="email"
            [(ngModel)]='email' 
            class="form-control"
            id="exampleInputEmail1"
            formControlName="email"
            aria-describedby="emailHelp"
            placeholder="Enter email"
          />
          <span class="text-danger" *ngIf="loginForm.get('email')?.invalid"
            >email is required</span
          >
        </div>
        <div class="form-group">
          <label for="exampleInputPassword1">Password</label>
          <input
            type="password"
            class="form-control"
            [(ngModel)]='password'
            formControlName="password"
            id="exampleInputPassword1"
            placeholder="Password"
          />
          <span class="text-danger" *ngIf="loginForm.get('password')?.invalid"
            >Enter Strong password using eg:'A/a/1/@'</span
          >
        </div>
        <button
          type="submit"
          class="btn btn-primary"
          id="btn-submit"
          style="    margin-top: 10px;
          margin-left: 48%;"
        >
          Submit
        </button>
      </form>
      <div>
        <span class="login-b" routerLink="/sign">
          New User Create an Account ?</span
        >
      </div>
    </div>
  `,
  styles: [],
})
export class LoginComponent implements OnInit {
   email:any;
   password:any;
  public users: User | undefined;
  constructor(private router: Router, private route: ActivatedRoute, private http:HttpClient, private service:BanksService) {}

  ngOnInit(): void {}

  loginForm = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.email]),
    password: new FormControl('', [
      Validators.required,
      Validators.pattern(
        '(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!#^~%*?&,.<>"\'\\;:{\\}\\[\\]\\|\\+\\-\\=\\_\\)\\(\\)\\`\\/\\\\\\]])[A-Za-z0-9d$@].{7,}'
      ),
    ]),
  });

  // get email() {
  //   return this.loginForm.get('email');
  // }

  onsubmit() {
    if(this.loginForm.invalid){
      return alert('Please Login First !!!')
    }else{
      let loginRequest = {
        "email":this.email,
        "password":this.password
      }
      this.http.post("http://localhost:9091/login/login",loginRequest).subscribe( (res)=>{
      this.loginRequest(res);
     });
    }
  }

  loginRequest(r:any){
    if(r.status == 200){
      this.service.status = true;
      localStorage.setItem('status',"1");
      localStorage.setItem('token',r);
      return  this.router.navigate(['/bank/banks'], { relativeTo: this.route });
    }else{
      return alert(r.message);
    }

  }
}
