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

@ABIMarker(TetheringEntitlementCheckTriggerDetails.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.TetheringEntitlementCheckTriggerDetails;{03c65e9d-5926-41f3-a94e-b50926fc421b})")
@WinRTByReference(brClass = TetheringEntitlementCheckTriggerDetails.ByReference::class)
public class TetheringEntitlementCheckTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITetheringEntitlementCheckTriggerDetails.WithDefault, IWinRTObject {
  private val __2079689540_Interface: ITetheringEntitlementCheckTriggerDetails.WithDefault by lazy {
    as_2079689540()
  }


  public override val __2079689540_Ptr: JNAPointer? by lazy {
    __2079689540_Interface.__2079689540_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2079689540_Interface)

  private fun as_2079689540(): ITetheringEntitlementCheckTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(ITetheringEntitlementCheckTriggerDetails.ABI.makeITetheringEntitlementCheckTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITetheringEntitlementCheckTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITetheringEntitlementCheckTriggerDetails.ABI.makeITetheringEntitlementCheckTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TetheringEntitlementCheckTriggerDetails> {
    public override fun getValue() = TetheringEntitlementCheckTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: TetheringEntitlementCheckTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TetheringEntitlementCheckTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        TetheringEntitlementCheckTriggerDetails {
      val address = segment.toRawLongValue()
      return TetheringEntitlementCheckTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: TetheringEntitlementCheckTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
