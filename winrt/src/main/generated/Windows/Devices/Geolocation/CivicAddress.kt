package Windows.Devices.Geolocation

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

@ABIMarker(CivicAddress.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.CivicAddress;{a8567a1a-64f4-4d48-bcea-f6b008eca34c})")
@WinRTByReference(brClass = CivicAddress.ByReference::class)
public class CivicAddress(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICivicAddress.WithDefault, IWinRTObject {
  private val __108653655_Interface: ICivicAddress.WithDefault by lazy {
    as_108653655()
  }


  public override val __108653655_Ptr: JNAPointer? by lazy {
    __108653655_Interface.__108653655_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__108653655_Interface)

  private fun as_108653655(): ICivicAddress.WithDefault {
    if(pointer == NULL) {
      return(ICivicAddress.ABI.makeICivicAddress(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICivicAddress>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICivicAddress.ABI.makeICivicAddress(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CivicAddress> {
    public override fun getValue() = CivicAddress(pointer.getPointer(0))

    public fun setValue(value: CivicAddress): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CivicAddress, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CivicAddress {
      val address = segment.toRawLongValue()
      return CivicAddress(Pointer(address))
    }

    public override fun toNative(obj: CivicAddress): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
