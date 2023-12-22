package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Grid
import Microsoft.UI.Xaml.Controls.Primitives.IMonochromaticOverlayPresenterFactory.ABI.IID
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

@ABIMarker(MonochromaticOverlayPresenter.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.MonochromaticOverlayPresenter;{3f0d1e92-5450-5078-8f72-5ac1749976e3})")
@WinRTByReference(brClass = MonochromaticOverlayPresenter.ByReference::class)
public open class MonochromaticOverlayPresenter(
  ptr: JNAPointer? = NULL
) : Grid(ptr), IMonochromaticOverlayPresenter.WithDefault, IWinRTObject {
  private val __1505736316_Interface: IMonochromaticOverlayPresenter.WithDefault by lazy {
    as_1505736316()
  }


  public override val __1505736316_Ptr: JNAPointer? by lazy {
    __1505736316_Interface.__1505736316_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1505736316_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1505736316(): IMonochromaticOverlayPresenter.WithDefault {
    if(pointer == NULL) {
      return(IMonochromaticOverlayPresenter.ABI.makeIMonochromaticOverlayPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMonochromaticOverlayPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMonochromaticOverlayPresenter.ABI.makeIMonochromaticOverlayPresenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MonochromaticOverlayPresenter> {
    public override fun getValue() = MonochromaticOverlayPresenter(pointer.getPointer(0))

    public fun setValue(value: MonochromaticOverlayPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MonochromaticOverlayPresenter, MemoryAddress> {
    public val IMonochromaticOverlayPresenterStatics_Instance: IMonochromaticOverlayPresenterStatics
        by lazy {
      createIMonochromaticOverlayPresenterStatics()
    }


    public val IMonochromaticOverlayPresenterFactory_Instance: IMonochromaticOverlayPresenterFactory
        by lazy {
      createIMonochromaticOverlayPresenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMonochromaticOverlayPresenterStatics():
        IMonochromaticOverlayPresenterStatics {
      val refiid = Guid.REFIID(IMonochromaticOverlayPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.MonochromaticOverlayPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IMonochromaticOverlayPresenterStatics.ABI.makeIMonochromaticOverlayPresenterStatics(interfacePtr.value)
      return result
    }

    public fun createIMonochromaticOverlayPresenterFactory():
        IMonochromaticOverlayPresenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.MonochromaticOverlayPresenter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMonochromaticOverlayPresenterFactory.ABI.makeIMonochromaticOverlayPresenterFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IMonochromaticOverlayPresenterFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MonochromaticOverlayPresenter {
      val address = segment.toRawLongValue()
      return MonochromaticOverlayPresenter(Pointer(address))
    }

    public override fun toNative(obj: MonochromaticOverlayPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SourceElementProperty() =
        ABI.IMonochromaticOverlayPresenterStatics_Instance.get_SourceElementProperty()

    public fun get_ReplacementColorProperty() =
        ABI.IMonochromaticOverlayPresenterStatics_Instance.get_ReplacementColorProperty()
  }
}
