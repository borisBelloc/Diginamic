import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CatalogRoutingModule } from './catalog-routing.module';
import { ListComponent } from './list/list.component';
import { DetailsComponent } from './details/details.component';

import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

// TODO: supprimer HttpClientModule de ce fichier
@NgModule({
  declarations: [ListComponent, DetailsComponent],
  imports: [
    CommonModule,
    CatalogRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
})
export class CatalogModule { }
