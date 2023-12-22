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

@ABIMarker(MobileBroadbandCellsInfo.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandCellsInfo;{89a9562a-e472-4da5-929c-de61711dd261})")
@WinRTByReference(brClass = MobileBroadbandCellsInfo.ByReference::class)
public class MobileBroadbandCellsInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandCellsInfo.WithDefault, IMobileBroadbandCellsInfo2.WithDefault,
    IWinRTObject {
  private val __1619612899_Interface: IMobileBroadbandCellsInfo.WithDefault by lazy {
    as_1619612899()
  }


  private val __1331607633_Interface: IMobileBroadbandCellsInfo2.WithDefault by lazy {
    as_1331607633()
  }


  public override val __1619612899_Ptr: JNAPointer? by lazy {
    __1619612899_Interface.__1619612899_Ptr
  }


  public override val __1331607633_Ptr: JNAPointer? by lazy {
    __1331607633_Interface.__1331607633_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1619612899_Interface, __1331607633_Interface)

  private fun as_1619612899(): IMobileBroadbandCellsInfo.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandCellsInfo.ABI.makeIMobileBroadbandCellsInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandCellsInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandCellsInfo.ABI.makeIMobileBroadbandCellsInfo(ref.value))
  }

  private fun as_1331607633(): IMobileBroadbandCellsInfo2.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandCellsInfo2.ABI.makeIMobileBroadbandCellsInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandCellsInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandCellsInfo2.ABI.makeIMobileBroadbandCellsInfo2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandCellsInfo> {
    public override fun getValue() = MobileBroadbandCellsInfo(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandCellsInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandCellsInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandCellsInfo {
      val address = segment.toRawLongValue()
      return MobileBroadbandCellsInfo(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandCellsInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
