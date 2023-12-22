package Windows.Graphics.Holographic

import Windows.Foundation.Numerics.Vector2
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

@ABIMarker(IHolographicCameraViewportParameters.ABI::class)
@Signature("{80cdf3f7-842a-41e1-93ed-5692ab1fbb10}")
@Guid("80cdf3f7842a41e193ed5692ab1fbb10")
@WinRTInterface("80cdf3f7842a41e193ed5692ab1fbb10")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicCameraViewportParameters.ByReference::class)
public interface IHolographicCameraViewportParameters : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HiddenAreaMesh(): Array<Vector2?>?

  @InterfaceMethod(1)
  public fun get_VisibleAreaMesh(): Array<Vector2?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicCameraViewportParameters> {
    public override fun getValue() =
        ABI.makeIHolographicCameraViewportParameters(pointer.getPointer(0))

    public fun setValue(value: IHolographicCameraViewportParameters_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicCameraViewportParameters {
    public val __388360912_Ptr: Pointer?

    public val _388360912_VtblPtr: Pointer?
      get() = __388360912_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HiddenAreaMesh(): Array<Vector2?>? {
      val fnPtr = _388360912_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<Vector2>()
      val hr = fn.invokeHR(arrayOf(__388360912_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array as Array<Vector2?>
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VisibleAreaMesh(): Array<Vector2?>? {
      val fnPtr = _388360912_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<Vector2>()
      val hr = fn.invokeHR(arrayOf(__388360912_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array as Array<Vector2?>
      return resultValue
    }
  }

  public class IHolographicCameraViewportParameters_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __388360912_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicCameraViewportParameters, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("80cdf3f7842a41e193ed5692ab1fbb10")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicCameraViewportParameters(ptr: Pointer?): WithDefault =
        IHolographicCameraViewportParameters_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicCameraViewportParameters {
      val address = segment.toRawLongValue()
      return makeIHolographicCameraViewportParameters(Pointer(address))
    }

    public override fun toNative(obj: IHolographicCameraViewportParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__388360912_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicCameraViewportParameters):
        Array<IHolographicCameraViewportParameters?> = (elements as
        Array<IHolographicCameraViewportParameters?>).castToImpl<IHolographicCameraViewportParameters,IHolographicCameraViewportParameters_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicCameraViewportParameters?> =
        arrayOfNulls<IHolographicCameraViewportParameters_Impl>(size) as
        Array<IHolographicCameraViewportParameters?>
  }
}
