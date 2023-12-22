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

@ABIMarker(MobileBroadbandSlotManager.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandSlotManager;{eba07cd6-2019-5f81-a294-cc364a11d0b2})")
@WinRTByReference(brClass = MobileBroadbandSlotManager.ByReference::class)
public class MobileBroadbandSlotManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandSlotManager.WithDefault, IWinRTObject {
  private val __1435448301_Interface: IMobileBroadbandSlotManager.WithDefault by lazy {
    as_1435448301()
  }


  public override val __1435448301_Ptr: JNAPointer? by lazy {
    __1435448301_Interface.__1435448301_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1435448301_Interface)

  private fun as_1435448301(): IMobileBroadbandSlotManager.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandSlotManager.ABI.makeIMobileBroadbandSlotManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandSlotManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandSlotManager.ABI.makeIMobileBroadbandSlotManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandSlotManager> {
    public override fun getValue() = MobileBroadbandSlotManager(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandSlotManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandSlotManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandSlotManager {
      val address = segment.toRawLongValue()
      return MobileBroadbandSlotManager(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandSlotManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
