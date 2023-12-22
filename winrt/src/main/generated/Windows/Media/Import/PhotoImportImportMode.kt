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

@ABIMarker(PhotoImportImportMode.ABI::class)
@Signature("enum(Windows.Media.Import.PhotoImportImportMode;i4)")
@WinRTByReference(brClass = PhotoImportImportMode.ByReference::class)
public enum class PhotoImportImportMode(
  public val value: Int
) : NativeMapped {
  ImportEverything(0),
  IgnoreSidecars(1),
  IgnoreSiblings(2),
  IgnoreSidecarsAndSiblings(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhotoImportImportMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ImportEverything
      1 -> IgnoreSidecars
      2 -> IgnoreSiblings
      3 -> IgnoreSidecarsAndSiblings
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhotoImportImportMode> {
    public fun setValue(newValue: PhotoImportImportMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhotoImportImportMode =
        PhotoImportImportMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhotoImportImportMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhotoImportImportMode =
        PhotoImportImportMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhotoImportImportMode): Int = obj.value
  }
}
