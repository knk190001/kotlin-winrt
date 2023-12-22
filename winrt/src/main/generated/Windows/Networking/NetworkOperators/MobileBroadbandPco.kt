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

@ABIMarker(MobileBroadbandPco.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandPco;{d4e4fcbe-e3a3-43c5-a87b-6c86d229d7fa})")
@WinRTByReference(brClass = MobileBroadbandPco.ByReference::class)
public class MobileBroadbandPco(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandPco.WithDefault, IWinRTObject {
  private val __205333216_Interface: IMobileBroadbandPco.WithDefault by lazy {
    as_205333216()
  }


  public override val __205333216_Ptr: JNAPointer? by lazy {
    __205333216_Interface.__205333216_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__205333216_Interface)

  private fun as_205333216(): IMobileBroadbandPco.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandPco.ABI.makeIMobileBroadbandPco(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandPco>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandPco.ABI.makeIMobileBroadbandPco(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandPco> {
    public override fun getValue() = MobileBroadbandPco(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandPco): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandPco, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandPco {
      val address = segment.toRawLongValue()
      return MobileBroadbandPco(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandPco): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
