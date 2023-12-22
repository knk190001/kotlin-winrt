package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IInkToolbarCustomToolButtonFactory.ABI.IID
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

@ABIMarker(InkToolbarCustomToolButton.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.InkToolbarCustomToolButton;{9f98acd7-c605-4105-be10-3943a7c0da3c})")
@WinRTByReference(brClass = InkToolbarCustomToolButton.ByReference::class)
public open class InkToolbarCustomToolButton(
  ptr: JNAPointer? = NULL
) : InkToolbarToolButton(ptr), IInkToolbarCustomToolButton.WithDefault, IWinRTObject {
  private val __1545068844_Interface: IInkToolbarCustomToolButton.WithDefault by lazy {
    as_1545068844()
  }


  public override val __1545068844_Ptr: JNAPointer? by lazy {
    __1545068844_Interface.__1545068844_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1545068844_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1545068844(): IInkToolbarCustomToolButton.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarCustomToolButton.ABI.makeIInkToolbarCustomToolButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarCustomToolButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarCustomToolButton.ABI.makeIInkToolbarCustomToolButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkToolbarCustomToolButton> {
    public override fun getValue() = InkToolbarCustomToolButton(pointer.getPointer(0))

    public fun setValue(value: InkToolbarCustomToolButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkToolbarCustomToolButton, MemoryAddress> {
    public val IInkToolbarCustomToolButtonStatics_Instance: IInkToolbarCustomToolButtonStatics by
        lazy {
      createIInkToolbarCustomToolButtonStatics()
    }


    public val IInkToolbarCustomToolButtonFactory_Instance: IInkToolbarCustomToolButtonFactory by
        lazy {
      createIInkToolbarCustomToolButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkToolbarCustomToolButtonStatics(): IInkToolbarCustomToolButtonStatics {
      val refiid = Guid.REFIID(IInkToolbarCustomToolButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarCustomToolButton".toHandle(),refiid,interfacePtr)
      val result =
          IInkToolbarCustomToolButtonStatics.ABI.makeIInkToolbarCustomToolButtonStatics(interfacePtr.value)
      return result
    }

    public fun createIInkToolbarCustomToolButtonFactory(): IInkToolbarCustomToolButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarCustomToolButton".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInkToolbarCustomToolButtonFactory.ABI.makeIInkToolbarCustomToolButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IInkToolbarCustomToolButtonFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InkToolbarCustomToolButton {
      val address = segment.toRawLongValue()
      return InkToolbarCustomToolButton(Pointer(address))
    }

    public override fun toNative(obj: InkToolbarCustomToolButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ConfigurationContentProperty() =
        ABI.IInkToolbarCustomToolButtonStatics_Instance.get_ConfigurationContentProperty()
  }
}
