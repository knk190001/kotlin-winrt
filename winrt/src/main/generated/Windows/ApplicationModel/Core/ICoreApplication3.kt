package Windows.ApplicationModel.Core

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreApplication3.ABI::class)
@Signature("{feec0d39-598b-4507-8a67-772632580a57}")
@Guid("feec0d39598b45078a67772632580a57")
@WinRTInterface("feec0d39598b45078a67772632580a57")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreApplication3.ByReference::class)
public interface ICoreApplication3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestRestartAsync(launchArguments: String?):
      IAsyncOperation<AppRestartFailureReason?>?

  @InterfaceMethod(1)
  public fun RequestRestartForUserAsync(user: User?, launchArguments: String?):
      IAsyncOperation<AppRestartFailureReason?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreApplication3> {
    public override fun getValue() = ABI.makeICoreApplication3(pointer.getPointer(0))

    public fun setValue(value: ICoreApplication3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreApplication3 {
    public val __20388930_Ptr: Pointer?

    public val _20388930_VtblPtr: Pointer?
      get() = __20388930_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestRestartAsync(launchArguments: String?):
        IAsyncOperation<AppRestartFailureReason?>? {
      val fnPtr = _20388930_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppRestartFailureReason?>>()
      val hr = fn.invokeHR(arrayOf(__20388930_Ptr, marshalToNative(launchArguments), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AppRestartFailureReason?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestRestartForUserAsync(user: User?, launchArguments: String?):
        IAsyncOperation<AppRestartFailureReason?>? {
      val fnPtr = _20388930_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppRestartFailureReason?>>()
      val hr = fn.invokeHR(arrayOf(__20388930_Ptr, marshalToNative(user),
          marshalToNative(launchArguments), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AppRestartFailureReason?>>(result.getValue())
      return resultValue
    }
  }

  public class ICoreApplication3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __20388930_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreApplication3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("feec0d39598b45078a67772632580a57")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreApplication3(ptr: Pointer?): WithDefault = ICoreApplication3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreApplication3 {
      val address = segment.toRawLongValue()
      return makeICoreApplication3(Pointer(address))
    }

    public override fun toNative(obj: ICoreApplication3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__20388930_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreApplication3): Array<ICoreApplication3?> = (elements
        as Array<ICoreApplication3?>).castToImpl<ICoreApplication3,ICoreApplication3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreApplication3?> =
        arrayOfNulls<ICoreApplication3_Impl>(size) as Array<ICoreApplication3?>
  }
}
