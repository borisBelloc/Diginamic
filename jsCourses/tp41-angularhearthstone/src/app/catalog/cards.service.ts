import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CardsService {

  constructor(private http: HttpClient) { }


  get endpoint() {
    return 'https://omgvamp-hearthstone-v1.p.rapidapi.com/';
  }



  get htttpOption(): { headers: HttpHeaders } {
    const headers = new HttpHeaders()
      .set('x-rapidapi-host', 'omgvamp-hearthstone-v1.p.rapidapi.com')
      .set('x-rapidapi-key', 'd99e92cde6mshffcf37544a876bep14eb15jsn1c1928e0dec3');
    return { headers };
  }

  getcards(setName: string, className?: string) {
    return this.set(setName);
  }

  private set(name) {
    return this.http.get(`${this.endpoint}cards/sets/${name}`, this.htttpOption);
  }
}
