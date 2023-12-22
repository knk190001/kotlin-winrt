package Windows.Foundation.Diagnostics

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LogFileGeneratedEventArgs.ABI::class)
@Signature("rc(Windows.Foundation.Diagnostics.LogFileGeneratedEventArgs;{269e976f-0d38-4c1a-b53f-b395d881df84})")
@WinRTByReference(brClass = LogFileGeneratedEventArgs.ByReference::class)
public class LogFileGeneratedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILogFileGeneratedEventArgs.WithDefault, IWinRTObject {
  private val __1194967461_Interface: ILogFileGeneratedEventArgs.WithDefault by lazy {
    as_1194967461()
  }


  public override val __1194967461_Ptr: JNAPointer? by lazy {
    __1194967461_Interface.__1194967461_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1194967461_Interface)

  private fun as_1194967461(): ILogFileGeneratedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ILogFileGeneratedEventArgs.ABI.makeILogFileGeneratedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILogFileGeneratedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILogFileGeneratedEventArgs.ABI.makeILogFileGeneratedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LogFileGeneratedEventArgs> {
    public override fun getValue() = LogFileGeneratedEventArgs(pointer.getPointer(0))

    public fun setValue(value: LogFileGeneratedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LogFileGeneratedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LogFileGeneratedEventArgs {
      val address = segment.toRawLongValue()
      return LogFileGeneratedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: LogFileGeneratedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
