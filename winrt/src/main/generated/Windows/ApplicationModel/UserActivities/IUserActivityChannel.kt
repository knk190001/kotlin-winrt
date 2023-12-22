package Windows.ApplicationModel.UserActivities

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IUserActivityChannel.ABI::class)
@Signature("{bac0f8b8-a0e4-483b-b948-9cbabd06070c}")
@Guid("bac0f8b8a0e4483bb9489cbabd06070c")
@WinRTInterface("bac0f8b8a0e4483bb9489cbabd06070c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivityChannel.ByReference::class)
public interface IUserActivityChannel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetOrCreateUserActivityAsync(activityId: String?): IAsyncOperation<UserActivity?>?

  @InterfaceMethod(1)
  public fun DeleteActivityAsync(activityId: String?): IAsyncAction?

  @InterfaceMethod(2)
  public fun DeleteAllActivitiesAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserActivityChannel> {
    public override fun getValue() = ABI.makeIUserActivityChannel(pointer.getPointer(0))

    public fun setValue(value: IUserActivityChannel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivityChannel {
    public val __313919746_Ptr: Pointer?

    public val _313919746_VtblPtr: Pointer?
      get() = __313919746_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetOrCreateUserActivityAsync(activityId: String?):
        IAsyncOperation<UserActivity?>? {
      val fnPtr = _313919746_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserActivity?>>()
      val hr = fn.invokeHR(arrayOf(__313919746_Ptr, marshalToNative(activityId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UserActivity?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun DeleteActivityAsync(activityId: String?): IAsyncAction? {
      val fnPtr = _313919746_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__313919746_Ptr, marshalToNative(activityId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun DeleteAllActivitiesAsync(): IAsyncAction? {
      val fnPtr = _313919746_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__313919746_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IUserActivityChannel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __313919746_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivityChannel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bac0f8b8a0e4483bb9489cbabd06070c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivityChannel(ptr: Pointer?): WithDefault = IUserActivityChannel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivityChannel {
      val address = segment.toRawLongValue()
      return makeIUserActivityChannel(Pointer(address))
    }

    public override fun toNative(obj: IUserActivityChannel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__313919746_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivityChannel): Array<IUserActivityChannel?> =
        (elements as
        Array<IUserActivityChannel?>).castToImpl<IUserActivityChannel,IUserActivityChannel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivityChannel?> =
        arrayOfNulls<IUserActivityChannel_Impl>(size) as Array<IUserActivityChannel?>
  }
}
