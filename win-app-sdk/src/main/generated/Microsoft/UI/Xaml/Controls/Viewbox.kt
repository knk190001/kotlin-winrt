package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.FrameworkElement
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

@ABIMarker(Viewbox.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Viewbox;{510683e8-d0fe-5ef4-85bd-e1131076ac22})")
@WinRTByReference(brClass = Viewbox.ByReference::class)
public class Viewbox(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IViewbox.WithDefault, IWinRTObject {
  private val __1494976161_Interface: IViewbox.WithDefault by lazy {
    as_1494976161()
  }


  public override val __1494976161_Ptr: JNAPointer? by lazy {
    __1494976161_Interface.__1494976161_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1494976161_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1494976161(): IViewbox.WithDefault {
    if(pointer == NULL) {
      return(IViewbox.ABI.makeIViewbox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IViewbox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IViewbox.ABI.makeIViewbox(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Viewbox> {
    public override fun getValue() = Viewbox(pointer.getPointer(0))

    public fun setValue(value: Viewbox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Viewbox, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IViewboxStatics_Instance: IViewboxStatics by lazy {
      createIViewboxStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Viewbox".toHandle(),
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

    public fun createIViewboxStatics(): IViewboxStatics {
      val refiid = Guid.REFIID(IViewboxStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Viewbox".toHandle(),refiid,interfacePtr)
      val result = IViewboxStatics.ABI.makeIViewboxStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Viewbox {
      val address = segment.toRawLongValue()
      return Viewbox(Pointer(address))
    }

    public override fun toNative(obj: Viewbox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_StretchProperty() = ABI.IViewboxStatics_Instance.get_StretchProperty()

    public fun get_StretchDirectionProperty() =
        ABI.IViewboxStatics_Instance.get_StretchDirectionProperty()
  }
}
