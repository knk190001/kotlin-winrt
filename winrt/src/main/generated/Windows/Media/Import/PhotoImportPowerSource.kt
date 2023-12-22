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

@ABIMarker(PhotoImportPowerSource.ABI::class)
@Signature("enum(Windows.Media.Import.PhotoImportPowerSource;i4)")
@WinRTByReference(brClass = PhotoImportPowerSource.ByReference::class)
public enum class PhotoImportPowerSource(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Battery(1),
  External(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhotoImportPowerSource {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Battery
      2 -> External
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhotoImportPowerSource> {
    public fun setValue(newValue: PhotoImportPowerSource): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhotoImportPowerSource =
        PhotoImportPowerSource.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhotoImportPowerSource, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhotoImportPowerSource =
        PhotoImportPowerSource.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhotoImportPowerSource): Int = obj.value
  }
}
