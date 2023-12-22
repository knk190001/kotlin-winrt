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

@ABIMarker(BackgroundUploader.ABI::class)
@Signature("rc(Windows.Networking.BackgroundTransfer.BackgroundUploader;{c595c9ae-cead-465b-8801-c55ac90a01ce})")
@WinRTByReference(brClass = BackgroundUploader.ByReference::class)
public class BackgroundUploader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundUploader.WithDefault, IBackgroundTransferBase.WithDefault,
    IBackgroundUploader2.WithDefault, IBackgroundUploader3.WithDefault, IWinRTObject {
  private val __355412291_Interface: IBackgroundUploader.WithDefault by lazy {
    as_355412291()
  }


  private val __1689666005_Interface: IBackgroundTransferBase.WithDefault by lazy {
    as_1689666005()
  }


  private val __1867120917_Interface: IBackgroundUploader2.WithDefault by lazy {
    as_1867120917()
  }


  private val __1867120918_Interface: IBackgroundUploader3.WithDefault by lazy {
    as_1867120918()
  }


  public override val __355412291_Ptr: JNAPointer? by lazy {
    __355412291_Interface.__355412291_Ptr
  }


  public override val __1689666005_Ptr: JNAPointer? by lazy {
    __1689666005_Interface.__1689666005_Ptr
  }


  public override val __1867120917_Ptr: JNAPointer? by lazy {
    __1867120917_Interface.__1867120917_Ptr
  }


  public override val __1867120918_Ptr: JNAPointer? by lazy {
    __1867120918_Interface.__1867120918_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__355412291_Interface, __1689666005_Interface, __1867120917_Interface,
        __1867120918_Interface)

  public constructor() : this(ABI.activate())

  public constructor(completionGroup: BackgroundTransferCompletionGroup) :
      this(ABI.activate(completionGroup))

  private fun as_355412291(): IBackgroundUploader.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundUploader.ABI.makeIBackgroundUploader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundUploader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundUploader.ABI.makeIBackgroundUploader(ref.value))
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

  private fun as_1867120917(): IBackgroundUploader2.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundUploader2.ABI.makeIBackgroundUploader2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundUploader2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundUploader2.ABI.makeIBackgroundUploader2(ref.value))
  }

  private fun as_1867120918(): IBackgroundUploader3.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundUploader3.ABI.makeIBackgroundUploader3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundUploader3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundUploader3.ABI.makeIBackgroundUploader3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundUploader> {
    public override fun getValue() = BackgroundUploader(pointer.getPointer(0))

    public fun setValue(value: BackgroundUploader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundUploader, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IBackgroundUploaderStaticMethods_Instance: IBackgroundUploaderStaticMethods by lazy {
      createIBackgroundUploaderStaticMethods()
    }


    public val IBackgroundUploaderStaticMethods2_Instance: IBackgroundUploaderStaticMethods2 by
        lazy {
      createIBackgroundUploaderStaticMethods2()
    }


    public val IBackgroundUploaderUserConsent_Instance: IBackgroundUploaderUserConsent by lazy {
      createIBackgroundUploaderUserConsent()
    }


    public val IBackgroundUploaderFactory_Instance: IBackgroundUploaderFactory by lazy {
      createIBackgroundUploaderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.BackgroundTransfer.BackgroundUploader".toHandle(),
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

    public fun createIBackgroundUploaderStaticMethods(): IBackgroundUploaderStaticMethods {
      val refiid = Guid.REFIID(IBackgroundUploaderStaticMethods.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.BackgroundTransfer.BackgroundUploader".toHandle(),refiid,interfacePtr)
      val result =
          IBackgroundUploaderStaticMethods.ABI.makeIBackgroundUploaderStaticMethods(interfacePtr.value)
      return result
    }

    public fun createIBackgroundUploaderStaticMethods2(): IBackgroundUploaderStaticMethods2 {
      val refiid = Guid.REFIID(IBackgroundUploaderStaticMethods2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.BackgroundTransfer.BackgroundUploader".toHandle(),refiid,interfacePtr)
      val result =
          IBackgroundUploaderStaticMethods2.ABI.makeIBackgroundUploaderStaticMethods2(interfacePtr.value)
      return result
    }

    public fun createIBackgroundUploaderUserConsent(): IBackgroundUploaderUserConsent {
      val refiid = Guid.REFIID(IBackgroundUploaderUserConsent.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.BackgroundTransfer.BackgroundUploader".toHandle(),refiid,interfacePtr)
      val result =
          IBackgroundUploaderUserConsent.ABI.makeIBackgroundUploaderUserConsent(interfacePtr.value)
      return result
    }

    public fun createIBackgroundUploaderFactory(): IBackgroundUploaderFactory {
      val refiid = Guid.REFIID(IBackgroundUploaderFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.BackgroundTransfer.BackgroundUploader".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBackgroundUploaderFactory.ABI.makeIBackgroundUploaderFactory(factoryActivatorPtr.value))
    }

    public fun activate(completionGroup: BackgroundTransferCompletionGroup): JNAPointer? =
        IBackgroundUploaderFactory_Instance.CreateWithCompletionGroup(completionGroup)?.pointer

    public override fun fromNative(segment: MemoryAddress): BackgroundUploader {
      val address = segment.toRawLongValue()
      return BackgroundUploader(Pointer(address))
    }

    public override fun toNative(obj: BackgroundUploader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetCurrentUploadsAsync() =
        ABI.IBackgroundUploaderStaticMethods_Instance.GetCurrentUploadsAsync()

    public fun GetCurrentUploadsAsync(group: String) =
        ABI.IBackgroundUploaderStaticMethods_Instance.GetCurrentUploadsAsync(group)

    public fun GetCurrentUploadsForTransferGroupAsync(group: BackgroundTransferGroup) =
        ABI.IBackgroundUploaderStaticMethods2_Instance.GetCurrentUploadsForTransferGroupAsync(group)

    public fun RequestUnconstrainedUploadsAsync(operations: IIterable<UploadOperation?>) =
        ABI.IBackgroundUploaderUserConsent_Instance.RequestUnconstrainedUploadsAsync(operations)
  }
}
