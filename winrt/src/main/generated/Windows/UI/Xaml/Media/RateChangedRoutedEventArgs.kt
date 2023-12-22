package Windows.UI.Xaml.Media

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

@ABIMarker(RateChangedRoutedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.RateChangedRoutedEventArgs;{9016aa6f-3ca8-4c80-8e2f-8851a68f131f})")
@WinRTByReference(brClass = RateChangedRoutedEventArgs.ByReference::class)
public class RateChangedRoutedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IRateChangedRoutedEventArgs.WithDefault, IWinRTObject {
  private val __806564796_Interface: IRateChangedRoutedEventArgs.WithDefault by lazy {
    as_806564796()
  }


  public override val __806564796_Ptr: JNAPointer? by lazy {
    __806564796_Interface.__806564796_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__806564796_Interface)

  public constructor() : this(ABI.activate())

  private fun as_806564796(): IRateChangedRoutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRateChangedRoutedEventArgs.ABI.makeIRateChangedRoutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRateChangedRoutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRateChangedRoutedEventArgs.ABI.makeIRateChangedRoutedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RateChangedRoutedEventArgs> {
    public override fun getValue() = RateChangedRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RateChangedRoutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RateChangedRoutedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.RateChangedRoutedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): RateChangedRoutedEventArgs {
      val address = segment.toRawLongValue()
      return RateChangedRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RateChangedRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
