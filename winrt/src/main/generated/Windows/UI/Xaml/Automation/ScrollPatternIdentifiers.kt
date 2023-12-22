package Windows.UI.Xaml.Automation

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

@ABIMarker(ScrollPatternIdentifiers.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.ScrollPatternIdentifiers;{366b1003-425c-4951-ae83-d521e73bc696})")
@WinRTByReference(brClass = ScrollPatternIdentifiers.ByReference::class)
public class ScrollPatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScrollPatternIdentifiers.WithDefault, IWinRTObject {
  private val __300816510_Interface: IScrollPatternIdentifiers.WithDefault by lazy {
    as_300816510()
  }


  public override val __300816510_Ptr: JNAPointer? by lazy {
    __300816510_Interface.__300816510_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__300816510_Interface)

  private fun as_300816510(): IScrollPatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(IScrollPatternIdentifiers.ABI.makeIScrollPatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollPatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollPatternIdentifiers.ABI.makeIScrollPatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollPatternIdentifiers> {
    public override fun getValue() = ScrollPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: ScrollPatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollPatternIdentifiers, MemoryAddress> {
    public val IScrollPatternIdentifiersStatics_Instance: IScrollPatternIdentifiersStatics by lazy {
      createIScrollPatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIScrollPatternIdentifiersStatics(): IScrollPatternIdentifiersStatics {
      val refiid = Guid.REFIID(IScrollPatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.ScrollPatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IScrollPatternIdentifiersStatics.ABI.makeIScrollPatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ScrollPatternIdentifiers {
      val address = segment.toRawLongValue()
      return ScrollPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: ScrollPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HorizontallyScrollableProperty() =
        ABI.IScrollPatternIdentifiersStatics_Instance.get_HorizontallyScrollableProperty()

    public fun get_HorizontalScrollPercentProperty() =
        ABI.IScrollPatternIdentifiersStatics_Instance.get_HorizontalScrollPercentProperty()

    public fun get_HorizontalViewSizeProperty() =
        ABI.IScrollPatternIdentifiersStatics_Instance.get_HorizontalViewSizeProperty()

    public fun get_NoScroll() = ABI.IScrollPatternIdentifiersStatics_Instance.get_NoScroll()

    public fun get_VerticallyScrollableProperty() =
        ABI.IScrollPatternIdentifiersStatics_Instance.get_VerticallyScrollableProperty()

    public fun get_VerticalScrollPercentProperty() =
        ABI.IScrollPatternIdentifiersStatics_Instance.get_VerticalScrollPercentProperty()

    public fun get_VerticalViewSizeProperty() =
        ABI.IScrollPatternIdentifiersStatics_Instance.get_VerticalViewSizeProperty()
  }
}
