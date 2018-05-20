export interface IProduct {
  id?: number;
  brand?: string;
  name?: string;
  keywords?: string;
  specs?: string;
  season?: string;
}

export class Product implements IProduct {
  constructor(
    public id?: number,
    public brand?: string,
    public name?: string,
    public keywords?: string,
    public specs?: string,
    public season?: string
  ) {}
}
