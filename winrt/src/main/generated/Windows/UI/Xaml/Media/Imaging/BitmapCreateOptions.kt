package Windows.UI.Xaml.Media.Imaging

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

@ABIMarker(BitmapCreateOptions.ABI::class)
@Signature("enum(Windows.UI.Xaml.Media.Imaging.BitmapCreateOptions;u4)")
@WinRTByReference(brClass = BitmapCreateOptions.ByReference::class)
public enum class BitmapCreateOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  IgnoreImageCache(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BitmapCreateOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      8 -> IgnoreImageCache
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<BitmapCreateOptions> {
    public fun setValue(newValue: BitmapCreateOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BitmapCreateOptions =
        BitmapCreateOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BitmapCreateOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BitmapCreateOptions =
        BitmapCreateOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: BitmapCreateOptions): Int = obj.value
  }
}
