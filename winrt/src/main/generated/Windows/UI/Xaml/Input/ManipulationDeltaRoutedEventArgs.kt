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

@ABIMarker(ManipulationDeltaRoutedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.ManipulationDeltaRoutedEventArgs;{400d5794-4c6f-491d-82d6-3517109399c6})")
@WinRTByReference(brClass = ManipulationDeltaRoutedEventArgs.ByReference::class)
public class ManipulationDeltaRoutedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IManipulationDeltaRoutedEventArgs.WithDefault, IWinRTObject {
  private val __1771136809_Interface: IManipulationDeltaRoutedEventArgs.WithDefault by lazy {
    as_1771136809()
  }


  public override val __1771136809_Ptr: JNAPointer? by lazy {
    __1771136809_Interface.__1771136809_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1771136809_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1771136809(): IManipulationDeltaRoutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IManipulationDeltaRoutedEventArgs.ABI.makeIManipulationDeltaRoutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IManipulationDeltaRoutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IManipulationDeltaRoutedEventArgs.ABI.makeIManipulationDeltaRoutedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ManipulationDeltaRoutedEventArgs> {
    public override fun getValue() = ManipulationDeltaRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ManipulationDeltaRoutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ManipulationDeltaRoutedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.ManipulationDeltaRoutedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ManipulationDeltaRoutedEventArgs {
      val address = segment.toRawLongValue()
      return ManipulationDeltaRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ManipulationDeltaRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
