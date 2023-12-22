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

@ABIMarker(Printing3DBufferFormat.ABI::class)
@Signature("enum(Windows.Graphics.Printing3D.Printing3DBufferFormat;i4)")
@WinRTByReference(brClass = Printing3DBufferFormat.ByReference::class)
public enum class Printing3DBufferFormat(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  R32G32B32A32Float(2),
  R32G32B32A32UInt(3),
  R32G32B32Float(6),
  R32G32B32UInt(7),
  Printing3DDouble(500),
  Printing3DUInt(501),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      Printing3DBufferFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      2 -> R32G32B32A32Float
      3 -> R32G32B32A32UInt
      6 -> R32G32B32Float
      7 -> R32G32B32UInt
      500 -> Printing3DDouble
      501 -> Printing3DUInt
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<Printing3DBufferFormat> {
    public fun setValue(newValue: Printing3DBufferFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Printing3DBufferFormat =
        Printing3DBufferFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<Printing3DBufferFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Printing3DBufferFormat =
        Printing3DBufferFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: Printing3DBufferFormat): Int = obj.value
  }
}
