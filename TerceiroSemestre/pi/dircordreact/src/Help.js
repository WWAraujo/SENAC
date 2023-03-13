import './Help.scss';


export default function Help(props) {

    return(
        <div className='box-helps'>
            <hr /> 
            <h1 className='titulo'>Precisa de ajuda? Conte com a gente.</h1>
            <p> {props.nome}  </p>

            <p className='paragrado-titulo'> De configurações de conta a permissões, encontre ajuda sobre tudo para o Discord Se você é novo no Discord e está precisando de umas dicas, dê uma olhada no nosso Guia do Iniciante! </p>
            <p> {props.formacao}</p>
            <hr />
        </div>

        
    )
}