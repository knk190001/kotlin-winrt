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

@ABIMarker(ITensorInt8BitStatics.ABI::class)
@Signature("{b1a12284-095c-4c76-a661-ac4cee1f3e8b}")
@Guid("b1a12284095c4c76a661ac4cee1f3e8b")
@WinRTInterface("b1a12284095c4c76a661ac4cee1f3e8b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorInt8BitStatics.ByReference::class)
public interface ITensorInt8BitStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(): TensorInt8Bit?

  @InterfaceMethod(1)
  public fun Create(shape: IIterable<Long>?): TensorInt8Bit?

  @InterfaceMethod(2)
  public fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Byte>): TensorInt8Bit?

  @InterfaceMethod(3)
  public fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Byte>?): TensorInt8Bit?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorInt8BitStatics> {
    public override fun getValue() = ABI.makeITensorInt8BitStatics(pointer.getPointer(0))

    public fun setValue(value: ITensorInt8BitStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorInt8BitStatics {
    public val __1577213401_Ptr: Pointer?

    public val _1577213401_VtblPtr: Pointer?
      get() = __1577213401_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(): TensorInt8Bit? {
      val fnPtr = _1577213401_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt8Bit>()
      val hr = fn.invokeHR(arrayOf(__1577213401_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt8Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Create(shape: IIterable<Long>?): TensorInt8Bit? {
      val fnPtr = _1577213401_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt8Bit>()
      val hr = fn.invokeHR(arrayOf(__1577213401_Ptr, marshalToNative(shape), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt8Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Byte>):
        TensorInt8Bit? {
      val fnPtr = _1577213401_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt8Bit>()
      val hr = fn.invokeHR(arrayOf(__1577213401_Ptr, marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt8Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Byte>?):
        TensorInt8Bit? {
      val fnPtr = _1577213401_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt8Bit>()
      val hr = fn.invokeHR(arrayOf(__1577213401_Ptr, marshalToNative(shape), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt8Bit>(result.getValue())
      return resultValue
    }
  }

  public class ITensorInt8BitStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1577213401_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorInt8BitStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b1a12284095c4c76a661ac4cee1f3e8b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorInt8BitStatics(ptr: Pointer?): WithDefault =
        ITensorInt8BitStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorInt8BitStatics {
      val address = segment.toRawLongValue()
      return makeITensorInt8BitStatics(Pointer(address))
    }

    public override fun toNative(obj: ITensorInt8BitStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1577213401_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorInt8BitStatics): Array<ITensorInt8BitStatics?> =
        (elements as
        Array<ITensorInt8BitStatics?>).castToImpl<ITensorInt8BitStatics,ITensorInt8BitStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorInt8BitStatics?> =
        arrayOfNulls<ITensorInt8BitStatics_Impl>(size) as Array<ITensorInt8BitStatics?>
  }
}
