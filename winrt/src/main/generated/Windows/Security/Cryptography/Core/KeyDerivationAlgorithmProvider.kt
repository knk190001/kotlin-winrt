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

@ABIMarker(KeyDerivationAlgorithmProvider.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider;{e1fba83b-4671-43b7-9158-763aaa98b6bf})")
@WinRTByReference(brClass = KeyDerivationAlgorithmProvider.ByReference::class)
public class KeyDerivationAlgorithmProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IKeyDerivationAlgorithmProvider.WithDefault, IWinRTObject {
  private val __212709931_Interface: IKeyDerivationAlgorithmProvider.WithDefault by lazy {
    as_212709931()
  }


  public override val __212709931_Ptr: JNAPointer? by lazy {
    __212709931_Interface.__212709931_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__212709931_Interface)

  private fun as_212709931(): IKeyDerivationAlgorithmProvider.WithDefault {
    if(pointer == NULL) {
      return(IKeyDerivationAlgorithmProvider.ABI.makeIKeyDerivationAlgorithmProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyDerivationAlgorithmProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyDerivationAlgorithmProvider.ABI.makeIKeyDerivationAlgorithmProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KeyDerivationAlgorithmProvider> {
    public override fun getValue() = KeyDerivationAlgorithmProvider(pointer.getPointer(0))

    public fun setValue(value: KeyDerivationAlgorithmProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyDerivationAlgorithmProvider, MemoryAddress> {
    public val IKeyDerivationAlgorithmProviderStatics_Instance:
        IKeyDerivationAlgorithmProviderStatics by lazy {
      createIKeyDerivationAlgorithmProviderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKeyDerivationAlgorithmProviderStatics():
        IKeyDerivationAlgorithmProviderStatics {
      val refiid = Guid.REFIID(IKeyDerivationAlgorithmProviderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider".toHandle(),refiid,interfacePtr)
      val result =
          IKeyDerivationAlgorithmProviderStatics.ABI.makeIKeyDerivationAlgorithmProviderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KeyDerivationAlgorithmProvider {
      val address = segment.toRawLongValue()
      return KeyDerivationAlgorithmProvider(Pointer(address))
    }

    public override fun toNative(obj: KeyDerivationAlgorithmProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun OpenAlgorithm(algorithm: String) =
        ABI.IKeyDerivationAlgorithmProviderStatics_Instance.OpenAlgorithm(algorithm)
  }
}
