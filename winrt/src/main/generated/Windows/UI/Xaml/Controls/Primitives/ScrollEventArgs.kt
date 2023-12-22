package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(ScrollEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.ScrollEventArgs;{c57e5168-3afe-448d-b752-2f364c75d743})")
@WinRTByReference(brClass = ScrollEventArgs.ByReference::class)
public class ScrollEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IScrollEventArgs.WithDefault, IWinRTObject {
  private val __1740829714_Interface: IScrollEventArgs.WithDefault by lazy {
    as_1740829714()
  }


  public override val __1740829714_Ptr: JNAPointer? by lazy {
    __1740829714_Interface.__1740829714_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1740829714_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1740829714(): IScrollEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IScrollEventArgs.ABI.makeIScrollEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollEventArgs.ABI.makeIScrollEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollEventArgs> {
    public override fun getValue() = ScrollEventArgs(pointer.getPointer(0))

    public fun setValue(value: ScrollEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.ScrollEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ScrollEventArgs {
      val address = segment.toRawLongValue()
      return ScrollEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ScrollEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
