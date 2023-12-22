package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Primitives.IScrollControllerScrollByRequestedEventArgsFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.ScrollingScrollOptions
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ScrollControllerScrollByRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ScrollControllerScrollByRequestedEventArgs;{e7f305fa-4073-5d88-8bf1-ae4ecb9208bf})")
@WinRTByReference(brClass = ScrollControllerScrollByRequestedEventArgs.ByReference::class)
public class ScrollControllerScrollByRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScrollControllerScrollByRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1597539801_Interface: IScrollControllerScrollByRequestedEventArgs.WithDefault by
      lazy {
    as_1597539801()
  }


  public override val __1597539801_Ptr: JNAPointer? by lazy {
    __1597539801_Interface.__1597539801_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1597539801_Interface)

  public constructor(offsetDelta: Double, options: ScrollingScrollOptions) :
      this(ABI.activate(offsetDelta, options))

  private fun as_1597539801(): IScrollControllerScrollByRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IScrollControllerScrollByRequestedEventArgs.ABI.makeIScrollControllerScrollByRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollControllerScrollByRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollControllerScrollByRequestedEventArgs.ABI.makeIScrollControllerScrollByRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollControllerScrollByRequestedEventArgs> {
    public override fun getValue() =
        ScrollControllerScrollByRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ScrollControllerScrollByRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollControllerScrollByRequestedEventArgs, MemoryAddress> {
    public val IScrollControllerScrollByRequestedEventArgsFactory_Instance:
        IScrollControllerScrollByRequestedEventArgsFactory by lazy {
      createIScrollControllerScrollByRequestedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIScrollControllerScrollByRequestedEventArgsFactory():
        IScrollControllerScrollByRequestedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ScrollControllerScrollByRequestedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IScrollControllerScrollByRequestedEventArgsFactory.ABI.makeIScrollControllerScrollByRequestedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(offsetDelta: Double, options: ScrollingScrollOptions): JNAPointer? =
        IScrollControllerScrollByRequestedEventArgsFactory_Instance.CreateInstance(offsetDelta,
        options)?.pointer

    public override fun fromNative(segment: MemoryAddress):
        ScrollControllerScrollByRequestedEventArgs {
      val address = segment.toRawLongValue()
      return ScrollControllerScrollByRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ScrollControllerScrollByRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
