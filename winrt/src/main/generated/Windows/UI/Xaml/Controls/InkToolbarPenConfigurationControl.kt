package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IInkToolbarPenConfigurationControlFactory.ABI.IID
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

@ABIMarker(InkToolbarPenConfigurationControl.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.InkToolbarPenConfigurationControl;{601ae5f6-28a5-44cc-89a6-380e91a572dd})")
@WinRTByReference(brClass = InkToolbarPenConfigurationControl.ByReference::class)
public open class InkToolbarPenConfigurationControl(
  ptr: JNAPointer? = NULL
) : Control(ptr), IInkToolbarPenConfigurationControl.WithDefault, IWinRTObject {
  private val __987790639_Interface: IInkToolbarPenConfigurationControl.WithDefault by lazy {
    as_987790639()
  }


  public override val __987790639_Ptr: JNAPointer? by lazy {
    __987790639_Interface.__987790639_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__987790639_Interface)

  public constructor() : this(ABI.activate())

  private fun as_987790639(): IInkToolbarPenConfigurationControl.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarPenConfigurationControl.ABI.makeIInkToolbarPenConfigurationControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarPenConfigurationControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarPenConfigurationControl.ABI.makeIInkToolbarPenConfigurationControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkToolbarPenConfigurationControl> {
    public override fun getValue() = InkToolbarPenConfigurationControl(pointer.getPointer(0))

    public fun setValue(value: InkToolbarPenConfigurationControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkToolbarPenConfigurationControl, MemoryAddress> {
    public val IInkToolbarPenConfigurationControlStatics_Instance:
        IInkToolbarPenConfigurationControlStatics by lazy {
      createIInkToolbarPenConfigurationControlStatics()
    }


    public val IInkToolbarPenConfigurationControlFactory_Instance:
        IInkToolbarPenConfigurationControlFactory by lazy {
      createIInkToolbarPenConfigurationControlFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkToolbarPenConfigurationControlStatics():
        IInkToolbarPenConfigurationControlStatics {
      val refiid = Guid.REFIID(IInkToolbarPenConfigurationControlStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarPenConfigurationControl".toHandle(),refiid,interfacePtr)
      val result =
          IInkToolbarPenConfigurationControlStatics.ABI.makeIInkToolbarPenConfigurationControlStatics(interfacePtr.value)
      return result
    }

    public fun createIInkToolbarPenConfigurationControlFactory():
        IInkToolbarPenConfigurationControlFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarPenConfigurationControl".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInkToolbarPenConfigurationControlFactory.ABI.makeIInkToolbarPenConfigurationControlFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IInkToolbarPenConfigurationControlFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InkToolbarPenConfigurationControl {
      val address = segment.toRawLongValue()
      return InkToolbarPenConfigurationControl(Pointer(address))
    }

    public override fun toNative(obj: InkToolbarPenConfigurationControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PenButtonProperty() =
        ABI.IInkToolbarPenConfigurationControlStatics_Instance.get_PenButtonProperty()
  }
}
