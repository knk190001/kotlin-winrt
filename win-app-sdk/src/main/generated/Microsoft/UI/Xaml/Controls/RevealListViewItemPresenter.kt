package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IRevealListViewItemPresenterFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.ListViewItemPresenter
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

@ABIMarker(RevealListViewItemPresenter.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.RevealListViewItemPresenter;{365fdbac-3989-559c-bea9-764561881c96})")
@WinRTByReference(brClass = RevealListViewItemPresenter.ByReference::class)
public open class RevealListViewItemPresenter(
  ptr: JNAPointer? = NULL
) : ListViewItemPresenter(ptr), IRevealListViewItemPresenter.WithDefault, IWinRTObject {
  private val __1753283902_Interface: IRevealListViewItemPresenter.WithDefault by lazy {
    as_1753283902()
  }


  public override val __1753283902_Ptr: JNAPointer? by lazy {
    __1753283902_Interface.__1753283902_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1753283902_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1753283902(): IRevealListViewItemPresenter.WithDefault {
    if(pointer == NULL) {
      return(IRevealListViewItemPresenter.ABI.makeIRevealListViewItemPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRevealListViewItemPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRevealListViewItemPresenter.ABI.makeIRevealListViewItemPresenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RevealListViewItemPresenter> {
    public override fun getValue() = RevealListViewItemPresenter(pointer.getPointer(0))

    public fun setValue(value: RevealListViewItemPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RevealListViewItemPresenter, MemoryAddress> {
    public val IRevealListViewItemPresenterFactory_Instance: IRevealListViewItemPresenterFactory by
        lazy {
      createIRevealListViewItemPresenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRevealListViewItemPresenterFactory(): IRevealListViewItemPresenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RevealListViewItemPresenter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRevealListViewItemPresenterFactory.ABI.makeIRevealListViewItemPresenterFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IRevealListViewItemPresenterFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RevealListViewItemPresenter {
      val address = segment.toRawLongValue()
      return RevealListViewItemPresenter(Pointer(address))
    }

    public override fun toNative(obj: RevealListViewItemPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
