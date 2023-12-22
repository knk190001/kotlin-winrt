package Windows.Storage.Provider

import Windows.Storage.Provider.IStorageProviderFileTypeInfoFactory.ABI.IID
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

@ABIMarker(StorageProviderFileTypeInfo.ABI::class)
@Signature("rc(Windows.Storage.Provider.StorageProviderFileTypeInfo;{1955b9c1-0184-5a88-87df-4544f464365d})")
@WinRTByReference(brClass = StorageProviderFileTypeInfo.ByReference::class)
public class StorageProviderFileTypeInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageProviderFileTypeInfo.WithDefault, IWinRTObject {
  private val __2141857334_Interface: IStorageProviderFileTypeInfo.WithDefault by lazy {
    as_2141857334()
  }


  public override val __2141857334_Ptr: JNAPointer? by lazy {
    __2141857334_Interface.__2141857334_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2141857334_Interface)

  public constructor(fileExtension: String, iconResource: String) : this(ABI.activate(fileExtension,
      iconResource))

  private fun as_2141857334(): IStorageProviderFileTypeInfo.WithDefault {
    if(pointer == NULL) {
      return(IStorageProviderFileTypeInfo.ABI.makeIStorageProviderFileTypeInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageProviderFileTypeInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageProviderFileTypeInfo.ABI.makeIStorageProviderFileTypeInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageProviderFileTypeInfo> {
    public override fun getValue() = StorageProviderFileTypeInfo(pointer.getPointer(0))

    public fun setValue(value: StorageProviderFileTypeInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageProviderFileTypeInfo, MemoryAddress> {
    public val IStorageProviderFileTypeInfoFactory_Instance: IStorageProviderFileTypeInfoFactory by
        lazy {
      createIStorageProviderFileTypeInfoFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStorageProviderFileTypeInfoFactory(): IStorageProviderFileTypeInfoFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Provider.StorageProviderFileTypeInfo".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IStorageProviderFileTypeInfoFactory.ABI.makeIStorageProviderFileTypeInfoFactory(factoryActivatorPtr.value))
    }

    public fun activate(fileExtension: String, iconResource: String): JNAPointer? =
        IStorageProviderFileTypeInfoFactory_Instance.CreateInstance(fileExtension,
        iconResource)?.pointer

    public override fun fromNative(segment: MemoryAddress): StorageProviderFileTypeInfo {
      val address = segment.toRawLongValue()
      return StorageProviderFileTypeInfo(Pointer(address))
    }

    public override fun toNative(obj: StorageProviderFileTypeInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
