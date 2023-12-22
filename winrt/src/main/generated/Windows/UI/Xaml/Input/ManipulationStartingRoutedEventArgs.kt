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

@ABIMarker(ManipulationStartingRoutedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.ManipulationStartingRoutedEventArgs;{18d636b7-53a4-4c15-a498-f3a9ca212a42})")
@WinRTByReference(brClass = ManipulationStartingRoutedEventArgs.ByReference::class)
public class ManipulationStartingRoutedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IManipulationStartingRoutedEventArgs.WithDefault, IWinRTObject {
  private val __559326647_Interface: IManipulationStartingRoutedEventArgs.WithDefault by lazy {
    as_559326647()
  }


  public override val __559326647_Ptr: JNAPointer? by lazy {
    __559326647_Interface.__559326647_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__559326647_Interface)

  public constructor() : this(ABI.activate())

  private fun as_559326647(): IManipulationStartingRoutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IManipulationStartingRoutedEventArgs.ABI.makeIManipulationStartingRoutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IManipulationStartingRoutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IManipulationStartingRoutedEventArgs.ABI.makeIManipulationStartingRoutedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ManipulationStartingRoutedEventArgs> {
    public override fun getValue() = ManipulationStartingRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ManipulationStartingRoutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ManipulationStartingRoutedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.ManipulationStartingRoutedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ManipulationStartingRoutedEventArgs {
      val address = segment.toRawLongValue()
      return ManipulationStartingRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ManipulationStartingRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
