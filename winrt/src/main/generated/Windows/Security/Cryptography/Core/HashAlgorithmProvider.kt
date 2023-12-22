package Windows.Security.Cryptography.Core

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(HashAlgorithmProvider.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Core.HashAlgorithmProvider;{be9b3080-b2c3-422b-bce1-ec90efb5d7b5})")
@WinRTByReference(brClass = HashAlgorithmProvider.ByReference::class)
public class HashAlgorithmProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHashAlgorithmProvider.WithDefault, IWinRTObject {
  private val __786656377_Interface: IHashAlgorithmProvider.WithDefault by lazy {
    as_786656377()
  }


  public override val __786656377_Ptr: JNAPointer? by lazy {
    __786656377_Interface.__786656377_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__786656377_Interface)

  private fun as_786656377(): IHashAlgorithmProvider.WithDefault {
    if(pointer == NULL) {
      return(IHashAlgorithmProvider.ABI.makeIHashAlgorithmProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHashAlgorithmProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHashAlgorithmProvider.ABI.makeIHashAlgorithmProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HashAlgorithmProvider> {
    public override fun getValue() = HashAlgorithmProvider(pointer.getPointer(0))

    public fun setValue(value: HashAlgorithmProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HashAlgorithmProvider, MemoryAddress> {
    public val IHashAlgorithmProviderStatics_Instance: IHashAlgorithmProviderStatics by lazy {
      createIHashAlgorithmProviderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHashAlgorithmProviderStatics(): IHashAlgorithmProviderStatics {
      val refiid = Guid.REFIID(IHashAlgorithmProviderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.HashAlgorithmProvider".toHandle(),refiid,interfacePtr)
      val result =
          IHashAlgorithmProviderStatics.ABI.makeIHashAlgorithmProviderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HashAlgorithmProvider {
      val address = segment.toRawLongValue()
      return HashAlgorithmProvider(Pointer(address))
    }

    public override fun toNative(obj: HashAlgorithmProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun OpenAlgorithm(algorithm: String) =
        ABI.IHashAlgorithmProviderStatics_Instance.OpenAlgorithm(algorithm)
  }
}
