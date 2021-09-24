--
-- PostgreSQL database dump
--

-- Dumped from database version 12.8 (Ubuntu 12.8-0ubuntu0.20.04.1)
-- Dumped by pg_dump version 12.8 (Ubuntu 12.8-0ubuntu0.20.04.1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: estudiante; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.estudiante (
    idestudiante integer NOT NULL,
    primer_nom character varying(50),
    primer_ape character varying(50),
    seg_nom character varying(50),
    seg_ape character varying(50),
    estado boolean DEFAULT false NOT NULL
);


ALTER TABLE public.estudiante OWNER TO postgres;

--
-- Name: estudiante_idestudiante_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.estudiante_idestudiante_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.estudiante_idestudiante_seq OWNER TO postgres;

--
-- Name: estudiante_idestudiante_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.estudiante_idestudiante_seq OWNED BY public.estudiante.idestudiante;


--
-- Name: estudiante idestudiante; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estudiante ALTER COLUMN idestudiante SET DEFAULT nextval('public.estudiante_idestudiante_seq'::regclass);


--
-- Data for Name: estudiante; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.estudiante (idestudiante, primer_nom, primer_ape, seg_nom, seg_ape, estado) FROM stdin;
2	Josue	Capistran	\N	Garcia	f
3	Fernando	Martinez	Francisco	Leon	f
1	Gabriel	Garcia	Rodrigo	Rodrigo	f
4	Maria	Rodriguez	Fernanda	Fernanda	t
\.


--
-- Name: estudiante_idestudiante_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.estudiante_idestudiante_seq', 4, true);


--
-- Name: estudiante estudiante_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estudiante
    ADD CONSTRAINT estudiante_pkey PRIMARY KEY (idestudiante);


--
-- Name: TABLE estudiante; Type: ACL; Schema: public; Owner: postgres
--

GRANT ALL ON TABLE public.estudiante TO capistran;


--
-- Name: SEQUENCE estudiante_idestudiante_seq; Type: ACL; Schema: public; Owner: postgres
--

GRANT SELECT,USAGE ON SEQUENCE public.estudiante_idestudiante_seq TO capistran;


--
-- PostgreSQL database dump complete
--

