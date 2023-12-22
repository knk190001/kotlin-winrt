package Windows.UI.Xaml.Controls

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

@ABIMarker(ScrollContentPresenter.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ScrollContentPresenter;{5712ee2b-0eeb-46d3-aa31-5f6801b8de20})")
@WinRTByReference(brClass = ScrollContentPresenter.ByReference::class)
public class ScrollContentPresenter(
  ptr: JNAPointer? = NULL
) : ContentPresenter(ptr), IScrollContentPresenter.WithDefault,
    IScrollContentPresenter2.WithDefault, IWinRTObject {
  private val __1174718920_Interface: IScrollContentPresenter.WithDefault by lazy {
    as_1174718920()
  }


  private val __2056548102_Interface: IScrollContentPresenter2.WithDefault by lazy {
    as_2056548102()
  }


  public override val __1174718920_Ptr: JNAPointer? by lazy {
    __1174718920_Interface.__1174718920_Ptr
  }


  public override val __2056548102_Ptr: JNAPointer? by lazy {
    __2056548102_Interface.__2056548102_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1174718920_Interface, __2056548102_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1174718920(): IScrollContentPresenter.WithDefault {
    if(pointer == NULL) {
      return(IScrollContentPresenter.ABI.makeIScrollContentPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollContentPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollContentPresenter.ABI.makeIScrollContentPresenter(ref.value))
  }

  private fun as_2056548102(): IScrollContentPresenter2.WithDefault {
    if(pointer == NULL) {
      return(IScrollContentPresenter2.ABI.makeIScrollContentPresenter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollContentPresenter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollContentPresenter2.ABI.makeIScrollContentPresenter2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollContentPresenter> {
    public override fun getValue() = ScrollContentPresenter(pointer.getPointer(0))

    public fun setValue(value: ScrollContentPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollContentPresenter, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IScrollContentPresenterStatics2_Instance: IScrollContentPresenterStatics2 by lazy {
      createIScrollContentPresenterStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ScrollContentPresenter".toHandle(),
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

    public fun createIScrollContentPresenterStatics2(): IScrollContentPresenterStatics2 {
      val refiid = Guid.REFIID(IScrollContentPresenterStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ScrollContentPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IScrollContentPresenterStatics2.ABI.makeIScrollContentPresenterStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ScrollContentPresenter {
      val address = segment.toRawLongValue()
      return ScrollContentPresenter(Pointer(address))
    }

    public override fun toNative(obj: ScrollContentPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CanContentRenderOutsideBoundsProperty() =
        ABI.IScrollContentPresenterStatics2_Instance.get_CanContentRenderOutsideBoundsProperty()

    public fun get_SizesContentToTemplatedParentProperty() =
        ABI.IScrollContentPresenterStatics2_Instance.get_SizesContentToTemplatedParentProperty()
  }
}
