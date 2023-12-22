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

@ABIMarker(MobileBroadbandCellCdma.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandCellCdma;{0601b3b4-411a-4f2e-8287-76f5650c60cd})")
@WinRTByReference(brClass = MobileBroadbandCellCdma.ByReference::class)
public class MobileBroadbandCellCdma(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandCellCdma.WithDefault, IWinRTObject {
  private val __1888821133_Interface: IMobileBroadbandCellCdma.WithDefault by lazy {
    as_1888821133()
  }


  public override val __1888821133_Ptr: JNAPointer? by lazy {
    __1888821133_Interface.__1888821133_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1888821133_Interface)

  private fun as_1888821133(): IMobileBroadbandCellCdma.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandCellCdma.ABI.makeIMobileBroadbandCellCdma(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandCellCdma>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandCellCdma.ABI.makeIMobileBroadbandCellCdma(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandCellCdma> {
    public override fun getValue() = MobileBroadbandCellCdma(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandCellCdma): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandCellCdma, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandCellCdma {
      val address = segment.toRawLongValue()
      return MobileBroadbandCellCdma(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandCellCdma): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
