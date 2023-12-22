package Windows.Security.Cryptography.Certificates

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(KeyAttestationHelper.ABI::class)
@WinRTByReference(brClass = KeyAttestationHelper.ByReference::class)
public class KeyAttestationHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KeyAttestationHelper> {
    public override fun getValue() = KeyAttestationHelper(pointer.getPointer(0))

    public fun setValue(value: KeyAttestationHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyAttestationHelper, MemoryAddress> {
    public val IKeyAttestationHelperStatics_Instance: IKeyAttestationHelperStatics by lazy {
      createIKeyAttestationHelperStatics()
    }


    public val IKeyAttestationHelperStatics2_Instance: IKeyAttestationHelperStatics2 by lazy {
      createIKeyAttestationHelperStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKeyAttestationHelperStatics(): IKeyAttestationHelperStatics {
      val refiid = Guid.REFIID(IKeyAttestationHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.KeyAttestationHelper".toHandle(),refiid,interfacePtr)
      val result =
          IKeyAttestationHelperStatics.ABI.makeIKeyAttestationHelperStatics(interfacePtr.value)
      return result
    }

    public fun createIKeyAttestationHelperStatics2(): IKeyAttestationHelperStatics2 {
      val refiid = Guid.REFIID(IKeyAttestationHelperStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.KeyAttestationHelper".toHandle(),refiid,interfacePtr)
      val result =
          IKeyAttestationHelperStatics2.ABI.makeIKeyAttestationHelperStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KeyAttestationHelper {
      val address = segment.toRawLongValue()
      return KeyAttestationHelper(Pointer(address))
    }

    public override fun toNative(obj: KeyAttestationHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun DecryptTpmAttestationCredentialAsync(credential: String) =
        ABI.IKeyAttestationHelperStatics_Instance.DecryptTpmAttestationCredentialAsync(credential)

    public fun GetTpmAttestationCredentialId(credential: String) =
        ABI.IKeyAttestationHelperStatics_Instance.GetTpmAttestationCredentialId(credential)

    public fun DecryptTpmAttestationCredentialAsync(credential: String, containerName: String) =
        ABI.IKeyAttestationHelperStatics2_Instance.DecryptTpmAttestationCredentialAsync(credential,
        containerName)
  }
}
