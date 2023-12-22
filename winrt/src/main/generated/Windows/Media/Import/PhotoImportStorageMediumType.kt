package Windows.Media.Import

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

@ABIMarker(PhotoImportStorageMediumType.ABI::class)
@Signature("enum(Windows.Media.Import.PhotoImportStorageMediumType;i4)")
@WinRTByReference(brClass = PhotoImportStorageMediumType.ByReference::class)
public enum class PhotoImportStorageMediumType(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  Fixed(1),
  Removable(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhotoImportStorageMediumType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> Fixed
      2 -> Removable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PhotoImportStorageMediumType> {
    public fun setValue(newValue: PhotoImportStorageMediumType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhotoImportStorageMediumType =
        PhotoImportStorageMediumType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhotoImportStorageMediumType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhotoImportStorageMediumType =
        PhotoImportStorageMediumType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhotoImportStorageMediumType): Int = obj.value
  }
}
