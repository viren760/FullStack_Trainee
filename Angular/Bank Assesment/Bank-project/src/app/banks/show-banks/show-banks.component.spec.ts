import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowBanksComponent } from './show-banks.component';

describe('ShowBanksComponent', () => {
  let component: ShowBanksComponent;
  let fixture: ComponentFixture<ShowBanksComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowBanksComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowBanksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
