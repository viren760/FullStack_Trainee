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
          <label for="exampleInputEmail1">Email address</label>
          <input
            type="email"
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
  public users: User[] | undefined;
  constructor(private router: Router, private route: ActivatedRoute, private http:HttpClient) {}

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
    this.router.navigate(['/sign'], { relativeTo: this.route });
   
    if(this.loginForm.invalid){
      return alert('Please Login First !!!');
    }
  }
}