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
import kotlin.Int
import kotlin.Long
import kotlin.Short
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorInt16BitStatics.ABI::class)
@Signature("{98646293-266e-4b1a-821f-e60d70898b91}")
@Guid("98646293266e4b1a821fe60d70898b91")
@WinRTInterface("98646293266e4b1a821fe60d70898b91")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorInt16BitStatics.ByReference::class)
public interface ITensorInt16BitStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(): TensorInt16Bit?

  @InterfaceMethod(1)
  public fun Create(shape: IIterable<Long>?): TensorInt16Bit?

  @InterfaceMethod(2)
  public fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Short>): TensorInt16Bit?

  @InterfaceMethod(3)
  public fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Short>?): TensorInt16Bit?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorInt16BitStatics> {
    public override fun getValue() = ABI.makeITensorInt16BitStatics(pointer.getPointer(0))

    public fun setValue(value: ITensorInt16BitStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorInt16BitStatics {
    public val __1297286548_Ptr: Pointer?

    public val _1297286548_VtblPtr: Pointer?
      get() = __1297286548_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(): TensorInt16Bit? {
      val fnPtr = _1297286548_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt16Bit>()
      val hr = fn.invokeHR(arrayOf(__1297286548_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt16Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Create(shape: IIterable<Long>?): TensorInt16Bit? {
      val fnPtr = _1297286548_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt16Bit>()
      val hr = fn.invokeHR(arrayOf(__1297286548_Ptr, marshalToNative(shape), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt16Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Short>):
        TensorInt16Bit? {
      val fnPtr = _1297286548_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt16Bit>()
      val hr = fn.invokeHR(arrayOf(__1297286548_Ptr, marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt16Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Short>?):
        TensorInt16Bit? {
      val fnPtr = _1297286548_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt16Bit>()
      val hr = fn.invokeHR(arrayOf(__1297286548_Ptr, marshalToNative(shape), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt16Bit>(result.getValue())
      return resultValue
    }
  }

  public class ITensorInt16BitStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1297286548_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorInt16BitStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("98646293266e4b1a821fe60d70898b91")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorInt16BitStatics(ptr: Pointer?): WithDefault =
        ITensorInt16BitStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorInt16BitStatics {
      val address = segment.toRawLongValue()
      return makeITensorInt16BitStatics(Pointer(address))
    }

    public override fun toNative(obj: ITensorInt16BitStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1297286548_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorInt16BitStatics): Array<ITensorInt16BitStatics?> =
        (elements as
        Array<ITensorInt16BitStatics?>).castToImpl<ITensorInt16BitStatics,ITensorInt16BitStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorInt16BitStatics?> =
        arrayOfNulls<ITensorInt16BitStatics_Impl>(size) as Array<ITensorInt16BitStatics?>
  }
}
