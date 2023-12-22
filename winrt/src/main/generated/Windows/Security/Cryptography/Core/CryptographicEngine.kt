package Windows.Security.Cryptography.Core

import Windows.Storage.Streams.IBuffer
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CryptographicEngine.ABI::class)
@WinRTByReference(brClass = CryptographicEngine.ByReference::class)
public class CryptographicEngine(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CryptographicEngine> {
    public override fun getValue() = CryptographicEngine(pointer.getPointer(0))

    public fun setValue(value: CryptographicEngine): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CryptographicEngine, MemoryAddress> {
    public val ICryptographicEngineStatics2_Instance: ICryptographicEngineStatics2 by lazy {
      createICryptographicEngineStatics2()
    }


    public val ICryptographicEngineStatics_Instance: ICryptographicEngineStatics by lazy {
      createICryptographicEngineStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICryptographicEngineStatics2(): ICryptographicEngineStatics2 {
      val refiid = Guid.REFIID(ICryptographicEngineStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.CryptographicEngine".toHandle(),refiid,interfacePtr)
      val result =
          ICryptographicEngineStatics2.ABI.makeICryptographicEngineStatics2(interfacePtr.value)
      return result
    }

    public fun createICryptographicEngineStatics(): ICryptographicEngineStatics {
      val refiid = Guid.REFIID(ICryptographicEngineStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.CryptographicEngine".toHandle(),refiid,interfacePtr)
      val result =
          ICryptographicEngineStatics.ABI.makeICryptographicEngineStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CryptographicEngine {
      val address = segment.toRawLongValue()
      return CryptographicEngine(Pointer(address))
    }

    public override fun toNative(obj: CryptographicEngine): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun SignHashedData(key: CryptographicKey, `data`: IBuffer) =
        ABI.ICryptographicEngineStatics2_Instance.SignHashedData(key, data)

    public fun VerifySignatureWithHashInput(
      key: CryptographicKey,
      `data`: IBuffer,
      signature: IBuffer
    ) = ABI.ICryptographicEngineStatics2_Instance.VerifySignatureWithHashInput(key, data, signature)

    public fun DecryptAsync(
      key: CryptographicKey,
      `data`: IBuffer,
      iv: IBuffer
    ) = ABI.ICryptographicEngineStatics2_Instance.DecryptAsync(key, data, iv)

    public fun SignAsync(key: CryptographicKey, `data`: IBuffer) =
        ABI.ICryptographicEngineStatics2_Instance.SignAsync(key, data)

    public fun SignHashedDataAsync(key: CryptographicKey, `data`: IBuffer) =
        ABI.ICryptographicEngineStatics2_Instance.SignHashedDataAsync(key, data)

    public fun Encrypt(
      key: CryptographicKey,
      `data`: IBuffer,
      iv: IBuffer
    ) = ABI.ICryptographicEngineStatics_Instance.Encrypt(key, data, iv)

    public fun Decrypt(
      key: CryptographicKey,
      `data`: IBuffer,
      iv: IBuffer
    ) = ABI.ICryptographicEngineStatics_Instance.Decrypt(key, data, iv)

    public fun EncryptAndAuthenticate(
      key: CryptographicKey,
      `data`: IBuffer,
      nonce: IBuffer,
      authenticatedData: IBuffer
    ) = ABI.ICryptographicEngineStatics_Instance.EncryptAndAuthenticate(key, data, nonce,
        authenticatedData)

    public fun DecryptAndAuthenticate(
      key: CryptographicKey,
      `data`: IBuffer,
      nonce: IBuffer,
      authenticationTag: IBuffer,
      authenticatedData: IBuffer
    ) = ABI.ICryptographicEngineStatics_Instance.DecryptAndAuthenticate(key, data, nonce,
        authenticationTag, authenticatedData)

    public fun Sign(key: CryptographicKey, `data`: IBuffer) =
        ABI.ICryptographicEngineStatics_Instance.Sign(key, data)

    public fun VerifySignature(
      key: CryptographicKey,
      `data`: IBuffer,
      signature: IBuffer
    ) = ABI.ICryptographicEngineStatics_Instance.VerifySignature(key, data, signature)

    public fun DeriveKeyMaterial(
      key: CryptographicKey,
      parameters: KeyDerivationParameters,
      desiredKeySize: WinDef.UINT
    ) = ABI.ICryptographicEngineStatics_Instance.DeriveKeyMaterial(key, parameters, desiredKeySize)
  }
}
