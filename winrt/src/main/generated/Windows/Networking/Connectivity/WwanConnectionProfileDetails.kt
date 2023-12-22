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

@ABIMarker(WwanConnectionProfileDetails.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.WwanConnectionProfileDetails;{0e4da8fe-835f-4df3-82fd-df556ebc09ef})")
@WinRTByReference(brClass = WwanConnectionProfileDetails.ByReference::class)
public class WwanConnectionProfileDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWwanConnectionProfileDetails.WithDefault,
    IWwanConnectionProfileDetails2.WithDefault, IWinRTObject {
  private val __626247225_Interface: IWwanConnectionProfileDetails.WithDefault by lazy {
    as_626247225()
  }


  private val __2061172555_Interface: IWwanConnectionProfileDetails2.WithDefault by lazy {
    as_2061172555()
  }


  public override val __626247225_Ptr: JNAPointer? by lazy {
    __626247225_Interface.__626247225_Ptr
  }


  public override val __2061172555_Ptr: JNAPointer? by lazy {
    __2061172555_Interface.__2061172555_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__626247225_Interface, __2061172555_Interface)

  private fun as_626247225(): IWwanConnectionProfileDetails.WithDefault {
    if(pointer == NULL) {
      return(IWwanConnectionProfileDetails.ABI.makeIWwanConnectionProfileDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWwanConnectionProfileDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWwanConnectionProfileDetails.ABI.makeIWwanConnectionProfileDetails(ref.value))
  }

  private fun as_2061172555(): IWwanConnectionProfileDetails2.WithDefault {
    if(pointer == NULL) {
      return(IWwanConnectionProfileDetails2.ABI.makeIWwanConnectionProfileDetails2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWwanConnectionProfileDetails2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWwanConnectionProfileDetails2.ABI.makeIWwanConnectionProfileDetails2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WwanConnectionProfileDetails> {
    public override fun getValue() = WwanConnectionProfileDetails(pointer.getPointer(0))

    public fun setValue(value: WwanConnectionProfileDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WwanConnectionProfileDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WwanConnectionProfileDetails {
      val address = segment.toRawLongValue()
      return WwanConnectionProfileDetails(Pointer(address))
    }

    public override fun toNative(obj: WwanConnectionProfileDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
