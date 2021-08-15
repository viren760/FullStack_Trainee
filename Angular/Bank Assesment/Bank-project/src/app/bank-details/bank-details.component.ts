import { EditBanksComponent } from './../edit-banks/edit-banks.component';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bank-details',
  template: `
   <div class="container" id="bdetail">
    <div class="row">
      <div class="col-10">

      </div>
      <div class="col-2">
        <button class="btn btn-success" routerLink='/editbanks'>Edit</button>
      </div>
    </div>
   </div>
  `,
  styles: [
  ]
})
export class BankDetailsComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
