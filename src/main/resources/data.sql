DROP TABLE IF EXISTS WS_PEDIDO;

CREATE TABLE WS_PEDIDO (
  ID INT AUTO_INCREMENT  PRIMARY KEY,
  DH_CRIACAO TIMESTAMP,
  RAZAO_SOCIAL VARCHAR(250),
  CNPJ VARCHAR(250),
  TELEFONE VARCHAR(250),
  EMAIL VARCHAR(250)
);