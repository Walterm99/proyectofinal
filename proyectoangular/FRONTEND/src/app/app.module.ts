import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoAPComponent } from './components/logo-ap/logo-ap.component';
import { SocialComponent } from './components/social/social.component';
import { BannerComponent } from './components/banner/banner.component';
import { AcercadeComponent } from './components/acercade/acercade.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HardandsoftComponent } from './components/hardandsoft/hardandsoft.component';
import { ProyectosComponent } from './components/proyectos/proyectos.component';
import { FooterComponent } from './components/footer/footer.component';
import {  HttpClient, HttpClientModule} from "@angular/common/http";
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoAPComponent,
    SocialComponent,
    BannerComponent,
    AcercadeComponent,
    ExperienciaComponent,
    EducacionComponent,
    HardandsoftComponent,
    ProyectosComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
