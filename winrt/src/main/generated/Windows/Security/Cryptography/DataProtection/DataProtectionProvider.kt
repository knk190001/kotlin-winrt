package Windows.Security.Cryptography.DataProtection

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(DataProtectionProvider.ABI::class)
@Signature("rc(Windows.Security.Cryptography.DataProtection.DataProtectionProvider;{09639948-ed22-4270-bd1c-6d72c00f8787})")
@WinRTByReference(brClass = DataProtectionProvider.ByReference::class)
public class DataProtectionProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataProtectionProvider.WithDefault, IWinRTObject {
  private val __766870501_Interface: IDataProtectionProvider.WithDefault by lazy {
    as_766870501()
  }


  public override val __766870501_Ptr: JNAPointer? by lazy {
    __766870501_Interface.__766870501_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__766870501_Interface)

  public constructor() : this(ABI.activate())

  public constructor(protectionDescriptor: String) : this(ABI.activate(protectionDescriptor))

  private fun as_766870501(): IDataProtectionProvider.WithDefault {
    if(pointer == NULL) {
      return(IDataProtectionProvider.ABI.makeIDataProtectionProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataProtectionProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataProtectionProvider.ABI.makeIDataProtectionProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DataProtectionProvider> {
    public override fun getValue() = DataProtectionProvider(pointer.getPointer(0))

    public fun setValue(value: DataProtectionProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataProtectionProvider, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IDataProtectionProviderFactory_Instance: IDataProtectionProviderFactory by lazy {
      createIDataProtectionProviderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.DataProtection.DataProtectionProvider".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIDataProtectionProviderFactory(): IDataProtectionProviderFactory {
      val refiid = Guid.REFIID(IDataProtectionProviderFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.DataProtection.DataProtectionProvider".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDataProtectionProviderFactory.ABI.makeIDataProtectionProviderFactory(factoryActivatorPtr.value))
    }

    public fun activate(protectionDescriptor: String): JNAPointer? =
        IDataProtectionProviderFactory_Instance.CreateOverloadExplicit(protectionDescriptor)?.pointer

    public override fun fromNative(segment: MemoryAddress): DataProtectionProvider {
      val address = segment.toRawLongValue()
      return DataProtectionProvider(Pointer(address))
    }

    public override fun toNative(obj: DataProtectionProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
