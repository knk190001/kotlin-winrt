package Windows.Storage.Pickers.Provider

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

@ABIMarker(FileSelectionMode.ABI::class)
@Signature("enum(Windows.Storage.Pickers.Provider.FileSelectionMode;i4)")
@WinRTByReference(brClass = FileSelectionMode.ByReference::class)
public enum class FileSelectionMode(
  public val value: Int
) : NativeMapped {
  Single(0),
  Multiple(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FileSelectionMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Single
      1 -> Multiple
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FileSelectionMode> {
    public fun setValue(newValue: FileSelectionMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FileSelectionMode =
        FileSelectionMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FileSelectionMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FileSelectionMode =
        FileSelectionMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: FileSelectionMode): Int = obj.value
  }
}
