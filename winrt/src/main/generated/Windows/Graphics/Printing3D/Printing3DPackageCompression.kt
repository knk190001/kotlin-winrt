package Windows.Graphics.Printing3D

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

@ABIMarker(Printing3DPackageCompression.ABI::class)
@Signature("enum(Windows.Graphics.Printing3D.Printing3DPackageCompression;i4)")
@WinRTByReference(brClass = Printing3DPackageCompression.ByReference::class)
public enum class Printing3DPackageCompression(
  public val value: Int
) : NativeMapped {
  Low(0),
  Medium(1),
  High(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      Printing3DPackageCompression {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Low
      1 -> Medium
      2 -> High
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<Printing3DPackageCompression> {
    public fun setValue(newValue: Printing3DPackageCompression): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Printing3DPackageCompression =
        Printing3DPackageCompression.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<Printing3DPackageCompression, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Printing3DPackageCompression =
        Printing3DPackageCompression.values()[0].fromNative(value, null)

    public override fun toNative(obj: Printing3DPackageCompression): Int = obj.value
  }
}
