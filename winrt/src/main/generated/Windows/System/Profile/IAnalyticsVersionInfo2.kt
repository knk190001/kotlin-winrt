package Windows.System.Profile

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAnalyticsVersionInfo2.ABI::class)
@Signature("{76e915b1-ff36-407c-9f57-160d3e540747}")
@Guid("76e915b1ff36407c9f57160d3e540747")
@WinRTInterface("76e915b1ff36407c9f57160d3e540747")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnalyticsVersionInfo2.ByReference::class)
public interface IAnalyticsVersionInfo2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProductName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnalyticsVersionInfo2> {
    public override fun getValue() = ABI.makeIAnalyticsVersionInfo2(pointer.getPointer(0))

    public fun setValue(value: IAnalyticsVersionInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnalyticsVersionInfo2 {
    public val __1896003778_Ptr: Pointer?

    public val _1896003778_VtblPtr: Pointer?
      get() = __1896003778_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProductName(): String? {
      val fnPtr = _1896003778_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1896003778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAnalyticsVersionInfo2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1896003778_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnalyticsVersionInfo2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("76e915b1ff36407c9f57160d3e540747")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnalyticsVersionInfo2(ptr: Pointer?): WithDefault =
        IAnalyticsVersionInfo2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnalyticsVersionInfo2 {
      val address = segment.toRawLongValue()
      return makeIAnalyticsVersionInfo2(Pointer(address))
    }

    public override fun toNative(obj: IAnalyticsVersionInfo2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1896003778_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnalyticsVersionInfo2): Array<IAnalyticsVersionInfo2?> =
        (elements as
        Array<IAnalyticsVersionInfo2?>).castToImpl<IAnalyticsVersionInfo2,IAnalyticsVersionInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnalyticsVersionInfo2?> =
        arrayOfNulls<IAnalyticsVersionInfo2_Impl>(size) as Array<IAnalyticsVersionInfo2?>
  }
}
