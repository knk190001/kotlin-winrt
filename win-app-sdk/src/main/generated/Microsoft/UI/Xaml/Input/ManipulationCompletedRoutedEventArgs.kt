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

@ABIMarker(ManipulationCompletedRoutedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.ManipulationCompletedRoutedEventArgs;{e3be9e4e-c5fb-5859-a81d-ce12fc3a2f4d})")
@WinRTByReference(brClass = ManipulationCompletedRoutedEventArgs.ByReference::class)
public class ManipulationCompletedRoutedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IManipulationCompletedRoutedEventArgs.WithDefault, IWinRTObject {
  private val __534055911_Interface: IManipulationCompletedRoutedEventArgs.WithDefault by lazy {
    as_534055911()
  }


  public override val __534055911_Ptr: JNAPointer? by lazy {
    __534055911_Interface.__534055911_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__534055911_Interface)

  public constructor() : this(ABI.activate())

  private fun as_534055911(): IManipulationCompletedRoutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IManipulationCompletedRoutedEventArgs.ABI.makeIManipulationCompletedRoutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IManipulationCompletedRoutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IManipulationCompletedRoutedEventArgs.ABI.makeIManipulationCompletedRoutedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ManipulationCompletedRoutedEventArgs> {
    public override fun getValue() = ManipulationCompletedRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ManipulationCompletedRoutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ManipulationCompletedRoutedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.ManipulationCompletedRoutedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ManipulationCompletedRoutedEventArgs {
      val address = segment.toRawLongValue()
      return ManipulationCompletedRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ManipulationCompletedRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
