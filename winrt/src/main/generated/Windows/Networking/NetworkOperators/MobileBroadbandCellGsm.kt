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

@ABIMarker(MobileBroadbandCellGsm.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandCellGsm;{cc917f06-7ee0-47b8-9e1f-c3b48df9df5b})")
@WinRTByReference(brClass = MobileBroadbandCellGsm.ByReference::class)
public class MobileBroadbandCellGsm(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandCellGsm.WithDefault, IWinRTObject {
  private val __1030756733_Interface: IMobileBroadbandCellGsm.WithDefault by lazy {
    as_1030756733()
  }


  public override val __1030756733_Ptr: JNAPointer? by lazy {
    __1030756733_Interface.__1030756733_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1030756733_Interface)

  private fun as_1030756733(): IMobileBroadbandCellGsm.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandCellGsm.ABI.makeIMobileBroadbandCellGsm(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandCellGsm>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandCellGsm.ABI.makeIMobileBroadbandCellGsm(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandCellGsm> {
    public override fun getValue() = MobileBroadbandCellGsm(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandCellGsm): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandCellGsm, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandCellGsm {
      val address = segment.toRawLongValue()
      return MobileBroadbandCellGsm(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandCellGsm): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
