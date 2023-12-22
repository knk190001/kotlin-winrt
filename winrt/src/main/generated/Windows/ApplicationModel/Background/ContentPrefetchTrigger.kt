package Windows.ApplicationModel.Background

import Windows.Foundation.TimeSpan
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ContentPrefetchTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.ContentPrefetchTrigger;{710627ee-04fa-440b-80c0-173202199e5d})")
@WinRTByReference(brClass = ContentPrefetchTrigger.ByReference::class)
public class ContentPrefetchTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentPrefetchTrigger.WithDefault, IBackgroundTrigger.WithDefault,
    IWinRTObject {
  private val __1792853305_Interface: IContentPrefetchTrigger.WithDefault by lazy {
    as_1792853305()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __1792853305_Ptr: JNAPointer? by lazy {
    __1792853305_Interface.__1792853305_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1792853305_Interface, __54213927_Interface)

  public constructor() : this(ABI.activate())

  public constructor(waitInterval: TimeSpan) : this(ABI.activate(waitInterval))

  private fun as_1792853305(): IContentPrefetchTrigger.WithDefault {
    if(pointer == NULL) {
      return(IContentPrefetchTrigger.ABI.makeIContentPrefetchTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentPrefetchTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentPrefetchTrigger.ABI.makeIContentPrefetchTrigger(ref.value))
  }

  private fun as_54213927(): IBackgroundTrigger.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentPrefetchTrigger> {
    public override fun getValue() = ContentPrefetchTrigger(pointer.getPointer(0))

    public fun setValue(value: ContentPrefetchTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentPrefetchTrigger, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IContentPrefetchTriggerFactory_Instance: IContentPrefetchTriggerFactory by lazy {
      createIContentPrefetchTriggerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.ContentPrefetchTrigger".toHandle(),
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

    public fun createIContentPrefetchTriggerFactory(): IContentPrefetchTriggerFactory {
      val refiid = Guid.REFIID(IContentPrefetchTriggerFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.ContentPrefetchTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IContentPrefetchTriggerFactory.ABI.makeIContentPrefetchTriggerFactory(factoryActivatorPtr.value))
    }

    public fun activate(waitInterval: TimeSpan): JNAPointer? =
        IContentPrefetchTriggerFactory_Instance.Create(waitInterval)?.pointer

    public override fun fromNative(segment: MemoryAddress): ContentPrefetchTrigger {
      val address = segment.toRawLongValue()
      return ContentPrefetchTrigger(Pointer(address))
    }

    public override fun toNative(obj: ContentPrefetchTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
