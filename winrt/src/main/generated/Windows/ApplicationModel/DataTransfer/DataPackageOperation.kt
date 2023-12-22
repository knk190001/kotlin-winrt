package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(DataPackageOperation.ABI::class)
@Signature("enum(Windows.ApplicationModel.DataTransfer.DataPackageOperation;u4)")
@WinRTByReference(brClass = DataPackageOperation.ByReference::class)
public enum class DataPackageOperation(
  public val value: Int
) : NativeMapped {
  None(0),
  Copy(1),
  Move(2),
  Link(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DataPackageOperation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Copy
      2 -> Move
      4 -> Link
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DataPackageOperation> {
    public fun setValue(newValue: DataPackageOperation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DataPackageOperation =
        DataPackageOperation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DataPackageOperation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DataPackageOperation =
        DataPackageOperation.values()[0].fromNative(value, null)

    public override fun toNative(obj: DataPackageOperation): Int = obj.value
  }
}
