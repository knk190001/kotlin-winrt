package Microsoft.UI.Xaml.Input

import Microsoft.UI.Xaml.RoutedEventArgs
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

@ABIMarker(HoldingRoutedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.HoldingRoutedEventArgs;{8272a4b2-2221-551e-b0bb-16e29138ab20})")
@WinRTByReference(brClass = HoldingRoutedEventArgs.ByReference::class)
public class HoldingRoutedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IHoldingRoutedEventArgs.WithDefault, IWinRTObject {
  private val __188889892_Interface: IHoldingRoutedEventArgs.WithDefault by lazy {
    as_188889892()
  }


  public override val __188889892_Ptr: JNAPointer? by lazy {
    __188889892_Interface.__188889892_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__188889892_Interface)

  public constructor() : this(ABI.activate())

  private fun as_188889892(): IHoldingRoutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IHoldingRoutedEventArgs.ABI.makeIHoldingRoutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHoldingRoutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHoldingRoutedEventArgs.ABI.makeIHoldingRoutedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HoldingRoutedEventArgs> {
    public override fun getValue() = HoldingRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: HoldingRoutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HoldingRoutedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.HoldingRoutedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): HoldingRoutedEventArgs {
      val address = segment.toRawLongValue()
      return HoldingRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: HoldingRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
