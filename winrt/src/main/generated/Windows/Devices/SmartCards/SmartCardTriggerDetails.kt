package Windows.Devices.SmartCards

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

@ABIMarker(SmartCardTriggerDetails.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardTriggerDetails;{5f9bf11e-39ef-4f2b-b44f-0a9155b177bc})")
@WinRTByReference(brClass = SmartCardTriggerDetails.ByReference::class)
public class SmartCardTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardTriggerDetails.WithDefault, ISmartCardTriggerDetails2.WithDefault,
    ISmartCardTriggerDetails3.WithDefault, IWinRTObject {
  private val __857491504_Interface: ISmartCardTriggerDetails.WithDefault by lazy {
    as_857491504()
  }


  private val __812432898_Interface: ISmartCardTriggerDetails2.WithDefault by lazy {
    as_812432898()
  }


  private val __812432899_Interface: ISmartCardTriggerDetails3.WithDefault by lazy {
    as_812432899()
  }


  public override val __857491504_Ptr: JNAPointer? by lazy {
    __857491504_Interface.__857491504_Ptr
  }


  public override val __812432898_Ptr: JNAPointer? by lazy {
    __812432898_Interface.__812432898_Ptr
  }


  public override val __812432899_Ptr: JNAPointer? by lazy {
    __812432899_Interface.__812432899_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__857491504_Interface, __812432898_Interface, __812432899_Interface)

  private fun as_857491504(): ISmartCardTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardTriggerDetails.ABI.makeISmartCardTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardTriggerDetails.ABI.makeISmartCardTriggerDetails(ref.value))
  }

  private fun as_812432898(): ISmartCardTriggerDetails2.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardTriggerDetails2.ABI.makeISmartCardTriggerDetails2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardTriggerDetails2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardTriggerDetails2.ABI.makeISmartCardTriggerDetails2(ref.value))
  }

  private fun as_812432899(): ISmartCardTriggerDetails3.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardTriggerDetails3.ABI.makeISmartCardTriggerDetails3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardTriggerDetails3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardTriggerDetails3.ABI.makeISmartCardTriggerDetails3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardTriggerDetails> {
    public override fun getValue() = SmartCardTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: SmartCardTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmartCardTriggerDetails {
      val address = segment.toRawLongValue()
      return SmartCardTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: SmartCardTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
