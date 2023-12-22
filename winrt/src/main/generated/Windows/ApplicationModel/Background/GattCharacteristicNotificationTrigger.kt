package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IGattCharacteristicNotificationTriggerFactory.ABI.IID
import Windows.Devices.Bluetooth.Background.BluetoothEventTriggeringMode
import Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GattCharacteristicNotificationTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.GattCharacteristicNotificationTrigger;{e25f8fc8-0696-474f-a732-f292b0cebc5d})")
@WinRTByReference(brClass = GattCharacteristicNotificationTrigger.ByReference::class)
public class GattCharacteristicNotificationTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattCharacteristicNotificationTrigger.WithDefault,
    IBackgroundTrigger.WithDefault, IGattCharacteristicNotificationTrigger2.WithDefault,
    IWinRTObject {
  private val __707103655_Interface: IGattCharacteristicNotificationTrigger.WithDefault by lazy {
    as_707103655()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  private val __445376875_Interface: IGattCharacteristicNotificationTrigger2.WithDefault by lazy {
    as_445376875()
  }


  public override val __707103655_Ptr: JNAPointer? by lazy {
    __707103655_Interface.__707103655_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val __445376875_Ptr: JNAPointer? by lazy {
    __445376875_Interface.__445376875_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__707103655_Interface, __54213927_Interface, __445376875_Interface)

  public constructor(characteristic: GattCharacteristic) : this(ABI.activate(characteristic))

  public constructor(characteristic: GattCharacteristic,
      eventTriggeringMode: BluetoothEventTriggeringMode) : this(ABI.activate(characteristic,
      eventTriggeringMode))

  private fun as_707103655(): IGattCharacteristicNotificationTrigger.WithDefault {
    if(pointer == NULL) {
      return(IGattCharacteristicNotificationTrigger.ABI.makeIGattCharacteristicNotificationTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattCharacteristicNotificationTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattCharacteristicNotificationTrigger.ABI.makeIGattCharacteristicNotificationTrigger(ref.value))
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

  private fun as_445376875(): IGattCharacteristicNotificationTrigger2.WithDefault {
    if(pointer == NULL) {
      return(IGattCharacteristicNotificationTrigger2.ABI.makeIGattCharacteristicNotificationTrigger2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattCharacteristicNotificationTrigger2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattCharacteristicNotificationTrigger2.ABI.makeIGattCharacteristicNotificationTrigger2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattCharacteristicNotificationTrigger> {
    public override fun getValue() = GattCharacteristicNotificationTrigger(pointer.getPointer(0))

    public fun setValue(value: GattCharacteristicNotificationTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattCharacteristicNotificationTrigger, MemoryAddress> {
    public val IGattCharacteristicNotificationTriggerFactory_Instance:
        IGattCharacteristicNotificationTriggerFactory by lazy {
      createIGattCharacteristicNotificationTriggerFactory()
    }


    public val IGattCharacteristicNotificationTriggerFactory2_Instance:
        IGattCharacteristicNotificationTriggerFactory2 by lazy {
      createIGattCharacteristicNotificationTriggerFactory2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGattCharacteristicNotificationTriggerFactory():
        IGattCharacteristicNotificationTriggerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.GattCharacteristicNotificationTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGattCharacteristicNotificationTriggerFactory.ABI.makeIGattCharacteristicNotificationTriggerFactory(factoryActivatorPtr.value))
    }

    public fun createIGattCharacteristicNotificationTriggerFactory2():
        IGattCharacteristicNotificationTriggerFactory2 {
      val refiid = Guid.REFIID(IGattCharacteristicNotificationTriggerFactory2.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.GattCharacteristicNotificationTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGattCharacteristicNotificationTriggerFactory2.ABI.makeIGattCharacteristicNotificationTriggerFactory2(factoryActivatorPtr.value))
    }

    public fun activate(characteristic: GattCharacteristic): JNAPointer? =
        IGattCharacteristicNotificationTriggerFactory_Instance.Create(characteristic)?.pointer

    public fun activate(characteristic: GattCharacteristic,
        eventTriggeringMode: BluetoothEventTriggeringMode): JNAPointer? =
        IGattCharacteristicNotificationTriggerFactory2_Instance.Create(characteristic,
        eventTriggeringMode)?.pointer

    public override fun fromNative(segment: MemoryAddress): GattCharacteristicNotificationTrigger {
      val address = segment.toRawLongValue()
      return GattCharacteristicNotificationTrigger(Pointer(address))
    }

    public override fun toNative(obj: GattCharacteristicNotificationTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
