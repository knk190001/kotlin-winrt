package Microsoft.UI.Xaml.Controls

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
@Signature("rc(Microsoft.UI.Xaml.Controls.ScrollContentPresenter;{9a896eb9-3189-5c53-912f-c470896331b8})")
@WinRTByReference(brClass = ScrollContentPresenter.ByReference::class)
public class ScrollContentPresenter(
  ptr: JNAPointer? = NULL
) : ContentPresenter(ptr), IScrollContentPresenter.WithDefault, IWinRTObject {
  private val __1724597667_Interface: IScrollContentPresenter.WithDefault by lazy {
    as_1724597667()
  }


  public override val __1724597667_Ptr: JNAPointer? by lazy {
    __1724597667_Interface.__1724597667_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1724597667_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1724597667(): IScrollContentPresenter.WithDefault {
    if(pointer == NULL) {
      return(IScrollContentPresenter.ABI.makeIScrollContentPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollContentPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollContentPresenter.ABI.makeIScrollContentPresenter(ref.value))
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


    public val IScrollContentPresenterStatics_Instance: IScrollContentPresenterStatics by lazy {
      createIScrollContentPresenterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ScrollContentPresenter".toHandle(),
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

    public fun createIScrollContentPresenterStatics(): IScrollContentPresenterStatics {
      val refiid = Guid.REFIID(IScrollContentPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ScrollContentPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IScrollContentPresenterStatics.ABI.makeIScrollContentPresenterStatics(interfacePtr.value)
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
        ABI.IScrollContentPresenterStatics_Instance.get_CanContentRenderOutsideBoundsProperty()

    public fun get_SizesContentToTemplatedParentProperty() =
        ABI.IScrollContentPresenterStatics_Instance.get_SizesContentToTemplatedParentProperty()
  }
}
