package Windows.Security.ExchangeActiveSyncProvisioning

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

@ABIMarker(EasComplianceResults.ABI::class)
@Signature("rc(Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults;{463c299c-7f19-4c66-b403-cb45dd57a2b3})")
@WinRTByReference(brClass = EasComplianceResults.ByReference::class)
public class EasComplianceResults(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEasComplianceResults.WithDefault, IEasComplianceResults2.WithDefault,
    IWinRTObject {
  private val __343962873_Interface: IEasComplianceResults.WithDefault by lazy {
    as_343962873()
  }


  private val __2072914521_Interface: IEasComplianceResults2.WithDefault by lazy {
    as_2072914521()
  }


  public override val __343962873_Ptr: JNAPointer? by lazy {
    __343962873_Interface.__343962873_Ptr
  }


  public override val __2072914521_Ptr: JNAPointer? by lazy {
    __2072914521_Interface.__2072914521_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__343962873_Interface, __2072914521_Interface)

  private fun as_343962873(): IEasComplianceResults.WithDefault {
    if(pointer == NULL) {
      return(IEasComplianceResults.ABI.makeIEasComplianceResults(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEasComplianceResults>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEasComplianceResults.ABI.makeIEasComplianceResults(ref.value))
  }

  private fun as_2072914521(): IEasComplianceResults2.WithDefault {
    if(pointer == NULL) {
      return(IEasComplianceResults2.ABI.makeIEasComplianceResults2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEasComplianceResults2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEasComplianceResults2.ABI.makeIEasComplianceResults2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EasComplianceResults> {
    public override fun getValue() = EasComplianceResults(pointer.getPointer(0))

    public fun setValue(value: EasComplianceResults): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EasComplianceResults, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EasComplianceResults {
      val address = segment.toRawLongValue()
      return EasComplianceResults(Pointer(address))
    }

    public override fun toNative(obj: EasComplianceResults): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
