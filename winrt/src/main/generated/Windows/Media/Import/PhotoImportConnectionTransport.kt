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

@ABIMarker(PhotoImportConnectionTransport.ABI::class)
@Signature("enum(Windows.Media.Import.PhotoImportConnectionTransport;i4)")
@WinRTByReference(brClass = PhotoImportConnectionTransport.ByReference::class)
public enum class PhotoImportConnectionTransport(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Usb(1),
  IP(2),
  Bluetooth(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhotoImportConnectionTransport {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Usb
      2 -> IP
      3 -> Bluetooth
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PhotoImportConnectionTransport> {
    public fun setValue(newValue: PhotoImportConnectionTransport): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhotoImportConnectionTransport =
        PhotoImportConnectionTransport.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhotoImportConnectionTransport, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhotoImportConnectionTransport =
        PhotoImportConnectionTransport.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhotoImportConnectionTransport): Int = obj.value
  }
}
