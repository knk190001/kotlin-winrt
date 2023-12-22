package Windows.Networking.NetworkOperators

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

@ABIMarker(MobileBroadbandSlotInfo.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandSlotInfo;{bd350b32-882e-542a-b17d-0bb1b49bae9e})")
@WinRTByReference(brClass = MobileBroadbandSlotInfo.ByReference::class)
public class MobileBroadbandSlotInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandSlotInfo.WithDefault, IWinRTObject {
  private val __2057604600_Interface: IMobileBroadbandSlotInfo.WithDefault by lazy {
    as_2057604600()
  }


  public override val __2057604600_Ptr: JNAPointer? by lazy {
    __2057604600_Interface.__2057604600_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2057604600_Interface)

  private fun as_2057604600(): IMobileBroadbandSlotInfo.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandSlotInfo.ABI.makeIMobileBroadbandSlotInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandSlotInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandSlotInfo.ABI.makeIMobileBroadbandSlotInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandSlotInfo> {
    public override fun getValue() = MobileBroadbandSlotInfo(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandSlotInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandSlotInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandSlotInfo {
      val address = segment.toRawLongValue()
      return MobileBroadbandSlotInfo(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandSlotInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
