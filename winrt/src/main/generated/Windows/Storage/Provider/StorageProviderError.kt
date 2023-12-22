package Windows.Storage.Provider

import Windows.Storage.Provider.IStorageProviderErrorFactory.ABI.IID
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

@ABIMarker(StorageProviderError.ABI::class)
@Signature("rc(Windows.Storage.Provider.StorageProviderError;{47f2780b-ef7f-5910-bf83-331d89256615})")
@WinRTByReference(brClass = StorageProviderError.ByReference::class)
public class StorageProviderError(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageProviderError.WithDefault, IWinRTObject {
  private val __2025407670_Interface: IStorageProviderError.WithDefault by lazy {
    as_2025407670()
  }


  public override val __2025407670_Ptr: JNAPointer? by lazy {
    __2025407670_Interface.__2025407670_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2025407670_Interface)

  public constructor(
    id: String,
    title: String,
    message: String
  ) : this(ABI.activate(id, title, message))

  private fun as_2025407670(): IStorageProviderError.WithDefault {
    if(pointer == NULL) {
      return(IStorageProviderError.ABI.makeIStorageProviderError(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageProviderError>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageProviderError.ABI.makeIStorageProviderError(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageProviderError> {
    public override fun getValue() = StorageProviderError(pointer.getPointer(0))

    public fun setValue(value: StorageProviderError): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageProviderError, MemoryAddress> {
    public val IStorageProviderErrorFactory_Instance: IStorageProviderErrorFactory by lazy {
      createIStorageProviderErrorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStorageProviderErrorFactory(): IStorageProviderErrorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Provider.StorageProviderError".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IStorageProviderErrorFactory.ABI.makeIStorageProviderErrorFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      id: String,
      title: String,
      message: String
    ): JNAPointer? = IStorageProviderErrorFactory_Instance.CreateInstance(id, title,
        message)?.pointer

    public override fun fromNative(segment: MemoryAddress): StorageProviderError {
      val address = segment.toRawLongValue()
      return StorageProviderError(Pointer(address))
    }

    public override fun toNative(obj: StorageProviderError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
