package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Primitives.IScrollControllerScrollToRequestedEventArgsFactory.ABI.IID
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

@ABIMarker(ScrollControllerScrollToRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ScrollControllerScrollToRequestedEventArgs;{73f16b99-7310-5c73-872b-276e5a9d4913})")
@WinRTByReference(brClass = ScrollControllerScrollToRequestedEventArgs.ByReference::class)
public class ScrollControllerScrollToRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScrollControllerScrollToRequestedEventArgs.WithDefault, IWinRTObject {
  private val __511657141_Interface: IScrollControllerScrollToRequestedEventArgs.WithDefault by
      lazy {
    as_511657141()
  }


  public override val __511657141_Ptr: JNAPointer? by lazy {
    __511657141_Interface.__511657141_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__511657141_Interface)

  public constructor(offset: Double, options: ScrollingScrollOptions) : this(ABI.activate(offset,
      options))

  private fun as_511657141(): IScrollControllerScrollToRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IScrollControllerScrollToRequestedEventArgs.ABI.makeIScrollControllerScrollToRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollControllerScrollToRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollControllerScrollToRequestedEventArgs.ABI.makeIScrollControllerScrollToRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollControllerScrollToRequestedEventArgs> {
    public override fun getValue() =
        ScrollControllerScrollToRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ScrollControllerScrollToRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollControllerScrollToRequestedEventArgs, MemoryAddress> {
    public val IScrollControllerScrollToRequestedEventArgsFactory_Instance:
        IScrollControllerScrollToRequestedEventArgsFactory by lazy {
      createIScrollControllerScrollToRequestedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIScrollControllerScrollToRequestedEventArgsFactory():
        IScrollControllerScrollToRequestedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ScrollControllerScrollToRequestedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IScrollControllerScrollToRequestedEventArgsFactory.ABI.makeIScrollControllerScrollToRequestedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(offset: Double, options: ScrollingScrollOptions): JNAPointer? =
        IScrollControllerScrollToRequestedEventArgsFactory_Instance.CreateInstance(offset,
        options)?.pointer

    public override fun fromNative(segment: MemoryAddress):
        ScrollControllerScrollToRequestedEventArgs {
      val address = segment.toRawLongValue()
      return ScrollControllerScrollToRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ScrollControllerScrollToRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
