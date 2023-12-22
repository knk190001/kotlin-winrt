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

@ABIMarker(StorageItemTypes.ABI::class)
@Signature("enum(Windows.Storage.StorageItemTypes;u4)")
@WinRTByReference(brClass = StorageItemTypes.ByReference::class)
public enum class StorageItemTypes(
  public val value: Int
) : NativeMapped {
  None(0),
  File(1),
  Folder(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StorageItemTypes {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> File
      2 -> Folder
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<StorageItemTypes> {
    public fun setValue(newValue: StorageItemTypes): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StorageItemTypes =
        StorageItemTypes.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StorageItemTypes, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StorageItemTypes =
        StorageItemTypes.values()[0].fromNative(value, null)

    public override fun toNative(obj: StorageItemTypes): Int = obj.value
  }
}
