package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IScrollingScrollOptionsFactory.ABI.IID
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

@ABIMarker(ScrollingScrollOptions.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ScrollingScrollOptions;{30b2e77b-2553-5b09-b308-b4b06fc8f9af})")
@WinRTByReference(brClass = ScrollingScrollOptions.ByReference::class)
public open class ScrollingScrollOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScrollingScrollOptions.WithDefault, IWinRTObject {
  private val __1400977827_Interface: IScrollingScrollOptions.WithDefault by lazy {
    as_1400977827()
  }


  public override val __1400977827_Ptr: JNAPointer? by lazy {
    __1400977827_Interface.__1400977827_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1400977827_Interface)

  public constructor(animationMode: ScrollingAnimationMode) : this(ABI.activate(animationMode))

  public constructor(animationMode: ScrollingAnimationMode, snapPointsMode: ScrollingSnapPointsMode)
      : this(ABI.activate(animationMode, snapPointsMode))

  private fun as_1400977827(): IScrollingScrollOptions.WithDefault {
    if(pointer == NULL) {
      return(IScrollingScrollOptions.ABI.makeIScrollingScrollOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollingScrollOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollingScrollOptions.ABI.makeIScrollingScrollOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollingScrollOptions> {
    public override fun getValue() = ScrollingScrollOptions(pointer.getPointer(0))

    public fun setValue(value: ScrollingScrollOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollingScrollOptions, MemoryAddress> {
    public val IScrollingScrollOptionsFactory_Instance: IScrollingScrollOptionsFactory by lazy {
      createIScrollingScrollOptionsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIScrollingScrollOptionsFactory(): IScrollingScrollOptionsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ScrollingScrollOptions".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IScrollingScrollOptionsFactory.ABI.makeIScrollingScrollOptionsFactory(factoryActivatorPtr.value))
    }

    public fun activate(animationMode: ScrollingAnimationMode): JNAPointer? =
        IScrollingScrollOptionsFactory_Instance.CreateInstance(animationMode, null, null)?.pointer

    public fun activate(animationMode: ScrollingAnimationMode,
        snapPointsMode: ScrollingSnapPointsMode): JNAPointer? =
        IScrollingScrollOptionsFactory_Instance.CreateInstance2(animationMode, snapPointsMode, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ScrollingScrollOptions {
      val address = segment.toRawLongValue()
      return ScrollingScrollOptions(Pointer(address))
    }

    public override fun toNative(obj: ScrollingScrollOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
