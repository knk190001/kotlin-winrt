package Windows.UI.Notifications

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

@ABIMarker(AdaptiveNotificationText.ABI::class)
@Signature("rc(Windows.UI.Notifications.AdaptiveNotificationText;{46d4a3be-609a-4326-a40b-bfde872034a3})")
@WinRTByReference(brClass = AdaptiveNotificationText.ByReference::class)
public class AdaptiveNotificationText(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdaptiveNotificationText.WithDefault,
    IAdaptiveNotificationContent.WithDefault, IWinRTObject {
  private val __517503042_Interface: IAdaptiveNotificationText.WithDefault by lazy {
    as_517503042()
  }


  private val __73964616_Interface: IAdaptiveNotificationContent.WithDefault by lazy {
    as_73964616()
  }


  public override val __517503042_Ptr: JNAPointer? by lazy {
    __517503042_Interface.__517503042_Ptr
  }


  public override val __73964616_Ptr: JNAPointer? by lazy {
    __73964616_Interface.__73964616_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__517503042_Interface, __73964616_Interface)

  public constructor() : this(ABI.activate())

  private fun as_517503042(): IAdaptiveNotificationText.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveNotificationText.ABI.makeIAdaptiveNotificationText(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveNotificationText>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveNotificationText.ABI.makeIAdaptiveNotificationText(ref.value))
  }

  private fun as_73964616(): IAdaptiveNotificationContent.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveNotificationContent.ABI.makeIAdaptiveNotificationContent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveNotificationContent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveNotificationContent.ABI.makeIAdaptiveNotificationContent(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdaptiveNotificationText> {
    public override fun getValue() = AdaptiveNotificationText(pointer.getPointer(0))

    public fun setValue(value: AdaptiveNotificationText): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdaptiveNotificationText, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.AdaptiveNotificationText".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): AdaptiveNotificationText {
      val address = segment.toRawLongValue()
      return AdaptiveNotificationText(Pointer(address))
    }

    public override fun toNative(obj: AdaptiveNotificationText): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
