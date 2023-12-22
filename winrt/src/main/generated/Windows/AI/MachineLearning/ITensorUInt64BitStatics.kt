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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ITensorUInt64BitStatics.ABI::class)
@Signature("{7a7e20eb-242f-47cb-a9c6-f602ecfbfee4}")
@Guid("7a7e20eb242f47cba9c6f602ecfbfee4")
@WinRTInterface("7a7e20eb242f47cba9c6f602ecfbfee4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorUInt64BitStatics.ByReference::class)
public interface ITensorUInt64BitStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(): TensorUInt64Bit?

  @InterfaceMethod(1)
  public fun Create(shape: IIterable<Long>?): TensorUInt64Bit?

  @InterfaceMethod(2)
  public fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<WinDef.ULONG>): TensorUInt64Bit?

  @InterfaceMethod(3)
  public fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<WinDef.ULONG>?):
      TensorUInt64Bit?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorUInt64BitStatics> {
    public override fun getValue() = ABI.makeITensorUInt64BitStatics(pointer.getPointer(0))

    public fun setValue(value: ITensorUInt64BitStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorUInt64BitStatics {
    public val __190937704_Ptr: Pointer?

    public val _190937704_VtblPtr: Pointer?
      get() = __190937704_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(): TensorUInt64Bit? {
      val fnPtr = _190937704_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt64Bit>()
      val hr = fn.invokeHR(arrayOf(__190937704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt64Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Create(shape: IIterable<Long>?): TensorUInt64Bit? {
      val fnPtr = _190937704_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt64Bit>()
      val hr = fn.invokeHR(arrayOf(__190937704_Ptr, marshalToNative(shape), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt64Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<WinDef.ULONG>):
        TensorUInt64Bit? {
      val fnPtr = _190937704_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt64Bit>()
      val hr = fn.invokeHR(arrayOf(__190937704_Ptr, marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt64Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromIterable(shape: IIterable<Long>?,
        `data`: IIterable<WinDef.ULONG>?): TensorUInt64Bit? {
      val fnPtr = _190937704_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt64Bit>()
      val hr = fn.invokeHR(arrayOf(__190937704_Ptr, marshalToNative(shape), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt64Bit>(result.getValue())
      return resultValue
    }
  }

  public class ITensorUInt64BitStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __190937704_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorUInt64BitStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a7e20eb242f47cba9c6f602ecfbfee4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorUInt64BitStatics(ptr: Pointer?): WithDefault =
        ITensorUInt64BitStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorUInt64BitStatics {
      val address = segment.toRawLongValue()
      return makeITensorUInt64BitStatics(Pointer(address))
    }

    public override fun toNative(obj: ITensorUInt64BitStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__190937704_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorUInt64BitStatics): Array<ITensorUInt64BitStatics?>
        = (elements as
        Array<ITensorUInt64BitStatics?>).castToImpl<ITensorUInt64BitStatics,ITensorUInt64BitStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorUInt64BitStatics?> =
        arrayOfNulls<ITensorUInt64BitStatics_Impl>(size) as Array<ITensorUInt64BitStatics?>
  }
}
