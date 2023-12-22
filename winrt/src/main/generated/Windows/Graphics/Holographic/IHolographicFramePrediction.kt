package Windows.Graphics.Holographic

import Windows.Foundation.Collections.IVectorView
import Windows.Perception.PerceptionTimestamp
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

@ABIMarker(IHolographicFramePrediction.ABI::class)
@Signature("{520f4de1-5c0a-4e79-a81e-6abe02bb2739}")
@Guid("520f4de15c0a4e79a81e6abe02bb2739")
@WinRTInterface("520f4de15c0a4e79a81e6abe02bb2739")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicFramePrediction.ByReference::class)
public interface IHolographicFramePrediction : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CameraPoses(): IVectorView<HolographicCameraPose?>?

  @InterfaceMethod(1)
  public fun get_Timestamp(): PerceptionTimestamp?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicFramePrediction> {
    public override fun getValue() = ABI.makeIHolographicFramePrediction(pointer.getPointer(0))

    public fun setValue(value: IHolographicFramePrediction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicFramePrediction {
    public val __663530527_Ptr: Pointer?

    public val _663530527_VtblPtr: Pointer?
      get() = __663530527_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CameraPoses(): IVectorView<HolographicCameraPose?>? {
      val fnPtr = _663530527_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HolographicCameraPose?>>()
      val hr = fn.invokeHR(arrayOf(__663530527_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<HolographicCameraPose?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Timestamp(): PerceptionTimestamp? {
      val fnPtr = _663530527_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionTimestamp>()
      val hr = fn.invokeHR(arrayOf(__663530527_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionTimestamp>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicFramePrediction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __663530527_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicFramePrediction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("520f4de15c0a4e79a81e6abe02bb2739")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicFramePrediction(ptr: Pointer?): WithDefault =
        IHolographicFramePrediction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicFramePrediction {
      val address = segment.toRawLongValue()
      return makeIHolographicFramePrediction(Pointer(address))
    }

    public override fun toNative(obj: IHolographicFramePrediction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__663530527_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicFramePrediction):
        Array<IHolographicFramePrediction?> = (elements as
        Array<IHolographicFramePrediction?>).castToImpl<IHolographicFramePrediction,IHolographicFramePrediction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicFramePrediction?> =
        arrayOfNulls<IHolographicFramePrediction_Impl>(size) as Array<IHolographicFramePrediction?>
  }
}
