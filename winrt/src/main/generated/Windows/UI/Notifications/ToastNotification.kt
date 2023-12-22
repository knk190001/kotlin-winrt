package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.UI.Notifications.IToastNotificationFactory.ABI.IID
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

@ABIMarker(ToastNotification.ABI::class)
@Signature("rc(Windows.UI.Notifications.ToastNotification;{997e2675-059e-4e60-8b06-1760917c8b80})")
@WinRTByReference(brClass = ToastNotification.ByReference::class)
public class ToastNotification(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IToastNotification.WithDefault, IToastNotification2.WithDefault,
    IToastNotification3.WithDefault, IToastNotification4.WithDefault,
    IToastNotification6.WithDefault, IWinRTObject {
  private val __1936149058_Interface: IToastNotification.WithDefault by lazy {
    as_1936149058()
  }


  private val __108921296_Interface: IToastNotification2.WithDefault by lazy {
    as_108921296()
  }


  private val __108921295_Interface: IToastNotification3.WithDefault by lazy {
    as_108921295()
  }


  private val __108921294_Interface: IToastNotification4.WithDefault by lazy {
    as_108921294()
  }


  private val __108921292_Interface: IToastNotification6.WithDefault by lazy {
    as_108921292()
  }


  public override val __1936149058_Ptr: JNAPointer? by lazy {
    __1936149058_Interface.__1936149058_Ptr
  }


  public override val __108921296_Ptr: JNAPointer? by lazy {
    __108921296_Interface.__108921296_Ptr
  }


  public override val __108921295_Ptr: JNAPointer? by lazy {
    __108921295_Interface.__108921295_Ptr
  }


  public override val __108921294_Ptr: JNAPointer? by lazy {
    __108921294_Interface.__108921294_Ptr
  }


  public override val __108921292_Ptr: JNAPointer? by lazy {
    __108921292_Interface.__108921292_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1936149058_Interface, __108921296_Interface, __108921295_Interface,
        __108921294_Interface, __108921292_Interface)

  public constructor(content: XmlDocument) : this(ABI.activate(content))

  private fun as_1936149058(): IToastNotification.WithDefault {
    if(pointer == NULL) {
      return(IToastNotification.ABI.makeIToastNotification(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastNotification>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotification.ABI.makeIToastNotification(ref.value))
  }

  private fun as_108921296(): IToastNotification2.WithDefault {
    if(pointer == NULL) {
      return(IToastNotification2.ABI.makeIToastNotification2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastNotification2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotification2.ABI.makeIToastNotification2(ref.value))
  }

  private fun as_108921295(): IToastNotification3.WithDefault {
    if(pointer == NULL) {
      return(IToastNotification3.ABI.makeIToastNotification3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastNotification3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotification3.ABI.makeIToastNotification3(ref.value))
  }

  private fun as_108921294(): IToastNotification4.WithDefault {
    if(pointer == NULL) {
      return(IToastNotification4.ABI.makeIToastNotification4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastNotification4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotification4.ABI.makeIToastNotification4(ref.value))
  }

  private fun as_108921292(): IToastNotification6.WithDefault {
    if(pointer == NULL) {
      return(IToastNotification6.ABI.makeIToastNotification6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastNotification6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotification6.ABI.makeIToastNotification6(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToastNotification> {
    public override fun getValue() = ToastNotification(pointer.getPointer(0))

    public fun setValue(value: ToastNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToastNotification, MemoryAddress> {
    public val IToastNotificationFactory_Instance: IToastNotificationFactory by lazy {
      createIToastNotificationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIToastNotificationFactory(): IToastNotificationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.ToastNotification".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IToastNotificationFactory.ABI.makeIToastNotificationFactory(factoryActivatorPtr.value))
    }

    public fun activate(content: XmlDocument): JNAPointer? =
        IToastNotificationFactory_Instance.CreateToastNotification(content)?.pointer

    public override fun fromNative(segment: MemoryAddress): ToastNotification {
      val address = segment.toRawLongValue()
      return ToastNotification(Pointer(address))
    }

    public override fun toNative(obj: ToastNotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
