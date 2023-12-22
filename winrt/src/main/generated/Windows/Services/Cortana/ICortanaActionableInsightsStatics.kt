package Windows.Services.Cortana

import Windows.System.User
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

@ABIMarker(ICortanaActionableInsightsStatics.ABI::class)
@Signature("{b5ded412-9d2f-5cb5-9b05-356a0b836c10}")
@Guid("b5ded4129d2f5cb59b05356a0b836c10")
@WinRTInterface("b5ded4129d2f5cb59b05356a0b836c10")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICortanaActionableInsightsStatics.ByReference::class)
public interface ICortanaActionableInsightsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): CortanaActionableInsights?

  @InterfaceMethod(1)
  public fun GetForUser(user: User?): CortanaActionableInsights?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICortanaActionableInsightsStatics> {
    public override fun getValue() =
        ABI.makeICortanaActionableInsightsStatics(pointer.getPointer(0))

    public fun setValue(value: ICortanaActionableInsightsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICortanaActionableInsightsStatics {
    public val __1957215620_Ptr: Pointer?

    public val _1957215620_VtblPtr: Pointer?
      get() = __1957215620_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): CortanaActionableInsights? {
      val fnPtr = _1957215620_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CortanaActionableInsights>()
      val hr = fn.invokeHR(arrayOf(__1957215620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CortanaActionableInsights>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForUser(user: User?): CortanaActionableInsights? {
      val fnPtr = _1957215620_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CortanaActionableInsights>()
      val hr = fn.invokeHR(arrayOf(__1957215620_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CortanaActionableInsights>(result.getValue())
      return resultValue
    }
  }

  public class ICortanaActionableInsightsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1957215620_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICortanaActionableInsightsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b5ded4129d2f5cb59b05356a0b836c10")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICortanaActionableInsightsStatics(ptr: Pointer?): WithDefault =
        ICortanaActionableInsightsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICortanaActionableInsightsStatics {
      val address = segment.toRawLongValue()
      return makeICortanaActionableInsightsStatics(Pointer(address))
    }

    public override fun toNative(obj: ICortanaActionableInsightsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1957215620_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICortanaActionableInsightsStatics):
        Array<ICortanaActionableInsightsStatics?> = (elements as
        Array<ICortanaActionableInsightsStatics?>).castToImpl<ICortanaActionableInsightsStatics,ICortanaActionableInsightsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICortanaActionableInsightsStatics?> =
        arrayOfNulls<ICortanaActionableInsightsStatics_Impl>(size) as
        Array<ICortanaActionableInsightsStatics?>
  }
}
