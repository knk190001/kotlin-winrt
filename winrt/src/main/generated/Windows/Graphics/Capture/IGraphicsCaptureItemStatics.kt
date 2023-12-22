package Windows.Graphics.Capture

import Windows.UI.Composition.Visual
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGraphicsCaptureItemStatics.ABI::class)
@Signature("{a87ebea5-457c-5788-ab47-0cf1d3637e74}")
@Guid("a87ebea5457c5788ab470cf1d3637e74")
@WinRTInterface("a87ebea5457c5788ab470cf1d3637e74")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGraphicsCaptureItemStatics.ByReference::class)
public interface IGraphicsCaptureItemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromVisual(visual: Visual?): GraphicsCaptureItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGraphicsCaptureItemStatics> {
    public override fun getValue() = ABI.makeIGraphicsCaptureItemStatics(pointer.getPointer(0))

    public fun setValue(value: IGraphicsCaptureItemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGraphicsCaptureItemStatics {
    public val __637915310_Ptr: Pointer?

    public val _637915310_VtblPtr: Pointer?
      get() = __637915310_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromVisual(visual: Visual?): GraphicsCaptureItem? {
      val fnPtr = _637915310_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GraphicsCaptureItem>()
      val hr = fn.invokeHR(arrayOf(__637915310_Ptr, marshalToNative(visual), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GraphicsCaptureItem>(result.getValue())
      return resultValue
    }
  }

  public class IGraphicsCaptureItemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __637915310_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGraphicsCaptureItemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a87ebea5457c5788ab470cf1d3637e74")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGraphicsCaptureItemStatics(ptr: Pointer?): WithDefault =
        IGraphicsCaptureItemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGraphicsCaptureItemStatics {
      val address = segment.toRawLongValue()
      return makeIGraphicsCaptureItemStatics(Pointer(address))
    }

    public override fun toNative(obj: IGraphicsCaptureItemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__637915310_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGraphicsCaptureItemStatics):
        Array<IGraphicsCaptureItemStatics?> = (elements as
        Array<IGraphicsCaptureItemStatics?>).castToImpl<IGraphicsCaptureItemStatics,IGraphicsCaptureItemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGraphicsCaptureItemStatics?> =
        arrayOfNulls<IGraphicsCaptureItemStatics_Impl>(size) as Array<IGraphicsCaptureItemStatics?>
  }
}
