import { ShowBanksComponent } from './banks/show-banks/show-banks.component';
import { BankDetailsComponent } from './banks/bank-details/bank-details.component';
import { AuthGuard } from './auth.guard';
import { BanksModule } from './banks/banks.module';
import { NgModule } from '@angular/core';
import { BrowserModule} from '@angular/platform-browser'
import{ReactiveFormsModule} from '@angular/forms'
import { AppRoutingModule, routingComponent } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule }   from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { CreateBankComponent } from './banks/create-bank/create-bank.component';
import { BankComponent } from './banks/bank/bank.component';
import { EditBanksComponent } from './banks/edit-banks/edit-banks.component';






@NgModule({
  declarations: [
    AppComponent,
    routingComponent,
   ShowBanksComponent ,
    CreateBankComponent,
    BankDetailsComponent,
    BankComponent,
    EditBanksComponent,
  ], entryComponents: [BankComponent],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    AppRoutingModule,
   HttpClientModule,
   FormsModule,
   ReactiveFormsModule,
   CommonModule,
   BanksModule
  ],
  providers: [AuthGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
