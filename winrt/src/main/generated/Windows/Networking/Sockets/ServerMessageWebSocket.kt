package Windows.Networking.Sockets

import Windows.Foundation.IClosable
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

@ABIMarker(ServerMessageWebSocket.ABI::class)
@Signature("rc(Windows.Networking.Sockets.ServerMessageWebSocket;{e3ac9240-813b-5efd-7e11-ae2305fc77f1})")
@WinRTByReference(brClass = ServerMessageWebSocket.ByReference::class)
public class ServerMessageWebSocket(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IServerMessageWebSocket.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __2011336123_Interface: IServerMessageWebSocket.WithDefault by lazy {
    as_2011336123()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __2011336123_Ptr: JNAPointer? by lazy {
    __2011336123_Interface.__2011336123_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2011336123_Interface, __1260617006_Interface)

  private fun as_2011336123(): IServerMessageWebSocket.WithDefault {
    if(pointer == NULL) {
      return(IServerMessageWebSocket.ABI.makeIServerMessageWebSocket(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IServerMessageWebSocket>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IServerMessageWebSocket.ABI.makeIServerMessageWebSocket(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ServerMessageWebSocket> {
    public override fun getValue() = ServerMessageWebSocket(pointer.getPointer(0))

    public fun setValue(value: ServerMessageWebSocket): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ServerMessageWebSocket, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ServerMessageWebSocket {
      val address = segment.toRawLongValue()
      return ServerMessageWebSocket(Pointer(address))
    }

    public override fun toNative(obj: ServerMessageWebSocket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
