package Windows.Graphics.Holographic

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

@ABIMarker(IHolographicCameraRenderingParameters4.ABI::class)
@Signature("{0878fa4c-e163-57dc-82b7-c406ab3e0537}")
@Guid("0878fa4ce16357dc82b7c406ab3e0537")
@WinRTInterface("0878fa4ce16357dc82b7c406ab3e0537")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicCameraRenderingParameters4.ByReference::class)
public interface IHolographicCameraRenderingParameters4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DepthReprojectionMethod(): HolographicDepthReprojectionMethod?

  @InterfaceMethod(1)
  public fun put_DepthReprojectionMethod(value: HolographicDepthReprojectionMethod?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicCameraRenderingParameters4> {
    public override fun getValue() =
        ABI.makeIHolographicCameraRenderingParameters4(pointer.getPointer(0))

    public fun setValue(value: IHolographicCameraRenderingParameters4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicCameraRenderingParameters4 {
    public val __295440130_Ptr: Pointer?

    public val _295440130_VtblPtr: Pointer?
      get() = __295440130_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DepthReprojectionMethod(): HolographicDepthReprojectionMethod? {
      val fnPtr = _295440130_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicDepthReprojectionMethod>()
      val hr = fn.invokeHR(arrayOf(__295440130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicDepthReprojectionMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DepthReprojectionMethod(value: HolographicDepthReprojectionMethod?):
        Unit {
      val fnPtr = _295440130_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__295440130_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHolographicCameraRenderingParameters4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __295440130_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicCameraRenderingParameters4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0878fa4ce16357dc82b7c406ab3e0537")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicCameraRenderingParameters4(ptr: Pointer?): WithDefault =
        IHolographicCameraRenderingParameters4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicCameraRenderingParameters4 {
      val address = segment.toRawLongValue()
      return makeIHolographicCameraRenderingParameters4(Pointer(address))
    }

    public override fun toNative(obj: IHolographicCameraRenderingParameters4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__295440130_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicCameraRenderingParameters4):
        Array<IHolographicCameraRenderingParameters4?> = (elements as
        Array<IHolographicCameraRenderingParameters4?>).castToImpl<IHolographicCameraRenderingParameters4,IHolographicCameraRenderingParameters4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicCameraRenderingParameters4?> =
        arrayOfNulls<IHolographicCameraRenderingParameters4_Impl>(size) as
        Array<IHolographicCameraRenderingParameters4?>
  }
}
