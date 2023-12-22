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

@ABIMarker(PhotoImportAccessMode.ABI::class)
@Signature("enum(Windows.Media.Import.PhotoImportAccessMode;i4)")
@WinRTByReference(brClass = PhotoImportAccessMode.ByReference::class)
public enum class PhotoImportAccessMode(
  public val value: Int
) : NativeMapped {
  ReadWrite(0),
  ReadOnly(1),
  ReadAndDelete(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhotoImportAccessMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ReadWrite
      1 -> ReadOnly
      2 -> ReadAndDelete
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhotoImportAccessMode> {
    public fun setValue(newValue: PhotoImportAccessMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhotoImportAccessMode =
        PhotoImportAccessMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhotoImportAccessMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhotoImportAccessMode =
        PhotoImportAccessMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhotoImportAccessMode): Int = obj.value
  }
}
