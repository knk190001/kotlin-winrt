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

@ABIMarker(ITensorUInt64Bit.ABI::class)
@Signature("{2e70ffad-04bf-4825-839a-82baef8c7886}")
@Guid("2e70ffad04bf4825839a82baef8c7886")
@WinRTInterface("2e70ffad04bf4825839a82baef8c7886")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorUInt64Bit.ByReference::class)
public interface ITensorUInt64Bit : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAsVectorView(): IVectorView<WinDef.ULONG>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorUInt64Bit> {
    public override fun getValue() = ABI.makeITensorUInt64Bit(pointer.getPointer(0))

    public fun setValue(value: ITensorUInt64Bit_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorUInt64Bit {
    public val __420912483_Ptr: Pointer?

    public val _420912483_VtblPtr: Pointer?
      get() = __420912483_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAsVectorView(): IVectorView<WinDef.ULONG>? {
      val fnPtr = _420912483_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__420912483_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.ULONG>>(result.getValue())
      return resultValue
    }
  }

  public class ITensorUInt64Bit_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __420912483_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorUInt64Bit, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e70ffad04bf4825839a82baef8c7886")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorUInt64Bit(ptr: Pointer?): WithDefault = ITensorUInt64Bit_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorUInt64Bit {
      val address = segment.toRawLongValue()
      return makeITensorUInt64Bit(Pointer(address))
    }

    public override fun toNative(obj: ITensorUInt64Bit): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__420912483_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorUInt64Bit): Array<ITensorUInt64Bit?> = (elements as
        Array<ITensorUInt64Bit?>).castToImpl<ITensorUInt64Bit,ITensorUInt64Bit_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorUInt64Bit?> =
        arrayOfNulls<ITensorUInt64Bit_Impl>(size) as Array<ITensorUInt64Bit?>
  }
}
