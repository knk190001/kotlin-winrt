package Windows.Media.DialProtocol

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

@ABIMarker(DialAppStateDetails.ABI::class)
@Signature("rc(Windows.Media.DialProtocol.DialAppStateDetails;{ddc4a4a1-f5de-400d-bea4-8c8466bb2961})")
@WinRTByReference(brClass = DialAppStateDetails.ByReference::class)
public class DialAppStateDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDialAppStateDetails.WithDefault, IWinRTObject {
  private val __207424074_Interface: IDialAppStateDetails.WithDefault by lazy {
    as_207424074()
  }


  public override val __207424074_Ptr: JNAPointer? by lazy {
    __207424074_Interface.__207424074_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__207424074_Interface)

  private fun as_207424074(): IDialAppStateDetails.WithDefault {
    if(pointer == NULL) {
      return(IDialAppStateDetails.ABI.makeIDialAppStateDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDialAppStateDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDialAppStateDetails.ABI.makeIDialAppStateDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DialAppStateDetails> {
    public override fun getValue() = DialAppStateDetails(pointer.getPointer(0))

    public fun setValue(value: DialAppStateDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DialAppStateDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DialAppStateDetails {
      val address = segment.toRawLongValue()
      return DialAppStateDetails(Pointer(address))
    }

    public override fun toNative(obj: DialAppStateDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
