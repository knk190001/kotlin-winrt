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

@ABIMarker(MobileBroadbandCellUmts.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandCellUmts;{77b4b5ae-49c8-4f15-b285-4c26a7f67215})")
@WinRTByReference(brClass = MobileBroadbandCellUmts.ByReference::class)
public class MobileBroadbandCellUmts(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandCellUmts.WithDefault, IWinRTObject {
  private val __1888276011_Interface: IMobileBroadbandCellUmts.WithDefault by lazy {
    as_1888276011()
  }


  public override val __1888276011_Ptr: JNAPointer? by lazy {
    __1888276011_Interface.__1888276011_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1888276011_Interface)

  private fun as_1888276011(): IMobileBroadbandCellUmts.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandCellUmts.ABI.makeIMobileBroadbandCellUmts(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandCellUmts>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandCellUmts.ABI.makeIMobileBroadbandCellUmts(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandCellUmts> {
    public override fun getValue() = MobileBroadbandCellUmts(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandCellUmts): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandCellUmts, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandCellUmts {
      val address = segment.toRawLongValue()
      return MobileBroadbandCellUmts(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandCellUmts): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
