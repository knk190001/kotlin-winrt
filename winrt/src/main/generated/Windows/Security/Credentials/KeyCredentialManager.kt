package Windows.Security.Credentials

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

@ABIMarker(KeyCredentialManager.ABI::class)
@WinRTByReference(brClass = KeyCredentialManager.ByReference::class)
public class KeyCredentialManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KeyCredentialManager> {
    public override fun getValue() = KeyCredentialManager(pointer.getPointer(0))

    public fun setValue(value: KeyCredentialManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyCredentialManager, MemoryAddress> {
    public val IKeyCredentialManagerStatics_Instance: IKeyCredentialManagerStatics by lazy {
      createIKeyCredentialManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKeyCredentialManagerStatics(): IKeyCredentialManagerStatics {
      val refiid = Guid.REFIID(IKeyCredentialManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Credentials.KeyCredentialManager".toHandle(),refiid,interfacePtr)
      val result =
          IKeyCredentialManagerStatics.ABI.makeIKeyCredentialManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KeyCredentialManager {
      val address = segment.toRawLongValue()
      return KeyCredentialManager(Pointer(address))
    }

    public override fun toNative(obj: KeyCredentialManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsSupportedAsync() = ABI.IKeyCredentialManagerStatics_Instance.IsSupportedAsync()

    public fun RenewAttestationAsync() =
        ABI.IKeyCredentialManagerStatics_Instance.RenewAttestationAsync()

    public fun RequestCreateAsync(name: String, option: KeyCredentialCreationOption) =
        ABI.IKeyCredentialManagerStatics_Instance.RequestCreateAsync(name, option)

    public fun OpenAsync(name: String) = ABI.IKeyCredentialManagerStatics_Instance.OpenAsync(name)

    public fun DeleteAsync(name: String) =
        ABI.IKeyCredentialManagerStatics_Instance.DeleteAsync(name)
  }
}
