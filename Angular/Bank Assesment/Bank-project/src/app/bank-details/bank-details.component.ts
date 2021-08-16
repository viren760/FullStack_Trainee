import { Router, ActivatedRoute } from '@angular/router';
import { EditBanksComponent } from 'src/app/edit-banks/edit-banks.component';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bank-details',
  template: `
   <div class="container" id="bdetail">
    <div class="row">
      <div class="col-10">

      </div>
      <div class="col-2">
        <button class="btn btn-success" (click)='edit()'>Edit</button>
      </div>
    </div>
   </div>
  `,
  styles: [
  ]
})
export class BankDetailsComponent implements OnInit {

  constructor(private router:Router, private route:ActivatedRoute) { }

  ngOnInit(): void {
  }

  edit(){
   this.router.navigate(['/bank/editbanks'],{relativeTo:this.route})
  }

}
