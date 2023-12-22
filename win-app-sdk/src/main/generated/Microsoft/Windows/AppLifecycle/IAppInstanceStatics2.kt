package Microsoft.Windows.AppLifecycle

import Windows.ApplicationModel.Core.AppRestartFailureReason
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

@ABIMarker(IAppInstanceStatics2.ABI::class)
@Signature("{fe9f1885-7160-5397-ba9b-5890b24fdc04}")
@Guid("fe9f188571605397ba9b5890b24fdc04")
@WinRTInterface("fe9f188571605397ba9b5890b24fdc04")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstanceStatics2.ByReference::class)
public interface IAppInstanceStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Restart(arguments: String?): AppRestartFailureReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstanceStatics2> {
    public override fun getValue() = ABI.makeIAppInstanceStatics2(pointer.getPointer(0))

    public fun setValue(value: IAppInstanceStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstanceStatics2 {
    public val __710538962_Ptr: Pointer?

    public val _710538962_VtblPtr: Pointer?
      get() = __710538962_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Restart(arguments: String?): AppRestartFailureReason? {
      val fnPtr = _710538962_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppRestartFailureReason>()
      val hr = fn.invokeHR(arrayOf(__710538962_Ptr, marshalToNative(arguments), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppRestartFailureReason>(result.getValue())
      return resultValue
    }
  }

  public class IAppInstanceStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __710538962_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstanceStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe9f188571605397ba9b5890b24fdc04")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstanceStatics2(ptr: Pointer?): WithDefault = IAppInstanceStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstanceStatics2 {
      val address = segment.toRawLongValue()
      return makeIAppInstanceStatics2(Pointer(address))
    }

    public override fun toNative(obj: IAppInstanceStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__710538962_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstanceStatics2): Array<IAppInstanceStatics2?> =
        (elements as
        Array<IAppInstanceStatics2?>).castToImpl<IAppInstanceStatics2,IAppInstanceStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstanceStatics2?> =
        arrayOfNulls<IAppInstanceStatics2_Impl>(size) as Array<IAppInstanceStatics2?>
  }
}
