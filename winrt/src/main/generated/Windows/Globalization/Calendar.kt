package Windows.Globalization

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(Calendar.ABI::class)
@Signature("rc(Windows.Globalization.Calendar;{ca30221d-86d9-40fb-a26b-d44eb7cf08ea})")
@WinRTByReference(brClass = Calendar.ByReference::class)
public class Calendar(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICalendar.WithDefault, ITimeZoneOnCalendar.WithDefault, IWinRTObject {
  private val __256724081_Interface: ICalendar.WithDefault by lazy {
    as_256724081()
  }


  private val __1516054359_Interface: ITimeZoneOnCalendar.WithDefault by lazy {
    as_1516054359()
  }


  public override val __256724081_Ptr: JNAPointer? by lazy {
    __256724081_Interface.__256724081_Ptr
  }


  public override val __1516054359_Ptr: JNAPointer? by lazy {
    __1516054359_Interface.__1516054359_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__256724081_Interface, __1516054359_Interface)

  public constructor() : this(ABI.activate())

  public constructor(languages: IIterable<String?>) : this(ABI.activate(languages))

  public constructor(
    languages: IIterable<String?>,
    calendar: String,
    clock: String
  ) : this(ABI.activate(languages, calendar, clock))

  public constructor(
    languages: IIterable<String?>,
    calendar: String,
    clock: String,
    timeZoneId: String
  ) : this(ABI.activate(languages, calendar, clock, timeZoneId))

  private fun as_256724081(): ICalendar.WithDefault {
    if(pointer == NULL) {
      return(ICalendar.ABI.makeICalendar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICalendar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICalendar.ABI.makeICalendar(ref.value))
  }

  private fun as_1516054359(): ITimeZoneOnCalendar.WithDefault {
    if(pointer == NULL) {
      return(ITimeZoneOnCalendar.ABI.makeITimeZoneOnCalendar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimeZoneOnCalendar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimeZoneOnCalendar.ABI.makeITimeZoneOnCalendar(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Calendar> {
    public override fun getValue() = Calendar(pointer.getPointer(0))

    public fun setValue(value: Calendar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Calendar, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ICalendarFactory_Instance: ICalendarFactory by lazy {
      createICalendarFactory()
    }


    public val ICalendarFactory2_Instance: ICalendarFactory2 by lazy {
      createICalendarFactory2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Globalization.Calendar".toHandle(), refiid,
          iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createICalendarFactory(): ICalendarFactory {
      val refiid = Guid.REFIID(ICalendarFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.Calendar".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICalendarFactory.ABI.makeICalendarFactory(factoryActivatorPtr.value))
    }

    public fun createICalendarFactory2(): ICalendarFactory2 {
      val refiid = Guid.REFIID(ICalendarFactory2.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.Calendar".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICalendarFactory2.ABI.makeICalendarFactory2(factoryActivatorPtr.value))
    }

    public fun activate(languages: IIterable<String?>): JNAPointer? =
        ICalendarFactory_Instance.CreateCalendarDefaultCalendarAndClock(languages)?.pointer

    public fun activate(
      languages: IIterable<String?>,
      calendar: String,
      clock: String
    ): JNAPointer? = ICalendarFactory_Instance.CreateCalendar(languages, calendar, clock)?.pointer

    public fun activate(
      languages: IIterable<String?>,
      calendar: String,
      clock: String,
      timeZoneId: String
    ): JNAPointer? = ICalendarFactory2_Instance.CreateCalendarWithTimeZone(languages, calendar,
        clock, timeZoneId)?.pointer

    public override fun fromNative(segment: MemoryAddress): Calendar {
      val address = segment.toRawLongValue()
      return Calendar(Pointer(address))
    }

    public override fun toNative(obj: Calendar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
