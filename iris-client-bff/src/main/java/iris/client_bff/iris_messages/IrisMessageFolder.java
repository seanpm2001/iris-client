package iris.client_bff.iris_messages;

import iris.client_bff.core.Aggregate;
import iris.client_bff.core.Id;
import lombok.*;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "iris_message_folder")
@SecondaryTable(name = "iris_message_folder_default")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class IrisMessageFolder extends Aggregate<IrisMessageFolder, IrisMessageFolder.IrisMessageFolderIdentifier> {

    {
        id = IrisMessageFolder.IrisMessageFolderIdentifier.of(UUID.randomUUID());
    }

    @OneToMany(mappedBy = "folder", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<IrisMessage> messages;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private IrisMessageContext context;

    @Column(name = "id", table = "iris_message_folder_default", insertable = false, updatable = false)
    private UUID defaultFolder;

    private UUID parentFolder;

    public Boolean getIsDefault() {
        return this.getId().toUUID().equals(this.defaultFolder);
    }

    @Embeddable
    @EqualsAndHashCode
    @RequiredArgsConstructor(staticName = "of")
    @NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
    public static class IrisMessageFolderIdentifier implements Id, Serializable {

        @Serial
        private static final long serialVersionUID = -8255216015747810442L;

        final UUID id;

        /**
         * for JSON deserialization
         */
        public static IrisMessageFolder.IrisMessageFolderIdentifier of(String uuid) {
            return of(UUID.fromString(uuid));
        }

        @Override
        public String toString() {
            return id.toString();
        }

        public UUID toUUID() {
            return id;
        }
    }
}
