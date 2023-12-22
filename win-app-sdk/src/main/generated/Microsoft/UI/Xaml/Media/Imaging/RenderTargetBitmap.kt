package Microsoft.UI.Xaml.Media.Imaging

import Microsoft.UI.Xaml.Media.ImageSource
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

@ABIMarker(RenderTargetBitmap.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Imaging.RenderTargetBitmap;{cf10407d-fa8b-57a3-9574-710529ae0b04})")
@WinRTByReference(brClass = RenderTargetBitmap.ByReference::class)
public class RenderTargetBitmap(
  ptr: JNAPointer? = NULL
) : ImageSource(ptr), IRenderTargetBitmap.WithDefault, IWinRTObject {
  private val __1186267843_Interface: IRenderTargetBitmap.WithDefault by lazy {
    as_1186267843()
  }


  public override val __1186267843_Ptr: JNAPointer? by lazy {
    __1186267843_Interface.__1186267843_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1186267843_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1186267843(): IRenderTargetBitmap.WithDefault {
    if(pointer == NULL) {
      return(IRenderTargetBitmap.ABI.makeIRenderTargetBitmap(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRenderTargetBitmap>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRenderTargetBitmap.ABI.makeIRenderTargetBitmap(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RenderTargetBitmap> {
    public override fun getValue() = RenderTargetBitmap(pointer.getPointer(0))

    public fun setValue(value: RenderTargetBitmap): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RenderTargetBitmap, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IRenderTargetBitmapStatics_Instance: IRenderTargetBitmapStatics by lazy {
      createIRenderTargetBitmapStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Imaging.RenderTargetBitmap".toHandle(),
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

    public fun createIRenderTargetBitmapStatics(): IRenderTargetBitmapStatics {
      val refiid = Guid.REFIID(IRenderTargetBitmapStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Imaging.RenderTargetBitmap".toHandle(),refiid,interfacePtr)
      val result = IRenderTargetBitmapStatics.ABI.makeIRenderTargetBitmapStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RenderTargetBitmap {
      val address = segment.toRawLongValue()
      return RenderTargetBitmap(Pointer(address))
    }

    public override fun toNative(obj: RenderTargetBitmap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PixelWidthProperty() =
        ABI.IRenderTargetBitmapStatics_Instance.get_PixelWidthProperty()

    public fun get_PixelHeightProperty() =
        ABI.IRenderTargetBitmapStatics_Instance.get_PixelHeightProperty()
  }
}
