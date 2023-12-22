package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.ResourceDictionary
import Microsoft.UI.Xaml.UIElement
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

@ABIMarker(XamlControlsResources.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.XamlControlsResources;{918ca043-f42c-5805-861b-62d6d1d0c162})")
@WinRTByReference(brClass = XamlControlsResources.ByReference::class)
public class XamlControlsResources(
  ptr: JNAPointer? = NULL
) : ResourceDictionary(ptr), IXamlControlsResources.WithDefault, IWinRTObject {
  private val __651314368_Interface: IXamlControlsResources.WithDefault by lazy {
    as_651314368()
  }


  public override val __651314368_Ptr: JNAPointer? by lazy {
    __651314368_Interface.__651314368_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__651314368_Interface)

  public constructor() : this(ABI.activate())

  private fun as_651314368(): IXamlControlsResources.WithDefault {
    if(pointer == NULL) {
      return(IXamlControlsResources.ABI.makeIXamlControlsResources(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlControlsResources>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlControlsResources.ABI.makeIXamlControlsResources(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XamlControlsResources> {
    public override fun getValue() = XamlControlsResources(pointer.getPointer(0))

    public fun setValue(value: XamlControlsResources): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlControlsResources, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IXamlControlsResourcesStatics_Instance: IXamlControlsResourcesStatics by lazy {
      createIXamlControlsResourcesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.XamlControlsResources".toHandle(),
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

    public fun createIXamlControlsResourcesStatics(): IXamlControlsResourcesStatics {
      val refiid = Guid.REFIID(IXamlControlsResourcesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.XamlControlsResources".toHandle(),refiid,interfacePtr)
      val result =
          IXamlControlsResourcesStatics.ABI.makeIXamlControlsResourcesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): XamlControlsResources {
      val address = segment.toRawLongValue()
      return XamlControlsResources(Pointer(address))
    }

    public override fun toNative(obj: XamlControlsResources): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun EnsureRevealLights(element: UIElement) =
        ABI.IXamlControlsResourcesStatics_Instance.EnsureRevealLights(element)

    public fun get_UseCompactResourcesProperty() =
        ABI.IXamlControlsResourcesStatics_Instance.get_UseCompactResourcesProperty()
  }
}
