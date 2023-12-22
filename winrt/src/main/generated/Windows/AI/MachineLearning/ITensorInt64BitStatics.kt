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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorInt64BitStatics.ABI::class)
@Signature("{9648ad9d-1198-4d74-9517-783ab62b9cc2}")
@Guid("9648ad9d11984d749517783ab62b9cc2")
@WinRTInterface("9648ad9d11984d749517783ab62b9cc2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorInt64BitStatics.ByReference::class)
public interface ITensorInt64BitStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(): TensorInt64Bit?

  @InterfaceMethod(1)
  public fun Create(shape: IIterable<Long>?): TensorInt64Bit?

  @InterfaceMethod(2)
  public fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Long>): TensorInt64Bit?

  @InterfaceMethod(3)
  public fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Long>?): TensorInt64Bit?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorInt64BitStatics> {
    public override fun getValue() = ABI.makeITensorInt64BitStatics(pointer.getPointer(0))

    public fun setValue(value: ITensorInt64BitStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorInt64BitStatics {
    public val __1241635565_Ptr: Pointer?

    public val _1241635565_VtblPtr: Pointer?
      get() = __1241635565_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(): TensorInt64Bit? {
      val fnPtr = _1241635565_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt64Bit>()
      val hr = fn.invokeHR(arrayOf(__1241635565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt64Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Create(shape: IIterable<Long>?): TensorInt64Bit? {
      val fnPtr = _1241635565_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt64Bit>()
      val hr = fn.invokeHR(arrayOf(__1241635565_Ptr, marshalToNative(shape), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt64Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Long>):
        TensorInt64Bit? {
      val fnPtr = _1241635565_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt64Bit>()
      val hr = fn.invokeHR(arrayOf(__1241635565_Ptr, marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt64Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Long>?):
        TensorInt64Bit? {
      val fnPtr = _1241635565_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt64Bit>()
      val hr = fn.invokeHR(arrayOf(__1241635565_Ptr, marshalToNative(shape), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt64Bit>(result.getValue())
      return resultValue
    }
  }

  public class ITensorInt64BitStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1241635565_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorInt64BitStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9648ad9d11984d749517783ab62b9cc2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorInt64BitStatics(ptr: Pointer?): WithDefault =
        ITensorInt64BitStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorInt64BitStatics {
      val address = segment.toRawLongValue()
      return makeITensorInt64BitStatics(Pointer(address))
    }

    public override fun toNative(obj: ITensorInt64BitStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1241635565_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorInt64BitStatics): Array<ITensorInt64BitStatics?> =
        (elements as
        Array<ITensorInt64BitStatics?>).castToImpl<ITensorInt64BitStatics,ITensorInt64BitStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorInt64BitStatics?> =
        arrayOfNulls<ITensorInt64BitStatics_Impl>(size) as Array<ITensorInt64BitStatics?>
  }
}
