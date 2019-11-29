import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CardInterface } from './interface/card.interface';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class CardsService {

  constructor(private http: HttpClient) { }


  get endpoint() {
    return 'https://omgvamp-hearthstone-v1.p.rapidapi.com/';
  }



  get httpOption(): { headers: HttpHeaders } {
    const headers = new HttpHeaders()
      .set('x-rapidapi-host', 'omgvamp-hearthstone-v1.p.rapidapi.com')
      .set('x-rapidapi-key', 'd99e92cde6mshffcf37544a876bep14eb15jsn1c1928e0dec3');
    return { headers };
  }

  getcards(setName: string, className?: string) {
    return this.set(setName);
  }

  getCardById(id: string) {
    return this.http.get(
      `${this.endpoint}cards/${id}`,
      this.httpOption).pipe(
        map((card: CardInterface[]) => card[0])
      );
  }

  private set(name): Observable<CardInterface[]> {
    return this.http.get(`${this.endpoint}cards/sets/${name}`, this.httpOption)
      .pipe(
        map((cards: CardInterface[]) => cards)
      );
  }
}
