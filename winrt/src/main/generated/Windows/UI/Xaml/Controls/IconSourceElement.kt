package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IIconSourceElementFactory.ABI.IID
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

@ABIMarker(IconSourceElement.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.IconSourceElement;{d7a64502-ddda-55cd-b4c9-e79abc8b0ea4})")
@WinRTByReference(brClass = IconSourceElement.ByReference::class)
public open class IconSourceElement(
  ptr: JNAPointer? = NULL
) : IconElement(ptr), IIconSourceElement.WithDefault, IWinRTObject {
  private val __237218252_Interface: IIconSourceElement.WithDefault by lazy {
    as_237218252()
  }


  public override val __237218252_Ptr: JNAPointer? by lazy {
    __237218252_Interface.__237218252_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__237218252_Interface)

  public constructor() : this(ABI.activate())

  private fun as_237218252(): IIconSourceElement.WithDefault {
    if(pointer == NULL) {
      return(IIconSourceElement.ABI.makeIIconSourceElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIconSourceElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIconSourceElement.ABI.makeIIconSourceElement(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IconSourceElement> {
    public override fun getValue() = IconSourceElement(pointer.getPointer(0))

    public fun setValue(value: IconSourceElement): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IconSourceElement, MemoryAddress> {
    public val IIconSourceElementStatics_Instance: IIconSourceElementStatics by lazy {
      createIIconSourceElementStatics()
    }


    public val IIconSourceElementFactory_Instance: IIconSourceElementFactory by lazy {
      createIIconSourceElementFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIIconSourceElementStatics(): IIconSourceElementStatics {
      val refiid = Guid.REFIID(IIconSourceElementStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.IconSourceElement".toHandle(),refiid,interfacePtr)
      val result = IIconSourceElementStatics.ABI.makeIIconSourceElementStatics(interfacePtr.value)
      return result
    }

    public fun createIIconSourceElementFactory(): IIconSourceElementFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.IconSourceElement".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IIconSourceElementFactory.ABI.makeIIconSourceElementFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IIconSourceElementFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): IconSourceElement {
      val address = segment.toRawLongValue()
      return IconSourceElement(Pointer(address))
    }

    public override fun toNative(obj: IconSourceElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IconSourceProperty() =
        ABI.IIconSourceElementStatics_Instance.get_IconSourceProperty()
  }
}
