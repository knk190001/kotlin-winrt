package Windows.Networking.Sockets

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

@ABIMarker(WebSocketServerCustomValidationRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.Sockets.WebSocketServerCustomValidationRequestedEventArgs;{ffeffe48-022a-4ab7-8b36-e10af4640e6b})")
@WinRTByReference(brClass = WebSocketServerCustomValidationRequestedEventArgs.ByReference::class)
public class WebSocketServerCustomValidationRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebSocketServerCustomValidationRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1131705125_Interface: IWebSocketServerCustomValidationRequestedEventArgs.WithDefault
      by lazy {
    as_1131705125()
  }


  public override val __1131705125_Ptr: JNAPointer? by lazy {
    __1131705125_Interface.__1131705125_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1131705125_Interface)

  private fun as_1131705125(): IWebSocketServerCustomValidationRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebSocketServerCustomValidationRequestedEventArgs.ABI.makeIWebSocketServerCustomValidationRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebSocketServerCustomValidationRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebSocketServerCustomValidationRequestedEventArgs.ABI.makeIWebSocketServerCustomValidationRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebSocketServerCustomValidationRequestedEventArgs> {
    public override fun getValue() =
        WebSocketServerCustomValidationRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebSocketServerCustomValidationRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebSocketServerCustomValidationRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebSocketServerCustomValidationRequestedEventArgs {
      val address = segment.toRawLongValue()
      return WebSocketServerCustomValidationRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebSocketServerCustomValidationRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
