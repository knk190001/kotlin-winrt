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

@ABIMarker(PhotoImportItemSelectionMode.ABI::class)
@Signature("enum(Windows.Media.Import.PhotoImportItemSelectionMode;i4)")
@WinRTByReference(brClass = PhotoImportItemSelectionMode.ByReference::class)
public enum class PhotoImportItemSelectionMode(
  public val value: Int
) : NativeMapped {
  SelectAll(0),
  SelectNone(1),
  SelectNew(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhotoImportItemSelectionMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SelectAll
      1 -> SelectNone
      2 -> SelectNew
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PhotoImportItemSelectionMode> {
    public fun setValue(newValue: PhotoImportItemSelectionMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhotoImportItemSelectionMode =
        PhotoImportItemSelectionMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhotoImportItemSelectionMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhotoImportItemSelectionMode =
        PhotoImportItemSelectionMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhotoImportItemSelectionMode): Int = obj.value
  }
}
