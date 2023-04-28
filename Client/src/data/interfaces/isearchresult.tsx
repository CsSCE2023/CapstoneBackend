export interface SearchResult {
  id: number;
  price: number;
  title: string;
  link: string;
  description: string;
  category: string;
  article_link: string;
  img_link: string;
  supermarket?: string;
  date_expires: string;
  scraped_date: string;
}
