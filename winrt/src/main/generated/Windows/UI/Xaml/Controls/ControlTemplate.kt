package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.FrameworkTemplate
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

@ABIMarker(ControlTemplate.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ControlTemplate;{efd2418e-41e0-48bb-8b82-91eda1ba3fe2})")
@WinRTByReference(brClass = ControlTemplate.ByReference::class)
public class ControlTemplate(
  ptr: JNAPointer? = NULL
) : FrameworkTemplate(ptr), IControlTemplate.WithDefault, IWinRTObject {
  private val __572108453_Interface: IControlTemplate.WithDefault by lazy {
    as_572108453()
  }


  public override val __572108453_Ptr: JNAPointer? by lazy {
    __572108453_Interface.__572108453_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__572108453_Interface)

  public constructor() : this(ABI.activate())

  private fun as_572108453(): IControlTemplate.WithDefault {
    if(pointer == NULL) {
      return(IControlTemplate.ABI.makeIControlTemplate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IControlTemplate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IControlTemplate.ABI.makeIControlTemplate(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ControlTemplate> {
    public override fun getValue() = ControlTemplate(pointer.getPointer(0))

    public fun setValue(value: ControlTemplate): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ControlTemplate, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ControlTemplate".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ControlTemplate {
      val address = segment.toRawLongValue()
      return ControlTemplate(Pointer(address))
    }

    public override fun toNative(obj: ControlTemplate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
