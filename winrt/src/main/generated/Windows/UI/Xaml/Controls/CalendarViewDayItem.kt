package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.ICalendarViewDayItemFactory.ABI.IID
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CalendarViewDayItem.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.CalendarViewDayItem;{0fdb2dc5-32c1-4b8f-befc-017b555b32d2})")
@WinRTByReference(brClass = CalendarViewDayItem.ByReference::class)
public open class CalendarViewDayItem(
  ptr: JNAPointer? = NULL
) : Control(ptr), ICalendarViewDayItem.WithDefault, IWinRTObject {
  private val __1470414512_Interface: ICalendarViewDayItem.WithDefault by lazy {
    as_1470414512()
  }


  public override val __1470414512_Ptr: JNAPointer? by lazy {
    __1470414512_Interface.__1470414512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1470414512_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1470414512(): ICalendarViewDayItem.WithDefault {
    if(pointer == NULL) {
      return(ICalendarViewDayItem.ABI.makeICalendarViewDayItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICalendarViewDayItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICalendarViewDayItem.ABI.makeICalendarViewDayItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CalendarViewDayItem> {
    public override fun getValue() = CalendarViewDayItem(pointer.getPointer(0))

    public fun setValue(value: CalendarViewDayItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CalendarViewDayItem, MemoryAddress> {
    public val ICalendarViewDayItemStatics_Instance: ICalendarViewDayItemStatics by lazy {
      createICalendarViewDayItemStatics()
    }


    public val ICalendarViewDayItemFactory_Instance: ICalendarViewDayItemFactory by lazy {
      createICalendarViewDayItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICalendarViewDayItemStatics(): ICalendarViewDayItemStatics {
      val refiid = Guid.REFIID(ICalendarViewDayItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.CalendarViewDayItem".toHandle(),refiid,interfacePtr)
      val result =
          ICalendarViewDayItemStatics.ABI.makeICalendarViewDayItemStatics(interfacePtr.value)
      return result
    }

    public fun createICalendarViewDayItemFactory(): ICalendarViewDayItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.CalendarViewDayItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICalendarViewDayItemFactory.ABI.makeICalendarViewDayItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ICalendarViewDayItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): CalendarViewDayItem {
      val address = segment.toRawLongValue()
      return CalendarViewDayItem(Pointer(address))
    }

    public override fun toNative(obj: CalendarViewDayItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsBlackoutProperty() =
        ABI.ICalendarViewDayItemStatics_Instance.get_IsBlackoutProperty()

    public fun get_DateProperty() = ABI.ICalendarViewDayItemStatics_Instance.get_DateProperty()
  }
}
