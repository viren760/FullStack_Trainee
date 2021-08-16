import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BanksRoutingModule } from './banks-routing.module';



@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    BanksRoutingModule,
    FormsModule,
    ReactiveFormsModule,
  ]
})
export class BanksModule { }
