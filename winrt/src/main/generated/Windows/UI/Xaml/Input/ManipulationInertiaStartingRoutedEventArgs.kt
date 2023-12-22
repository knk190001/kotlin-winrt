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

@ABIMarker(ManipulationInertiaStartingRoutedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.ManipulationInertiaStartingRoutedEventArgs;{246a91a9-ca43-4c0b-acef-81e8b8147520})")
@WinRTByReference(brClass = ManipulationInertiaStartingRoutedEventArgs.ByReference::class)
public class ManipulationInertiaStartingRoutedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IManipulationInertiaStartingRoutedEventArgs.WithDefault, IWinRTObject {
  private val __215008117_Interface: IManipulationInertiaStartingRoutedEventArgs.WithDefault by
      lazy {
    as_215008117()
  }


  public override val __215008117_Ptr: JNAPointer? by lazy {
    __215008117_Interface.__215008117_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__215008117_Interface)

  public constructor() : this(ABI.activate())

  private fun as_215008117(): IManipulationInertiaStartingRoutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IManipulationInertiaStartingRoutedEventArgs.ABI.makeIManipulationInertiaStartingRoutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IManipulationInertiaStartingRoutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IManipulationInertiaStartingRoutedEventArgs.ABI.makeIManipulationInertiaStartingRoutedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ManipulationInertiaStartingRoutedEventArgs> {
    public override fun getValue() =
        ManipulationInertiaStartingRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ManipulationInertiaStartingRoutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ManipulationInertiaStartingRoutedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.ManipulationInertiaStartingRoutedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress):
        ManipulationInertiaStartingRoutedEventArgs {
      val address = segment.toRawLongValue()
      return ManipulationInertiaStartingRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ManipulationInertiaStartingRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
