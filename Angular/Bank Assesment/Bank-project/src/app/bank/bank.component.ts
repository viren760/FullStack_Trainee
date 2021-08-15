import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bank',
  template: `
    <div>
      1
      <span routerLink='/showbanks'>
        Show All banks
      </span>
    </div>
    <div>
      2
      <span routerLink='/createbanks' >
        Create New Bank
      </span>
    </div>
  `,
  styles: [
  ]
})
export class BankComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
