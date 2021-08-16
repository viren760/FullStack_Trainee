import { AuthGuard } from './auth.guard';
import { SigninComponent } from './signin/signin.component';
import { LoginComponent } from './login/login.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CommonModule } from '@angular/common';

const routes: Routes = [
  {path:'login', component:LoginComponent},
  {path:'bank',loadChildren:()=>import('./banks/banks.module')
   .then(mod=>mod.BanksModule) ,
   canActivate:[AuthGuard]
},
  {path:'sign', component:SigninComponent},
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes),CommonModule],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const routingComponent =[LoginComponent,SigninComponent]