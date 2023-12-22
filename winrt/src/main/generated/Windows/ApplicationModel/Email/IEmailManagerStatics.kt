package Windows.ApplicationModel.Email

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IEmailManagerStatics.ABI::class)
@Signature("{f5128654-55c5-4890-a824-216c2618ce7f}")
@Guid("f512865455c54890a824216c2618ce7f")
@WinRTInterface("f512865455c54890a824216c2618ce7f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailManagerStatics.ByReference::class)
public interface IEmailManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowComposeNewEmailAsync(message: EmailMessage?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailManagerStatics> {
    public override fun getValue() = ABI.makeIEmailManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IEmailManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailManagerStatics {
    public val __1339681565_Ptr: Pointer?

    public val _1339681565_VtblPtr: Pointer?
      get() = __1339681565_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowComposeNewEmailAsync(message: EmailMessage?): IAsyncAction? {
      val fnPtr = _1339681565_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1339681565_Ptr, marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IEmailManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1339681565_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f512865455c54890a824216c2618ce7f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailManagerStatics(ptr: Pointer?): WithDefault = IEmailManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailManagerStatics {
      val address = segment.toRawLongValue()
      return makeIEmailManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IEmailManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1339681565_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailManagerStatics): Array<IEmailManagerStatics?> =
        (elements as
        Array<IEmailManagerStatics?>).castToImpl<IEmailManagerStatics,IEmailManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailManagerStatics?> =
        arrayOfNulls<IEmailManagerStatics_Impl>(size) as Array<IEmailManagerStatics?>
  }
}
