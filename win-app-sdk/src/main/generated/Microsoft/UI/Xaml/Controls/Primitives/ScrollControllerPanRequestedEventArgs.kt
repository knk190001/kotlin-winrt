package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Input.PointerPoint
import Microsoft.UI.Xaml.Controls.Primitives.IScrollControllerPanRequestedEventArgsFactory.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ScrollControllerPanRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ScrollControllerPanRequestedEventArgs;{beee064e-1d4d-5a1a-8781-acf1587a5d6a})")
@WinRTByReference(brClass = ScrollControllerPanRequestedEventArgs.ByReference::class)
public class ScrollControllerPanRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScrollControllerPanRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1879270964_Interface: IScrollControllerPanRequestedEventArgs.WithDefault by lazy {
    as_1879270964()
  }


  public override val __1879270964_Ptr: JNAPointer? by lazy {
    __1879270964_Interface.__1879270964_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1879270964_Interface)

  public constructor(pointerPoint: PointerPoint) : this(ABI.activate(pointerPoint))

  private fun as_1879270964(): IScrollControllerPanRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IScrollControllerPanRequestedEventArgs.ABI.makeIScrollControllerPanRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollControllerPanRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollControllerPanRequestedEventArgs.ABI.makeIScrollControllerPanRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollControllerPanRequestedEventArgs> {
    public override fun getValue() = ScrollControllerPanRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ScrollControllerPanRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollControllerPanRequestedEventArgs, MemoryAddress> {
    public val IScrollControllerPanRequestedEventArgsFactory_Instance:
        IScrollControllerPanRequestedEventArgsFactory by lazy {
      createIScrollControllerPanRequestedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIScrollControllerPanRequestedEventArgsFactory():
        IScrollControllerPanRequestedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ScrollControllerPanRequestedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IScrollControllerPanRequestedEventArgsFactory.ABI.makeIScrollControllerPanRequestedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(pointerPoint: PointerPoint): JNAPointer? =
        IScrollControllerPanRequestedEventArgsFactory_Instance.CreateInstance(pointerPoint)?.pointer

    public override fun fromNative(segment: MemoryAddress): ScrollControllerPanRequestedEventArgs {
      val address = segment.toRawLongValue()
      return ScrollControllerPanRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ScrollControllerPanRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
