package Windows.Storage.FileProperties

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

@ABIMarker(ThumbnailType.ABI::class)
@Signature("enum(Windows.Storage.FileProperties.ThumbnailType;i4)")
@WinRTByReference(brClass = ThumbnailType.ByReference::class)
public enum class ThumbnailType(
  public val value: Int
) : NativeMapped {
  Image(0),
  Icon(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ThumbnailType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Image
      1 -> Icon
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ThumbnailType> {
    public fun setValue(newValue: ThumbnailType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ThumbnailType =
        ThumbnailType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ThumbnailType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ThumbnailType =
        ThumbnailType.values()[0].fromNative(value, null)

    public override fun toNative(obj: ThumbnailType): Int = obj.value
  }
}
