package Windows.AI.MachineLearning

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorUInt8Bit.ABI::class)
@Signature("{58e1ae27-622b-48e3-be22-d867aed1daac}")
@Guid("58e1ae27622b48e3be22d867aed1daac")
@WinRTInterface("58e1ae27622b48e3be22d867aed1daac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorUInt8Bit.ByReference::class)
public interface ITensorUInt8Bit : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAsVectorView(): IVectorView<Byte>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorUInt8Bit> {
    public override fun getValue() = ABI.makeITensorUInt8Bit(pointer.getPointer(0))

    public fun setValue(value: ITensorUInt8Bit_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorUInt8Bit {
    public val __817780423_Ptr: Pointer?

    public val _817780423_VtblPtr: Pointer?
      get() = __817780423_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAsVectorView(): IVectorView<Byte>? {
      val fnPtr = _817780423_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Byte>>()
      val hr = fn.invokeHR(arrayOf(__817780423_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Byte>>(result.getValue())
      return resultValue
    }
  }

  public class ITensorUInt8Bit_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __817780423_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorUInt8Bit, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("58e1ae27622b48e3be22d867aed1daac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorUInt8Bit(ptr: Pointer?): WithDefault = ITensorUInt8Bit_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorUInt8Bit {
      val address = segment.toRawLongValue()
      return makeITensorUInt8Bit(Pointer(address))
    }

    public override fun toNative(obj: ITensorUInt8Bit): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__817780423_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorUInt8Bit): Array<ITensorUInt8Bit?> = (elements as
        Array<ITensorUInt8Bit?>).castToImpl<ITensorUInt8Bit,ITensorUInt8Bit_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorUInt8Bit?> =
        arrayOfNulls<ITensorUInt8Bit_Impl>(size) as Array<ITensorUInt8Bit?>
  }
}
