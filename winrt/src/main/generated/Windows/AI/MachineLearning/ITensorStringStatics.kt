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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorStringStatics.ABI::class)
@Signature("{83623324-cf26-4f17-a2d4-20ef8d097d53}")
@Guid("83623324cf264f17a2d420ef8d097d53")
@WinRTInterface("83623324cf264f17a2d420ef8d097d53")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorStringStatics.ByReference::class)
public interface ITensorStringStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(): TensorString?

  @InterfaceMethod(1)
  public fun Create(shape: IIterable<Long>?): TensorString?

  @InterfaceMethod(2)
  public fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<String?>): TensorString?

  @InterfaceMethod(3)
  public fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<String?>?): TensorString?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorStringStatics> {
    public override fun getValue() = ABI.makeITensorStringStatics(pointer.getPointer(0))

    public fun setValue(value: ITensorStringStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorStringStatics {
    public val __1336508772_Ptr: Pointer?

    public val _1336508772_VtblPtr: Pointer?
      get() = __1336508772_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(): TensorString? {
      val fnPtr = _1336508772_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorString>()
      val hr = fn.invokeHR(arrayOf(__1336508772_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorString>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Create(shape: IIterable<Long>?): TensorString? {
      val fnPtr = _1336508772_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorString>()
      val hr = fn.invokeHR(arrayOf(__1336508772_Ptr, marshalToNative(shape), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorString>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<String?>):
        TensorString? {
      val fnPtr = _1336508772_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorString>()
      val hr = fn.invokeHR(arrayOf(__1336508772_Ptr, marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorString>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<String?>?):
        TensorString? {
      val fnPtr = _1336508772_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorString>()
      val hr = fn.invokeHR(arrayOf(__1336508772_Ptr, marshalToNative(shape), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorString>(result.getValue())
      return resultValue
    }
  }

  public class ITensorStringStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1336508772_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorStringStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("83623324cf264f17a2d420ef8d097d53")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorStringStatics(ptr: Pointer?): WithDefault = ITensorStringStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorStringStatics {
      val address = segment.toRawLongValue()
      return makeITensorStringStatics(Pointer(address))
    }

    public override fun toNative(obj: ITensorStringStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1336508772_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorStringStatics): Array<ITensorStringStatics?> =
        (elements as
        Array<ITensorStringStatics?>).castToImpl<ITensorStringStatics,ITensorStringStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorStringStatics?> =
        arrayOfNulls<ITensorStringStatics_Impl>(size) as Array<ITensorStringStatics?>
  }
}
