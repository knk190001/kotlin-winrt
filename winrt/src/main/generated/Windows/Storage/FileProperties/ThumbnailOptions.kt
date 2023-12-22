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

@ABIMarker(ThumbnailOptions.ABI::class)
@Signature("enum(Windows.Storage.FileProperties.ThumbnailOptions;u4)")
@WinRTByReference(brClass = ThumbnailOptions.ByReference::class)
public enum class ThumbnailOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  ReturnOnlyIfCached(1),
  ResizeThumbnail(2),
  UseCurrentScale(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ThumbnailOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> ReturnOnlyIfCached
      2 -> ResizeThumbnail
      4 -> UseCurrentScale
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ThumbnailOptions> {
    public fun setValue(newValue: ThumbnailOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ThumbnailOptions =
        ThumbnailOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ThumbnailOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ThumbnailOptions =
        ThumbnailOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: ThumbnailOptions): Int = obj.value
  }
}
