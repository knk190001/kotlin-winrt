package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(DatePickedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.DatePickedEventArgs;{a1527b12-59c1-4521-b28c-b176675e7c5a})")
@WinRTByReference(brClass = DatePickedEventArgs.ByReference::class)
public class DatePickedEventArgs(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IDatePickedEventArgs.WithDefault, IWinRTObject {
  private val __511823565_Interface: IDatePickedEventArgs.WithDefault by lazy {
    as_511823565()
  }


  public override val __511823565_Ptr: JNAPointer? by lazy {
    __511823565_Interface.__511823565_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__511823565_Interface)

  public constructor() : this(ABI.activate())

  private fun as_511823565(): IDatePickedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDatePickedEventArgs.ABI.makeIDatePickedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatePickedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatePickedEventArgs.ABI.makeIDatePickedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DatePickedEventArgs> {
    public override fun getValue() = DatePickedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DatePickedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DatePickedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.DatePickedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): DatePickedEventArgs {
      val address = segment.toRawLongValue()
      return DatePickedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DatePickedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
