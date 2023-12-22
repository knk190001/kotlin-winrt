package Microsoft.Windows.Security.AccessControl

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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SecurityDescriptorHelpers.ABI::class)
@WinRTByReference(brClass = SecurityDescriptorHelpers.ByReference::class)
public class SecurityDescriptorHelpers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SecurityDescriptorHelpers> {
    public override fun getValue() = SecurityDescriptorHelpers(pointer.getPointer(0))

    public fun setValue(value: SecurityDescriptorHelpers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SecurityDescriptorHelpers, MemoryAddress> {
    public val ISecurityDescriptorHelpersStatics_Instance: ISecurityDescriptorHelpersStatics by
        lazy {
      createISecurityDescriptorHelpersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISecurityDescriptorHelpersStatics(): ISecurityDescriptorHelpersStatics {
      val refiid = Guid.REFIID(ISecurityDescriptorHelpersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.Security.AccessControl.SecurityDescriptorHelpers".toHandle(),refiid,interfacePtr)
      val result =
          ISecurityDescriptorHelpersStatics.ABI.makeISecurityDescriptorHelpersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SecurityDescriptorHelpers {
      val address = segment.toRawLongValue()
      return SecurityDescriptorHelpers(Pointer(address))
    }

    public override fun toNative(obj: SecurityDescriptorHelpers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetSddlForAppContainerNames(
      accessRequests: Array<AppContainerNameAndAccess?>,
      principalStringSid: String,
      principalAccessMask: WinDef.UINT
    ) = ABI.ISecurityDescriptorHelpersStatics_Instance.GetSddlForAppContainerNames(accessRequests,
        principalStringSid, principalAccessMask)

    public fun GetSecurityDescriptorBytesFromAppContainerNames(
      accessRequests: Array<AppContainerNameAndAccess?>,
      principalStringSid: String,
      principalAccessMask: WinDef.UINT
    ) =
        ABI.ISecurityDescriptorHelpersStatics_Instance.GetSecurityDescriptorBytesFromAppContainerNames(accessRequests,
        principalStringSid, principalAccessMask)
  }
}
