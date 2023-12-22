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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(KeyAlgorithmNames.ABI::class)
@WinRTByReference(brClass = KeyAlgorithmNames.ByReference::class)
public class KeyAlgorithmNames(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KeyAlgorithmNames> {
    public override fun getValue() = KeyAlgorithmNames(pointer.getPointer(0))

    public fun setValue(value: KeyAlgorithmNames): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyAlgorithmNames, MemoryAddress> {
    public val IKeyAlgorithmNamesStatics2_Instance: IKeyAlgorithmNamesStatics2 by lazy {
      createIKeyAlgorithmNamesStatics2()
    }


    public val IKeyAlgorithmNamesStatics_Instance: IKeyAlgorithmNamesStatics by lazy {
      createIKeyAlgorithmNamesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKeyAlgorithmNamesStatics2(): IKeyAlgorithmNamesStatics2 {
      val refiid = Guid.REFIID(IKeyAlgorithmNamesStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames".toHandle(),refiid,interfacePtr)
      val result = IKeyAlgorithmNamesStatics2.ABI.makeIKeyAlgorithmNamesStatics2(interfacePtr.value)
      return result
    }

    public fun createIKeyAlgorithmNamesStatics(): IKeyAlgorithmNamesStatics {
      val refiid = Guid.REFIID(IKeyAlgorithmNamesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames".toHandle(),refiid,interfacePtr)
      val result = IKeyAlgorithmNamesStatics.ABI.makeIKeyAlgorithmNamesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KeyAlgorithmNames {
      val address = segment.toRawLongValue()
      return KeyAlgorithmNames(Pointer(address))
    }

    public override fun toNative(obj: KeyAlgorithmNames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Ecdsa() = ABI.IKeyAlgorithmNamesStatics2_Instance.get_Ecdsa()

    public fun get_Ecdh() = ABI.IKeyAlgorithmNamesStatics2_Instance.get_Ecdh()

    public fun get_Rsa() = ABI.IKeyAlgorithmNamesStatics_Instance.get_Rsa()

    public fun get_Dsa() = ABI.IKeyAlgorithmNamesStatics_Instance.get_Dsa()

    public fun get_Ecdh256() = ABI.IKeyAlgorithmNamesStatics_Instance.get_Ecdh256()

    public fun get_Ecdh384() = ABI.IKeyAlgorithmNamesStatics_Instance.get_Ecdh384()

    public fun get_Ecdh521() = ABI.IKeyAlgorithmNamesStatics_Instance.get_Ecdh521()

    public fun get_Ecdsa256() = ABI.IKeyAlgorithmNamesStatics_Instance.get_Ecdsa256()

    public fun get_Ecdsa384() = ABI.IKeyAlgorithmNamesStatics_Instance.get_Ecdsa384()

    public fun get_Ecdsa521() = ABI.IKeyAlgorithmNamesStatics_Instance.get_Ecdsa521()
  }
}
