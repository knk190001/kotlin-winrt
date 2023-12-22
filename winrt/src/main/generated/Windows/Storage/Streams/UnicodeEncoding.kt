package Windows.Storage.Streams

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

@ABIMarker(UnicodeEncoding.ABI::class)
@Signature("enum(Windows.Storage.Streams.UnicodeEncoding;i4)")
@WinRTByReference(brClass = UnicodeEncoding.ByReference::class)
public enum class UnicodeEncoding(
  public val value: Int
) : NativeMapped {
  Utf8(0),
  Utf16LE(1),
  Utf16BE(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UnicodeEncoding {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Utf8
      1 -> Utf16LE
      2 -> Utf16BE
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UnicodeEncoding> {
    public fun setValue(newValue: UnicodeEncoding): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UnicodeEncoding =
        UnicodeEncoding.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UnicodeEncoding, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UnicodeEncoding =
        UnicodeEncoding.values()[0].fromNative(value, null)

    public override fun toNative(obj: UnicodeEncoding): Int = obj.value
  }
}
