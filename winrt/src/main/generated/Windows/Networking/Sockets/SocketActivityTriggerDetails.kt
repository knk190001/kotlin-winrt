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

@ABIMarker(SocketActivityTriggerDetails.ABI::class)
@Signature("rc(Windows.Networking.Sockets.SocketActivityTriggerDetails;{45f406a7-fc9f-4f81-acad-355fef51e67b})")
@WinRTByReference(brClass = SocketActivityTriggerDetails.ByReference::class)
public class SocketActivityTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISocketActivityTriggerDetails.WithDefault, IWinRTObject {
  private val __1329772444_Interface: ISocketActivityTriggerDetails.WithDefault by lazy {
    as_1329772444()
  }


  public override val __1329772444_Ptr: JNAPointer? by lazy {
    __1329772444_Interface.__1329772444_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1329772444_Interface)

  private fun as_1329772444(): ISocketActivityTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(ISocketActivityTriggerDetails.ABI.makeISocketActivityTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISocketActivityTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISocketActivityTriggerDetails.ABI.makeISocketActivityTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SocketActivityTriggerDetails> {
    public override fun getValue() = SocketActivityTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: SocketActivityTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SocketActivityTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SocketActivityTriggerDetails {
      val address = segment.toRawLongValue()
      return SocketActivityTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: SocketActivityTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
