package Windows.UI.Notifications

import Windows.ApplicationModel.AppInfo
import Windows.Foundation.DateTime
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

@ABIMarker(IUserNotification.ABI::class)
@Signature("{adf7e52f-4e53-42d5-9c33-eb5ea515b23e}")
@Guid("adf7e52f4e5342d59c33eb5ea515b23e")
@WinRTInterface("adf7e52f4e5342d59c33eb5ea515b23e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserNotification.ByReference::class)
public interface IUserNotification : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Notification(): Notification?

  @InterfaceMethod(1)
  public fun get_AppInfo(): AppInfo?

  @InterfaceMethod(2)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_CreationTime(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserNotification> {
    public override fun getValue() = ABI.makeIUserNotification(pointer.getPointer(0))

    public fun setValue(value: IUserNotification_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserNotification {
    public val __1252730054_Ptr: Pointer?

    public val _1252730054_VtblPtr: Pointer?
      get() = __1252730054_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Notification(): Notification? {
      val fnPtr = _1252730054_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Notification>()
      val hr = fn.invokeHR(arrayOf(__1252730054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Notification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AppInfo(): AppInfo? {
      val fnPtr = _1252730054_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInfo>()
      val hr = fn.invokeHR(arrayOf(__1252730054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _1252730054_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1252730054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_CreationTime(): DateTime? {
      val fnPtr = _1252730054_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1252730054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class IUserNotification_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1252730054_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserNotification, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("adf7e52f4e5342d59c33eb5ea515b23e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserNotification(ptr: Pointer?): WithDefault = IUserNotification_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserNotification {
      val address = segment.toRawLongValue()
      return makeIUserNotification(Pointer(address))
    }

    public override fun toNative(obj: IUserNotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1252730054_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserNotification): Array<IUserNotification?> = (elements
        as Array<IUserNotification?>).castToImpl<IUserNotification,IUserNotification_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserNotification?> =
        arrayOfNulls<IUserNotification_Impl>(size) as Array<IUserNotification?>
  }
}
