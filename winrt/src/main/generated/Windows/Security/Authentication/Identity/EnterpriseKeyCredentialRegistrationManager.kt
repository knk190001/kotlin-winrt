package Windows.Security.Authentication.Identity

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(EnterpriseKeyCredentialRegistrationManager.ABI::class)
@Signature("rc(Windows.Security.Authentication.Identity.EnterpriseKeyCredentialRegistrationManager;{83f3be3f-a25f-4cba-bb8e-bdc32d03c297})")
@WinRTByReference(brClass = EnterpriseKeyCredentialRegistrationManager.ByReference::class)
public class EnterpriseKeyCredentialRegistrationManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEnterpriseKeyCredentialRegistrationManager.WithDefault, IWinRTObject {
  private val __448930889_Interface: IEnterpriseKeyCredentialRegistrationManager.WithDefault by
      lazy {
    as_448930889()
  }


  public override val __448930889_Ptr: JNAPointer? by lazy {
    __448930889_Interface.__448930889_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__448930889_Interface)

  private fun as_448930889(): IEnterpriseKeyCredentialRegistrationManager.WithDefault {
    if(pointer == NULL) {
      return(IEnterpriseKeyCredentialRegistrationManager.ABI.makeIEnterpriseKeyCredentialRegistrationManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEnterpriseKeyCredentialRegistrationManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEnterpriseKeyCredentialRegistrationManager.ABI.makeIEnterpriseKeyCredentialRegistrationManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EnterpriseKeyCredentialRegistrationManager> {
    public override fun getValue() =
        EnterpriseKeyCredentialRegistrationManager(pointer.getPointer(0))

    public fun setValue(value: EnterpriseKeyCredentialRegistrationManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EnterpriseKeyCredentialRegistrationManager, MemoryAddress> {
    public val IEnterpriseKeyCredentialRegistrationManagerStatics_Instance:
        IEnterpriseKeyCredentialRegistrationManagerStatics by lazy {
      createIEnterpriseKeyCredentialRegistrationManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIEnterpriseKeyCredentialRegistrationManagerStatics():
        IEnterpriseKeyCredentialRegistrationManagerStatics {
      val refiid = Guid.REFIID(IEnterpriseKeyCredentialRegistrationManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Identity.EnterpriseKeyCredentialRegistrationManager".toHandle(),refiid,interfacePtr)
      val result =
          IEnterpriseKeyCredentialRegistrationManagerStatics.ABI.makeIEnterpriseKeyCredentialRegistrationManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress):
        EnterpriseKeyCredentialRegistrationManager {
      val address = segment.toRawLongValue()
      return EnterpriseKeyCredentialRegistrationManager(Pointer(address))
    }

    public override fun toNative(obj: EnterpriseKeyCredentialRegistrationManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Current() =
        ABI.IEnterpriseKeyCredentialRegistrationManagerStatics_Instance.get_Current()
  }
}
