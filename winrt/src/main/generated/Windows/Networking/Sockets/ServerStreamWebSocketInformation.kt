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

@ABIMarker(ServerStreamWebSocketInformation.ABI::class)
@Signature("rc(Windows.Networking.Sockets.ServerStreamWebSocketInformation;{fc32b45f-4448-5505-6cc9-09aba8915f5d})")
@WinRTByReference(brClass = ServerStreamWebSocketInformation.ByReference::class)
public class ServerStreamWebSocketInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IServerStreamWebSocketInformation.WithDefault, IWinRTObject {
  private val __1735632192_Interface: IServerStreamWebSocketInformation.WithDefault by lazy {
    as_1735632192()
  }


  public override val __1735632192_Ptr: JNAPointer? by lazy {
    __1735632192_Interface.__1735632192_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1735632192_Interface)

  private fun as_1735632192(): IServerStreamWebSocketInformation.WithDefault {
    if(pointer == NULL) {
      return(IServerStreamWebSocketInformation.ABI.makeIServerStreamWebSocketInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IServerStreamWebSocketInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IServerStreamWebSocketInformation.ABI.makeIServerStreamWebSocketInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ServerStreamWebSocketInformation> {
    public override fun getValue() = ServerStreamWebSocketInformation(pointer.getPointer(0))

    public fun setValue(value: ServerStreamWebSocketInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ServerStreamWebSocketInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ServerStreamWebSocketInformation {
      val address = segment.toRawLongValue()
      return ServerStreamWebSocketInformation(Pointer(address))
    }

    public override fun toNative(obj: ServerStreamWebSocketInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
