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

@ABIMarker(FileOpenDisposition.ABI::class)
@Signature("enum(Windows.Storage.Streams.FileOpenDisposition;i4)")
@WinRTByReference(brClass = FileOpenDisposition.ByReference::class)
public enum class FileOpenDisposition(
  public val value: Int
) : NativeMapped {
  OpenExisting(0),
  OpenAlways(1),
  CreateNew(2),
  CreateAlways(3),
  TruncateExisting(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FileOpenDisposition {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> OpenExisting
      1 -> OpenAlways
      2 -> CreateNew
      3 -> CreateAlways
      4 -> TruncateExisting
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FileOpenDisposition> {
    public fun setValue(newValue: FileOpenDisposition): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FileOpenDisposition =
        FileOpenDisposition.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FileOpenDisposition, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FileOpenDisposition =
        FileOpenDisposition.values()[0].fromNative(value, null)

    public override fun toNative(obj: FileOpenDisposition): Int = obj.value
  }
}
