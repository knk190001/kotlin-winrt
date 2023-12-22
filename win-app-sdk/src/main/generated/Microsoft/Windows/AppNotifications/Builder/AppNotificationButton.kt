package Microsoft.Windows.AppNotifications.Builder

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

@ABIMarker(AppNotificationButton.ABI::class)
@Signature("rc(Microsoft.Windows.AppNotifications.Builder.AppNotificationButton;{a7c03031-5634-5098-aec9-47ecb60c3499})")
@WinRTByReference(brClass = AppNotificationButton.ByReference::class)
public class AppNotificationButton(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppNotificationButton.WithDefault, IWinRTObject {
  private val __1201055028_Interface: IAppNotificationButton.WithDefault by lazy {
    as_1201055028()
  }


  public override val __1201055028_Ptr: JNAPointer? by lazy {
    __1201055028_Interface.__1201055028_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1201055028_Interface)

  public constructor() : this(ABI.activate())

  public constructor(content: String) : this(ABI.activate(content))

  private fun as_1201055028(): IAppNotificationButton.WithDefault {
    if(pointer == NULL) {
      return(IAppNotificationButton.ABI.makeIAppNotificationButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppNotificationButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppNotificationButton.ABI.makeIAppNotificationButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppNotificationButton> {
    public override fun getValue() = AppNotificationButton(pointer.getPointer(0))

    public fun setValue(value: AppNotificationButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppNotificationButton, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IAppNotificationButtonStatics_Instance: IAppNotificationButtonStatics by lazy {
      createIAppNotificationButtonStatics()
    }


    public val IAppNotificationButtonFactory_Instance: IAppNotificationButtonFactory by lazy {
      createIAppNotificationButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.AppNotifications.Builder.AppNotificationButton".toHandle(),
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

    public fun createIAppNotificationButtonStatics(): IAppNotificationButtonStatics {
      val refiid = Guid.REFIID(IAppNotificationButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.AppNotifications.Builder.AppNotificationButton".toHandle(),refiid,interfacePtr)
      val result =
          IAppNotificationButtonStatics.ABI.makeIAppNotificationButtonStatics(interfacePtr.value)
      return result
    }

    public fun createIAppNotificationButtonFactory(): IAppNotificationButtonFactory {
      val refiid = Guid.REFIID(IAppNotificationButtonFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.AppNotifications.Builder.AppNotificationButton".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAppNotificationButtonFactory.ABI.makeIAppNotificationButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(content: String): JNAPointer? =
        IAppNotificationButtonFactory_Instance.CreateInstance(content)?.pointer

    public override fun fromNative(segment: MemoryAddress): AppNotificationButton {
      val address = segment.toRawLongValue()
      return AppNotificationButton(Pointer(address))
    }

    public override fun toNative(obj: AppNotificationButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsToolTipSupported() =
        ABI.IAppNotificationButtonStatics_Instance.IsToolTipSupported()

    public fun IsButtonStyleSupported() =
        ABI.IAppNotificationButtonStatics_Instance.IsButtonStyleSupported()
  }
}
