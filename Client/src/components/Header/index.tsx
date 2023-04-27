import React from "react";
import { useRouter } from "next/router";
import Image from "next/image";
import Link from "next/link";

const Header = () => {
  const router = useRouter();
  return (
    <div className="flex w-full justify-between py-4 px-10 sticky inset-0 z-[800] h-[73px] border-b border-gray-200 bg-[#F7F7F7] bg-opacity-90 backdrop-blur-xl">
      <div className="mt-2 flex" onClick={() => router.push("/")}>
        <Image
          className="cursor-pointer"
          src={"/logo-icon.png"}
          alt="Picture of the author"
          width={50}
          height={100}
        />
        <span className="text-center font-semibold text-xl "><span className="text-orange-500">FOOD</span>ISEARCH</span>
        
      </div>

      <div>
        <svg
          className="max-w-[24px] max-h-[24px]"
          width="76"
          height="76"
          viewBox="0 0 76 76"
          fill="none"
          xmlns="http://www.w3.org/2000/svg"
        >
          <circle cx="38" cy="38" r="38" fill="#FF7D00" fill-opacity="0.9" />
          <path
            d="M39.1437 49.3218C46.5755 49.3218 52.6135 43.6216 52.8704 36.5C52.6135 29.3783 46.5755 23.6781 39.1437 23.6781C31.7126 23.6781 25.6729 29.3783 25.4194 36.5C25.6721 43.6216 31.7118 49.3218 39.1437 49.3218Z"
            fill="white"
          />
          <path
            d="M39.1445 17.5938C28.7031 17.5938 20.2374 26.0586 20.2374 36.5C20.2374 46.9405 28.704 55.4062 39.1445 55.4062C49.5851 55.4062 58.0508 46.9405 58.0508 36.5C58.0508 26.0586 49.5851 17.5938 39.1445 17.5938ZM39.1437 50.25C31.5494 50.25 25.3928 44.3023 25.3928 36.9632C25.3928 36.8068 25.4143 36.6547 25.4195 36.5C25.4143 36.3453 25.3928 36.1923 25.3928 36.0368C25.3928 28.6977 31.5502 22.75 39.1437 22.75C46.738 22.75 52.8937 28.6977 52.8937 36.0368C52.8937 36.1923 52.8756 36.3453 52.8713 36.5C52.8765 36.6547 52.8937 36.8068 52.8937 36.9632C52.8928 44.3023 46.738 50.25 39.1437 50.25Z"
            fill="white"
          />
          <path
            d="M13.9915 15.3774C14.1977 14.5687 14.6059 15.3679 14.6059 15.3679C14.6059 15.3679 14.7486 23.7382 15.6767 23.8293C16.6048 23.9204 15.8898 15.2167 16.9881 15.05C18.0091 14.8875 17.4264 23.9677 18.3563 23.8757C19.2827 23.7778 19.4391 15.4109 19.4391 15.4109C19.4391 15.4109 19.8516 14.6125 20.0552 15.4152C22.5715 25.3066 20.5356 29.35 20.5356 29.35C20.5356 29.35 20.1919 30.1999 19.3755 30.2042C19.299 30.1999 19.3566 53.6961 19.3514 56.8551C19.3531 58.3908 14.6248 58.3436 14.6274 56.8147C14.6309 53.6557 14.7228 30.1621 14.6489 30.1638C13.8299 30.1638 13.487 29.3147 13.487 29.3147C13.487 29.3147 11.4589 25.2739 13.9915 15.3774ZM58.7984 15.0156C59.8623 15.013 64.2761 18.1953 64.2812 30.022C64.2864 33.8041 62.223 33.8032 62.2265 36.1691C62.2299 38.5307 62.2428 57.3149 62.2428 57.3149C62.2428 57.3149 59.9792 58.8678 58.2966 57.2427L58.2656 15.3516C58.2673 15.3525 58.2613 15.0147 58.7984 15.0156Z"
            fill="white"
          />
        </svg>
      </div>
      <div className="flex flex-end">
        <button
          onClick={() => router.push("/login")}
          type="button"
          style={{ backgroundColor: "orange" }}
          className="inline-block mx-4 rounded px-4 py-0 text-xs font-medium uppercase leading-normal text-white transition duration-150 ease-in-out hover:bg-primary-600 hover:shadow-[0_8px_9px_-4px_rgba(59,113,202,0.3),0_4px_18px_0_rgba(59,113,202,0.2)] focus:bg-primary-600 focus:shadow-[0_8px_9px_-4px_rgba(59,113,202,0.3),0_4px_18px_0_rgba(59,113,202,0.2)] focus:outline-none focus:ring-0 active:bg-primary-700"
        >
          Sign in
        </button>

        <button
          onClick={() => router.push("/register")}
          type="button"
          style={{ backgroundColor: "white" }}
          className="inline-block rounded px-4 py-0 text-xs font-medium uppercase leading-normal text-orange transition duration-150 ease-in-out hover:bg-primary-600 hover:shadow-[0_8px_9px_-4px_rgba(59,113,202,0.3),0_4px_18px_0_rgba(59,113,202,0.2)] focus:bg-primary-600 focus:shadow-[0_8px_9px_-4px_rgba(59,113,202,0.3),0_4px_18px_0_rgba(59,113,202,0.2)] focus:outline-none focus:ring-0 active:bg-primary-700"
        >
          Sign up
        </button>
      </div>
    </div>
  );
};

export default Header;
