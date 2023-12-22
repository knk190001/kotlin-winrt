package Windows.Security.Authentication.Identity.Core

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

@ABIMarker(MicrosoftAccountMultiFactorAuthenticationManager.ABI::class)
@Signature("rc(Windows.Security.Authentication.Identity.Core.MicrosoftAccountMultiFactorAuthenticationManager;{0fd340a5-f574-4320-a08e-0a19a82322aa})")
@WinRTByReference(brClass = MicrosoftAccountMultiFactorAuthenticationManager.ByReference::class)
public class MicrosoftAccountMultiFactorAuthenticationManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMicrosoftAccountMultiFactorAuthenticationManager.WithDefault, IWinRTObject {
  private val __345523207_Interface: IMicrosoftAccountMultiFactorAuthenticationManager.WithDefault
      by lazy {
    as_345523207()
  }


  public override val __345523207_Ptr: JNAPointer? by lazy {
    __345523207_Interface.__345523207_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__345523207_Interface)

  private fun as_345523207(): IMicrosoftAccountMultiFactorAuthenticationManager.WithDefault {
    if(pointer == NULL) {
      return(IMicrosoftAccountMultiFactorAuthenticationManager.ABI.makeIMicrosoftAccountMultiFactorAuthenticationManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMicrosoftAccountMultiFactorAuthenticationManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMicrosoftAccountMultiFactorAuthenticationManager.ABI.makeIMicrosoftAccountMultiFactorAuthenticationManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MicrosoftAccountMultiFactorAuthenticationManager> {
    public override fun getValue() =
        MicrosoftAccountMultiFactorAuthenticationManager(pointer.getPointer(0))

    public fun setValue(value: MicrosoftAccountMultiFactorAuthenticationManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MicrosoftAccountMultiFactorAuthenticationManager, MemoryAddress> {
    public val IMicrosoftAccountMultiFactorAuthenticatorStatics_Instance:
        IMicrosoftAccountMultiFactorAuthenticatorStatics by lazy {
      createIMicrosoftAccountMultiFactorAuthenticatorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMicrosoftAccountMultiFactorAuthenticatorStatics():
        IMicrosoftAccountMultiFactorAuthenticatorStatics {
      val refiid = Guid.REFIID(IMicrosoftAccountMultiFactorAuthenticatorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Identity.Core.MicrosoftAccountMultiFactorAuthenticationManager".toHandle(),refiid,interfacePtr)
      val result =
          IMicrosoftAccountMultiFactorAuthenticatorStatics.ABI.makeIMicrosoftAccountMultiFactorAuthenticatorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress):
        MicrosoftAccountMultiFactorAuthenticationManager {
      val address = segment.toRawLongValue()
      return MicrosoftAccountMultiFactorAuthenticationManager(Pointer(address))
    }

    public override fun toNative(obj: MicrosoftAccountMultiFactorAuthenticationManager):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Current() =
        ABI.IMicrosoftAccountMultiFactorAuthenticatorStatics_Instance.get_Current()
  }
}
