package Windows.UI.Xaml

import Windows.UI.Xaml.IColorPaletteResourcesFactory.ABI.IID
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

@ABIMarker(ColorPaletteResources.ABI::class)
@Signature("rc(Windows.UI.Xaml.ColorPaletteResources;{258088c4-aef2-5d3f-833b-c36db6278ed9})")
@WinRTByReference(brClass = ColorPaletteResources.ByReference::class)
public open class ColorPaletteResources(
  ptr: JNAPointer? = NULL
) : ResourceDictionary(ptr), IColorPaletteResources.WithDefault, IWinRTObject {
  private val __399470683_Interface: IColorPaletteResources.WithDefault by lazy {
    as_399470683()
  }


  public override val __399470683_Ptr: JNAPointer? by lazy {
    __399470683_Interface.__399470683_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__399470683_Interface)

  public constructor() : this(ABI.activate())

  private fun as_399470683(): IColorPaletteResources.WithDefault {
    if(pointer == NULL) {
      return(IColorPaletteResources.ABI.makeIColorPaletteResources(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IColorPaletteResources>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IColorPaletteResources.ABI.makeIColorPaletteResources(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ColorPaletteResources> {
    public override fun getValue() = ColorPaletteResources(pointer.getPointer(0))

    public fun setValue(value: ColorPaletteResources): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ColorPaletteResources, MemoryAddress> {
    public val IColorPaletteResourcesFactory_Instance: IColorPaletteResourcesFactory by lazy {
      createIColorPaletteResourcesFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIColorPaletteResourcesFactory(): IColorPaletteResourcesFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.ColorPaletteResources".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IColorPaletteResourcesFactory.ABI.makeIColorPaletteResourcesFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IColorPaletteResourcesFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ColorPaletteResources {
      val address = segment.toRawLongValue()
      return ColorPaletteResources(Pointer(address))
    }

    public override fun toNative(obj: ColorPaletteResources): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
