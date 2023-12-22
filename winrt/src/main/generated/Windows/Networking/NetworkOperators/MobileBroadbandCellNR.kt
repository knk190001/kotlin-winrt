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

@ABIMarker(MobileBroadbandCellNR.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandCellNR;{a13f0deb-66fc-4b4b-83a9-a487a3a5a0a6})")
@WinRTByReference(brClass = MobileBroadbandCellNR.ByReference::class)
public class MobileBroadbandCellNR(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandCellNR.WithDefault, IWinRTObject {
  private val __1418723358_Interface: IMobileBroadbandCellNR.WithDefault by lazy {
    as_1418723358()
  }


  public override val __1418723358_Ptr: JNAPointer? by lazy {
    __1418723358_Interface.__1418723358_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1418723358_Interface)

  private fun as_1418723358(): IMobileBroadbandCellNR.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandCellNR.ABI.makeIMobileBroadbandCellNR(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandCellNR>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandCellNR.ABI.makeIMobileBroadbandCellNR(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandCellNR> {
    public override fun getValue() = MobileBroadbandCellNR(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandCellNR): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandCellNR, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandCellNR {
      val address = segment.toRawLongValue()
      return MobileBroadbandCellNR(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandCellNR): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
