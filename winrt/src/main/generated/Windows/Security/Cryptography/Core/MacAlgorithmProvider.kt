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

@ABIMarker(MacAlgorithmProvider.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Core.MacAlgorithmProvider;{4a3fc5c3-1cbd-41ce-a092-aa0bc5d2d2f5})")
@WinRTByReference(brClass = MacAlgorithmProvider.ByReference::class)
public class MacAlgorithmProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMacAlgorithmProvider.WithDefault, IMacAlgorithmProvider2.WithDefault,
    IWinRTObject {
  private val __1942792156_Interface: IMacAlgorithmProvider.WithDefault by lazy {
    as_1942792156()
  }


  private val __97014742_Interface: IMacAlgorithmProvider2.WithDefault by lazy {
    as_97014742()
  }


  public override val __1942792156_Ptr: JNAPointer? by lazy {
    __1942792156_Interface.__1942792156_Ptr
  }


  public override val __97014742_Ptr: JNAPointer? by lazy {
    __97014742_Interface.__97014742_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1942792156_Interface, __97014742_Interface)

  private fun as_1942792156(): IMacAlgorithmProvider.WithDefault {
    if(pointer == NULL) {
      return(IMacAlgorithmProvider.ABI.makeIMacAlgorithmProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMacAlgorithmProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMacAlgorithmProvider.ABI.makeIMacAlgorithmProvider(ref.value))
  }

  private fun as_97014742(): IMacAlgorithmProvider2.WithDefault {
    if(pointer == NULL) {
      return(IMacAlgorithmProvider2.ABI.makeIMacAlgorithmProvider2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMacAlgorithmProvider2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMacAlgorithmProvider2.ABI.makeIMacAlgorithmProvider2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MacAlgorithmProvider> {
    public override fun getValue() = MacAlgorithmProvider(pointer.getPointer(0))

    public fun setValue(value: MacAlgorithmProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MacAlgorithmProvider, MemoryAddress> {
    public val IMacAlgorithmProviderStatics_Instance: IMacAlgorithmProviderStatics by lazy {
      createIMacAlgorithmProviderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMacAlgorithmProviderStatics(): IMacAlgorithmProviderStatics {
      val refiid = Guid.REFIID(IMacAlgorithmProviderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.MacAlgorithmProvider".toHandle(),refiid,interfacePtr)
      val result =
          IMacAlgorithmProviderStatics.ABI.makeIMacAlgorithmProviderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MacAlgorithmProvider {
      val address = segment.toRawLongValue()
      return MacAlgorithmProvider(Pointer(address))
    }

    public override fun toNative(obj: MacAlgorithmProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun OpenAlgorithm(algorithm: String) =
        ABI.IMacAlgorithmProviderStatics_Instance.OpenAlgorithm(algorithm)
  }
}
