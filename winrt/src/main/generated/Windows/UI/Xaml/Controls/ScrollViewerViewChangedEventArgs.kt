package Windows.UI.Xaml.Controls

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ScrollViewerViewChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ScrollViewerViewChangedEventArgs;{4dd04f7e-7a11-4b2e-9933-577df39252b6})")
@WinRTByReference(brClass = ScrollViewerViewChangedEventArgs.ByReference::class)
public class ScrollViewerViewChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScrollViewerViewChangedEventArgs.WithDefault, IWinRTObject {
  private val __2068252413_Interface: IScrollViewerViewChangedEventArgs.WithDefault by lazy {
    as_2068252413()
  }


  public override val __2068252413_Ptr: JNAPointer? by lazy {
    __2068252413_Interface.__2068252413_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2068252413_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2068252413(): IScrollViewerViewChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IScrollViewerViewChangedEventArgs.ABI.makeIScrollViewerViewChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollViewerViewChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollViewerViewChangedEventArgs.ABI.makeIScrollViewerViewChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollViewerViewChangedEventArgs> {
    public override fun getValue() = ScrollViewerViewChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ScrollViewerViewChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollViewerViewChangedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ScrollViewerViewChangedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ScrollViewerViewChangedEventArgs {
      val address = segment.toRawLongValue()
      return ScrollViewerViewChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ScrollViewerViewChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
