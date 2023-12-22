package Windows.AI.MachineLearning

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorDouble.ABI::class)
@Signature("{91e41252-7a8f-4f0e-a28f-9637ffc8a3d0}")
@Guid("91e412527a8f4f0ea28f9637ffc8a3d0")
@WinRTInterface("91e412527a8f4f0ea28f9637ffc8a3d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorDouble.ByReference::class)
public interface ITensorDouble : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAsVectorView(): IVectorView<Double>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITensorDouble>
      {
    public override fun getValue() = ABI.makeITensorDouble(pointer.getPointer(0))

    public fun setValue(value: ITensorDouble_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorDouble {
    public val __349441193_Ptr: Pointer?

    public val _349441193_VtblPtr: Pointer?
      get() = __349441193_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAsVectorView(): IVectorView<Double>? {
      val fnPtr = _349441193_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Double>>()
      val hr = fn.invokeHR(arrayOf(__349441193_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Double>>(result.getValue())
      return resultValue
    }
  }

  public class ITensorDouble_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __349441193_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorDouble, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("91e412527a8f4f0ea28f9637ffc8a3d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorDouble(ptr: Pointer?): WithDefault = ITensorDouble_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorDouble {
      val address = segment.toRawLongValue()
      return makeITensorDouble(Pointer(address))
    }

    public override fun toNative(obj: ITensorDouble): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__349441193_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorDouble): Array<ITensorDouble?> = (elements as
        Array<ITensorDouble?>).castToImpl<ITensorDouble,ITensorDouble_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorDouble?> =
        arrayOfNulls<ITensorDouble_Impl>(size) as Array<ITensorDouble?>
  }
}
