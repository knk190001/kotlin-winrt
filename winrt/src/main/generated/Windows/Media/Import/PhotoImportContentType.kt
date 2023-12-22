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

@ABIMarker(PhotoImportContentType.ABI::class)
@Signature("enum(Windows.Media.Import.PhotoImportContentType;i4)")
@WinRTByReference(brClass = PhotoImportContentType.ByReference::class)
public enum class PhotoImportContentType(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Image(1),
  Video(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhotoImportContentType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Image
      2 -> Video
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhotoImportContentType> {
    public fun setValue(newValue: PhotoImportContentType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhotoImportContentType =
        PhotoImportContentType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhotoImportContentType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhotoImportContentType =
        PhotoImportContentType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhotoImportContentType): Int = obj.value
  }
}
