package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Panel
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

@ABIMarker(CalendarPanel.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.CalendarPanel;{a4b26c3a-3825-5da4-a9e0-dd9b1e405e53})")
@WinRTByReference(brClass = CalendarPanel.ByReference::class)
public class CalendarPanel(
  ptr: JNAPointer? = NULL
) : Panel(ptr), ICalendarPanel.WithDefault, IWinRTObject {
  private val __771559605_Interface: ICalendarPanel.WithDefault by lazy {
    as_771559605()
  }


  public override val __771559605_Ptr: JNAPointer? by lazy {
    __771559605_Interface.__771559605_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__771559605_Interface)

  public constructor() : this(ABI.activate())

  private fun as_771559605(): ICalendarPanel.WithDefault {
    if(pointer == NULL) {
      return(ICalendarPanel.ABI.makeICalendarPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICalendarPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICalendarPanel.ABI.makeICalendarPanel(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CalendarPanel>
      {
    public override fun getValue() = CalendarPanel(pointer.getPointer(0))

    public fun setValue(value: CalendarPanel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CalendarPanel, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.CalendarPanel".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): CalendarPanel {
      val address = segment.toRawLongValue()
      return CalendarPanel(Pointer(address))
    }

    public override fun toNative(obj: CalendarPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
