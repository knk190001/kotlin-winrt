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

@ABIMarker(SymmetricKeyAlgorithmProvider.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider;{3d7e4a33-3bd0-4902-8ac8-470d50d21376})")
@WinRTByReference(brClass = SymmetricKeyAlgorithmProvider.ByReference::class)
public class SymmetricKeyAlgorithmProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISymmetricKeyAlgorithmProvider.WithDefault, IWinRTObject {
  private val __1644516141_Interface: ISymmetricKeyAlgorithmProvider.WithDefault by lazy {
    as_1644516141()
  }


  public override val __1644516141_Ptr: JNAPointer? by lazy {
    __1644516141_Interface.__1644516141_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1644516141_Interface)

  private fun as_1644516141(): ISymmetricKeyAlgorithmProvider.WithDefault {
    if(pointer == NULL) {
      return(ISymmetricKeyAlgorithmProvider.ABI.makeISymmetricKeyAlgorithmProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISymmetricKeyAlgorithmProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISymmetricKeyAlgorithmProvider.ABI.makeISymmetricKeyAlgorithmProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SymmetricKeyAlgorithmProvider> {
    public override fun getValue() = SymmetricKeyAlgorithmProvider(pointer.getPointer(0))

    public fun setValue(value: SymmetricKeyAlgorithmProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SymmetricKeyAlgorithmProvider, MemoryAddress> {
    public val ISymmetricKeyAlgorithmProviderStatics_Instance: ISymmetricKeyAlgorithmProviderStatics
        by lazy {
      createISymmetricKeyAlgorithmProviderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISymmetricKeyAlgorithmProviderStatics():
        ISymmetricKeyAlgorithmProviderStatics {
      val refiid = Guid.REFIID(ISymmetricKeyAlgorithmProviderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider".toHandle(),refiid,interfacePtr)
      val result =
          ISymmetricKeyAlgorithmProviderStatics.ABI.makeISymmetricKeyAlgorithmProviderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SymmetricKeyAlgorithmProvider {
      val address = segment.toRawLongValue()
      return SymmetricKeyAlgorithmProvider(Pointer(address))
    }

    public override fun toNative(obj: SymmetricKeyAlgorithmProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun OpenAlgorithm(algorithm: String) =
        ABI.ISymmetricKeyAlgorithmProviderStatics_Instance.OpenAlgorithm(algorithm)
  }
}
