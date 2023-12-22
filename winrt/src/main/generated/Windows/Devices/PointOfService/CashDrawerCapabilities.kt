package Windows.Devices.PointOfService

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

@ABIMarker(CashDrawerCapabilities.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.CashDrawerCapabilities;{0bc6de0b-e8e7-4b1f-b1d1-3e501ad08247})")
@WinRTByReference(brClass = CashDrawerCapabilities.ByReference::class)
public class CashDrawerCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICashDrawerCapabilities.WithDefault, IWinRTObject {
  private val __797828537_Interface: ICashDrawerCapabilities.WithDefault by lazy {
    as_797828537()
  }


  public override val __797828537_Ptr: JNAPointer? by lazy {
    __797828537_Interface.__797828537_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__797828537_Interface)

  private fun as_797828537(): ICashDrawerCapabilities.WithDefault {
    if(pointer == NULL) {
      return(ICashDrawerCapabilities.ABI.makeICashDrawerCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICashDrawerCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICashDrawerCapabilities.ABI.makeICashDrawerCapabilities(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CashDrawerCapabilities> {
    public override fun getValue() = CashDrawerCapabilities(pointer.getPointer(0))

    public fun setValue(value: CashDrawerCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CashDrawerCapabilities, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CashDrawerCapabilities {
      val address = segment.toRawLongValue()
      return CashDrawerCapabilities(Pointer(address))
    }

    public override fun toNative(obj: CashDrawerCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
