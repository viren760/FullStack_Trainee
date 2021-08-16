import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BankComponent } from '../bank/bank.component';
import { ShowBanksComponent } from '../show-banks/show-banks.component';
import { CreateBankComponent } from '../create-bank/create-bank.component';
import { BankDetailsComponent } from '../bank-details/bank-details.component';
import { EditBanksComponent} from '../edit-banks/edit-banks.component';

const routes: Routes = [
  {path:'banks',component:BankComponent},
  {path:'showbanks',component:ShowBanksComponent},
  {path:'createbanks',component:CreateBankComponent},
  {path:'banksdetail', component:BankDetailsComponent},
  {path:'editbanks',component:EditBanksComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class BanksRoutingModule { }
