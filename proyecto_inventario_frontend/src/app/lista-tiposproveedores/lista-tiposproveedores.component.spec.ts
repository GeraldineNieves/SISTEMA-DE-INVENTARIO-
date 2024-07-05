import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaTiposproveedoresComponent } from './lista-tiposproveedores.component';

describe('ListaTiposproveedoresComponent', () => {
  let component: ListaTiposproveedoresComponent;
  let fixture: ComponentFixture<ListaTiposproveedoresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListaTiposproveedoresComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListaTiposproveedoresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
