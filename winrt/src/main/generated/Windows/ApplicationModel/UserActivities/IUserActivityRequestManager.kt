package Windows.ApplicationModel.UserActivities

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IUserActivityRequestManager.ABI::class)
@Signature("{0c30be4e-903d-48d6-82d4-4043ed57791b}")
@Guid("0c30be4e903d48d682d44043ed57791b")
@WinRTInterface("0c30be4e903d48d682d44043ed57791b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivityRequestManager.ByReference::class)
public interface IUserActivityRequestManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_UserActivityRequested(handler: TypedEventHandler<UserActivityRequestManager?,
      UserActivityRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_UserActivityRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserActivityRequestManager> {
    public override fun getValue() = ABI.makeIUserActivityRequestManager(pointer.getPointer(0))

    public fun setValue(value: IUserActivityRequestManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivityRequestManager {
    public val __1511699137_Ptr: Pointer?

    public val _1511699137_VtblPtr: Pointer?
      get() = __1511699137_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_UserActivityRequested(handler: TypedEventHandler<UserActivityRequestManager?,
        UserActivityRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1511699137_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1511699137_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_UserActivityRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1511699137_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1511699137_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserActivityRequestManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1511699137_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivityRequestManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c30be4e903d48d682d44043ed57791b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivityRequestManager(ptr: Pointer?): WithDefault =
        IUserActivityRequestManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivityRequestManager {
      val address = segment.toRawLongValue()
      return makeIUserActivityRequestManager(Pointer(address))
    }

    public override fun toNative(obj: IUserActivityRequestManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1511699137_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivityRequestManager):
        Array<IUserActivityRequestManager?> = (elements as
        Array<IUserActivityRequestManager?>).castToImpl<IUserActivityRequestManager,IUserActivityRequestManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivityRequestManager?> =
        arrayOfNulls<IUserActivityRequestManager_Impl>(size) as Array<IUserActivityRequestManager?>
  }
}
