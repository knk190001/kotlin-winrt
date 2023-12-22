package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.FrameworkElement
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

@ABIMarker(CaptureElement.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.CaptureElement;{31a5c0e7-f307-4d4a-b626-e978863f5b74})")
@WinRTByReference(brClass = CaptureElement.ByReference::class)
public class CaptureElement(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), ICaptureElement.WithDefault, IWinRTObject {
  private val __521318414_Interface: ICaptureElement.WithDefault by lazy {
    as_521318414()
  }


  public override val __521318414_Ptr: JNAPointer? by lazy {
    __521318414_Interface.__521318414_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__521318414_Interface)

  public constructor() : this(ABI.activate())

  private fun as_521318414(): ICaptureElement.WithDefault {
    if(pointer == NULL) {
      return(ICaptureElement.ABI.makeICaptureElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICaptureElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICaptureElement.ABI.makeICaptureElement(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CaptureElement>
      {
    public override fun getValue() = CaptureElement(pointer.getPointer(0))

    public fun setValue(value: CaptureElement): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CaptureElement, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ICaptureElementStatics_Instance: ICaptureElementStatics by lazy {
      createICaptureElementStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.CaptureElement".toHandle(),
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

    public fun createICaptureElementStatics(): ICaptureElementStatics {
      val refiid = Guid.REFIID(ICaptureElementStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.CaptureElement".toHandle(),refiid,interfacePtr)
      val result = ICaptureElementStatics.ABI.makeICaptureElementStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CaptureElement {
      val address = segment.toRawLongValue()
      return CaptureElement(Pointer(address))
    }

    public override fun toNative(obj: CaptureElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SourceProperty() = ABI.ICaptureElementStatics_Instance.get_SourceProperty()

    public fun get_StretchProperty() = ABI.ICaptureElementStatics_Instance.get_StretchProperty()
  }
}
