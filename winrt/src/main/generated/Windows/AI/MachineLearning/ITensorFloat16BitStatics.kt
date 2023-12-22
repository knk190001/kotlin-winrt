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

@ABIMarker(ITensorFloat16BitStatics.ABI::class)
@Signature("{a52db6f5-318a-44d4-820b-0cdc7054a84a}")
@Guid("a52db6f5318a44d4820b0cdc7054a84a")
@WinRTInterface("a52db6f5318a44d4820b0cdc7054a84a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorFloat16BitStatics.ByReference::class)
public interface ITensorFloat16BitStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(): TensorFloat16Bit?

  @InterfaceMethod(1)
  public fun Create(shape: IIterable<Long>?): TensorFloat16Bit?

  @InterfaceMethod(2)
  public fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Float>): TensorFloat16Bit?

  @InterfaceMethod(3)
  public fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Float>?):
      TensorFloat16Bit?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorFloat16BitStatics> {
    public override fun getValue() = ABI.makeITensorFloat16BitStatics(pointer.getPointer(0))

    public fun setValue(value: ITensorFloat16BitStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorFloat16BitStatics {
    public val __507745663_Ptr: Pointer?

    public val _507745663_VtblPtr: Pointer?
      get() = __507745663_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(): TensorFloat16Bit? {
      val fnPtr = _507745663_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorFloat16Bit>()
      val hr = fn.invokeHR(arrayOf(__507745663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorFloat16Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Create(shape: IIterable<Long>?): TensorFloat16Bit? {
      val fnPtr = _507745663_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorFloat16Bit>()
      val hr = fn.invokeHR(arrayOf(__507745663_Ptr, marshalToNative(shape), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorFloat16Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Float>):
        TensorFloat16Bit? {
      val fnPtr = _507745663_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorFloat16Bit>()
      val hr = fn.invokeHR(arrayOf(__507745663_Ptr, marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorFloat16Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Float>?):
        TensorFloat16Bit? {
      val fnPtr = _507745663_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorFloat16Bit>()
      val hr = fn.invokeHR(arrayOf(__507745663_Ptr, marshalToNative(shape), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorFloat16Bit>(result.getValue())
      return resultValue
    }
  }

  public class ITensorFloat16BitStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __507745663_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorFloat16BitStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a52db6f5318a44d4820b0cdc7054a84a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorFloat16BitStatics(ptr: Pointer?): WithDefault =
        ITensorFloat16BitStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorFloat16BitStatics {
      val address = segment.toRawLongValue()
      return makeITensorFloat16BitStatics(Pointer(address))
    }

    public override fun toNative(obj: ITensorFloat16BitStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__507745663_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorFloat16BitStatics):
        Array<ITensorFloat16BitStatics?> = (elements as
        Array<ITensorFloat16BitStatics?>).castToImpl<ITensorFloat16BitStatics,ITensorFloat16BitStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorFloat16BitStatics?> =
        arrayOfNulls<ITensorFloat16BitStatics_Impl>(size) as Array<ITensorFloat16BitStatics?>
  }
}
