import { EditBanksComponent } from './edit-banks/edit-banks.component';
import { BankDetailsComponent } from './bank-details/bank-details.component';
import { CreateBanksComponent } from './create-banks/create-banks.component';
import { ShowBanksComponent } from './show-banks/show-banks.component';
import { BankComponent } from './bank/bank.component';
import { SigninComponent } from './signin/signin.component';
import { LoginComponent } from './login/login.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path:'login', component:LoginComponent},
  {path:'sign', component:SigninComponent},
  {path:'banks',component:BankComponent},
  {path:'showbanks',component:ShowBanksComponent},
  {path:'createbanks',component:CreateBanksComponent},
  {path:'banksdetail', component:BankDetailsComponent},
  {path:'editbanks',component:EditBanksComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const routingComponent =[LoginComponent,SigninComponent,BankComponent,CreateBanksComponent,ShowBanksComponent,BankDetailsComponent,EditBanksComponent]