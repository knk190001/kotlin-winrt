package Windows.Networking.Sockets

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WebSocketError.ABI::class)
@WinRTByReference(brClass = WebSocketError.ByReference::class)
public class WebSocketError(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WebSocketError>
      {
    public override fun getValue() = WebSocketError(pointer.getPointer(0))

    public fun setValue(value: WebSocketError): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebSocketError, MemoryAddress> {
    public val IWebSocketErrorStatics_Instance: IWebSocketErrorStatics by lazy {
      createIWebSocketErrorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebSocketErrorStatics(): IWebSocketErrorStatics {
      val refiid = Guid.REFIID(IWebSocketErrorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Sockets.WebSocketError".toHandle(),refiid,interfacePtr)
      val result = IWebSocketErrorStatics.ABI.makeIWebSocketErrorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WebSocketError {
      val address = segment.toRawLongValue()
      return WebSocketError(Pointer(address))
    }

    public override fun toNative(obj: WebSocketError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetStatus(hresult: Int) = ABI.IWebSocketErrorStatics_Instance.GetStatus(hresult)
  }
}
