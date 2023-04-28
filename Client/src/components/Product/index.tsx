import React from "react";
import { truncate } from "lodash";
import Image from "next/image";
import Link from "next/link";
import { SearchResult } from "@/data/interfaces/isearchresult";

interface SearchResultProps {
  result: SearchResult;
}

// const myLoader = ({ src, width, quality }) => {
//   return `https://example.com/${src}?w=${width}&q=${quality || 75}`;
// };
const Product: React.FC<SearchResultProps> = ({ result }) => (
  <div className="p-4 w-full md:w-1/2 lg:w-1/3 xl:w-1/4 cursor-pointer">
    <div className="bg-white shadow-md rounded p-6 cursor-pointer hover:scale-110 hover:transition-transform">
      <Link
        href={`/products/${result.id}?supermarket=${result.supermarket}`}
        rel="noopener noreferrer"
        target="_blank"
      >
        <Image
          src={result.img_link}
          alt="Picture of the author"
          width={200}
          height={200}
        />
        <h3 className="text-lg font-semibold mb-2 text-black">
          {result.title}
        </h3>
        {/* <h4 className="line-through">Price: € {result.price}</h4> */}
        <h4>Price: € 7.99</h4>
        <p className="mt-2 bold text-gray-700">{result.supermarket}</p>
      </Link>
    </div>
  </div>
);

interface SearchResultsProps {
  results: Array<SearchResult>;
}

const SearchResults: React.FC<SearchResultsProps> = ({ results }) => (
  <div className="search-results-container mt-8 max-w-5xl">
    <div className="flex flex-wrap -m-4 justify-center items-center">
      {results.map((result, index) => (
        <Product key={index} result={result} />
      ))}
    </div>
  </div>
);

export default SearchResults;
