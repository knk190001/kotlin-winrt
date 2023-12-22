package Windows.UI.WebUI

import Windows.ApplicationModel.Core.AppRestartFailureReason
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

@ABIMarker(IWebUIActivationStatics3.ABI::class)
@Signature("{91abb686-1af5-4445-b49f-9459f40fc8de}")
@Guid("91abb6861af54445b49f9459f40fc8de")
@WinRTInterface("91abb6861af54445b49f9459f40fc8de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUIActivationStatics3.ByReference::class)
public interface IWebUIActivationStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestRestartAsync(launchArguments: String?):
      IAsyncOperation<AppRestartFailureReason?>?

  @InterfaceMethod(1)
  public fun RequestRestartForUserAsync(user: User?, launchArguments: String?):
      IAsyncOperation<AppRestartFailureReason?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUIActivationStatics3> {
    public override fun getValue() = ABI.makeIWebUIActivationStatics3(pointer.getPointer(0))

    public fun setValue(value: IWebUIActivationStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUIActivationStatics3 {
    public val __510850524_Ptr: Pointer?

    public val _510850524_VtblPtr: Pointer?
      get() = __510850524_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestRestartAsync(launchArguments: String?):
        IAsyncOperation<AppRestartFailureReason?>? {
      val fnPtr = _510850524_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppRestartFailureReason?>>()
      val hr = fn.invokeHR(arrayOf(__510850524_Ptr, marshalToNative(launchArguments), result))
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
      val fnPtr = _510850524_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppRestartFailureReason?>>()
      val hr = fn.invokeHR(arrayOf(__510850524_Ptr, marshalToNative(user),
          marshalToNative(launchArguments), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AppRestartFailureReason?>>(result.getValue())
      return resultValue
    }
  }

  public class IWebUIActivationStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __510850524_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUIActivationStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("91abb6861af54445b49f9459f40fc8de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUIActivationStatics3(ptr: Pointer?): WithDefault =
        IWebUIActivationStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUIActivationStatics3 {
      val address = segment.toRawLongValue()
      return makeIWebUIActivationStatics3(Pointer(address))
    }

    public override fun toNative(obj: IWebUIActivationStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__510850524_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUIActivationStatics3):
        Array<IWebUIActivationStatics3?> = (elements as
        Array<IWebUIActivationStatics3?>).castToImpl<IWebUIActivationStatics3,IWebUIActivationStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUIActivationStatics3?> =
        arrayOfNulls<IWebUIActivationStatics3_Impl>(size) as Array<IWebUIActivationStatics3?>
  }
}
