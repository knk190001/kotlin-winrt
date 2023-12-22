package Windows.Networking.BackgroundTransfer

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(BackgroundDownloader.ABI::class)
@Signature("rc(Windows.Networking.BackgroundTransfer.BackgroundDownloader;{c1c79333-6649-4b1d-a826-a4b3dd234d0b})")
@WinRTByReference(brClass = BackgroundDownloader.ByReference::class)
public class BackgroundDownloader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundDownloader.WithDefault, IBackgroundTransferBase.WithDefault,
    IBackgroundDownloader2.WithDefault, IBackgroundDownloader3.WithDefault, IWinRTObject {
  private val __32912324_Interface: IBackgroundDownloader.WithDefault by lazy {
    as_32912324()
  }


  private val __1689666005_Interface: IBackgroundTransferBase.WithDefault by lazy {
    as_1689666005()
  }


  private val __1020282094_Interface: IBackgroundDownloader2.WithDefault by lazy {
    as_1020282094()
  }


  private val __1020282095_Interface: IBackgroundDownloader3.WithDefault by lazy {
    as_1020282095()
  }


  public override val __32912324_Ptr: JNAPointer? by lazy {
    __32912324_Interface.__32912324_Ptr
  }


  public override val __1689666005_Ptr: JNAPointer? by lazy {
    __1689666005_Interface.__1689666005_Ptr
  }


  public override val __1020282094_Ptr: JNAPointer? by lazy {
    __1020282094_Interface.__1020282094_Ptr
  }


  public override val __1020282095_Ptr: JNAPointer? by lazy {
    __1020282095_Interface.__1020282095_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__32912324_Interface, __1689666005_Interface, __1020282094_Interface,
        __1020282095_Interface)

  public constructor() : this(ABI.activate())

  public constructor(completionGroup: BackgroundTransferCompletionGroup) :
      this(ABI.activate(completionGroup))

  private fun as_32912324(): IBackgroundDownloader.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundDownloader.ABI.makeIBackgroundDownloader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundDownloader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundDownloader.ABI.makeIBackgroundDownloader(ref.value))
  }

  private fun as_1689666005(): IBackgroundTransferBase.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTransferBase.ABI.makeIBackgroundTransferBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTransferBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTransferBase.ABI.makeIBackgroundTransferBase(ref.value))
  }

  private fun as_1020282094(): IBackgroundDownloader2.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundDownloader2.ABI.makeIBackgroundDownloader2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundDownloader2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundDownloader2.ABI.makeIBackgroundDownloader2(ref.value))
  }

  private fun as_1020282095(): IBackgroundDownloader3.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundDownloader3.ABI.makeIBackgroundDownloader3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundDownloader3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundDownloader3.ABI.makeIBackgroundDownloader3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundDownloader> {
    public override fun getValue() = BackgroundDownloader(pointer.getPointer(0))

    public fun setValue(value: BackgroundDownloader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundDownloader, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IBackgroundDownloaderUserConsent_Instance: IBackgroundDownloaderUserConsent by lazy {
      createIBackgroundDownloaderUserConsent()
    }


    public val IBackgroundDownloaderStaticMethods_Instance: IBackgroundDownloaderStaticMethods by
        lazy {
      createIBackgroundDownloaderStaticMethods()
    }


    public val IBackgroundDownloaderStaticMethods2_Instance: IBackgroundDownloaderStaticMethods2 by
        lazy {
      createIBackgroundDownloaderStaticMethods2()
    }


    public val IBackgroundDownloaderFactory_Instance: IBackgroundDownloaderFactory by lazy {
      createIBackgroundDownloaderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.BackgroundTransfer.BackgroundDownloader".toHandle(),
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

    public fun createIBackgroundDownloaderUserConsent(): IBackgroundDownloaderUserConsent {
      val refiid = Guid.REFIID(IBackgroundDownloaderUserConsent.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.BackgroundTransfer.BackgroundDownloader".toHandle(),refiid,interfacePtr)
      val result =
          IBackgroundDownloaderUserConsent.ABI.makeIBackgroundDownloaderUserConsent(interfacePtr.value)
      return result
    }

    public fun createIBackgroundDownloaderStaticMethods(): IBackgroundDownloaderStaticMethods {
      val refiid = Guid.REFIID(IBackgroundDownloaderStaticMethods.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.BackgroundTransfer.BackgroundDownloader".toHandle(),refiid,interfacePtr)
      val result =
          IBackgroundDownloaderStaticMethods.ABI.makeIBackgroundDownloaderStaticMethods(interfacePtr.value)
      return result
    }

    public fun createIBackgroundDownloaderStaticMethods2(): IBackgroundDownloaderStaticMethods2 {
      val refiid = Guid.REFIID(IBackgroundDownloaderStaticMethods2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.BackgroundTransfer.BackgroundDownloader".toHandle(),refiid,interfacePtr)
      val result =
          IBackgroundDownloaderStaticMethods2.ABI.makeIBackgroundDownloaderStaticMethods2(interfacePtr.value)
      return result
    }

    public fun createIBackgroundDownloaderFactory(): IBackgroundDownloaderFactory {
      val refiid = Guid.REFIID(IBackgroundDownloaderFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.BackgroundTransfer.BackgroundDownloader".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBackgroundDownloaderFactory.ABI.makeIBackgroundDownloaderFactory(factoryActivatorPtr.value))
    }

    public fun activate(completionGroup: BackgroundTransferCompletionGroup): JNAPointer? =
        IBackgroundDownloaderFactory_Instance.CreateWithCompletionGroup(completionGroup)?.pointer

    public override fun fromNative(segment: MemoryAddress): BackgroundDownloader {
      val address = segment.toRawLongValue()
      return BackgroundDownloader(Pointer(address))
    }

    public override fun toNative(obj: BackgroundDownloader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RequestUnconstrainedDownloadsAsync(operations: IIterable<DownloadOperation?>) =
        ABI.IBackgroundDownloaderUserConsent_Instance.RequestUnconstrainedDownloadsAsync(operations)

    public fun GetCurrentDownloadsAsync() =
        ABI.IBackgroundDownloaderStaticMethods_Instance.GetCurrentDownloadsAsync()

    public fun GetCurrentDownloadsAsync(group: String) =
        ABI.IBackgroundDownloaderStaticMethods_Instance.GetCurrentDownloadsAsync(group)

    public fun GetCurrentDownloadsForTransferGroupAsync(group: BackgroundTransferGroup) =
        ABI.IBackgroundDownloaderStaticMethods2_Instance.GetCurrentDownloadsForTransferGroupAsync(group)
  }
}
