package Windows.UI.Xaml.Input

import Windows.UI.Xaml.RoutedEventArgs
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

@ABIMarker(DoubleTappedRoutedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.DoubleTappedRoutedEventArgs;{af404424-26df-44f4-8714-9359249b62d3})")
@WinRTByReference(brClass = DoubleTappedRoutedEventArgs.ByReference::class)
public class DoubleTappedRoutedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IDoubleTappedRoutedEventArgs.WithDefault, IWinRTObject {
  private val __285592969_Interface: IDoubleTappedRoutedEventArgs.WithDefault by lazy {
    as_285592969()
  }


  public override val __285592969_Ptr: JNAPointer? by lazy {
    __285592969_Interface.__285592969_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__285592969_Interface)

  public constructor() : this(ABI.activate())

  private fun as_285592969(): IDoubleTappedRoutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDoubleTappedRoutedEventArgs.ABI.makeIDoubleTappedRoutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDoubleTappedRoutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDoubleTappedRoutedEventArgs.ABI.makeIDoubleTappedRoutedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DoubleTappedRoutedEventArgs> {
    public override fun getValue() = DoubleTappedRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DoubleTappedRoutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DoubleTappedRoutedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.DoubleTappedRoutedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): DoubleTappedRoutedEventArgs {
      val address = segment.toRawLongValue()
      return DoubleTappedRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DoubleTappedRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
