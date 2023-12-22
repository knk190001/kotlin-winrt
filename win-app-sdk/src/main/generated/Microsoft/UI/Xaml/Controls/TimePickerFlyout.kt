package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.PickerFlyoutBase
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TimePickerFlyout.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TimePickerFlyout;{479799dc-700a-5a9c-ba0b-9ab2587ed2e8})")
@WinRTByReference(brClass = TimePickerFlyout.ByReference::class)
public class TimePickerFlyout(
  ptr: JNAPointer? = NULL
) : PickerFlyoutBase(ptr), ITimePickerFlyout.WithDefault, IWinRTObject {
  private val __1398933667_Interface: ITimePickerFlyout.WithDefault by lazy {
    as_1398933667()
  }


  public override val __1398933667_Ptr: JNAPointer? by lazy {
    __1398933667_Interface.__1398933667_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1398933667_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1398933667(): ITimePickerFlyout.WithDefault {
    if(pointer == NULL) {
      return(ITimePickerFlyout.ABI.makeITimePickerFlyout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimePickerFlyout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimePickerFlyout.ABI.makeITimePickerFlyout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimePickerFlyout> {
    public override fun getValue() = TimePickerFlyout(pointer.getPointer(0))

    public fun setValue(value: TimePickerFlyout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimePickerFlyout, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ITimePickerFlyoutStatics_Instance: ITimePickerFlyoutStatics by lazy {
      createITimePickerFlyoutStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TimePickerFlyout".toHandle(),
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

    public fun createITimePickerFlyoutStatics(): ITimePickerFlyoutStatics {
      val refiid = Guid.REFIID(ITimePickerFlyoutStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TimePickerFlyout".toHandle(),refiid,interfacePtr)
      val result = ITimePickerFlyoutStatics.ABI.makeITimePickerFlyoutStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TimePickerFlyout {
      val address = segment.toRawLongValue()
      return TimePickerFlyout(Pointer(address))
    }

    public override fun toNative(obj: TimePickerFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ClockIdentifierProperty() =
        ABI.ITimePickerFlyoutStatics_Instance.get_ClockIdentifierProperty()

    public fun get_TimeProperty() = ABI.ITimePickerFlyoutStatics_Instance.get_TimeProperty()

    public fun get_MinuteIncrementProperty() =
        ABI.ITimePickerFlyoutStatics_Instance.get_MinuteIncrementProperty()
  }
}
