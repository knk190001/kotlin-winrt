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
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorFloatStatics.ABI::class)
@Signature("{dbcd395b-3ba3-452f-b10d-3c135e573fa9}")
@Guid("dbcd395b3ba3452fb10d3c135e573fa9")
@WinRTInterface("dbcd395b3ba3452fb10d3c135e573fa9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorFloatStatics.ByReference::class)
public interface ITensorFloatStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(): TensorFloat?

  @InterfaceMethod(1)
  public fun Create(shape: IIterable<Long>?): TensorFloat?

  @InterfaceMethod(2)
  public fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Float>): TensorFloat?

  @InterfaceMethod(3)
  public fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Float>?): TensorFloat?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorFloatStatics> {
    public override fun getValue() = ABI.makeITensorFloatStatics(pointer.getPointer(0))

    public fun setValue(value: ITensorFloatStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorFloatStatics {
    public val __833152161_Ptr: Pointer?

    public val _833152161_VtblPtr: Pointer?
      get() = __833152161_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(): TensorFloat? {
      val fnPtr = _833152161_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorFloat>()
      val hr = fn.invokeHR(arrayOf(__833152161_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorFloat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Create(shape: IIterable<Long>?): TensorFloat? {
      val fnPtr = _833152161_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorFloat>()
      val hr = fn.invokeHR(arrayOf(__833152161_Ptr, marshalToNative(shape), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorFloat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Float>):
        TensorFloat? {
      val fnPtr = _833152161_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorFloat>()
      val hr = fn.invokeHR(arrayOf(__833152161_Ptr, marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorFloat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Float>?):
        TensorFloat? {
      val fnPtr = _833152161_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorFloat>()
      val hr = fn.invokeHR(arrayOf(__833152161_Ptr, marshalToNative(shape), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorFloat>(result.getValue())
      return resultValue
    }
  }

  public class ITensorFloatStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __833152161_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorFloatStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dbcd395b3ba3452fb10d3c135e573fa9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorFloatStatics(ptr: Pointer?): WithDefault = ITensorFloatStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorFloatStatics {
      val address = segment.toRawLongValue()
      return makeITensorFloatStatics(Pointer(address))
    }

    public override fun toNative(obj: ITensorFloatStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__833152161_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorFloatStatics): Array<ITensorFloatStatics?> =
        (elements as
        Array<ITensorFloatStatics?>).castToImpl<ITensorFloatStatics,ITensorFloatStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorFloatStatics?> =
        arrayOfNulls<ITensorFloatStatics_Impl>(size) as Array<ITensorFloatStatics?>
  }
}
