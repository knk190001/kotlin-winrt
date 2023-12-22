package Microsoft.Windows.AppNotifications

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppNotification.ABI::class)
@Signature("{373a6917-4116-5657-936a-15f99afdd667}")
@Guid("373a691741165657936a15f99afdd667")
@WinRTInterface("373a691741165657936a15f99afdd667")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotification.ByReference::class)
public interface IAppNotification : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Tag(): String?

  @InterfaceMethod(1)
  public fun put_Tag(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Group(): String?

  @InterfaceMethod(3)
  public fun put_Group(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_Payload(): String?

  @InterfaceMethod(6)
  public fun get_Progress(): AppNotificationProgressData?

  @InterfaceMethod(7)
  public fun put_Progress(value: AppNotificationProgressData?): Unit

  @InterfaceMethod(8)
  public fun get_Expiration(): DateTime?

  @InterfaceMethod(9)
  public fun put_Expiration(value: DateTime?): Unit

  @InterfaceMethod(10)
  public fun get_ExpiresOnReboot(): Boolean

  @InterfaceMethod(11)
  public fun put_ExpiresOnReboot(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_Priority(): AppNotificationPriority?

  @InterfaceMethod(13)
  public fun put_Priority(value: AppNotificationPriority?): Unit

  @InterfaceMethod(14)
  public fun get_SuppressDisplay(): Boolean

  @InterfaceMethod(15)
  public fun put_SuppressDisplay(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotification> {
    public override fun getValue() = ABI.makeIAppNotification(pointer.getPointer(0))

    public fun setValue(value: IAppNotification_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotification {
    public val __569960491_Ptr: Pointer?

    public val _569960491_VtblPtr: Pointer?
      get() = __569960491_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Tag(): String? {
      val fnPtr = _569960491_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__569960491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Tag(value: String?): Unit {
      val fnPtr = _569960491_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__569960491_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Group(): String? {
      val fnPtr = _569960491_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__569960491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Group(value: String?): Unit {
      val fnPtr = _569960491_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__569960491_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _569960491_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__569960491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_Payload(): String? {
      val fnPtr = _569960491_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__569960491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Progress(): AppNotificationProgressData? {
      val fnPtr = _569960491_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationProgressData>()
      val hr = fn.invokeHR(arrayOf(__569960491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationProgressData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Progress(value: AppNotificationProgressData?): Unit {
      val fnPtr = _569960491_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__569960491_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Expiration(): DateTime? {
      val fnPtr = _569960491_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__569960491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Expiration(value: DateTime?): Unit {
      val fnPtr = _569960491_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__569960491_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ExpiresOnReboot(): Boolean {
      val fnPtr = _569960491_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__569960491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_ExpiresOnReboot(value: Boolean): Unit {
      val fnPtr = _569960491_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__569960491_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Priority(): AppNotificationPriority? {
      val fnPtr = _569960491_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationPriority>()
      val hr = fn.invokeHR(arrayOf(__569960491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationPriority>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_Priority(value: AppNotificationPriority?): Unit {
      val fnPtr = _569960491_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__569960491_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_SuppressDisplay(): Boolean {
      val fnPtr = _569960491_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__569960491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_SuppressDisplay(value: Boolean): Unit {
      val fnPtr = _569960491_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__569960491_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppNotification_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __569960491_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotification, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("373a691741165657936a15f99afdd667")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotification(ptr: Pointer?): WithDefault = IAppNotification_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotification {
      val address = segment.toRawLongValue()
      return makeIAppNotification(Pointer(address))
    }

    public override fun toNative(obj: IAppNotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__569960491_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotification): Array<IAppNotification?> = (elements as
        Array<IAppNotification?>).castToImpl<IAppNotification,IAppNotification_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotification?> =
        arrayOfNulls<IAppNotification_Impl>(size) as Array<IAppNotification?>
  }
}
