package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IPivotFactory.ABI.IID
import Microsoft.UI.Xaml.FrameworkElement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(Pivot.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Pivot;{1c6438e5-ecac-5fb6-8e8e-00de7e922303})")
@WinRTByReference(brClass = Pivot.ByReference::class)
public open class Pivot(
  ptr: JNAPointer? = NULL
) : ItemsControl(ptr), IPivot.WithDefault, IWinRTObject {
  private val __2004843813_Interface: IPivot.WithDefault by lazy {
    as_2004843813()
  }


  public override val __2004843813_Ptr: JNAPointer? by lazy {
    __2004843813_Interface.__2004843813_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2004843813_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2004843813(): IPivot.WithDefault {
    if(pointer == NULL) {
      return(IPivot.ABI.makeIPivot(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPivot>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPivot.ABI.makeIPivot(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Pivot> {
    public override fun getValue() = Pivot(pointer.getPointer(0))

    public fun setValue(value: Pivot): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Pivot, MemoryAddress> {
    public val IPivotStatics_Instance: IPivotStatics by lazy {
      createIPivotStatics()
    }


    public val IPivotFactory_Instance: IPivotFactory by lazy {
      createIPivotFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPivotStatics(): IPivotStatics {
      val refiid = Guid.REFIID(IPivotStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Pivot".toHandle(),refiid,interfacePtr)
      val result = IPivotStatics.ABI.makeIPivotStatics(interfacePtr.value)
      return result
    }

    public fun createIPivotFactory(): IPivotFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Pivot".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPivotFactory.ABI.makeIPivotFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IPivotFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Pivot {
      val address = segment.toRawLongValue()
      return Pivot(Pointer(address))
    }

    public override fun toNative(obj: Pivot): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TitleProperty() = ABI.IPivotStatics_Instance.get_TitleProperty()

    public fun get_TitleTemplateProperty() = ABI.IPivotStatics_Instance.get_TitleTemplateProperty()

    public fun get_LeftHeaderProperty() = ABI.IPivotStatics_Instance.get_LeftHeaderProperty()

    public fun get_LeftHeaderTemplateProperty() =
        ABI.IPivotStatics_Instance.get_LeftHeaderTemplateProperty()

    public fun get_RightHeaderProperty() = ABI.IPivotStatics_Instance.get_RightHeaderProperty()

    public fun get_RightHeaderTemplateProperty() =
        ABI.IPivotStatics_Instance.get_RightHeaderTemplateProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.IPivotStatics_Instance.get_HeaderTemplateProperty()

    public fun get_SelectedIndexProperty() = ABI.IPivotStatics_Instance.get_SelectedIndexProperty()

    public fun get_SelectedItemProperty() = ABI.IPivotStatics_Instance.get_SelectedItemProperty()

    public fun get_IsLockedProperty() = ABI.IPivotStatics_Instance.get_IsLockedProperty()

    public fun get_HeaderFocusVisualPlacementProperty() =
        ABI.IPivotStatics_Instance.get_HeaderFocusVisualPlacementProperty()

    public fun get_IsHeaderItemsCarouselEnabledProperty() =
        ABI.IPivotStatics_Instance.get_IsHeaderItemsCarouselEnabledProperty()

    public fun get_SlideInAnimationGroupProperty() =
        ABI.IPivotStatics_Instance.get_SlideInAnimationGroupProperty()

    public fun GetSlideInAnimationGroup(element: FrameworkElement) =
        ABI.IPivotStatics_Instance.GetSlideInAnimationGroup(element)

    public fun SetSlideInAnimationGroup(element: FrameworkElement,
        value: PivotSlideInAnimationGroup) =
        ABI.IPivotStatics_Instance.SetSlideInAnimationGroup(element, value)
  }
}
