package Windows.Globalization.NumberFormatting

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

@ABIMarker(INumberRounderOption.ABI::class)
@Signature("{3b088433-646f-4efe-8d48-66eb2e49e736}")
@Guid("3b088433646f4efe8d4866eb2e49e736")
@WinRTInterface("3b088433646f4efe8d4866eb2e49e736")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INumberRounderOption.ByReference::class)
public interface INumberRounderOption : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NumberRounder(): INumberRounder?

  @InterfaceMethod(1)
  public fun put_NumberRounder(value: INumberRounder?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INumberRounderOption> {
    public override fun getValue() = ABI.makeINumberRounderOption(pointer.getPointer(0))

    public fun setValue(value: INumberRounderOption_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INumberRounderOption {
    public val __1982953500_Ptr: Pointer?

    public val _1982953500_VtblPtr: Pointer?
      get() = __1982953500_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NumberRounder(): INumberRounder? {
      val fnPtr = _1982953500_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<INumberRounder>()
      val hr = fn.invokeHR(arrayOf(__1982953500_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<INumberRounder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_NumberRounder(value: INumberRounder?): Unit {
      val fnPtr = _1982953500_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982953500_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INumberRounderOption_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1982953500_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INumberRounderOption, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b088433646f4efe8d4866eb2e49e736")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINumberRounderOption(ptr: Pointer?): WithDefault = INumberRounderOption_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INumberRounderOption {
      val address = segment.toRawLongValue()
      return makeINumberRounderOption(Pointer(address))
    }

    public override fun toNative(obj: INumberRounderOption): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1982953500_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INumberRounderOption): Array<INumberRounderOption?> =
        (elements as
        Array<INumberRounderOption?>).castToImpl<INumberRounderOption,INumberRounderOption_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INumberRounderOption?> =
        arrayOfNulls<INumberRounderOption_Impl>(size) as Array<INumberRounderOption?>
  }
}
