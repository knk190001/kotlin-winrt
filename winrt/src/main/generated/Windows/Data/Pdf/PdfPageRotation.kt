package Windows.Data.Pdf

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

@ABIMarker(PdfPageRotation.ABI::class)
@Signature("enum(Windows.Data.Pdf.PdfPageRotation;i4)")
@WinRTByReference(brClass = PdfPageRotation.ByReference::class)
public enum class PdfPageRotation(
  public val value: Int
) : NativeMapped {
  Normal(0),
  Rotate90(1),
  Rotate180(2),
  Rotate270(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PdfPageRotation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Normal
      1 -> Rotate90
      2 -> Rotate180
      3 -> Rotate270
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PdfPageRotation> {
    public fun setValue(newValue: PdfPageRotation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PdfPageRotation =
        PdfPageRotation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PdfPageRotation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PdfPageRotation =
        PdfPageRotation.values()[0].fromNative(value, null)

    public override fun toNative(obj: PdfPageRotation): Int = obj.value
  }
}
