package Windows.Storage.Provider

import Windows.Foundation.Collections.IIterable
import Windows.Storage.Provider.IStorageProviderStatusFactory.ABI.IID
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

@ABIMarker(StorageProviderStatus.ABI::class)
@Signature("rc(Windows.Storage.Provider.StorageProviderStatus;{ff6e761d-fb8b-56c3-9e7a-05309d191fb4})")
@WinRTByReference(brClass = StorageProviderStatus.ByReference::class)
public class StorageProviderStatus(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageProviderStatus.WithDefault, IWinRTObject {
  private val __1234717948_Interface: IStorageProviderStatus.WithDefault by lazy {
    as_1234717948()
  }


  public override val __1234717948_Ptr: JNAPointer? by lazy {
    __1234717948_Interface.__1234717948_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1234717948_Interface)

  public constructor(state: StorageProviderState, message: String) : this(ABI.activate(state,
      message))

  public constructor(
    state: StorageProviderState,
    message: String,
    errorMessages: IIterable<StorageProviderError?>
  ) : this(ABI.activate(state, message, errorMessages))

  private fun as_1234717948(): IStorageProviderStatus.WithDefault {
    if(pointer == NULL) {
      return(IStorageProviderStatus.ABI.makeIStorageProviderStatus(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageProviderStatus>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageProviderStatus.ABI.makeIStorageProviderStatus(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageProviderStatus> {
    public override fun getValue() = StorageProviderStatus(pointer.getPointer(0))

    public fun setValue(value: StorageProviderStatus): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageProviderStatus, MemoryAddress> {
    public val IStorageProviderStatusFactory_Instance: IStorageProviderStatusFactory by lazy {
      createIStorageProviderStatusFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStorageProviderStatusFactory(): IStorageProviderStatusFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Provider.StorageProviderStatus".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IStorageProviderStatusFactory.ABI.makeIStorageProviderStatusFactory(factoryActivatorPtr.value))
    }

    public fun activate(state: StorageProviderState, message: String): JNAPointer? =
        IStorageProviderStatusFactory_Instance.CreateInstance(state, message)?.pointer

    public fun activate(
      state: StorageProviderState,
      message: String,
      errorMessages: IIterable<StorageProviderError?>
    ): JNAPointer? = IStorageProviderStatusFactory_Instance.CreateInstance2(state, message,
        errorMessages)?.pointer

    public override fun fromNative(segment: MemoryAddress): StorageProviderStatus {
      val address = segment.toRawLongValue()
      return StorageProviderStatus(Pointer(address))
    }

    public override fun toNative(obj: StorageProviderStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
