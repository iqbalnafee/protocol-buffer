// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: addressbook.proto
// Protobuf Java Version: 4.27.2

package proto.generated_proto_classes;

public final class AddressBookProtos {
  private AddressBookProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      AddressBookProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Person_descriptor;
  static final
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Person_PhoneNumber_descriptor;
  static final
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_Person_PhoneNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_AddressBook_descriptor;
  static final
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_AddressBook_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021addressbook.proto\022\005proto\"\323\002\n\006Person\022\021\n" +
      "\004name\030\001 \001(\tH\000\210\001\001\022\017\n\002id\030\002 \001(\005H\001\210\001\001\022\022\n\005ema" +
      "il\030\003 \001(\tH\002\210\001\001\022)\n\006phones\030\004 \003(\0132\031.proto.Pe" +
      "rson.PhoneNumber\032b\n\013PhoneNumber\022\023\n\006numbe" +
      "r\030\001 \001(\tH\000\210\001\001\022*\n\004type\030\002 \001(\0162\027.proto.Perso" +
      "n.PhoneTypeH\001\210\001\001B\t\n\007_numberB\007\n\005_type\"h\n\t" +
      "PhoneType\022\032\n\026PHONE_TYPE_UNSPECIFIED\020\000\022\025\n" +
      "\021PHONE_TYPE_MOBILE\020\001\022\023\n\017PHONE_TYPE_HOME\020" +
      "\002\022\023\n\017PHONE_TYPE_WORK\020\003B\007\n\005_nameB\005\n\003_idB\010" +
      "\n\006_email\",\n\013AddressBook\022\035\n\006people\030\001 \003(\0132" +
      "\r.proto.PersonB.\n\027generated_proto_classe" +
      "sB\021AddressBookProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_proto_Person_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", "Phones", });
    internal_static_proto_Person_PhoneNumber_descriptor =
      internal_static_proto_Person_descriptor.getNestedTypes().get(0);
    internal_static_proto_Person_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_proto_Person_PhoneNumber_descriptor,
        new java.lang.String[] { "Number", "Type", });
    internal_static_proto_AddressBook_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_AddressBook_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_proto_AddressBook_descriptor,
        new java.lang.String[] { "People", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
