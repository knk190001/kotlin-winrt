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

@ABIMarker(ServerMessageWebSocketControl.ABI::class)
@Signature("rc(Windows.Networking.Sockets.ServerMessageWebSocketControl;{69c2f051-1c1f-587a-4519-2181610192b7})")
@WinRTByReference(brClass = ServerMessageWebSocketControl.ByReference::class)
public class ServerMessageWebSocketControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IServerMessageWebSocketControl.WithDefault, IWinRTObject {
  private val __922708190_Interface: IServerMessageWebSocketControl.WithDefault by lazy {
    as_922708190()
  }


  public override val __922708190_Ptr: JNAPointer? by lazy {
    __922708190_Interface.__922708190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__922708190_Interface)

  private fun as_922708190(): IServerMessageWebSocketControl.WithDefault {
    if(pointer == NULL) {
      return(IServerMessageWebSocketControl.ABI.makeIServerMessageWebSocketControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IServerMessageWebSocketControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IServerMessageWebSocketControl.ABI.makeIServerMessageWebSocketControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ServerMessageWebSocketControl> {
    public override fun getValue() = ServerMessageWebSocketControl(pointer.getPointer(0))

    public fun setValue(value: ServerMessageWebSocketControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ServerMessageWebSocketControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ServerMessageWebSocketControl {
      val address = segment.toRawLongValue()
      return ServerMessageWebSocketControl(Pointer(address))
    }

    public override fun toNative(obj: ServerMessageWebSocketControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
