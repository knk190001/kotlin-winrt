package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IDeviceManufacturerNotificationTriggerFactory.ABI.IID
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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DeviceManufacturerNotificationTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.DeviceManufacturerNotificationTrigger;{81278ab5-41ab-16da-86c2-7f7bf0912f5b})")
@WinRTByReference(brClass = DeviceManufacturerNotificationTrigger.ByReference::class)
public class DeviceManufacturerNotificationTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceManufacturerNotificationTrigger.WithDefault,
    IBackgroundTrigger.WithDefault, IWinRTObject {
  private val __1020770869_Interface: IDeviceManufacturerNotificationTrigger.WithDefault by lazy {
    as_1020770869()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __1020770869_Ptr: JNAPointer? by lazy {
    __1020770869_Interface.__1020770869_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1020770869_Interface, __54213927_Interface)

  public constructor(triggerQualifier: String, oneShot: Boolean) :
      this(ABI.activate(triggerQualifier, oneShot))

  private fun as_1020770869(): IDeviceManufacturerNotificationTrigger.WithDefault {
    if(pointer == NULL) {
      return(IDeviceManufacturerNotificationTrigger.ABI.makeIDeviceManufacturerNotificationTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceManufacturerNotificationTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceManufacturerNotificationTrigger.ABI.makeIDeviceManufacturerNotificationTrigger(ref.value))
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
      IByReference<DeviceManufacturerNotificationTrigger> {
    public override fun getValue() = DeviceManufacturerNotificationTrigger(pointer.getPointer(0))

    public fun setValue(value: DeviceManufacturerNotificationTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceManufacturerNotificationTrigger, MemoryAddress> {
    public val IDeviceManufacturerNotificationTriggerFactory_Instance:
        IDeviceManufacturerNotificationTriggerFactory by lazy {
      createIDeviceManufacturerNotificationTriggerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDeviceManufacturerNotificationTriggerFactory():
        IDeviceManufacturerNotificationTriggerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.DeviceManufacturerNotificationTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDeviceManufacturerNotificationTriggerFactory.ABI.makeIDeviceManufacturerNotificationTriggerFactory(factoryActivatorPtr.value))
    }

    public fun activate(triggerQualifier: String, oneShot: Boolean): JNAPointer? =
        IDeviceManufacturerNotificationTriggerFactory_Instance.Create(triggerQualifier,
        oneShot)?.pointer

    public override fun fromNative(segment: MemoryAddress): DeviceManufacturerNotificationTrigger {
      val address = segment.toRawLongValue()
      return DeviceManufacturerNotificationTrigger(Pointer(address))
    }

    public override fun toNative(obj: DeviceManufacturerNotificationTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
