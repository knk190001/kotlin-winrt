package Windows.ApplicationModel.UserDataAccounts.SystemAccess

import Windows.Foundation.Uri
import Windows.Security.Credentials.PasswordCredential
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

@ABIMarker(IDeviceAccountConfiguration2.ABI::class)
@Signature("{f2b2e5a6-728d-4a4a-8945-2bf8580136de}")
@Guid("f2b2e5a6728d4a4a89452bf8580136de")
@WinRTInterface("f2b2e5a6728d4a4a89452bf8580136de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceAccountConfiguration2.ByReference::class)
public interface IDeviceAccountConfiguration2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IncomingServerCredential(): PasswordCredential?

  @InterfaceMethod(1)
  public fun put_IncomingServerCredential(value: PasswordCredential?): Unit

  @InterfaceMethod(2)
  public fun get_OutgoingServerCredential(): PasswordCredential?

  @InterfaceMethod(3)
  public fun put_OutgoingServerCredential(value: PasswordCredential?): Unit

  @InterfaceMethod(4)
  public fun get_OAuthRefreshToken(): String?

  @InterfaceMethod(5)
  public fun put_OAuthRefreshToken(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_IsExternallyManaged(): Boolean

  @InterfaceMethod(7)
  public fun put_IsExternallyManaged(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_AccountIconId(): DeviceAccountIconId?

  @InterfaceMethod(9)
  public fun put_AccountIconId(value: DeviceAccountIconId?): Unit

  @InterfaceMethod(10)
  public fun get_AuthenticationType(): DeviceAccountAuthenticationType?

  @InterfaceMethod(11)
  public fun put_AuthenticationType(value: DeviceAccountAuthenticationType?): Unit

  @InterfaceMethod(12)
  public fun get_IsSsoAuthenticationSupported(): Boolean

  @InterfaceMethod(13)
  public fun get_SsoAccountId(): String?

  @InterfaceMethod(14)
  public fun put_SsoAccountId(value: String?): Unit

  @InterfaceMethod(15)
  public fun get_AlwaysDownloadFullMessage(): Boolean

  @InterfaceMethod(16)
  public fun put_AlwaysDownloadFullMessage(value: Boolean): Unit

  @InterfaceMethod(17)
  public fun get_DoesPolicyAllowMailSync(): Boolean

  @InterfaceMethod(18)
  public fun get_SyncScheduleKind(): DeviceAccountSyncScheduleKind?

  @InterfaceMethod(19)
  public fun put_SyncScheduleKind(value: DeviceAccountSyncScheduleKind?): Unit

  @InterfaceMethod(20)
  public fun get_MailAgeFilter(): DeviceAccountMailAgeFilter?

  @InterfaceMethod(21)
  public fun put_MailAgeFilter(value: DeviceAccountMailAgeFilter?): Unit

  @InterfaceMethod(22)
  public fun get_IsClientAuthenticationCertificateRequired(): Boolean

  @InterfaceMethod(23)
  public fun put_IsClientAuthenticationCertificateRequired(value: Boolean): Unit

  @InterfaceMethod(24)
  public fun get_AutoSelectAuthenticationCertificate(): Boolean

  @InterfaceMethod(25)
  public fun put_AutoSelectAuthenticationCertificate(value: Boolean): Unit

  @InterfaceMethod(26)
  public fun get_AuthenticationCertificateId(): String?

  @InterfaceMethod(27)
  public fun put_AuthenticationCertificateId(value: String?): Unit

  @InterfaceMethod(28)
  public fun get_CardDavSyncScheduleKind(): DeviceAccountSyncScheduleKind?

  @InterfaceMethod(29)
  public fun put_CardDavSyncScheduleKind(value: DeviceAccountSyncScheduleKind?): Unit

  @InterfaceMethod(30)
  public fun get_CalDavSyncScheduleKind(): DeviceAccountSyncScheduleKind?

  @InterfaceMethod(31)
  public fun put_CalDavSyncScheduleKind(value: DeviceAccountSyncScheduleKind?): Unit

  @InterfaceMethod(32)
  public fun get_CardDavServerUrl(): Uri?

  @InterfaceMethod(33)
  public fun put_CardDavServerUrl(value: Uri?): Unit

  @InterfaceMethod(34)
  public fun get_CardDavRequiresSsl(): Boolean

  @InterfaceMethod(35)
  public fun put_CardDavRequiresSsl(value: Boolean): Unit

  @InterfaceMethod(36)
  public fun get_CalDavServerUrl(): Uri?

  @InterfaceMethod(37)
  public fun put_CalDavServerUrl(value: Uri?): Unit

  @InterfaceMethod(38)
  public fun get_CalDavRequiresSsl(): Boolean

  @InterfaceMethod(39)
  public fun put_CalDavRequiresSsl(value: Boolean): Unit

  @InterfaceMethod(40)
  public fun get_WasModifiedByUser(): Boolean

  @InterfaceMethod(41)
  public fun put_WasModifiedByUser(value: Boolean): Unit

  @InterfaceMethod(42)
  public fun get_WasIncomingServerCertificateHashConfirmed(): Boolean

  @InterfaceMethod(43)
  public fun put_WasIncomingServerCertificateHashConfirmed(value: Boolean): Unit

  @InterfaceMethod(44)
  public fun get_IncomingServerCertificateHash(): String?

  @InterfaceMethod(45)
  public fun put_IncomingServerCertificateHash(value: String?): Unit

  @InterfaceMethod(46)
  public fun get_IsOutgoingServerAuthenticationRequired(): Boolean

  @InterfaceMethod(47)
  public fun put_IsOutgoingServerAuthenticationRequired(value: Boolean): Unit

  @InterfaceMethod(48)
  public fun get_IsOutgoingServerAuthenticationEnabled(): Boolean

  @InterfaceMethod(49)
  public fun put_IsOutgoingServerAuthenticationEnabled(value: Boolean): Unit

  @InterfaceMethod(50)
  public fun get_WasOutgoingServerCertificateHashConfirmed(): Boolean

  @InterfaceMethod(51)
  public fun put_WasOutgoingServerCertificateHashConfirmed(value: Boolean): Unit

  @InterfaceMethod(52)
  public fun get_OutgoingServerCertificateHash(): String?

  @InterfaceMethod(53)
  public fun put_OutgoingServerCertificateHash(value: String?): Unit

  @InterfaceMethod(54)
  public fun get_IsSyncScheduleManagedBySystem(): Boolean

  @InterfaceMethod(55)
  public fun put_IsSyncScheduleManagedBySystem(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceAccountConfiguration2> {
    public override fun getValue() = ABI.makeIDeviceAccountConfiguration2(pointer.getPointer(0))

    public fun setValue(value: IDeviceAccountConfiguration2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceAccountConfiguration2 {
    public val __199707334_Ptr: Pointer?

    public val _199707334_VtblPtr: Pointer?
      get() = __199707334_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IncomingServerCredential(): PasswordCredential? {
      val fnPtr = _199707334_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordCredential>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordCredential>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_IncomingServerCredential(value: PasswordCredential?): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_OutgoingServerCredential(): PasswordCredential? {
      val fnPtr = _199707334_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordCredential>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordCredential>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_OutgoingServerCredential(value: PasswordCredential?): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_OAuthRefreshToken(): String? {
      val fnPtr = _199707334_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_OAuthRefreshToken(value: String?): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsExternallyManaged(): Boolean {
      val fnPtr = _199707334_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsExternallyManaged(value: Boolean): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_AccountIconId(): DeviceAccountIconId? {
      val fnPtr = _199707334_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceAccountIconId>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceAccountIconId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_AccountIconId(value: DeviceAccountIconId?): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_AuthenticationType(): DeviceAccountAuthenticationType? {
      val fnPtr = _199707334_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceAccountAuthenticationType>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceAccountAuthenticationType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_AuthenticationType(value: DeviceAccountAuthenticationType?): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsSsoAuthenticationSupported(): Boolean {
      val fnPtr = _199707334_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_SsoAccountId(): String? {
      val fnPtr = _199707334_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_SsoAccountId(value: String?): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_AlwaysDownloadFullMessage(): Boolean {
      val fnPtr = _199707334_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun put_AlwaysDownloadFullMessage(value: Boolean): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_DoesPolicyAllowMailSync(): Boolean {
      val fnPtr = _199707334_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun get_SyncScheduleKind(): DeviceAccountSyncScheduleKind? {
      val fnPtr = _199707334_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceAccountSyncScheduleKind>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceAccountSyncScheduleKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_SyncScheduleKind(value: DeviceAccountSyncScheduleKind?): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_MailAgeFilter(): DeviceAccountMailAgeFilter? {
      val fnPtr = _199707334_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceAccountMailAgeFilter>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceAccountMailAgeFilter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_MailAgeFilter(value: DeviceAccountMailAgeFilter?): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_IsClientAuthenticationCertificateRequired(): Boolean {
      val fnPtr = _199707334_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun put_IsClientAuthenticationCertificateRequired(value: Boolean): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_AutoSelectAuthenticationCertificate(): Boolean {
      val fnPtr = _199707334_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun put_AutoSelectAuthenticationCertificate(value: Boolean): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_AuthenticationCertificateId(): String? {
      val fnPtr = _199707334_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_AuthenticationCertificateId(value: String?): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_CardDavSyncScheduleKind(): DeviceAccountSyncScheduleKind? {
      val fnPtr = _199707334_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceAccountSyncScheduleKind>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceAccountSyncScheduleKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_CardDavSyncScheduleKind(value: DeviceAccountSyncScheduleKind?): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_CalDavSyncScheduleKind(): DeviceAccountSyncScheduleKind? {
      val fnPtr = _199707334_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceAccountSyncScheduleKind>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceAccountSyncScheduleKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_CalDavSyncScheduleKind(value: DeviceAccountSyncScheduleKind?): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_CardDavServerUrl(): Uri? {
      val fnPtr = _199707334_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun put_CardDavServerUrl(value: Uri?): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_CardDavRequiresSsl(): Boolean {
      val fnPtr = _199707334_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(35)
    public override fun put_CardDavRequiresSsl(value: Boolean): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_CalDavServerUrl(): Uri? {
      val fnPtr = _199707334_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun put_CalDavServerUrl(value: Uri?): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_CalDavRequiresSsl(): Boolean {
      val fnPtr = _199707334_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(39)
    public override fun put_CalDavRequiresSsl(value: Boolean): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_WasModifiedByUser(): Boolean {
      val fnPtr = _199707334_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(41)
    public override fun put_WasModifiedByUser(value: Boolean): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_WasIncomingServerCertificateHashConfirmed(): Boolean {
      val fnPtr = _199707334_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(43)
    public override fun put_WasIncomingServerCertificateHashConfirmed(value: Boolean): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun get_IncomingServerCertificateHash(): String? {
      val fnPtr = _199707334_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun put_IncomingServerCertificateHash(value: String?): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun get_IsOutgoingServerAuthenticationRequired(): Boolean {
      val fnPtr = _199707334_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(47)
    public override fun put_IsOutgoingServerAuthenticationRequired(value: Boolean): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun get_IsOutgoingServerAuthenticationEnabled(): Boolean {
      val fnPtr = _199707334_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(49)
    public override fun put_IsOutgoingServerAuthenticationEnabled(value: Boolean): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun get_WasOutgoingServerCertificateHashConfirmed(): Boolean {
      val fnPtr = _199707334_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(51)
    public override fun put_WasOutgoingServerCertificateHashConfirmed(value: Boolean): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun get_OutgoingServerCertificateHash(): String? {
      val fnPtr = _199707334_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun put_OutgoingServerCertificateHash(value: String?): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(54)
    public override fun get_IsSyncScheduleManagedBySystem(): Boolean {
      val fnPtr = _199707334_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(55)
    public override fun put_IsSyncScheduleManagedBySystem(value: Boolean): Unit {
      val fnPtr = _199707334_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199707334_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDeviceAccountConfiguration2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __199707334_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceAccountConfiguration2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f2b2e5a6728d4a4a89452bf8580136de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceAccountConfiguration2(ptr: Pointer?): WithDefault =
        IDeviceAccountConfiguration2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceAccountConfiguration2 {
      val address = segment.toRawLongValue()
      return makeIDeviceAccountConfiguration2(Pointer(address))
    }

    public override fun toNative(obj: IDeviceAccountConfiguration2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__199707334_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceAccountConfiguration2):
        Array<IDeviceAccountConfiguration2?> = (elements as
        Array<IDeviceAccountConfiguration2?>).castToImpl<IDeviceAccountConfiguration2,IDeviceAccountConfiguration2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceAccountConfiguration2?> =
        arrayOfNulls<IDeviceAccountConfiguration2_Impl>(size) as
        Array<IDeviceAccountConfiguration2?>
  }
}
