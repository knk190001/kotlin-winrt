package Windows.Graphics.Imaging

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

@ABIMarker(BitmapBufferAccessMode.ABI::class)
@Signature("enum(Windows.Graphics.Imaging.BitmapBufferAccessMode;i4)")
@WinRTByReference(brClass = BitmapBufferAccessMode.ByReference::class)
public enum class BitmapBufferAccessMode(
  public val value: Int
) : NativeMapped {
  Read(0),
  ReadWrite(1),
  Write(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BitmapBufferAccessMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Read
      1 -> ReadWrite
      2 -> Write
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<BitmapBufferAccessMode> {
    public fun setValue(newValue: BitmapBufferAccessMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BitmapBufferAccessMode =
        BitmapBufferAccessMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BitmapBufferAccessMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BitmapBufferAccessMode =
        BitmapBufferAccessMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: BitmapBufferAccessMode): Int = obj.value
  }
}
