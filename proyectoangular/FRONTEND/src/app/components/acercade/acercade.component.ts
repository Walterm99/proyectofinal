import { Component, OnInit } from '@angular/core';
import { Persona } from 'src/app/model/Persona.model';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-acercade',
  templateUrl: './acercade.component.html',
  styleUrls: ['./acercade.component.css']
})
export class AcercadeComponent implements OnInit {
  persona:Persona=new Persona("","","");
  constructor(public personaService:PersonaService) { }

  ngOnInit(): void {
  }

}
