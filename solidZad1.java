public class HttpRestRequest {

    protected MuleMessage muleMessage;
    protected Constraints validationConstraints;

    public HttpRestRequest(MuleMessage muleMessage) 
    {
        this.muleMessage = muleMessage;
    }

    public void setStrings()
    {
        for (Constraint constraint : validationConstraints.getHeaderConstraints())
        {
            String headerName = constraint.getHeaderName();
            String headerValue = muleMessage.getHeader(headerName);
        }
    }

    public void validate(Constraints validationConstraints) throws InvalidHeaderException 
    {
        this.validationConstraints = validationConstraints;
        this.setStrings();
    }

    public MuleMessage setMassage()
    {
        this.setStrings();
        return MuleMessage;
    }

    private void checkHeaderRequirements(String headerName, String HeaderValues) throws InvalidHeaderException
    {
        if (headerValue == null && constraint.isHeaderRequired()) 
        {
            throw new InvalidHeaderException("Required header " + headerName + " not specified");
        }
    }

    private void setHeaderValues(String headerName, String HeaderValues) throws InvalidHeaderException
    {
        if (headerValue == null && constraint.getDefaultValue() != null) 
        {
            muleMessage.setHeader(headerName, constraint.getDefaultValue());
        }
    }

    private void checkHeaderFormat(String headerName, String HeaderValues) throws InvalidHeaderException
    {
        if (headerValue != null) 
        {
            if (!constraint.validate(headerValue)) 
            {
                throw new InvalidHeaderException(MessageFormat.format("Invalid value format for header {0}.", headerName));
            }
        }
    }


  
    
}