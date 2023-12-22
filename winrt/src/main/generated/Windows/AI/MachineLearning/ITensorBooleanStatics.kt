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
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorBooleanStatics.ABI::class)
@Signature("{2796862c-2357-49a7-b476-d0aa3dfe6866}")
@Guid("2796862c235749a7b476d0aa3dfe6866")
@WinRTInterface("2796862c235749a7b476d0aa3dfe6866")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorBooleanStatics.ByReference::class)
public interface ITensorBooleanStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(): TensorBoolean?

  @InterfaceMethod(1)
  public fun Create(shape: IIterable<Long>?): TensorBoolean?

  @InterfaceMethod(2)
  public fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Boolean>): TensorBoolean?

  @InterfaceMethod(3)
  public fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Boolean>?):
      TensorBoolean?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorBooleanStatics> {
    public override fun getValue() = ABI.makeITensorBooleanStatics(pointer.getPointer(0))

    public fun setValue(value: ITensorBooleanStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorBooleanStatics {
    public val __1945049259_Ptr: Pointer?

    public val _1945049259_VtblPtr: Pointer?
      get() = __1945049259_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(): TensorBoolean? {
      val fnPtr = _1945049259_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorBoolean>()
      val hr = fn.invokeHR(arrayOf(__1945049259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorBoolean>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Create(shape: IIterable<Long>?): TensorBoolean? {
      val fnPtr = _1945049259_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorBoolean>()
      val hr = fn.invokeHR(arrayOf(__1945049259_Ptr, marshalToNative(shape), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorBoolean>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Boolean>):
        TensorBoolean? {
      val fnPtr = _1945049259_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorBoolean>()
      val hr = fn.invokeHR(arrayOf(__1945049259_Ptr, marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorBoolean>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Boolean>?):
        TensorBoolean? {
      val fnPtr = _1945049259_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorBoolean>()
      val hr = fn.invokeHR(arrayOf(__1945049259_Ptr, marshalToNative(shape), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorBoolean>(result.getValue())
      return resultValue
    }
  }

  public class ITensorBooleanStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1945049259_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorBooleanStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2796862c235749a7b476d0aa3dfe6866")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorBooleanStatics(ptr: Pointer?): WithDefault =
        ITensorBooleanStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorBooleanStatics {
      val address = segment.toRawLongValue()
      return makeITensorBooleanStatics(Pointer(address))
    }

    public override fun toNative(obj: ITensorBooleanStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1945049259_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorBooleanStatics): Array<ITensorBooleanStatics?> =
        (elements as
        Array<ITensorBooleanStatics?>).castToImpl<ITensorBooleanStatics,ITensorBooleanStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorBooleanStatics?> =
        arrayOfNulls<ITensorBooleanStatics_Impl>(size) as Array<ITensorBooleanStatics?>
  }
}
