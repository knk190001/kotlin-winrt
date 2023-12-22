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

@ABIMarker(ServerMessageWebSocketInformation.ABI::class)
@Signature("rc(Windows.Networking.Sockets.ServerMessageWebSocketInformation;{fc32b45f-4448-5505-6cc9-09afa8915f5d})")
@WinRTByReference(brClass = ServerMessageWebSocketInformation.ByReference::class)
public class ServerMessageWebSocketInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IServerMessageWebSocketInformation.WithDefault, IWinRTObject {
  private val __1987525745_Interface: IServerMessageWebSocketInformation.WithDefault by lazy {
    as_1987525745()
  }


  public override val __1987525745_Ptr: JNAPointer? by lazy {
    __1987525745_Interface.__1987525745_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1987525745_Interface)

  private fun as_1987525745(): IServerMessageWebSocketInformation.WithDefault {
    if(pointer == NULL) {
      return(IServerMessageWebSocketInformation.ABI.makeIServerMessageWebSocketInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IServerMessageWebSocketInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IServerMessageWebSocketInformation.ABI.makeIServerMessageWebSocketInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ServerMessageWebSocketInformation> {
    public override fun getValue() = ServerMessageWebSocketInformation(pointer.getPointer(0))

    public fun setValue(value: ServerMessageWebSocketInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ServerMessageWebSocketInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ServerMessageWebSocketInformation {
      val address = segment.toRawLongValue()
      return ServerMessageWebSocketInformation(Pointer(address))
    }

    public override fun toNative(obj: ServerMessageWebSocketInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
