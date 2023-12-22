package Windows.ApplicationModel.UserActivities.Core

import Windows.ApplicationModel.UserActivities.UserActivity
import Windows.ApplicationModel.UserActivities.UserActivityChannel
import Windows.ApplicationModel.UserActivities.UserActivitySession
import Windows.Foundation.DateTime
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

@ABIMarker(ICoreUserActivityManagerStatics.ABI::class)
@Signature("{ca3adb02-a4be-4d4d-bfa8-6795f4264efb}")
@Guid("ca3adb02a4be4d4dbfa86795f4264efb")
@WinRTInterface("ca3adb02a4be4d4dbfa86795f4264efb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreUserActivityManagerStatics.ByReference::class)
public interface ICoreUserActivityManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateUserActivitySessionInBackground(activity: UserActivity?): UserActivitySession?

  @InterfaceMethod(1)
  public fun DeleteUserActivitySessionsInTimeRangeAsync(
    channel: UserActivityChannel?,
    startTime: DateTime?,
    endTime: DateTime?
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreUserActivityManagerStatics> {
    public override fun getValue() = ABI.makeICoreUserActivityManagerStatics(pointer.getPointer(0))

    public fun setValue(value: ICoreUserActivityManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreUserActivityManagerStatics {
    public val __234081647_Ptr: Pointer?

    public val _234081647_VtblPtr: Pointer?
      get() = __234081647_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateUserActivitySessionInBackground(activity: UserActivity?):
        UserActivitySession? {
      val fnPtr = _234081647_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserActivitySession>()
      val hr = fn.invokeHR(arrayOf(__234081647_Ptr, marshalToNative(activity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserActivitySession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun DeleteUserActivitySessionsInTimeRangeAsync(
      channel: UserActivityChannel?,
      startTime: DateTime?,
      endTime: DateTime?
    ): IAsyncAction? {
      val fnPtr = _234081647_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__234081647_Ptr, marshalToNative(channel),
          marshalToNative(startTime), marshalToNative(endTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ICoreUserActivityManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __234081647_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreUserActivityManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca3adb02a4be4d4dbfa86795f4264efb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreUserActivityManagerStatics(ptr: Pointer?): WithDefault =
        ICoreUserActivityManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreUserActivityManagerStatics {
      val address = segment.toRawLongValue()
      return makeICoreUserActivityManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: ICoreUserActivityManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__234081647_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreUserActivityManagerStatics):
        Array<ICoreUserActivityManagerStatics?> = (elements as
        Array<ICoreUserActivityManagerStatics?>).castToImpl<ICoreUserActivityManagerStatics,ICoreUserActivityManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreUserActivityManagerStatics?> =
        arrayOfNulls<ICoreUserActivityManagerStatics_Impl>(size) as
        Array<ICoreUserActivityManagerStatics?>
  }
}
