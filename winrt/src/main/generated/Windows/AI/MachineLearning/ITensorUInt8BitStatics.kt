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
import kotlin.Byte
import kotlin.Int
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorUInt8BitStatics.ABI::class)
@Signature("{05f67583-bc24-4220-8a41-2dcd8c5ed33c}")
@Guid("05f67583bc2442208a412dcd8c5ed33c")
@WinRTInterface("05f67583bc2442208a412dcd8c5ed33c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorUInt8BitStatics.ByReference::class)
public interface ITensorUInt8BitStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(): TensorUInt8Bit?

  @InterfaceMethod(1)
  public fun Create(shape: IIterable<Long>?): TensorUInt8Bit?

  @InterfaceMethod(2)
  public fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Byte>): TensorUInt8Bit?

  @InterfaceMethod(3)
  public fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Byte>?): TensorUInt8Bit?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorUInt8BitStatics> {
    public override fun getValue() = ABI.makeITensorUInt8BitStatics(pointer.getPointer(0))

    public fun setValue(value: ITensorUInt8BitStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorUInt8BitStatics {
    public val __1958961918_Ptr: Pointer?

    public val _1958961918_VtblPtr: Pointer?
      get() = __1958961918_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(): TensorUInt8Bit? {
      val fnPtr = _1958961918_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt8Bit>()
      val hr = fn.invokeHR(arrayOf(__1958961918_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt8Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Create(shape: IIterable<Long>?): TensorUInt8Bit? {
      val fnPtr = _1958961918_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt8Bit>()
      val hr = fn.invokeHR(arrayOf(__1958961918_Ptr, marshalToNative(shape), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt8Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Byte>):
        TensorUInt8Bit? {
      val fnPtr = _1958961918_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt8Bit>()
      val hr = fn.invokeHR(arrayOf(__1958961918_Ptr, marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt8Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Byte>?):
        TensorUInt8Bit? {
      val fnPtr = _1958961918_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt8Bit>()
      val hr = fn.invokeHR(arrayOf(__1958961918_Ptr, marshalToNative(shape), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt8Bit>(result.getValue())
      return resultValue
    }
  }

  public class ITensorUInt8BitStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1958961918_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorUInt8BitStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("05f67583bc2442208a412dcd8c5ed33c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorUInt8BitStatics(ptr: Pointer?): WithDefault =
        ITensorUInt8BitStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorUInt8BitStatics {
      val address = segment.toRawLongValue()
      return makeITensorUInt8BitStatics(Pointer(address))
    }

    public override fun toNative(obj: ITensorUInt8BitStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1958961918_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorUInt8BitStatics): Array<ITensorUInt8BitStatics?> =
        (elements as
        Array<ITensorUInt8BitStatics?>).castToImpl<ITensorUInt8BitStatics,ITensorUInt8BitStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorUInt8BitStatics?> =
        arrayOfNulls<ITensorUInt8BitStatics_Impl>(size) as Array<ITensorUInt8BitStatics?>
  }
}
