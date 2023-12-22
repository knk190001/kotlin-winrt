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

@ABIMarker(PropertyPrefetchOptions.ABI::class)
@Signature("enum(Windows.Storage.FileProperties.PropertyPrefetchOptions;u4)")
@WinRTByReference(brClass = PropertyPrefetchOptions.ByReference::class)
public enum class PropertyPrefetchOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  MusicProperties(1),
  VideoProperties(2),
  ImageProperties(4),
  DocumentProperties(8),
  BasicProperties(16),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PropertyPrefetchOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> MusicProperties
      2 -> VideoProperties
      4 -> ImageProperties
      8 -> DocumentProperties
      16 -> BasicProperties
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PropertyPrefetchOptions> {
    public fun setValue(newValue: PropertyPrefetchOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PropertyPrefetchOptions =
        PropertyPrefetchOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PropertyPrefetchOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PropertyPrefetchOptions =
        PropertyPrefetchOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: PropertyPrefetchOptions): Int = obj.value
  }
}
