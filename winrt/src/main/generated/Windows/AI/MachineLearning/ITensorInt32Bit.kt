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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorInt32Bit.ABI::class)
@Signature("{2c0c28d3-207c-4486-a7d2-884522c5e589}")
@Guid("2c0c28d3207c4486a7d2884522c5e589")
@WinRTInterface("2c0c28d3207c4486a7d2884522c5e589")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorInt32Bit.ByReference::class)
public interface ITensorInt32Bit : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAsVectorView(): IVectorView<Int>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorInt32Bit> {
    public override fun getValue() = ABI.makeITensorInt32Bit(pointer.getPointer(0))

    public fun setValue(value: ITensorInt32Bit_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorInt32Bit {
    public val __31641993_Ptr: Pointer?

    public val _31641993_VtblPtr: Pointer?
      get() = __31641993_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAsVectorView(): IVectorView<Int>? {
      val fnPtr = _31641993_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Int>>()
      val hr = fn.invokeHR(arrayOf(__31641993_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Int>>(result.getValue())
      return resultValue
    }
  }

  public class ITensorInt32Bit_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __31641993_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorInt32Bit, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c0c28d3207c4486a7d2884522c5e589")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorInt32Bit(ptr: Pointer?): WithDefault = ITensorInt32Bit_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorInt32Bit {
      val address = segment.toRawLongValue()
      return makeITensorInt32Bit(Pointer(address))
    }

    public override fun toNative(obj: ITensorInt32Bit): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__31641993_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorInt32Bit): Array<ITensorInt32Bit?> = (elements as
        Array<ITensorInt32Bit?>).castToImpl<ITensorInt32Bit,ITensorInt32Bit_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorInt32Bit?> =
        arrayOfNulls<ITensorInt32Bit_Impl>(size) as Array<ITensorInt32Bit?>
  }
}
