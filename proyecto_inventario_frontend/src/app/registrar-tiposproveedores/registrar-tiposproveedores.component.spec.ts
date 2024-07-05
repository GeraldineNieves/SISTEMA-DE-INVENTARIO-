import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrarTiposproveedoresComponent } from './registrar-tiposproveedores.component';

describe('RegistrarTiposproveedoresComponent', () => {
  let component: RegistrarTiposproveedoresComponent;
  let fixture: ComponentFixture<RegistrarTiposproveedoresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RegistrarTiposproveedoresComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegistrarTiposproveedoresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
