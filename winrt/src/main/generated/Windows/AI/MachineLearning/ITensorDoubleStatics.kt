package Windows.AI.MachineLearning

import Windows.Foundation.Collections.IIterable
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
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorDoubleStatics.ABI::class)
@Signature("{a86693c5-9538-44e7-a3ca-5df374a5a70c}")
@Guid("a86693c5953844e7a3ca5df374a5a70c")
@WinRTInterface("a86693c5953844e7a3ca5df374a5a70c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorDoubleStatics.ByReference::class)
public interface ITensorDoubleStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(): TensorDouble?

  @InterfaceMethod(1)
  public fun Create(shape: IIterable<Long>?): TensorDouble?

  @InterfaceMethod(2)
  public fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Double>): TensorDouble?

  @InterfaceMethod(3)
  public fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Double>?): TensorDouble?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorDoubleStatics> {
    public override fun getValue() = ABI.makeITensorDoubleStatics(pointer.getPointer(0))

    public fun setValue(value: ITensorDoubleStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorDoubleStatics {
    public val __1466848548_Ptr: Pointer?

    public val _1466848548_VtblPtr: Pointer?
      get() = __1466848548_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(): TensorDouble? {
      val fnPtr = _1466848548_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorDouble>()
      val hr = fn.invokeHR(arrayOf(__1466848548_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorDouble>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Create(shape: IIterable<Long>?): TensorDouble? {
      val fnPtr = _1466848548_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorDouble>()
      val hr = fn.invokeHR(arrayOf(__1466848548_Ptr, marshalToNative(shape), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorDouble>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Double>):
        TensorDouble? {
      val fnPtr = _1466848548_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorDouble>()
      val hr = fn.invokeHR(arrayOf(__1466848548_Ptr, marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorDouble>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Double>?):
        TensorDouble? {
      val fnPtr = _1466848548_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorDouble>()
      val hr = fn.invokeHR(arrayOf(__1466848548_Ptr, marshalToNative(shape), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorDouble>(result.getValue())
      return resultValue
    }
  }

  public class ITensorDoubleStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1466848548_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorDoubleStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a86693c5953844e7a3ca5df374a5a70c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorDoubleStatics(ptr: Pointer?): WithDefault = ITensorDoubleStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorDoubleStatics {
      val address = segment.toRawLongValue()
      return makeITensorDoubleStatics(Pointer(address))
    }

    public override fun toNative(obj: ITensorDoubleStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1466848548_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorDoubleStatics): Array<ITensorDoubleStatics?> =
        (elements as
        Array<ITensorDoubleStatics?>).castToImpl<ITensorDoubleStatics,ITensorDoubleStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorDoubleStatics?> =
        arrayOfNulls<ITensorDoubleStatics_Impl>(size) as Array<ITensorDoubleStatics?>
  }
}
