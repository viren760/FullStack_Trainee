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
import { CreateBankComponent } from './create-bank/create-bank.component';
import { BankComponent } from './bank/bank.component';



@NgModule({
  declarations: [
    AppComponent,
    routingComponent,
    CreateBankComponent,
    BankComponent
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
