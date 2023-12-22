package Windows.Storage

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(StorageLibraryChangeType.ABI::class)
@Signature("enum(Windows.Storage.StorageLibraryChangeType;i4)")
@WinRTByReference(brClass = StorageLibraryChangeType.ByReference::class)
public enum class StorageLibraryChangeType(
  public val value: Int
) : NativeMapped {
  Created(0),
  Deleted(1),
  MovedOrRenamed(2),
  ContentsChanged(3),
  MovedOutOfLibrary(4),
  MovedIntoLibrary(5),
  ContentsReplaced(6),
  IndexingStatusChanged(7),
  EncryptionChanged(8),
  ChangeTrackingLost(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StorageLibraryChangeType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Created
      1 -> Deleted
      2 -> MovedOrRenamed
      3 -> ContentsChanged
      4 -> MovedOutOfLibrary
      5 -> MovedIntoLibrary
      6 -> ContentsReplaced
      7 -> IndexingStatusChanged
      8 -> EncryptionChanged
      9 -> ChangeTrackingLost
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<StorageLibraryChangeType>
      {
    public fun setValue(newValue: StorageLibraryChangeType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StorageLibraryChangeType =
        StorageLibraryChangeType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StorageLibraryChangeType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StorageLibraryChangeType =
        StorageLibraryChangeType.values()[0].fromNative(value, null)

    public override fun toNative(obj: StorageLibraryChangeType): Int = obj.value
  }
}
