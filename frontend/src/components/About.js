import React from "react";
import Navbar from "./Navbar";
import Footer from "./Footer";
import InfoSection from "./InfoSection";
import { InfoData2 } from "../data/InfoData";

function About() {
  return (
    <>
      <Navbar />
      <InfoSection {...InfoData2} />
      <Footer />
    </>
  );
}

export default About;
