package Windows.Phone.System.Power

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPowerManagerStatics2.ABI::class)
@Signature("{596236cf-1918-4551-a466-c51aae373bf8}")
@Guid("596236cf19184551a466c51aae373bf8")
@WinRTInterface("596236cf19184551a466c51aae373bf8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPowerManagerStatics2.ByReference::class)
public interface IPowerManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PowerSavingModeEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPowerManagerStatics2> {
    public override fun getValue() = ABI.makeIPowerManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IPowerManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPowerManagerStatics2 {
    public val __1232824333_Ptr: Pointer?

    public val _1232824333_VtblPtr: Pointer?
      get() = __1232824333_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PowerSavingModeEnabled(): Boolean {
      val fnPtr = _1232824333_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1232824333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPowerManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1232824333_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPowerManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("596236cf19184551a466c51aae373bf8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPowerManagerStatics2(ptr: Pointer?): WithDefault =
        IPowerManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPowerManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIPowerManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IPowerManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1232824333_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPowerManagerStatics2): Array<IPowerManagerStatics2?> =
        (elements as
        Array<IPowerManagerStatics2?>).castToImpl<IPowerManagerStatics2,IPowerManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPowerManagerStatics2?> =
        arrayOfNulls<IPowerManagerStatics2_Impl>(size) as Array<IPowerManagerStatics2?>
  }
}
