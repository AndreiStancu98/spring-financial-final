import React, { useState, useEffect } from "react";
import Navbar from "./Navbar";
import { getAccountData } from "../data/AccountData";
import styled from "styled-components";
import { useParams } from "react-router-dom";
import axios from "axios";

const Section = styled.section`
  width: 100%;
  height: 100%;
  min-height: 100vh;
  padding: 4rem 0rem;
  background-color: #000d1a;
`;
const Container = styled.div`
  // padding: 15rem calc((100vw - 1300px) / 2);
  display: grid;
  gap: 20px;
  grid-template-columns: 1fr 1fr;
  grid-template-rows: 800px;
  color: white;
  @media screen and (max-width: 768px) {
    grid-template-columns: 1fr;
  }
  margin: auto;
  width: 50%;
  padding: 10px;
  text-align: center;
`;
const ColumnLeft = styled.div`
  display: flex;
  justify-content: center;
  line-height: 0.1;
  padding: 1rem 2rem;
  order: ${({ reverse }) => (reverse ? "2" : "1")};
  .asdf + asdf {
    margin-top: 20px;
  }
  h1 {
    margin-bottom: 2rem;
    font-size: clamp(1.5rem, 6vw, 2rem);
  }

  p {
    margin-bottom: 2rem;
  }

  hr {
    display: block;
    height: 1px;
    border: 0;
    border-top: 1px solid #ccc;
    margin: 1em 0;
    padding: 0;
  }
`;

const ColumnRight = styled.div`
  padding: 1rem 2rem;
  margin-bottom: 8rem;
  margin-top: 5rem;
  line-height: 0.3;
  order: ${({ reverse }) => (reverse ? "1" : "2")};
  display: flex;
  justify-content: center;
  line-height: 0.1;
  margin-top: 0px;
  align-items: flex-start;
  @media screen and (max-width: 768px) {
    order: ${({ reverse }) => (reverse ? "2" : "1")};
  }

  h1 {
    margin-bottom: 2rem;
    font-size: clamp(1.5rem, 6vw, 2rem);
  }

  p {
    margin-bottom: 2rem;
  }

  hr {
    display: block;
    height: 1px;
    border: 0;
    border-top: 1px solid #ccc;
    margin: 1em 0;
    padding: 0;
  }
`;

function AccountDetails() {
  let { id } = useParams();
  const baseUrl = "http://localhost:8080/api/test/account/customerPid";
  const baseUrlCard = "http://localhost:8080/api/test/card/accountNumber";

  let [accountData, setAccountData] = useState([]);
  let [cardData, setCardData] = useState([]);
  let [accountId, setAccountId] = useState(id);

  const getData = async (customerId) => {
    const request = await fetch(`${baseUrl}=${customerId}`);

    if (request.ok) {
      const data = await request.json();
      console.log(data);
      const cid = data
        .map((d) => d.accountNumber)
        .filter((e, i, a) => !a.slice(0, i).includes(e))
        .pop();
      setAccountData(data);
      setAccountId(cid);
    }
  };

  const getCardData = async (accountNumber) => {
    const request = await fetch(`${baseUrlCard}=${accountNumber}`);
    if (request.ok) {
      const data = await request.json();
      setCardData(data);
      console.log(data);
    }
  };

  useEffect(() => {
    getData(id);
    getCardData(accountId);
  }, [accountId]);

  return (
    <>
      <Navbar />
      <Section>
        <div style={{ display: "flex", marginBottom: "2rem" }}>
          <h1
            style={{
              paddingLeft: "600px",
              paddingTop: "300px",
              paddingBottom: "0px",
              color: "white",
            }}
          >
            Accounts
          </h1>
          <h1
            style={{
              paddingLeft: "330px",
              paddingTop: "300px",
              paddingBottom: "30px",
              color: "white",
            }}
          >
            Cards
          </h1>
        </div>
        <Container>
          {accountData !== null ? (
            <div>
              {accountData.map((a, i) => (
                // <Container>
                <ColumnLeft key={i}>
                  <div style={{ border: "2px solid white", padding: "40px" }}>
                    <h1> </h1>
                    <h1>Account number</h1>
                    <p>{a.accountNumber}</p>
                    <hr />
                    <h1>Amount</h1>
                    <p>{a.amount}</p>
                    <hr />
                    <h1>Currency</h1>
                    <p>{a.currency}</p>
                    <hr />
                    <h1>Interest</h1>
                    <p>{a.interest}</p>
                    <hr />
                    <h1>Type</h1>
                    <p>{a.type}</p>
                    <hr />
                  </div>
                </ColumnLeft>
                // </Container>
              ))}
            </div>
          ) : null}
          <ColumnRight>
            {cardData && cardData.length ? (
              <div style={{ border: "2px solid white", padding: "40px" }}>
                {cardData.map((a, i) => (
                  <div key={i}>
                    <h1>Card number</h1>
                    <p>{a.cardNumber}</p>
                    <hr />
                    <h1>CVV</h1>
                    <p>{a.cvv}</p>
                    <hr />
                    <h1>First Name</h1>
                    <p>{a.customerFirstName}</p>
                    <hr />
                    <h1>Last Name</h1>
                    <p>{a.customerLastName}</p>
                    <hr />
                    <h1>Type</h1>
                    <p>{a.accountType}</p>
                    <hr />
                    <h1>Expiration Date</h1>
                    <p>{a.expirationDate}</p>
                    <hr />
                  </div>
                ))}
              </div>
            ) : null}
          </ColumnRight>
        </Container>
      </Section>
    </>
  );
}

export default AccountDetails;
