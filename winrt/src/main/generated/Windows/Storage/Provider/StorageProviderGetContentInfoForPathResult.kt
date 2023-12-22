package Windows.Storage.Provider

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(StorageProviderGetContentInfoForPathResult.ABI::class)
@Signature("rc(Windows.Storage.Provider.StorageProviderGetContentInfoForPathResult;{2564711d-aa89-4d12-82e3-f72a92e33966})")
@WinRTByReference(brClass = StorageProviderGetContentInfoForPathResult.ByReference::class)
public class StorageProviderGetContentInfoForPathResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageProviderGetContentInfoForPathResult.WithDefault, IWinRTObject {
  private val __628368792_Interface: IStorageProviderGetContentInfoForPathResult.WithDefault by
      lazy {
    as_628368792()
  }


  public override val __628368792_Ptr: JNAPointer? by lazy {
    __628368792_Interface.__628368792_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__628368792_Interface)

  public constructor() : this(ABI.activate())

  private fun as_628368792(): IStorageProviderGetContentInfoForPathResult.WithDefault {
    if(pointer == NULL) {
      return(IStorageProviderGetContentInfoForPathResult.ABI.makeIStorageProviderGetContentInfoForPathResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageProviderGetContentInfoForPathResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageProviderGetContentInfoForPathResult.ABI.makeIStorageProviderGetContentInfoForPathResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageProviderGetContentInfoForPathResult> {
    public override fun getValue() =
        StorageProviderGetContentInfoForPathResult(pointer.getPointer(0))

    public fun setValue(value: StorageProviderGetContentInfoForPathResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageProviderGetContentInfoForPathResult, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Provider.StorageProviderGetContentInfoForPathResult".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress):
        StorageProviderGetContentInfoForPathResult {
      val address = segment.toRawLongValue()
      return StorageProviderGetContentInfoForPathResult(Pointer(address))
    }

    public override fun toNative(obj: StorageProviderGetContentInfoForPathResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
