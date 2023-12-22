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

@ABIMarker(StorageProviderSyncRootInfo.ABI::class)
@Signature("rc(Windows.Storage.Provider.StorageProviderSyncRootInfo;{7c1305c4-99f9-41ac-8904-ab055d654926})")
@WinRTByReference(brClass = StorageProviderSyncRootInfo.ByReference::class)
public class StorageProviderSyncRootInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageProviderSyncRootInfo.WithDefault,
    IStorageProviderSyncRootInfo2.WithDefault, IStorageProviderSyncRootInfo3.WithDefault,
    IWinRTObject {
  private val __274897405_Interface: IStorageProviderSyncRootInfo.WithDefault by lazy {
    as_274897405()
  }


  private val __68114987_Interface: IStorageProviderSyncRootInfo2.WithDefault by lazy {
    as_68114987()
  }


  private val __68114986_Interface: IStorageProviderSyncRootInfo3.WithDefault by lazy {
    as_68114986()
  }


  public override val __274897405_Ptr: JNAPointer? by lazy {
    __274897405_Interface.__274897405_Ptr
  }


  public override val __68114987_Ptr: JNAPointer? by lazy {
    __68114987_Interface.__68114987_Ptr
  }


  public override val __68114986_Ptr: JNAPointer? by lazy {
    __68114986_Interface.__68114986_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__274897405_Interface, __68114987_Interface, __68114986_Interface)

  public constructor() : this(ABI.activate())

  private fun as_274897405(): IStorageProviderSyncRootInfo.WithDefault {
    if(pointer == NULL) {
      return(IStorageProviderSyncRootInfo.ABI.makeIStorageProviderSyncRootInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageProviderSyncRootInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageProviderSyncRootInfo.ABI.makeIStorageProviderSyncRootInfo(ref.value))
  }

  private fun as_68114987(): IStorageProviderSyncRootInfo2.WithDefault {
    if(pointer == NULL) {
      return(IStorageProviderSyncRootInfo2.ABI.makeIStorageProviderSyncRootInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageProviderSyncRootInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageProviderSyncRootInfo2.ABI.makeIStorageProviderSyncRootInfo2(ref.value))
  }

  private fun as_68114986(): IStorageProviderSyncRootInfo3.WithDefault {
    if(pointer == NULL) {
      return(IStorageProviderSyncRootInfo3.ABI.makeIStorageProviderSyncRootInfo3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageProviderSyncRootInfo3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageProviderSyncRootInfo3.ABI.makeIStorageProviderSyncRootInfo3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageProviderSyncRootInfo> {
    public override fun getValue() = StorageProviderSyncRootInfo(pointer.getPointer(0))

    public fun setValue(value: StorageProviderSyncRootInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageProviderSyncRootInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Provider.StorageProviderSyncRootInfo".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): StorageProviderSyncRootInfo {
      val address = segment.toRawLongValue()
      return StorageProviderSyncRootInfo(Pointer(address))
    }

    public override fun toNative(obj: StorageProviderSyncRootInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
