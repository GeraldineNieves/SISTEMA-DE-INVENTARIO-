import { Component, inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { ActivatedRoute, Router, RouterModule } from '@angular/router';
import { ServiceTiposproveedoresService } from '../service/service-tiposproveedores.service';
import { Tiposproveedores } from '../model/tiposproveedores.interface';

@Component({
  selector: 'app-registrar-tiposproveedores',
  standalone: true,
  imports: [RouterModule, ReactiveFormsModule],
  templateUrl: './registrar-tiposproveedores.component.html',
  styleUrl: './registrar-tiposproveedores.component.css'
})
export class RegistrarTiposproveedoresComponent implements OnInit{
  private fb = inject(FormBuilder);
  private router = inject(Router);
  private route = inject(ActivatedRoute);
  private tiposproveedoresService = inject(ServiceTiposproveedoresService);
  form?: FormGroup;
  tiposproveedores?: Tiposproveedores;

  ngOnInit(): void {
    const idTipoprov = this.route.snapshot.paramMap.get('idTipoprov');
    if (idTipoprov) {
      this.tiposproveedoresService.buscarTipsoproveedores(parseInt(idTipoprov))
        .subscribe(tiposproveedores => {
          this.tiposproveedores = tiposproveedores;
          this.form = this.fb.group({
            descripcion: [tiposproveedores.descripcion, [Validators.required]],
            
           
          });
        });
    } else {
      this.form = this.fb.group({
        descripcion: ['', [Validators.required]],
       
      });
    }
  }

  save() {
    const registrarTiposproveedores = this.form!.value;

    if (this.tiposproveedores) {
      registrarTiposproveedores.idTipoprov = this.tiposproveedores.idTipoprov;

      this.tiposproveedoresService.update(this.tiposproveedores.idTipoprov, registrarTiposproveedores)
        .subscribe(() => {
          this.router.navigate(['/']);
        });
    } else {
      this.tiposproveedoresService.create(registrarTiposproveedores)
        .subscribe(() => {
          this.router.navigate(['/']);
        });
    }
  }

  
}




