package Microsoft.UI.Xaml.Controls.Primitives

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(ScrollBar.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ScrollBar;{568cbf41-f741-5f05-8e08-c0a50ac17c8c})")
@WinRTByReference(brClass = ScrollBar.ByReference::class)
public class ScrollBar(
  ptr: JNAPointer? = NULL
) : RangeBase(ptr), IScrollBar.WithDefault, IWinRTObject {
  private val __2075404501_Interface: IScrollBar.WithDefault by lazy {
    as_2075404501()
  }


  public override val __2075404501_Ptr: JNAPointer? by lazy {
    __2075404501_Interface.__2075404501_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2075404501_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2075404501(): IScrollBar.WithDefault {
    if(pointer == NULL) {
      return(IScrollBar.ABI.makeIScrollBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollBar.ABI.makeIScrollBar(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ScrollBar> {
    public override fun getValue() = ScrollBar(pointer.getPointer(0))

    public fun setValue(value: ScrollBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollBar, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IScrollBarStatics_Instance: IScrollBarStatics by lazy {
      createIScrollBarStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ScrollBar".toHandle(),
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

    public fun createIScrollBarStatics(): IScrollBarStatics {
      val refiid = Guid.REFIID(IScrollBarStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ScrollBar".toHandle(),refiid,interfacePtr)
      val result = IScrollBarStatics.ABI.makeIScrollBarStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ScrollBar {
      val address = segment.toRawLongValue()
      return ScrollBar(Pointer(address))
    }

    public override fun toNative(obj: ScrollBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_OrientationProperty() = ABI.IScrollBarStatics_Instance.get_OrientationProperty()

    public fun get_ViewportSizeProperty() =
        ABI.IScrollBarStatics_Instance.get_ViewportSizeProperty()

    public fun get_IndicatorModeProperty() =
        ABI.IScrollBarStatics_Instance.get_IndicatorModeProperty()
  }
}
