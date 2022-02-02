public final class BodyPart {
    final static BodyPart ARM = new BodyPart("Рука");
    final static BodyPart LEG = new BodyPart("Нога");
    final static BodyPart HEAD = new BodyPart("Голова");
    final static BodyPart CHEST = new BodyPart("Грудь");
    private String bodyPart;

  private BodyPart (String bodyPart) {this.bodyPart = bodyPart;}

    @Override
    public String toString() {
        return this.bodyPart;
    }
}
