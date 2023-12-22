package Windows.UI.Notifications

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IUserNotificationChangedEventArgs.ABI::class)
@Signature("{b6bd6839-79cf-4b25-82c0-0ce1eef81f8c}")
@Guid("b6bd683979cf4b2582c00ce1eef81f8c")
@WinRTInterface("b6bd683979cf4b2582c00ce1eef81f8c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserNotificationChangedEventArgs.ByReference::class)
public interface IUserNotificationChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChangeKind(): UserNotificationChangedKind?

  @InterfaceMethod(1)
  public fun get_UserNotificationId(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserNotificationChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIUserNotificationChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IUserNotificationChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserNotificationChangedEventArgs {
    public val __865632041_Ptr: Pointer?

    public val _865632041_VtblPtr: Pointer?
      get() = __865632041_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChangeKind(): UserNotificationChangedKind? {
      val fnPtr = _865632041_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserNotificationChangedKind>()
      val hr = fn.invokeHR(arrayOf(__865632041_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserNotificationChangedKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UserNotificationId(): WinDef.UINT {
      val fnPtr = _865632041_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__865632041_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IUserNotificationChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __865632041_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserNotificationChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6bd683979cf4b2582c00ce1eef81f8c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserNotificationChangedEventArgs(ptr: Pointer?): WithDefault =
        IUserNotificationChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserNotificationChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIUserNotificationChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IUserNotificationChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__865632041_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserNotificationChangedEventArgs):
        Array<IUserNotificationChangedEventArgs?> = (elements as
        Array<IUserNotificationChangedEventArgs?>).castToImpl<IUserNotificationChangedEventArgs,IUserNotificationChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserNotificationChangedEventArgs?> =
        arrayOfNulls<IUserNotificationChangedEventArgs_Impl>(size) as
        Array<IUserNotificationChangedEventArgs?>
  }
}
