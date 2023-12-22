package Windows.Security.Cryptography

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

@ABIMarker(BinaryStringEncoding.ABI::class)
@Signature("enum(Windows.Security.Cryptography.BinaryStringEncoding;i4)")
@WinRTByReference(brClass = BinaryStringEncoding.ByReference::class)
public enum class BinaryStringEncoding(
  public val value: Int
) : NativeMapped {
  Utf8(0),
  Utf16LE(1),
  Utf16BE(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BinaryStringEncoding {
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

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<BinaryStringEncoding> {
    public fun setValue(newValue: BinaryStringEncoding): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BinaryStringEncoding =
        BinaryStringEncoding.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BinaryStringEncoding, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BinaryStringEncoding =
        BinaryStringEncoding.values()[0].fromNative(value, null)

    public override fun toNative(obj: BinaryStringEncoding): Int = obj.value
  }
}
