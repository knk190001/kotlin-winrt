package Windows.ApplicationModel.UserActivities

import Windows.Foundation.Collections.IVector
import Windows.Foundation.DateTime
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

@ABIMarker(IUserActivityChannel2.ABI::class)
@Signature("{1698e35b-eb7e-4ea0-bf17-a459e8be706c}")
@Guid("1698e35beb7e4ea0bf17a459e8be706c")
@WinRTInterface("1698e35beb7e4ea0bf17a459e8be706c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivityChannel2.ByReference::class)
public interface IUserActivityChannel2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetRecentUserActivitiesAsync(maxUniqueActivities: Int):
      IAsyncOperation<IVector<UserActivitySessionHistoryItem?>?>?

  @InterfaceMethod(1)
  public fun GetSessionHistoryItemsForUserActivityAsync(activityId: String?, startTime: DateTime?):
      IAsyncOperation<IVector<UserActivitySessionHistoryItem?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserActivityChannel2> {
    public override fun getValue() = ABI.makeIUserActivityChannel2(pointer.getPointer(0))

    public fun setValue(value: IUserActivityChannel2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivityChannel2 {
    public val __1141577584_Ptr: Pointer?

    public val _1141577584_VtblPtr: Pointer?
      get() = __1141577584_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetRecentUserActivitiesAsync(maxUniqueActivities: Int):
        IAsyncOperation<IVector<UserActivitySessionHistoryItem?>?>? {
      val fnPtr = _1141577584_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<UserActivitySessionHistoryItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__1141577584_Ptr, maxUniqueActivities, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVector<UserActivitySessionHistoryItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetSessionHistoryItemsForUserActivityAsync(activityId: String?,
        startTime: DateTime?): IAsyncOperation<IVector<UserActivitySessionHistoryItem?>?>? {
      val fnPtr = _1141577584_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<UserActivitySessionHistoryItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__1141577584_Ptr, marshalToNative(activityId),
          marshalToNative(startTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVector<UserActivitySessionHistoryItem?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IUserActivityChannel2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1141577584_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivityChannel2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1698e35beb7e4ea0bf17a459e8be706c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivityChannel2(ptr: Pointer?): WithDefault =
        IUserActivityChannel2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivityChannel2 {
      val address = segment.toRawLongValue()
      return makeIUserActivityChannel2(Pointer(address))
    }

    public override fun toNative(obj: IUserActivityChannel2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1141577584_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivityChannel2): Array<IUserActivityChannel2?> =
        (elements as
        Array<IUserActivityChannel2?>).castToImpl<IUserActivityChannel2,IUserActivityChannel2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivityChannel2?> =
        arrayOfNulls<IUserActivityChannel2_Impl>(size) as Array<IUserActivityChannel2?>
  }
}
