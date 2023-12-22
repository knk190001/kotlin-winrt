package Windows.Media.Capture

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

@ABIMarker(IAppBroadcastTriggerDetails.ABI::class)
@Signature("{deebab35-ec5e-4d8f-b1c0-5da6e8c75638}")
@Guid("deebab35ec5e4d8fb1c05da6e8c75638")
@WinRTInterface("deebab35ec5e4d8fb1c05da6e8c75638")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastTriggerDetails.ByReference::class)
public interface IAppBroadcastTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundService(): AppBroadcastBackgroundService?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastTriggerDetails> {
    public override fun getValue() = ABI.makeIAppBroadcastTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastTriggerDetails {
    public val __1989145346_Ptr: Pointer?

    public val _1989145346_VtblPtr: Pointer?
      get() = __1989145346_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundService(): AppBroadcastBackgroundService? {
      val fnPtr = _1989145346_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastBackgroundService>()
      val hr = fn.invokeHR(arrayOf(__1989145346_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastBackgroundService>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1989145346_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("deebab35ec5e4d8fb1c05da6e8c75638")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastTriggerDetails(ptr: Pointer?): WithDefault =
        IAppBroadcastTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1989145346_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastTriggerDetails):
        Array<IAppBroadcastTriggerDetails?> = (elements as
        Array<IAppBroadcastTriggerDetails?>).castToImpl<IAppBroadcastTriggerDetails,IAppBroadcastTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastTriggerDetails?> =
        arrayOfNulls<IAppBroadcastTriggerDetails_Impl>(size) as Array<IAppBroadcastTriggerDetails?>
  }
}
