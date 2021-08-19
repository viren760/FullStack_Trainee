import { Router, ActivatedRoute } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bank',
  template: `
    <div>
      1
      <span (click)='showBanks()'>
        Show All banks
      </span>
    </div>
    <div>
      2
      <span (click)='createBanks()' >
        Create New Bank
      </span>
    </div>
  `,
  styles: [
  ]
})
export class BankComponent implements OnInit {

  constructor(private router:Router, private route:ActivatedRoute) { }

  ngOnInit(): void {
  }

  showBanks(){
    return this.router.navigate(['/bank/showbanks'],{relativeTo:this.route})
  }

  createBanks(){
    return this.router.navigate(['/bank/createbanks'],{relativeTo:this.route})
  }

}
