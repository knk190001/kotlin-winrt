package Windows.Networking.Connectivity

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

@ABIMarker(WlanConnectionProfileDetails.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.WlanConnectionProfileDetails;{562098cb-b35a-4bf1-a884-b7557e88ff86})")
@WinRTByReference(brClass = WlanConnectionProfileDetails.ByReference::class)
public class WlanConnectionProfileDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWlanConnectionProfileDetails.WithDefault, IWinRTObject {
  private val __1680900476_Interface: IWlanConnectionProfileDetails.WithDefault by lazy {
    as_1680900476()
  }


  public override val __1680900476_Ptr: JNAPointer? by lazy {
    __1680900476_Interface.__1680900476_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1680900476_Interface)

  private fun as_1680900476(): IWlanConnectionProfileDetails.WithDefault {
    if(pointer == NULL) {
      return(IWlanConnectionProfileDetails.ABI.makeIWlanConnectionProfileDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWlanConnectionProfileDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWlanConnectionProfileDetails.ABI.makeIWlanConnectionProfileDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WlanConnectionProfileDetails> {
    public override fun getValue() = WlanConnectionProfileDetails(pointer.getPointer(0))

    public fun setValue(value: WlanConnectionProfileDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WlanConnectionProfileDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WlanConnectionProfileDetails {
      val address = segment.toRawLongValue()
      return WlanConnectionProfileDetails(Pointer(address))
    }

    public override fun toNative(obj: WlanConnectionProfileDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
