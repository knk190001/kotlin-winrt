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

@ABIMarker(AsymmetricKeyAlgorithmProvider.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider;{e8d2ff37-6259-4e88-b7e0-94191fde699e})")
@WinRTByReference(brClass = AsymmetricKeyAlgorithmProvider.ByReference::class)
public class AsymmetricKeyAlgorithmProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAsymmetricKeyAlgorithmProvider.WithDefault,
    IAsymmetricKeyAlgorithmProvider2.WithDefault, IWinRTObject {
  private val __54166562_Interface: IAsymmetricKeyAlgorithmProvider.WithDefault by lazy {
    as_54166562()
  }


  private val __1679163472_Interface: IAsymmetricKeyAlgorithmProvider2.WithDefault by lazy {
    as_1679163472()
  }


  public override val __54166562_Ptr: JNAPointer? by lazy {
    __54166562_Interface.__54166562_Ptr
  }


  public override val __1679163472_Ptr: JNAPointer? by lazy {
    __1679163472_Interface.__1679163472_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__54166562_Interface, __1679163472_Interface)

  private fun as_54166562(): IAsymmetricKeyAlgorithmProvider.WithDefault {
    if(pointer == NULL) {
      return(IAsymmetricKeyAlgorithmProvider.ABI.makeIAsymmetricKeyAlgorithmProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAsymmetricKeyAlgorithmProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAsymmetricKeyAlgorithmProvider.ABI.makeIAsymmetricKeyAlgorithmProvider(ref.value))
  }

  private fun as_1679163472(): IAsymmetricKeyAlgorithmProvider2.WithDefault {
    if(pointer == NULL) {
      return(IAsymmetricKeyAlgorithmProvider2.ABI.makeIAsymmetricKeyAlgorithmProvider2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAsymmetricKeyAlgorithmProvider2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAsymmetricKeyAlgorithmProvider2.ABI.makeIAsymmetricKeyAlgorithmProvider2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AsymmetricKeyAlgorithmProvider> {
    public override fun getValue() = AsymmetricKeyAlgorithmProvider(pointer.getPointer(0))

    public fun setValue(value: AsymmetricKeyAlgorithmProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AsymmetricKeyAlgorithmProvider, MemoryAddress> {
    public val IAsymmetricKeyAlgorithmProviderStatics_Instance:
        IAsymmetricKeyAlgorithmProviderStatics by lazy {
      createIAsymmetricKeyAlgorithmProviderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAsymmetricKeyAlgorithmProviderStatics():
        IAsymmetricKeyAlgorithmProviderStatics {
      val refiid = Guid.REFIID(IAsymmetricKeyAlgorithmProviderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider".toHandle(),refiid,interfacePtr)
      val result =
          IAsymmetricKeyAlgorithmProviderStatics.ABI.makeIAsymmetricKeyAlgorithmProviderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AsymmetricKeyAlgorithmProvider {
      val address = segment.toRawLongValue()
      return AsymmetricKeyAlgorithmProvider(Pointer(address))
    }

    public override fun toNative(obj: AsymmetricKeyAlgorithmProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun OpenAlgorithm(algorithm: String) =
        ABI.IAsymmetricKeyAlgorithmProviderStatics_Instance.OpenAlgorithm(algorithm)
  }
}
