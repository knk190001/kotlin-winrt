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

@ABIMarker(MobileBroadbandUicc.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandUicc;{e634f691-525a-4ce2-8fce-aa4162579154})")
@WinRTByReference(brClass = MobileBroadbandUicc.ByReference::class)
public class MobileBroadbandUicc(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandUicc.WithDefault, IWinRTObject {
  private val __2070207952_Interface: IMobileBroadbandUicc.WithDefault by lazy {
    as_2070207952()
  }


  public override val __2070207952_Ptr: JNAPointer? by lazy {
    __2070207952_Interface.__2070207952_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2070207952_Interface)

  private fun as_2070207952(): IMobileBroadbandUicc.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandUicc.ABI.makeIMobileBroadbandUicc(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandUicc>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandUicc.ABI.makeIMobileBroadbandUicc(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandUicc> {
    public override fun getValue() = MobileBroadbandUicc(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandUicc): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandUicc, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandUicc {
      val address = segment.toRawLongValue()
      return MobileBroadbandUicc(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandUicc): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
