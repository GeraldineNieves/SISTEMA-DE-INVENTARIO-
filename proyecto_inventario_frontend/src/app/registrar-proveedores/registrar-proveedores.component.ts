import { Component, inject, OnInit } from '@angular/core';

import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { ActivatedRoute, Router, RouterModule } from '@angular/router';
import { ServiceProveedoresService } from '../service/service-proveedores.service';
import { Proveedores } from '../model/proveedores.interface';

@Component({
  selector: 'app-registrar-proveedores',
  standalone: true,
  imports: [RouterModule, ReactiveFormsModule],
  templateUrl: './registrar-proveedores.component.html',
  styleUrl: './registrar-proveedores.component.css',
   
})
export default class RegistrarProveedoresComponent implements OnInit{
  private fb = inject(FormBuilder);
  private router = inject(Router);
  private route = inject(ActivatedRoute);
  private proveedoresService = inject(ServiceProveedoresService);
  form?: FormGroup;
  proveedores?: Proveedores;

  ngOnInit(): void {
    const idProveedores = this.route.snapshot.paramMap.get('idProveedores');
    if (idProveedores) {
      this.proveedoresService.get(parseInt(idProveedores))
        .subscribe(proveedores => {
          this.proveedores = proveedores;
          this.form = this.fb.group({
            nombre: [proveedores.nombre, [Validators.required]],
            telefono: [proveedores.telefono, [Validators.required]],
            direccion: [proveedores.direccion, [Validators.required]],
            email: [proveedores.email, [Validators.required]],
            tiposproveedores: [proveedores.tiposproveedores, [Validators.required]],
           
          });
        });
    } else {
      this.form = this.fb.group({
        nombre: ['', [Validators.required]],
        telefono: ['', [Validators.required]],
        direccion: ['', [Validators.required]],
        email: ['', [Validators.required]],
        tiposproveeodres: ['', [Validators.required]],
       
      });
    }
  }

  save() {
    const registrarProveedores = this.form!.value;

    if (this.proveedores) {
      registrarProveedores.idProveedores = this.proveedores.idProveedores;

      this.proveedoresService.update(this.proveedores.idProveedores, registrarProveedores)
        .subscribe(() => {
          this.router.navigate(['/']);
        });
    } else {
      this.proveedoresService.create(registrarProveedores)
        .subscribe(() => {
          this.router.navigate(['/']);
        });
    }
  }

  
}

