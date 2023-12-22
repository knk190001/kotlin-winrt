package Windows.Graphics.Holographic

import Windows.Foundation.Size
import Windows.Graphics.DirectX.DirectXPixelFormat
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

@ABIMarker(IHolographicQuadLayerFactory.ABI::class)
@Signature("{a67538f3-5a14-5a10-489a-455065b37b76}")
@Guid("a67538f35a145a10489a455065b37b76")
@WinRTInterface("a67538f35a145a10489a455065b37b76")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicQuadLayerFactory.ByReference::class)
public interface IHolographicQuadLayerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(size: Size?): HolographicQuadLayer?

  @InterfaceMethod(1)
  public fun CreateWithPixelFormat(size: Size?, pixelFormat: DirectXPixelFormat?):
      HolographicQuadLayer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicQuadLayerFactory> {
    public override fun getValue() = ABI.makeIHolographicQuadLayerFactory(pointer.getPointer(0))

    public fun setValue(value: IHolographicQuadLayerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicQuadLayerFactory {
    public val __779247621_Ptr: Pointer?

    public val _779247621_VtblPtr: Pointer?
      get() = __779247621_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(size: Size?): HolographicQuadLayer? {
      val fnPtr = _779247621_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicQuadLayer>()
      val hr = fn.invokeHR(arrayOf(__779247621_Ptr, marshalToNative(size), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicQuadLayer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithPixelFormat(size: Size?, pixelFormat: DirectXPixelFormat?):
        HolographicQuadLayer? {
      val fnPtr = _779247621_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicQuadLayer>()
      val hr = fn.invokeHR(arrayOf(__779247621_Ptr, marshalToNative(size),
          marshalToNative(pixelFormat), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicQuadLayer>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicQuadLayerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __779247621_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicQuadLayerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a67538f35a145a10489a455065b37b76")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicQuadLayerFactory(ptr: Pointer?): WithDefault =
        IHolographicQuadLayerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicQuadLayerFactory {
      val address = segment.toRawLongValue()
      return makeIHolographicQuadLayerFactory(Pointer(address))
    }

    public override fun toNative(obj: IHolographicQuadLayerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__779247621_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicQuadLayerFactory):
        Array<IHolographicQuadLayerFactory?> = (elements as
        Array<IHolographicQuadLayerFactory?>).castToImpl<IHolographicQuadLayerFactory,IHolographicQuadLayerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicQuadLayerFactory?> =
        arrayOfNulls<IHolographicQuadLayerFactory_Impl>(size) as
        Array<IHolographicQuadLayerFactory?>
  }
}
