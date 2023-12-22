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

@ABIMarker(ITensorUInt16BitStatics.ABI::class)
@Signature("{5df745dd-028a-481a-a27c-c7e6435e52dd}")
@Guid("5df745dd028a481aa27cc7e6435e52dd")
@WinRTInterface("5df745dd028a481aa27cc7e6435e52dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorUInt16BitStatics.ByReference::class)
public interface ITensorUInt16BitStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(): TensorUInt16Bit?

  @InterfaceMethod(1)
  public fun Create(shape: IIterable<Long>?): TensorUInt16Bit?

  @InterfaceMethod(2)
  public fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<WinDef.USHORT>):
      TensorUInt16Bit?

  @InterfaceMethod(3)
  public fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<WinDef.USHORT>?):
      TensorUInt16Bit?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorUInt16BitStatics> {
    public override fun getValue() = ABI.makeITensorUInt16BitStatics(pointer.getPointer(0))

    public fun setValue(value: ITensorUInt16BitStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorUInt16BitStatics {
    public val __246588687_Ptr: Pointer?

    public val _246588687_VtblPtr: Pointer?
      get() = __246588687_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(): TensorUInt16Bit? {
      val fnPtr = _246588687_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt16Bit>()
      val hr = fn.invokeHR(arrayOf(__246588687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt16Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Create(shape: IIterable<Long>?): TensorUInt16Bit? {
      val fnPtr = _246588687_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt16Bit>()
      val hr = fn.invokeHR(arrayOf(__246588687_Ptr, marshalToNative(shape), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt16Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<WinDef.USHORT>):
        TensorUInt16Bit? {
      val fnPtr = _246588687_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt16Bit>()
      val hr = fn.invokeHR(arrayOf(__246588687_Ptr, marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt16Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromIterable(shape: IIterable<Long>?,
        `data`: IIterable<WinDef.USHORT>?): TensorUInt16Bit? {
      val fnPtr = _246588687_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt16Bit>()
      val hr = fn.invokeHR(arrayOf(__246588687_Ptr, marshalToNative(shape), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt16Bit>(result.getValue())
      return resultValue
    }
  }

  public class ITensorUInt16BitStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __246588687_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorUInt16BitStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5df745dd028a481aa27cc7e6435e52dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorUInt16BitStatics(ptr: Pointer?): WithDefault =
        ITensorUInt16BitStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorUInt16BitStatics {
      val address = segment.toRawLongValue()
      return makeITensorUInt16BitStatics(Pointer(address))
    }

    public override fun toNative(obj: ITensorUInt16BitStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__246588687_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorUInt16BitStatics): Array<ITensorUInt16BitStatics?>
        = (elements as
        Array<ITensorUInt16BitStatics?>).castToImpl<ITensorUInt16BitStatics,ITensorUInt16BitStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorUInt16BitStatics?> =
        arrayOfNulls<ITensorUInt16BitStatics_Impl>(size) as Array<ITensorUInt16BitStatics?>
  }
}
