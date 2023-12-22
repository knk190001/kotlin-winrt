package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IAppBroadcastTriggerFactory.ABI.IID
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

@ABIMarker(AppBroadcastTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.AppBroadcastTrigger;{84b3a058-6027-4b87-9790-bdf3f757dbd7})")
@WinRTByReference(brClass = AppBroadcastTrigger.ByReference::class)
public class AppBroadcastTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundTrigger.WithDefault, IAppBroadcastTrigger.WithDefault, IWinRTObject
    {
  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  private val __1946034279_Interface: IAppBroadcastTrigger.WithDefault by lazy {
    as_1946034279()
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val __1946034279_Ptr: JNAPointer? by lazy {
    __1946034279_Interface.__1946034279_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__54213927_Interface, __1946034279_Interface)

  public constructor(providerKey: String) : this(ABI.activate(providerKey))

  private fun as_54213927(): IBackgroundTrigger.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(ref.value))
  }

  private fun as_1946034279(): IAppBroadcastTrigger.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastTrigger.ABI.makeIAppBroadcastTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastTrigger.ABI.makeIAppBroadcastTrigger(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastTrigger> {
    public override fun getValue() = AppBroadcastTrigger(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastTrigger, MemoryAddress> {
    public val IAppBroadcastTriggerFactory_Instance: IAppBroadcastTriggerFactory by lazy {
      createIAppBroadcastTriggerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppBroadcastTriggerFactory(): IAppBroadcastTriggerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.AppBroadcastTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAppBroadcastTriggerFactory.ABI.makeIAppBroadcastTriggerFactory(factoryActivatorPtr.value))
    }

    public fun activate(providerKey: String): JNAPointer? =
        IAppBroadcastTriggerFactory_Instance.CreateAppBroadcastTrigger(providerKey)?.pointer

    public override fun fromNative(segment: MemoryAddress): AppBroadcastTrigger {
      val address = segment.toRawLongValue()
      return AppBroadcastTrigger(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
