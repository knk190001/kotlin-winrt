package Windows.UI.UIAutomation.Core

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

@ABIMarker(RemoteAutomationConnectionRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.UIAutomation.Core.RemoteAutomationConnectionRequestedEventArgs;{ea3319a8-e3a8-5dc6-adf8-044e46b14af5})")
@WinRTByReference(brClass = RemoteAutomationConnectionRequestedEventArgs.ByReference::class)
public class RemoteAutomationConnectionRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteAutomationConnectionRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1161217498_Interface: IRemoteAutomationConnectionRequestedEventArgs.WithDefault by
      lazy {
    as_1161217498()
  }


  public override val __1161217498_Ptr: JNAPointer? by lazy {
    __1161217498_Interface.__1161217498_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1161217498_Interface)

  private fun as_1161217498(): IRemoteAutomationConnectionRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRemoteAutomationConnectionRequestedEventArgs.ABI.makeIRemoteAutomationConnectionRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteAutomationConnectionRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteAutomationConnectionRequestedEventArgs.ABI.makeIRemoteAutomationConnectionRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteAutomationConnectionRequestedEventArgs> {
    public override fun getValue() =
        RemoteAutomationConnectionRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RemoteAutomationConnectionRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteAutomationConnectionRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        RemoteAutomationConnectionRequestedEventArgs {
      val address = segment.toRawLongValue()
      return RemoteAutomationConnectionRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RemoteAutomationConnectionRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
