#language: pt
#Author: your.email@your.domain.com


@executa1
 Funcionalidade: Buscar profissional
   Como usuario quero validar a busca do professinal via api


 Contexto: Acessar api
Dado  que eu acesse api get para consultar profissional

 
 Cenario: Validar status code 
   Entao  valido o status code de retorno
   
   
   Cenario: Validar body response estrutura lista campo name
   Entao  valido o nome "Professional"
