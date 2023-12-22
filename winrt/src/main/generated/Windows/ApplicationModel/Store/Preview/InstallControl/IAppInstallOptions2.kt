package Windows.ApplicationModel.Store.Preview.InstallControl

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppInstallOptions2.ABI::class)
@Signature("{8a04c0d7-c94b-425e-95b4-bf27faeaee89}")
@Guid("8a04c0d7c94b425e95b4bf27faeaee89")
@WinRTInterface("8a04c0d7c94b425e95b4bf27faeaee89")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallOptions2.ByReference::class)
public interface IAppInstallOptions2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PinToDesktopAfterInstall(): Boolean

  @InterfaceMethod(1)
  public fun put_PinToDesktopAfterInstall(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_PinToStartAfterInstall(): Boolean

  @InterfaceMethod(3)
  public fun put_PinToStartAfterInstall(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_PinToTaskbarAfterInstall(): Boolean

  @InterfaceMethod(5)
  public fun put_PinToTaskbarAfterInstall(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_CompletedInstallToastNotificationMode(): AppInstallationToastNotificationMode?

  @InterfaceMethod(7)
  public
      fun put_CompletedInstallToastNotificationMode(value: AppInstallationToastNotificationMode?):
      Unit

  @InterfaceMethod(8)
  public fun get_InstallInProgressToastNotificationMode(): AppInstallationToastNotificationMode?

  @InterfaceMethod(9)
  public
      fun put_InstallInProgressToastNotificationMode(value: AppInstallationToastNotificationMode?):
      Unit

  @InterfaceMethod(10)
  public fun get_InstallForAllUsers(): Boolean

  @InterfaceMethod(11)
  public fun put_InstallForAllUsers(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_StageButDoNotInstall(): Boolean

  @InterfaceMethod(13)
  public fun put_StageButDoNotInstall(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_CampaignId(): String?

  @InterfaceMethod(15)
  public fun put_CampaignId(value: String?): Unit

  @InterfaceMethod(16)
  public fun get_ExtendedCampaignId(): String?

  @InterfaceMethod(17)
  public fun put_ExtendedCampaignId(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallOptions2> {
    public override fun getValue() = ABI.makeIAppInstallOptions2(pointer.getPointer(0))

    public fun setValue(value: IAppInstallOptions2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallOptions2 {
    public val __899573352_Ptr: Pointer?

    public val _899573352_VtblPtr: Pointer?
      get() = __899573352_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PinToDesktopAfterInstall(): Boolean {
      val fnPtr = _899573352_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_PinToDesktopAfterInstall(value: Boolean): Unit {
      val fnPtr = _899573352_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PinToStartAfterInstall(): Boolean {
      val fnPtr = _899573352_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_PinToStartAfterInstall(value: Boolean): Unit {
      val fnPtr = _899573352_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PinToTaskbarAfterInstall(): Boolean {
      val fnPtr = _899573352_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_PinToTaskbarAfterInstall(value: Boolean): Unit {
      val fnPtr = _899573352_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CompletedInstallToastNotificationMode():
        AppInstallationToastNotificationMode? {
      val fnPtr = _899573352_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInstallationToastNotificationMode>()
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInstallationToastNotificationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override
        fun put_CompletedInstallToastNotificationMode(value: AppInstallationToastNotificationMode?):
        Unit {
      val fnPtr = _899573352_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_InstallInProgressToastNotificationMode():
        AppInstallationToastNotificationMode? {
      val fnPtr = _899573352_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInstallationToastNotificationMode>()
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInstallationToastNotificationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override
        fun put_InstallInProgressToastNotificationMode(value: AppInstallationToastNotificationMode?):
        Unit {
      val fnPtr = _899573352_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_InstallForAllUsers(): Boolean {
      val fnPtr = _899573352_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_InstallForAllUsers(value: Boolean): Unit {
      val fnPtr = _899573352_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_StageButDoNotInstall(): Boolean {
      val fnPtr = _899573352_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_StageButDoNotInstall(value: Boolean): Unit {
      val fnPtr = _899573352_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_CampaignId(): String? {
      val fnPtr = _899573352_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_CampaignId(value: String?): Unit {
      val fnPtr = _899573352_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ExtendedCampaignId(): String? {
      val fnPtr = _899573352_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_ExtendedCampaignId(value: String?): Unit {
      val fnPtr = _899573352_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__899573352_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppInstallOptions2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __899573352_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallOptions2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8a04c0d7c94b425e95b4bf27faeaee89")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallOptions2(ptr: Pointer?): WithDefault = IAppInstallOptions2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallOptions2 {
      val address = segment.toRawLongValue()
      return makeIAppInstallOptions2(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallOptions2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__899573352_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallOptions2): Array<IAppInstallOptions2?> =
        (elements as
        Array<IAppInstallOptions2?>).castToImpl<IAppInstallOptions2,IAppInstallOptions2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallOptions2?> =
        arrayOfNulls<IAppInstallOptions2_Impl>(size) as Array<IAppInstallOptions2?>
  }
}
