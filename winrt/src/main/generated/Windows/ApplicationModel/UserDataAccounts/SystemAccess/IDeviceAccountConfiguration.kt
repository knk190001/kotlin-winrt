package Windows.ApplicationModel.UserDataAccounts.SystemAccess

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

@ABIMarker(IDeviceAccountConfiguration.ABI::class)
@Signature("{ad0123a3-fbdc-4d1b-be43-5a27ea4a1b63}")
@Guid("ad0123a3fbdc4d1bbe435a27ea4a1b63")
@WinRTInterface("ad0123a3fbdc4d1bbe435a27ea4a1b63")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceAccountConfiguration.ByReference::class)
public interface IDeviceAccountConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AccountName(): String?

  @InterfaceMethod(1)
  public fun put_AccountName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_DeviceAccountTypeId(): String?

  @InterfaceMethod(3)
  public fun put_DeviceAccountTypeId(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_ServerType(): DeviceAccountServerType?

  @InterfaceMethod(5)
  public fun put_ServerType(value: DeviceAccountServerType?): Unit

  @InterfaceMethod(6)
  public fun get_EmailAddress(): String?

  @InterfaceMethod(7)
  public fun put_EmailAddress(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_Domain(): String?

  @InterfaceMethod(9)
  public fun put_Domain(value: String?): Unit

  @InterfaceMethod(10)
  public fun get_EmailSyncEnabled(): Boolean

  @InterfaceMethod(11)
  public fun put_EmailSyncEnabled(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_ContactsSyncEnabled(): Boolean

  @InterfaceMethod(13)
  public fun put_ContactsSyncEnabled(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_CalendarSyncEnabled(): Boolean

  @InterfaceMethod(15)
  public fun put_CalendarSyncEnabled(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_IncomingServerAddress(): String?

  @InterfaceMethod(17)
  public fun put_IncomingServerAddress(value: String?): Unit

  @InterfaceMethod(18)
  public fun get_IncomingServerPort(): Int

  @InterfaceMethod(19)
  public fun put_IncomingServerPort(value: Int): Unit

  @InterfaceMethod(20)
  public fun get_IncomingServerRequiresSsl(): Boolean

  @InterfaceMethod(21)
  public fun put_IncomingServerRequiresSsl(value: Boolean): Unit

  @InterfaceMethod(22)
  public fun get_IncomingServerUsername(): String?

  @InterfaceMethod(23)
  public fun put_IncomingServerUsername(value: String?): Unit

  @InterfaceMethod(24)
  public fun get_OutgoingServerAddress(): String?

  @InterfaceMethod(25)
  public fun put_OutgoingServerAddress(value: String?): Unit

  @InterfaceMethod(26)
  public fun get_OutgoingServerPort(): Int

  @InterfaceMethod(27)
  public fun put_OutgoingServerPort(value: Int): Unit

  @InterfaceMethod(28)
  public fun get_OutgoingServerRequiresSsl(): Boolean

  @InterfaceMethod(29)
  public fun put_OutgoingServerRequiresSsl(value: Boolean): Unit

  @InterfaceMethod(30)
  public fun get_OutgoingServerUsername(): String?

  @InterfaceMethod(31)
  public fun put_OutgoingServerUsername(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceAccountConfiguration> {
    public override fun getValue() = ABI.makeIDeviceAccountConfiguration(pointer.getPointer(0))

    public fun setValue(value: IDeviceAccountConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceAccountConfiguration {
    public val __1669010156_Ptr: Pointer?

    public val _1669010156_VtblPtr: Pointer?
      get() = __1669010156_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AccountName(): String? {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AccountName(value: String?): Unit {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DeviceAccountTypeId(): String? {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DeviceAccountTypeId(value: String?): Unit {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ServerType(): DeviceAccountServerType? {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceAccountServerType>()
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceAccountServerType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ServerType(value: DeviceAccountServerType?): Unit {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_EmailAddress(): String? {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_EmailAddress(value: String?): Unit {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Domain(): String? {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Domain(value: String?): Unit {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_EmailSyncEnabled(): Boolean {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_EmailSyncEnabled(value: Boolean): Unit {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ContactsSyncEnabled(): Boolean {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_ContactsSyncEnabled(value: Boolean): Unit {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_CalendarSyncEnabled(): Boolean {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_CalendarSyncEnabled(value: Boolean): Unit {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_IncomingServerAddress(): String? {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_IncomingServerAddress(value: String?): Unit {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_IncomingServerPort(): Int {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_IncomingServerPort(value: Int): Unit {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_IncomingServerRequiresSsl(): Boolean {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_IncomingServerRequiresSsl(value: Boolean): Unit {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_IncomingServerUsername(): String? {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_IncomingServerUsername(value: String?): Unit {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_OutgoingServerAddress(): String? {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_OutgoingServerAddress(value: String?): Unit {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_OutgoingServerPort(): Int {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun put_OutgoingServerPort(value: Int): Unit {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_OutgoingServerRequiresSsl(): Boolean {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override fun put_OutgoingServerRequiresSsl(value: Boolean): Unit {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_OutgoingServerUsername(): String? {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_OutgoingServerUsername(value: String?): Unit {
      val fnPtr = _1669010156_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669010156_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDeviceAccountConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1669010156_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceAccountConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ad0123a3fbdc4d1bbe435a27ea4a1b63")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceAccountConfiguration(ptr: Pointer?): WithDefault =
        IDeviceAccountConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceAccountConfiguration {
      val address = segment.toRawLongValue()
      return makeIDeviceAccountConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IDeviceAccountConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1669010156_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceAccountConfiguration):
        Array<IDeviceAccountConfiguration?> = (elements as
        Array<IDeviceAccountConfiguration?>).castToImpl<IDeviceAccountConfiguration,IDeviceAccountConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceAccountConfiguration?> =
        arrayOfNulls<IDeviceAccountConfiguration_Impl>(size) as Array<IDeviceAccountConfiguration?>
  }
}
