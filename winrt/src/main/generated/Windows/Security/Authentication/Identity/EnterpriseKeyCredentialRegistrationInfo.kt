package Windows.Security.Authentication.Identity

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

@ABIMarker(EnterpriseKeyCredentialRegistrationInfo.ABI::class)
@Signature("rc(Windows.Security.Authentication.Identity.EnterpriseKeyCredentialRegistrationInfo;{38321acc-672b-4823-b603-6b3c753daf97})")
@WinRTByReference(brClass = EnterpriseKeyCredentialRegistrationInfo.ByReference::class)
public class EnterpriseKeyCredentialRegistrationInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEnterpriseKeyCredentialRegistrationInfo.WithDefault, IWinRTObject {
  private val __607986916_Interface: IEnterpriseKeyCredentialRegistrationInfo.WithDefault by lazy {
    as_607986916()
  }


  public override val __607986916_Ptr: JNAPointer? by lazy {
    __607986916_Interface.__607986916_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__607986916_Interface)

  private fun as_607986916(): IEnterpriseKeyCredentialRegistrationInfo.WithDefault {
    if(pointer == NULL) {
      return(IEnterpriseKeyCredentialRegistrationInfo.ABI.makeIEnterpriseKeyCredentialRegistrationInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEnterpriseKeyCredentialRegistrationInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEnterpriseKeyCredentialRegistrationInfo.ABI.makeIEnterpriseKeyCredentialRegistrationInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EnterpriseKeyCredentialRegistrationInfo> {
    public override fun getValue() = EnterpriseKeyCredentialRegistrationInfo(pointer.getPointer(0))

    public fun setValue(value: EnterpriseKeyCredentialRegistrationInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EnterpriseKeyCredentialRegistrationInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        EnterpriseKeyCredentialRegistrationInfo {
      val address = segment.toRawLongValue()
      return EnterpriseKeyCredentialRegistrationInfo(Pointer(address))
    }

    public override fun toNative(obj: EnterpriseKeyCredentialRegistrationInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
