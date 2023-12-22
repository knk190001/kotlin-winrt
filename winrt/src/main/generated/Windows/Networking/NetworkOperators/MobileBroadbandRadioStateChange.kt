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

@ABIMarker(MobileBroadbandRadioStateChange.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandRadioStateChange;{b054a561-9833-4aed-9717-4348b21a24b3})")
@WinRTByReference(brClass = MobileBroadbandRadioStateChange.ByReference::class)
public class MobileBroadbandRadioStateChange(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandRadioStateChange.WithDefault, IWinRTObject {
  private val __2103709410_Interface: IMobileBroadbandRadioStateChange.WithDefault by lazy {
    as_2103709410()
  }


  public override val __2103709410_Ptr: JNAPointer? by lazy {
    __2103709410_Interface.__2103709410_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2103709410_Interface)

  private fun as_2103709410(): IMobileBroadbandRadioStateChange.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandRadioStateChange.ABI.makeIMobileBroadbandRadioStateChange(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandRadioStateChange>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandRadioStateChange.ABI.makeIMobileBroadbandRadioStateChange(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandRadioStateChange> {
    public override fun getValue() = MobileBroadbandRadioStateChange(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandRadioStateChange): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandRadioStateChange, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandRadioStateChange {
      val address = segment.toRawLongValue()
      return MobileBroadbandRadioStateChange(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandRadioStateChange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
