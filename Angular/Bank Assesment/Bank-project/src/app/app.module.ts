import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import{ReactiveFormsModule} from '@angular/forms'
import { AppRoutingModule, routingComponent } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { BankComponent } from './bank/bank.component';
import { ShowBanksComponent } from './show-banks/show-banks.component';
import { CreateBanksComponent } from './create-banks/create-banks.component';
import { BankDetailsComponent } from './bank-details/bank-details.component';
import { EditBanksComponent } from './edit-banks/edit-banks.component';


@NgModule({
  declarations: [
    AppComponent,
    routingComponent,
    BankComponent,
    ShowBanksComponent,
    CreateBanksComponent,
    BankDetailsComponent,
    EditBanksComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    AppRoutingModule,
   HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
