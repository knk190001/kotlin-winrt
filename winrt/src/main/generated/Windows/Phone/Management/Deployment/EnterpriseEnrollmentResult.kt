package Windows.Phone.Management.Deployment

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

@ABIMarker(EnterpriseEnrollmentResult.ABI::class)
@Signature("rc(Windows.Phone.Management.Deployment.EnterpriseEnrollmentResult;{9ff71ce6-90db-4342-b326-1729aa91301c})")
@WinRTByReference(brClass = EnterpriseEnrollmentResult.ByReference::class)
public class EnterpriseEnrollmentResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEnterpriseEnrollmentResult.WithDefault, IWinRTObject {
  private val __145397286_Interface: IEnterpriseEnrollmentResult.WithDefault by lazy {
    as_145397286()
  }


  public override val __145397286_Ptr: JNAPointer? by lazy {
    __145397286_Interface.__145397286_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__145397286_Interface)

  private fun as_145397286(): IEnterpriseEnrollmentResult.WithDefault {
    if(pointer == NULL) {
      return(IEnterpriseEnrollmentResult.ABI.makeIEnterpriseEnrollmentResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEnterpriseEnrollmentResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEnterpriseEnrollmentResult.ABI.makeIEnterpriseEnrollmentResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EnterpriseEnrollmentResult> {
    public override fun getValue() = EnterpriseEnrollmentResult(pointer.getPointer(0))

    public fun setValue(value: EnterpriseEnrollmentResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EnterpriseEnrollmentResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EnterpriseEnrollmentResult {
      val address = segment.toRawLongValue()
      return EnterpriseEnrollmentResult(Pointer(address))
    }

    public override fun toNative(obj: EnterpriseEnrollmentResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
