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

@ABIMarker(WebSocketClosedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.Sockets.WebSocketClosedEventArgs;{ceb78d07-d0a8-4703-a091-c8c2c0915bc3})")
@WinRTByReference(brClass = WebSocketClosedEventArgs.ByReference::class)
public class WebSocketClosedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebSocketClosedEventArgs.WithDefault, IWinRTObject {
  private val __400648796_Interface: IWebSocketClosedEventArgs.WithDefault by lazy {
    as_400648796()
  }


  public override val __400648796_Ptr: JNAPointer? by lazy {
    __400648796_Interface.__400648796_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__400648796_Interface)

  private fun as_400648796(): IWebSocketClosedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebSocketClosedEventArgs.ABI.makeIWebSocketClosedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebSocketClosedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebSocketClosedEventArgs.ABI.makeIWebSocketClosedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebSocketClosedEventArgs> {
    public override fun getValue() = WebSocketClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebSocketClosedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebSocketClosedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebSocketClosedEventArgs {
      val address = segment.toRawLongValue()
      return WebSocketClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebSocketClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
