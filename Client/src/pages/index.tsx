import Image from "next/image";
import { Inter } from "next/font/google";
import SearchInput from "@/components/inputs/searchinput";
import SearchResults from "@/components/Product";
import React, { useEffect, useState } from "react";
import { SearchResult } from "@/data/interfaces/isearchresult";
import Header from "@/components/Header";
import PageLayout from "@/containers/layout/PageLayout";

const inter = Inter({ subsets: ["latin"] });

export default function Home() {
  const [searchResults, setSearchResults] = useState<SearchResult[]>([]);
  const [filteredResults, setFilteredResults] = useState<SearchResult[]>([]);
  const [filter, setFilter] = useState<string>("all");
  const [categories, setCategories] = useState<string[]>([]);
  const [search, setSearch] = useState("");
  async function fetchSearchResults() {
    const urls = [
      "/aldi-products.json",
      "/edeka-products.json",
      "/rewe-products.json",
    ];
    const supermarkets = ["aldi-nord", "edeka", "rewe"];
    const requests = urls.map((url) => fetch(url));
    const responses = await Promise.all(requests);

    const json = responses.map((res) => res.json());

    const data = await Promise.all(json);

    const flatData = data
      .flatMap((d, index) => {
        return d.map((d1: SearchResult) => {
          return {
            ...d1,
            supermarket: supermarkets[index],
          } as SearchResult;
        });
      })
      .reverse() as SearchResult[];
    setSearchResults(flatData);

    const categories: string[] = flatData
      .filter((p) => typeof p.category !== "undefined")
      .map((p) => p.category);
    setCategories(Array.from(new Set(categories)));
  }
  // Fetch search results from an API or another data source
  useEffect(() => {
    fetchSearchResults();
  }, []);

  useEffect(() => {
    if (filter === "all") {
      setFilteredResults(searchResults);
    } else {
      setFilteredResults(
        searchResults.filter((result) => result.category === filter)
      );
    }
  }, [searchResults, filter]);

  useEffect(() => {
    if (search == "") {
      fetchSearchResults();
      return;
    }
    const products = searchResults.filter((s) =>
      s.name.toLowerCase().includes(search.toLowerCase())
    );
    setSearchResults(products);
    setFilteredResults(products);
  }, [search, searchResults]);
  const handleFilterChange = (event: React.ChangeEvent<HTMLSelectElement>) => {
    setFilter(event.target.value);
  };
  const onSearchInputChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    console.log(e.target.value);
    setSearch(e.target.value);
  };
  return (
    <PageLayout>
      <Header />

      <SearchInput onChange={onSearchInputChange} value={search} />

      {filteredResults.length > 0 && (
        <>
          <div className="mb-6">
            <label
              htmlFor="category"
              className="block text-sm font-medium text-gray-700"
            >
              Filter by category
            </label>
            <select
              id="category"
              name="category"
              value={filter}
              onChange={handleFilterChange}
              className="mt-1 block w-full pl-3 pr-10 py-2 text-base border-gray-300 focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm rounded-md text-black"
            >
              <option value="all">All</option>
              {categories.map((c: string) => (
                <option key={c} value={c.toLowerCase()}>
                  {c}
                </option>
              ))}
            </select>
          </div>
          <h1 className="text-3xl font-semibold mb-6">Search Results</h1>

          <SearchResults results={filteredResults} />
        </>
      )}
    </PageLayout>
  );
}
