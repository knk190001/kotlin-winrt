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

@ABIMarker(TimePickedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.TimePickedEventArgs;{8ad3ff21-5f66-4785-b999-24fef39fb6db})")
@WinRTByReference(brClass = TimePickedEventArgs.ByReference::class)
public class TimePickedEventArgs(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ITimePickedEventArgs.WithDefault, IWinRTObject {
  private val __384702002_Interface: ITimePickedEventArgs.WithDefault by lazy {
    as_384702002()
  }


  public override val __384702002_Ptr: JNAPointer? by lazy {
    __384702002_Interface.__384702002_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__384702002_Interface)

  public constructor() : this(ABI.activate())

  private fun as_384702002(): ITimePickedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITimePickedEventArgs.ABI.makeITimePickedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimePickedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimePickedEventArgs.ABI.makeITimePickedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimePickedEventArgs> {
    public override fun getValue() = TimePickedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TimePickedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimePickedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TimePickedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): TimePickedEventArgs {
      val address = segment.toRawLongValue()
      return TimePickedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TimePickedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
