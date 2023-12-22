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

@ABIMarker(KeyStorageProviderNames.ABI::class)
@WinRTByReference(brClass = KeyStorageProviderNames.ByReference::class)
public class KeyStorageProviderNames(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KeyStorageProviderNames> {
    public override fun getValue() = KeyStorageProviderNames(pointer.getPointer(0))

    public fun setValue(value: KeyStorageProviderNames): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyStorageProviderNames, MemoryAddress> {
    public val IKeyStorageProviderNamesStatics2_Instance: IKeyStorageProviderNamesStatics2 by lazy {
      createIKeyStorageProviderNamesStatics2()
    }


    public val IKeyStorageProviderNamesStatics_Instance: IKeyStorageProviderNamesStatics by lazy {
      createIKeyStorageProviderNamesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKeyStorageProviderNamesStatics2(): IKeyStorageProviderNamesStatics2 {
      val refiid = Guid.REFIID(IKeyStorageProviderNamesStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames".toHandle(),refiid,interfacePtr)
      val result =
          IKeyStorageProviderNamesStatics2.ABI.makeIKeyStorageProviderNamesStatics2(interfacePtr.value)
      return result
    }

    public fun createIKeyStorageProviderNamesStatics(): IKeyStorageProviderNamesStatics {
      val refiid = Guid.REFIID(IKeyStorageProviderNamesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames".toHandle(),refiid,interfacePtr)
      val result =
          IKeyStorageProviderNamesStatics.ABI.makeIKeyStorageProviderNamesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KeyStorageProviderNames {
      val address = segment.toRawLongValue()
      return KeyStorageProviderNames(Pointer(address))
    }

    public override fun toNative(obj: KeyStorageProviderNames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PassportKeyStorageProvider() =
        ABI.IKeyStorageProviderNamesStatics2_Instance.get_PassportKeyStorageProvider()

    public fun get_SoftwareKeyStorageProvider() =
        ABI.IKeyStorageProviderNamesStatics_Instance.get_SoftwareKeyStorageProvider()

    public fun get_SmartcardKeyStorageProvider() =
        ABI.IKeyStorageProviderNamesStatics_Instance.get_SmartcardKeyStorageProvider()

    public fun get_PlatformKeyStorageProvider() =
        ABI.IKeyStorageProviderNamesStatics_Instance.get_PlatformKeyStorageProvider()
  }
}
