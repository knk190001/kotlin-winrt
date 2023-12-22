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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ITensorUInt16Bit.ABI::class)
@Signature("{68140f4b-23c0-42f3-81f6-a891c011bc3f}")
@Guid("68140f4b23c042f381f6a891c011bc3f")
@WinRTInterface("68140f4b23c042f381f6a891c011bc3f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorUInt16Bit.ByReference::class)
public interface ITensorUInt16Bit : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAsVectorView(): IVectorView<WinDef.USHORT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorUInt16Bit> {
    public override fun getValue() = ABI.makeITensorUInt16Bit(pointer.getPointer(0))

    public fun setValue(value: ITensorUInt16Bit_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorUInt16Bit {
    public val __425470506_Ptr: Pointer?

    public val _425470506_VtblPtr: Pointer?
      get() = __425470506_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAsVectorView(): IVectorView<WinDef.USHORT>? {
      val fnPtr = _425470506_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.USHORT>>()
      val hr = fn.invokeHR(arrayOf(__425470506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.USHORT>>(result.getValue())
      return resultValue
    }
  }

  public class ITensorUInt16Bit_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __425470506_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorUInt16Bit, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("68140f4b23c042f381f6a891c011bc3f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorUInt16Bit(ptr: Pointer?): WithDefault = ITensorUInt16Bit_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorUInt16Bit {
      val address = segment.toRawLongValue()
      return makeITensorUInt16Bit(Pointer(address))
    }

    public override fun toNative(obj: ITensorUInt16Bit): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__425470506_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorUInt16Bit): Array<ITensorUInt16Bit?> = (elements as
        Array<ITensorUInt16Bit?>).castToImpl<ITensorUInt16Bit,ITensorUInt16Bit_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorUInt16Bit?> =
        arrayOfNulls<ITensorUInt16Bit_Impl>(size) as Array<ITensorUInt16Bit?>
  }
}
