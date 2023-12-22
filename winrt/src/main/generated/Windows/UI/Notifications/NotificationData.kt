package Windows.UI.Notifications

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(NotificationData.ABI::class)
@Signature("rc(Windows.UI.Notifications.NotificationData;{9ffd2312-9d6a-4aaf-b6ac-ff17f0c1f280})")
@WinRTByReference(brClass = NotificationData.ByReference::class)
public class NotificationData(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INotificationData.WithDefault, IWinRTObject {
  private val __1252576347_Interface: INotificationData.WithDefault by lazy {
    as_1252576347()
  }


  public override val __1252576347_Ptr: JNAPointer? by lazy {
    __1252576347_Interface.__1252576347_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1252576347_Interface)

  public constructor() : this(ABI.activate())

  public constructor(initialValues: IIterable<IKeyValuePair<String?, String?>?>,
      sequenceNumber: WinDef.UINT) : this(ABI.activate(initialValues, sequenceNumber))

  public constructor(initialValues: IIterable<IKeyValuePair<String?, String?>?>) :
      this(ABI.activate(initialValues))

  private fun as_1252576347(): INotificationData.WithDefault {
    if(pointer == NULL) {
      return(INotificationData.ABI.makeINotificationData(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INotificationData>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INotificationData.ABI.makeINotificationData(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NotificationData> {
    public override fun getValue() = NotificationData(pointer.getPointer(0))

    public fun setValue(value: NotificationData): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NotificationData, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val INotificationDataFactory_Instance: INotificationDataFactory by lazy {
      createINotificationDataFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.NotificationData".toHandle(),
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

    public fun createINotificationDataFactory(): INotificationDataFactory {
      val refiid = Guid.REFIID(INotificationDataFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.NotificationData".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INotificationDataFactory.ABI.makeINotificationDataFactory(factoryActivatorPtr.value))
    }

    public fun activate(initialValues: IIterable<IKeyValuePair<String?, String?>?>,
        sequenceNumber: WinDef.UINT): JNAPointer? =
        INotificationDataFactory_Instance.CreateNotificationData(initialValues,
        sequenceNumber)?.pointer

    public fun activate(initialValues: IIterable<IKeyValuePair<String?, String?>?>): JNAPointer? =
        INotificationDataFactory_Instance.CreateNotificationData(initialValues)?.pointer

    public override fun fromNative(segment: MemoryAddress): NotificationData {
      val address = segment.toRawLongValue()
      return NotificationData(Pointer(address))
    }

    public override fun toNative(obj: NotificationData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
