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

@ABIMarker(MobileBroadbandCellLte.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandCellLte;{9197c87b-2b78-456d-8b53-aaa25d0af741})")
@WinRTByReference(brClass = MobileBroadbandCellLte.ByReference::class)
public class MobileBroadbandCellLte(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandCellLte.WithDefault, IWinRTObject {
  private val __1030751905_Interface: IMobileBroadbandCellLte.WithDefault by lazy {
    as_1030751905()
  }


  public override val __1030751905_Ptr: JNAPointer? by lazy {
    __1030751905_Interface.__1030751905_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1030751905_Interface)

  private fun as_1030751905(): IMobileBroadbandCellLte.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandCellLte.ABI.makeIMobileBroadbandCellLte(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandCellLte>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandCellLte.ABI.makeIMobileBroadbandCellLte(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandCellLte> {
    public override fun getValue() = MobileBroadbandCellLte(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandCellLte): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandCellLte, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandCellLte {
      val address = segment.toRawLongValue()
      return MobileBroadbandCellLte(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandCellLte): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
