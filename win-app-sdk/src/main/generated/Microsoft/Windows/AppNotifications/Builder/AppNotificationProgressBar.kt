package Microsoft.Windows.AppNotifications.Builder

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

@ABIMarker(AppNotificationProgressBar.ABI::class)
@Signature("rc(Microsoft.Windows.AppNotifications.Builder.AppNotificationProgressBar;{fced62f2-2074-5641-8630-87a14315ac86})")
@WinRTByReference(brClass = AppNotificationProgressBar.ByReference::class)
public class AppNotificationProgressBar(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppNotificationProgressBar.WithDefault, IWinRTObject {
  private val __1606063644_Interface: IAppNotificationProgressBar.WithDefault by lazy {
    as_1606063644()
  }


  public override val __1606063644_Ptr: JNAPointer? by lazy {
    __1606063644_Interface.__1606063644_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1606063644_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1606063644(): IAppNotificationProgressBar.WithDefault {
    if(pointer == NULL) {
      return(IAppNotificationProgressBar.ABI.makeIAppNotificationProgressBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppNotificationProgressBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppNotificationProgressBar.ABI.makeIAppNotificationProgressBar(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppNotificationProgressBar> {
    public override fun getValue() = AppNotificationProgressBar(pointer.getPointer(0))

    public fun setValue(value: AppNotificationProgressBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppNotificationProgressBar, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.AppNotifications.Builder.AppNotificationProgressBar".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): AppNotificationProgressBar {
      val address = segment.toRawLongValue()
      return AppNotificationProgressBar(Pointer(address))
    }

    public override fun toNative(obj: AppNotificationProgressBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
