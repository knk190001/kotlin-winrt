package Microsoft.UI.Xaml.Input

import Microsoft.UI.Xaml.Input.IManipulationStartedRoutedEventArgsFactory.ABI.IID
import Microsoft.UI.Xaml.RoutedEventArgs
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(ManipulationStartedRoutedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.ManipulationStartedRoutedEventArgs;{61857950-5821-5652-9fdf-c6277c5886f5})")
@WinRTByReference(brClass = ManipulationStartedRoutedEventArgs.ByReference::class)
public open class ManipulationStartedRoutedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IManipulationStartedRoutedEventArgs.WithDefault, IWinRTObject {
  private val __695031517_Interface: IManipulationStartedRoutedEventArgs.WithDefault by lazy {
    as_695031517()
  }


  public override val __695031517_Ptr: JNAPointer? by lazy {
    __695031517_Interface.__695031517_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__695031517_Interface)

  public constructor() : this(ABI.activate())

  private fun as_695031517(): IManipulationStartedRoutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IManipulationStartedRoutedEventArgs.ABI.makeIManipulationStartedRoutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IManipulationStartedRoutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IManipulationStartedRoutedEventArgs.ABI.makeIManipulationStartedRoutedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ManipulationStartedRoutedEventArgs> {
    public override fun getValue() = ManipulationStartedRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ManipulationStartedRoutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ManipulationStartedRoutedEventArgs, MemoryAddress> {
    public val IManipulationStartedRoutedEventArgsFactory_Instance:
        IManipulationStartedRoutedEventArgsFactory by lazy {
      createIManipulationStartedRoutedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIManipulationStartedRoutedEventArgsFactory():
        IManipulationStartedRoutedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.ManipulationStartedRoutedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IManipulationStartedRoutedEventArgsFactory.ABI.makeIManipulationStartedRoutedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IManipulationStartedRoutedEventArgsFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ManipulationStartedRoutedEventArgs {
      val address = segment.toRawLongValue()
      return ManipulationStartedRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ManipulationStartedRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
