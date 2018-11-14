#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Region
#------------------------------------------------------------

CREATE TABLE Region(
        idRegion  Int  Auto_increment  NOT NULL ,
        nomRegion Varchar (50) NOT NULL
	,CONSTRAINT Region_PK PRIMARY KEY (idRegion)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Apprenant
#------------------------------------------------------------

CREATE TABLE Apprenant(
        idApprenant     Int NOT NULL ,
        nomApprenant    Varchar (50) NOT NULL ,
        prenomApprenant Varchar (50) NOT NULL ,
        dateNaissance   Date NOT NULL ,
        emailApprenant  Varchar (50) NOT NULL ,
        photoApprenant  Blob NOT NULL ,
        idRegion        Int NOT NULL
	,CONSTRAINT Apprenant_PK PRIMARY KEY (idApprenant)

	,CONSTRAINT Apprenant_Region_FK FOREIGN KEY (idRegion) REFERENCES Region(idRegion)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Activites
#------------------------------------------------------------

CREATE TABLE Activites(
        idActivite  Int NOT NULL ,
        nomActivite Varchar (50) NOT NULL
	,CONSTRAINT Activites_PK PRIMARY KEY (idActivite)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: fait
#------------------------------------------------------------

CREATE TABLE fait(
        idActivite  Int NOT NULL ,
        idApprenant Int NOT NULL
	,CONSTRAINT fait_PK PRIMARY KEY (idActivite,idApprenant)

	,CONSTRAINT fait_Activites_FK FOREIGN KEY (idActivite) REFERENCES Activites(idActivite)
	,CONSTRAINT fait_Apprenant0_FK FOREIGN KEY (idApprenant) REFERENCES Apprenant(idApprenant)
)ENGINE=InnoDB;

