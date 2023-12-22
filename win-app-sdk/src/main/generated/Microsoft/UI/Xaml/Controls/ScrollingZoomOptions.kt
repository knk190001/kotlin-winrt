package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IScrollingZoomOptionsFactory.ABI.IID
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

@ABIMarker(ScrollingZoomOptions.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ScrollingZoomOptions;{e4ace0b2-9b0c-5eda-88a2-c31b1b84f829})")
@WinRTByReference(brClass = ScrollingZoomOptions.ByReference::class)
public open class ScrollingZoomOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScrollingZoomOptions.WithDefault, IWinRTObject {
  private val __987620957_Interface: IScrollingZoomOptions.WithDefault by lazy {
    as_987620957()
  }


  public override val __987620957_Ptr: JNAPointer? by lazy {
    __987620957_Interface.__987620957_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__987620957_Interface)

  public constructor(animationMode: ScrollingAnimationMode) : this(ABI.activate(animationMode))

  public constructor(animationMode: ScrollingAnimationMode, snapPointsMode: ScrollingSnapPointsMode)
      : this(ABI.activate(animationMode, snapPointsMode))

  private fun as_987620957(): IScrollingZoomOptions.WithDefault {
    if(pointer == NULL) {
      return(IScrollingZoomOptions.ABI.makeIScrollingZoomOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollingZoomOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollingZoomOptions.ABI.makeIScrollingZoomOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollingZoomOptions> {
    public override fun getValue() = ScrollingZoomOptions(pointer.getPointer(0))

    public fun setValue(value: ScrollingZoomOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollingZoomOptions, MemoryAddress> {
    public val IScrollingZoomOptionsFactory_Instance: IScrollingZoomOptionsFactory by lazy {
      createIScrollingZoomOptionsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIScrollingZoomOptionsFactory(): IScrollingZoomOptionsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ScrollingZoomOptions".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IScrollingZoomOptionsFactory.ABI.makeIScrollingZoomOptionsFactory(factoryActivatorPtr.value))
    }

    public fun activate(animationMode: ScrollingAnimationMode): JNAPointer? =
        IScrollingZoomOptionsFactory_Instance.CreateInstance(animationMode, null, null)?.pointer

    public fun activate(animationMode: ScrollingAnimationMode,
        snapPointsMode: ScrollingSnapPointsMode): JNAPointer? =
        IScrollingZoomOptionsFactory_Instance.CreateInstance2(animationMode, snapPointsMode, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ScrollingZoomOptions {
      val address = segment.toRawLongValue()
      return ScrollingZoomOptions(Pointer(address))
    }

    public override fun toNative(obj: ScrollingZoomOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
