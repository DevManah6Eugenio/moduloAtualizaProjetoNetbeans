package moduloAtualizaProjeto;
/** Localizable strings for {@link moduloAtualizaProjeto}. */
class Bundle {
    /**
     * @return <i>tela</i>
     * @see telaTopComponent
     */
    static String CTL_telaAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_telaAction");
    }
    /**
     * @return <i>Atualizar Projetos GW</i>
     * @see telaTopComponent
     */
    static String CTL_telaTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_telaTopComponent");
    }
    /**
     * @return <i>Atualizar Projetos GW</i>
     * @see telaTopComponent
     */
    static String HINT_telaTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HINT_telaTopComponent");
    }
    private Bundle() {}
}
