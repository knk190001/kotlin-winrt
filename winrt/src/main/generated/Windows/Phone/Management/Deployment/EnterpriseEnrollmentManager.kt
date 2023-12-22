package Windows.Phone.Management.Deployment

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(EnterpriseEnrollmentManager.ABI::class)
@WinRTByReference(brClass = EnterpriseEnrollmentManager.ByReference::class)
public class EnterpriseEnrollmentManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EnterpriseEnrollmentManager> {
    public override fun getValue() = EnterpriseEnrollmentManager(pointer.getPointer(0))

    public fun setValue(value: EnterpriseEnrollmentManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EnterpriseEnrollmentManager, MemoryAddress> {
    public val IEnterpriseEnrollmentManager_Instance: IEnterpriseEnrollmentManager by lazy {
      createIEnterpriseEnrollmentManager()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIEnterpriseEnrollmentManager(): IEnterpriseEnrollmentManager {
      val refiid = Guid.REFIID(IEnterpriseEnrollmentManager.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.Management.Deployment.EnterpriseEnrollmentManager".toHandle(),refiid,interfacePtr)
      val result =
          IEnterpriseEnrollmentManager.ABI.makeIEnterpriseEnrollmentManager(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): EnterpriseEnrollmentManager {
      val address = segment.toRawLongValue()
      return EnterpriseEnrollmentManager(Pointer(address))
    }

    public override fun toNative(obj: EnterpriseEnrollmentManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EnrolledEnterprises() =
        ABI.IEnterpriseEnrollmentManager_Instance.get_EnrolledEnterprises()

    public fun get_CurrentEnterprise() =
        ABI.IEnterpriseEnrollmentManager_Instance.get_CurrentEnterprise()

    public fun ValidateEnterprisesAsync() =
        ABI.IEnterpriseEnrollmentManager_Instance.ValidateEnterprisesAsync()

    public fun RequestEnrollmentAsync(enrollmentToken: String) =
        ABI.IEnterpriseEnrollmentManager_Instance.RequestEnrollmentAsync(enrollmentToken)

    public fun RequestUnenrollmentAsync(enterprise: Enterprise) =
        ABI.IEnterpriseEnrollmentManager_Instance.RequestUnenrollmentAsync(enterprise)
  }
}
