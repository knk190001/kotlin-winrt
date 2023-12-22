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

@ABIMarker(Print3DTaskDetail.ABI::class)
@Signature("enum(Windows.Graphics.Printing3D.Print3DTaskDetail;i4)")
@WinRTByReference(brClass = Print3DTaskDetail.ByReference::class)
public enum class Print3DTaskDetail(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  ModelExceedsPrintBed(1),
  UploadFailed(2),
  InvalidMaterialSelection(3),
  InvalidModel(4),
  ModelNotManifold(5),
  InvalidPrintTicket(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      Print3DTaskDetail {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> ModelExceedsPrintBed
      2 -> UploadFailed
      3 -> InvalidMaterialSelection
      4 -> InvalidModel
      5 -> ModelNotManifold
      6 -> InvalidPrintTicket
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<Print3DTaskDetail> {
    public fun setValue(newValue: Print3DTaskDetail): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Print3DTaskDetail =
        Print3DTaskDetail.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<Print3DTaskDetail, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Print3DTaskDetail =
        Print3DTaskDetail.values()[0].fromNative(value, null)

    public override fun toNative(obj: Print3DTaskDetail): Int = obj.value
  }
}
