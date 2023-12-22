package Windows.Devices.Sms

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

@ABIMarker(SmsMessageReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Sms.SmsMessageReceivedEventArgs;{08e80a98-b8e5-41c1-a3d8-d3abfae22675})")
@WinRTByReference(brClass = SmsMessageReceivedEventArgs.ByReference::class)
public class SmsMessageReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmsMessageReceivedEventArgs.WithDefault, IWinRTObject {
  private val __1523644196_Interface: ISmsMessageReceivedEventArgs.WithDefault by lazy {
    as_1523644196()
  }


  public override val __1523644196_Ptr: JNAPointer? by lazy {
    __1523644196_Interface.__1523644196_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1523644196_Interface)

  private fun as_1523644196(): ISmsMessageReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISmsMessageReceivedEventArgs.ABI.makeISmsMessageReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsMessageReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsMessageReceivedEventArgs.ABI.makeISmsMessageReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmsMessageReceivedEventArgs> {
    public override fun getValue() = SmsMessageReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SmsMessageReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmsMessageReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmsMessageReceivedEventArgs {
      val address = segment.toRawLongValue()
      return SmsMessageReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SmsMessageReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
