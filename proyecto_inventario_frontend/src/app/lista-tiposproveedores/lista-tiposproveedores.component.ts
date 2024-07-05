import { Component, inject, OnInit } from '@angular/core';
import { ServiceTiposproveedoresService } from '../service/service-tiposproveedores.service';
import { RouterLink, RouterModule } from '@angular/router';
import { Tiposproveedores } from '../model/tiposproveedores.interface';

@Component({
  selector: 'app-lista-tiposproveedores',
  standalone: true,
  imports: [RouterModule, RouterLink],
  templateUrl: './lista-tiposproveedores.component.html',
  styleUrl: './lista-tiposproveedores.component.css'
})
export class ListaTiposproveedoresComponent  implements OnInit {

  private tiposproveedoresService=inject(ServiceTiposproveedoresService);
  tiposproveedores: Tiposproveedores[] = [];

  ngOnInit(): void {
    this.loadAll();
  }
loadAll(){
  this.tiposproveedoresService.listarTiposproveedores()
  .subscribe(tiposproveedores  =>{
    this.tiposproveedores = tiposproveedores;
  });
}

  eliminarTiposproveedores(tiposproveedores: Tiposproveedores){
    this.tiposproveedoresService.eliminarTiposproveedores(tiposproveedores.idTipoprov)
    .subscribe(() =>{
      this.loadAll();
    });
  }

}