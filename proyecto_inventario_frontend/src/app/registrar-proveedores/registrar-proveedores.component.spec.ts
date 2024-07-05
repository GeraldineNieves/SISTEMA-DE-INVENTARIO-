import { ComponentFixture, TestBed } from '@angular/core/testing';
import RegistrarProveedoresComponent from './registrar-proveedores.component';



describe('RegistrarProveedoresComponent', () => {
  let component: RegistrarProveedoresComponent;
  let fixture: ComponentFixture<RegistrarProveedoresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RegistrarProveedoresComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegistrarProveedoresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
