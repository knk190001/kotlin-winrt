package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IInkToolbarEraserButtonFactory.ABI.IID
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

@ABIMarker(InkToolbarEraserButton.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.InkToolbarEraserButton;{4cbdb92e-5f5e-4b35-a41c-16ffb0283bc0})")
@WinRTByReference(brClass = InkToolbarEraserButton.ByReference::class)
public open class InkToolbarEraserButton(
  ptr: JNAPointer? = NULL
) : InkToolbarToolButton(ptr), IInkToolbarEraserButton.WithDefault,
    IInkToolbarEraserButton2.WithDefault, IWinRTObject {
  private val __257934671_Interface: IInkToolbarEraserButton.WithDefault by lazy {
    as_257934671()
  }


  private val __593959741_Interface: IInkToolbarEraserButton2.WithDefault by lazy {
    as_593959741()
  }


  public override val __257934671_Ptr: JNAPointer? by lazy {
    __257934671_Interface.__257934671_Ptr
  }


  public override val __593959741_Ptr: JNAPointer? by lazy {
    __593959741_Interface.__593959741_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__257934671_Interface, __593959741_Interface)

  public constructor() : this(ABI.activate())

  private fun as_257934671(): IInkToolbarEraserButton.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarEraserButton.ABI.makeIInkToolbarEraserButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarEraserButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarEraserButton.ABI.makeIInkToolbarEraserButton(ref.value))
  }

  private fun as_593959741(): IInkToolbarEraserButton2.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarEraserButton2.ABI.makeIInkToolbarEraserButton2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarEraserButton2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarEraserButton2.ABI.makeIInkToolbarEraserButton2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkToolbarEraserButton> {
    public override fun getValue() = InkToolbarEraserButton(pointer.getPointer(0))

    public fun setValue(value: InkToolbarEraserButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkToolbarEraserButton, MemoryAddress> {
    public val IInkToolbarEraserButtonStatics2_Instance: IInkToolbarEraserButtonStatics2 by lazy {
      createIInkToolbarEraserButtonStatics2()
    }


    public val IInkToolbarEraserButtonFactory_Instance: IInkToolbarEraserButtonFactory by lazy {
      createIInkToolbarEraserButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkToolbarEraserButtonStatics2(): IInkToolbarEraserButtonStatics2 {
      val refiid = Guid.REFIID(IInkToolbarEraserButtonStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarEraserButton".toHandle(),refiid,interfacePtr)
      val result =
          IInkToolbarEraserButtonStatics2.ABI.makeIInkToolbarEraserButtonStatics2(interfacePtr.value)
      return result
    }

    public fun createIInkToolbarEraserButtonFactory(): IInkToolbarEraserButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarEraserButton".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInkToolbarEraserButtonFactory.ABI.makeIInkToolbarEraserButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IInkToolbarEraserButtonFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InkToolbarEraserButton {
      val address = segment.toRawLongValue()
      return InkToolbarEraserButton(Pointer(address))
    }

    public override fun toNative(obj: InkToolbarEraserButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsClearAllVisibleProperty() =
        ABI.IInkToolbarEraserButtonStatics2_Instance.get_IsClearAllVisibleProperty()
  }
}
