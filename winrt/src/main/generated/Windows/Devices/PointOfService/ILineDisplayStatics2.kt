package Windows.Devices.PointOfService

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

@ABIMarker(ILineDisplayStatics2.ABI::class)
@Signature("{600c3f1c-77ab-4968-a7de-c02ff169f2cc}")
@Guid("600c3f1c77ab4968a7dec02ff169f2cc")
@WinRTInterface("600c3f1c77ab4968a7dec02ff169f2cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineDisplayStatics2.ByReference::class)
public interface ILineDisplayStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StatisticsCategorySelector(): LineDisplayStatisticsCategorySelector?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILineDisplayStatics2> {
    public override fun getValue() = ABI.makeILineDisplayStatics2(pointer.getPointer(0))

    public fun setValue(value: ILineDisplayStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineDisplayStatics2 {
    public val __1313939420_Ptr: Pointer?

    public val _1313939420_VtblPtr: Pointer?
      get() = __1313939420_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StatisticsCategorySelector(): LineDisplayStatisticsCategorySelector? {
      val fnPtr = _1313939420_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineDisplayStatisticsCategorySelector>()
      val hr = fn.invokeHR(arrayOf(__1313939420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineDisplayStatisticsCategorySelector>(result.getValue())
      return resultValue
    }
  }

  public class ILineDisplayStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1313939420_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineDisplayStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("600c3f1c77ab4968a7dec02ff169f2cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineDisplayStatics2(ptr: Pointer?): WithDefault = ILineDisplayStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineDisplayStatics2 {
      val address = segment.toRawLongValue()
      return makeILineDisplayStatics2(Pointer(address))
    }

    public override fun toNative(obj: ILineDisplayStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1313939420_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineDisplayStatics2): Array<ILineDisplayStatics2?> =
        (elements as
        Array<ILineDisplayStatics2?>).castToImpl<ILineDisplayStatics2,ILineDisplayStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineDisplayStatics2?> =
        arrayOfNulls<ILineDisplayStatics2_Impl>(size) as Array<ILineDisplayStatics2?>
  }
}
