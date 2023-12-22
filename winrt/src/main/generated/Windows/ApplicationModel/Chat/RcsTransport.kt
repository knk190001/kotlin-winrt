package Windows.ApplicationModel.Chat

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

@ABIMarker(RcsTransport.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.RcsTransport;{fea34759-f37c-4319-8546-ec84d21d30ff})")
@WinRTByReference(brClass = RcsTransport.ByReference::class)
public class RcsTransport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRcsTransport.WithDefault, IWinRTObject {
  private val __1400416274_Interface: IRcsTransport.WithDefault by lazy {
    as_1400416274()
  }


  public override val __1400416274_Ptr: JNAPointer? by lazy {
    __1400416274_Interface.__1400416274_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1400416274_Interface)

  private fun as_1400416274(): IRcsTransport.WithDefault {
    if(pointer == NULL) {
      return(IRcsTransport.ABI.makeIRcsTransport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRcsTransport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRcsTransport.ABI.makeIRcsTransport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RcsTransport> {
    public override fun getValue() = RcsTransport(pointer.getPointer(0))

    public fun setValue(value: RcsTransport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RcsTransport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RcsTransport {
      val address = segment.toRawLongValue()
      return RcsTransport(Pointer(address))
    }

    public override fun toNative(obj: RcsTransport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
