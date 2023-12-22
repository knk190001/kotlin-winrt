package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IAnnotatedScrollBarFactory.ABI.IID
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

@ABIMarker(AnnotatedScrollBar.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.AnnotatedScrollBar;{0f4904a9-b6f9-5834-8d5d-59bc3b7b7ee2})")
@WinRTByReference(brClass = AnnotatedScrollBar.ByReference::class)
public open class AnnotatedScrollBar(
  ptr: JNAPointer? = NULL
) : Control(ptr), IAnnotatedScrollBar.WithDefault, IWinRTObject {
  private val __1170462123_Interface: IAnnotatedScrollBar.WithDefault by lazy {
    as_1170462123()
  }


  public override val __1170462123_Ptr: JNAPointer? by lazy {
    __1170462123_Interface.__1170462123_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1170462123_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1170462123(): IAnnotatedScrollBar.WithDefault {
    if(pointer == NULL) {
      return(IAnnotatedScrollBar.ABI.makeIAnnotatedScrollBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnnotatedScrollBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnnotatedScrollBar.ABI.makeIAnnotatedScrollBar(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AnnotatedScrollBar> {
    public override fun getValue() = AnnotatedScrollBar(pointer.getPointer(0))

    public fun setValue(value: AnnotatedScrollBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AnnotatedScrollBar, MemoryAddress> {
    public val IAnnotatedScrollBarStatics_Instance: IAnnotatedScrollBarStatics by lazy {
      createIAnnotatedScrollBarStatics()
    }


    public val IAnnotatedScrollBarFactory_Instance: IAnnotatedScrollBarFactory by lazy {
      createIAnnotatedScrollBarFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAnnotatedScrollBarStatics(): IAnnotatedScrollBarStatics {
      val refiid = Guid.REFIID(IAnnotatedScrollBarStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AnnotatedScrollBar".toHandle(),refiid,interfacePtr)
      val result = IAnnotatedScrollBarStatics.ABI.makeIAnnotatedScrollBarStatics(interfacePtr.value)
      return result
    }

    public fun createIAnnotatedScrollBarFactory(): IAnnotatedScrollBarFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AnnotatedScrollBar".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAnnotatedScrollBarFactory.ABI.makeIAnnotatedScrollBarFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IAnnotatedScrollBarFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AnnotatedScrollBar {
      val address = segment.toRawLongValue()
      return AnnotatedScrollBar(Pointer(address))
    }

    public override fun toNative(obj: AnnotatedScrollBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LabelsProperty() = ABI.IAnnotatedScrollBarStatics_Instance.get_LabelsProperty()

    public fun get_LabelTemplateProperty() =
        ABI.IAnnotatedScrollBarStatics_Instance.get_LabelTemplateProperty()

    public fun get_DetailLabelTemplateProperty() =
        ABI.IAnnotatedScrollBarStatics_Instance.get_DetailLabelTemplateProperty()

    public fun get_SmallChangeProperty() =
        ABI.IAnnotatedScrollBarStatics_Instance.get_SmallChangeProperty()
  }
}
