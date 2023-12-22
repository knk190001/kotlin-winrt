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

@ABIMarker(MobileBroadbandCellTdscdma.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandCellTdscdma;{0eda1655-db0e-4182-8cda-cc419a7bde08})")
@WinRTByReference(brClass = MobileBroadbandCellTdscdma.ByReference::class)
public class MobileBroadbandCellTdscdma(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandCellTdscdma.WithDefault, IWinRTObject {
  private val __704532666_Interface: IMobileBroadbandCellTdscdma.WithDefault by lazy {
    as_704532666()
  }


  public override val __704532666_Ptr: JNAPointer? by lazy {
    __704532666_Interface.__704532666_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__704532666_Interface)

  private fun as_704532666(): IMobileBroadbandCellTdscdma.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandCellTdscdma.ABI.makeIMobileBroadbandCellTdscdma(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandCellTdscdma>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandCellTdscdma.ABI.makeIMobileBroadbandCellTdscdma(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandCellTdscdma> {
    public override fun getValue() = MobileBroadbandCellTdscdma(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandCellTdscdma): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandCellTdscdma, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandCellTdscdma {
      val address = segment.toRawLongValue()
      return MobileBroadbandCellTdscdma(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandCellTdscdma): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
