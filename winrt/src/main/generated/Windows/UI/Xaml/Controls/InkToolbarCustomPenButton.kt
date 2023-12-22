package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IInkToolbarCustomPenButtonFactory.ABI.IID
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

@ABIMarker(InkToolbarCustomPenButton.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.InkToolbarCustomPenButton;{46024401-2b2a-4f3c-a53c-1a045a408efa})")
@WinRTByReference(brClass = InkToolbarCustomPenButton.ByReference::class)
public open class InkToolbarCustomPenButton(
  ptr: JNAPointer? = NULL
) : InkToolbarPenButton(ptr), IInkToolbarCustomPenButton.WithDefault, IWinRTObject {
  private val __276232407_Interface: IInkToolbarCustomPenButton.WithDefault by lazy {
    as_276232407()
  }


  public override val __276232407_Ptr: JNAPointer? by lazy {
    __276232407_Interface.__276232407_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__276232407_Interface)

  public constructor() : this(ABI.activate())

  private fun as_276232407(): IInkToolbarCustomPenButton.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarCustomPenButton.ABI.makeIInkToolbarCustomPenButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarCustomPenButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarCustomPenButton.ABI.makeIInkToolbarCustomPenButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkToolbarCustomPenButton> {
    public override fun getValue() = InkToolbarCustomPenButton(pointer.getPointer(0))

    public fun setValue(value: InkToolbarCustomPenButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkToolbarCustomPenButton, MemoryAddress> {
    public val IInkToolbarCustomPenButtonStatics_Instance: IInkToolbarCustomPenButtonStatics by
        lazy {
      createIInkToolbarCustomPenButtonStatics()
    }


    public val IInkToolbarCustomPenButtonFactory_Instance: IInkToolbarCustomPenButtonFactory by
        lazy {
      createIInkToolbarCustomPenButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkToolbarCustomPenButtonStatics(): IInkToolbarCustomPenButtonStatics {
      val refiid = Guid.REFIID(IInkToolbarCustomPenButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarCustomPenButton".toHandle(),refiid,interfacePtr)
      val result =
          IInkToolbarCustomPenButtonStatics.ABI.makeIInkToolbarCustomPenButtonStatics(interfacePtr.value)
      return result
    }

    public fun createIInkToolbarCustomPenButtonFactory(): IInkToolbarCustomPenButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarCustomPenButton".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInkToolbarCustomPenButtonFactory.ABI.makeIInkToolbarCustomPenButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IInkToolbarCustomPenButtonFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InkToolbarCustomPenButton {
      val address = segment.toRawLongValue()
      return InkToolbarCustomPenButton(Pointer(address))
    }

    public override fun toNative(obj: InkToolbarCustomPenButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CustomPenProperty() =
        ABI.IInkToolbarCustomPenButtonStatics_Instance.get_CustomPenProperty()

    public fun get_ConfigurationContentProperty() =
        ABI.IInkToolbarCustomPenButtonStatics_Instance.get_ConfigurationContentProperty()
  }
}
