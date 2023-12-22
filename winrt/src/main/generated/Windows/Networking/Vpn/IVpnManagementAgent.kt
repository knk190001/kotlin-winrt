package Windows.Networking.Vpn

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnManagementAgent.ABI::class)
@Signature("{193696cd-a5c4-4abe-852b-785be4cb3e34}")
@Guid("193696cda5c44abe852b785be4cb3e34")
@WinRTInterface("193696cda5c44abe852b785be4cb3e34")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnManagementAgent.ByReference::class)
public interface IVpnManagementAgent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddProfileFromXmlAsync(xml: String?): IAsyncOperation<VpnManagementErrorStatus?>?

  @InterfaceMethod(1)
  public fun AddProfileFromObjectAsync(profile: IVpnProfile?):
      IAsyncOperation<VpnManagementErrorStatus?>?

  @InterfaceMethod(2)
  public fun UpdateProfileFromXmlAsync(xml: String?): IAsyncOperation<VpnManagementErrorStatus?>?

  @InterfaceMethod(3)
  public fun UpdateProfileFromObjectAsync(profile: IVpnProfile?):
      IAsyncOperation<VpnManagementErrorStatus?>?

  @InterfaceMethod(4)
  public fun GetProfilesAsync(): IAsyncOperation<IVectorView<IVpnProfile?>?>?

  @InterfaceMethod(5)
  public fun DeleteProfileAsync(profile: IVpnProfile?): IAsyncOperation<VpnManagementErrorStatus?>?

  @InterfaceMethod(6)
  public fun ConnectProfileAsync(profile: IVpnProfile?): IAsyncOperation<VpnManagementErrorStatus?>?

  @InterfaceMethod(7)
  public fun ConnectProfileWithPasswordCredentialAsync(profile: IVpnProfile?,
      passwordCredential: PasswordCredential?): IAsyncOperation<VpnManagementErrorStatus?>?

  @InterfaceMethod(8)
  public fun DisconnectProfileAsync(profile: IVpnProfile?):
      IAsyncOperation<VpnManagementErrorStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnManagementAgent> {
    public override fun getValue() = ABI.makeIVpnManagementAgent(pointer.getPointer(0))

    public fun setValue(value: IVpnManagementAgent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnManagementAgent {
    public val __177834222_Ptr: Pointer?

    public val _177834222_VtblPtr: Pointer?
      get() = __177834222_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddProfileFromXmlAsync(xml: String?):
        IAsyncOperation<VpnManagementErrorStatus?>? {
      val fnPtr = _177834222_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VpnManagementErrorStatus?>>()
      val hr = fn.invokeHR(arrayOf(__177834222_Ptr, marshalToNative(xml), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<VpnManagementErrorStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AddProfileFromObjectAsync(profile: IVpnProfile?):
        IAsyncOperation<VpnManagementErrorStatus?>? {
      val fnPtr = _177834222_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VpnManagementErrorStatus?>>()
      val hr = fn.invokeHR(arrayOf(__177834222_Ptr, marshalToNative(profile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<VpnManagementErrorStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun UpdateProfileFromXmlAsync(xml: String?):
        IAsyncOperation<VpnManagementErrorStatus?>? {
      val fnPtr = _177834222_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VpnManagementErrorStatus?>>()
      val hr = fn.invokeHR(arrayOf(__177834222_Ptr, marshalToNative(xml), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<VpnManagementErrorStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun UpdateProfileFromObjectAsync(profile: IVpnProfile?):
        IAsyncOperation<VpnManagementErrorStatus?>? {
      val fnPtr = _177834222_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VpnManagementErrorStatus?>>()
      val hr = fn.invokeHR(arrayOf(__177834222_Ptr, marshalToNative(profile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<VpnManagementErrorStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetProfilesAsync(): IAsyncOperation<IVectorView<IVpnProfile?>?>? {
      val fnPtr = _177834222_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<IVpnProfile?>?>>()
      val hr = fn.invokeHR(arrayOf(__177834222_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<IVpnProfile?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun DeleteProfileAsync(profile: IVpnProfile?):
        IAsyncOperation<VpnManagementErrorStatus?>? {
      val fnPtr = _177834222_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VpnManagementErrorStatus?>>()
      val hr = fn.invokeHR(arrayOf(__177834222_Ptr, marshalToNative(profile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<VpnManagementErrorStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun ConnectProfileAsync(profile: IVpnProfile?):
        IAsyncOperation<VpnManagementErrorStatus?>? {
      val fnPtr = _177834222_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VpnManagementErrorStatus?>>()
      val hr = fn.invokeHR(arrayOf(__177834222_Ptr, marshalToNative(profile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<VpnManagementErrorStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun ConnectProfileWithPasswordCredentialAsync(profile: IVpnProfile?,
        passwordCredential: PasswordCredential?): IAsyncOperation<VpnManagementErrorStatus?>? {
      val fnPtr = _177834222_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VpnManagementErrorStatus?>>()
      val hr = fn.invokeHR(arrayOf(__177834222_Ptr, marshalToNative(profile),
          marshalToNative(passwordCredential), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<VpnManagementErrorStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun DisconnectProfileAsync(profile: IVpnProfile?):
        IAsyncOperation<VpnManagementErrorStatus?>? {
      val fnPtr = _177834222_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VpnManagementErrorStatus?>>()
      val hr = fn.invokeHR(arrayOf(__177834222_Ptr, marshalToNative(profile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<VpnManagementErrorStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IVpnManagementAgent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __177834222_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnManagementAgent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("193696cda5c44abe852b785be4cb3e34")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnManagementAgent(ptr: Pointer?): WithDefault = IVpnManagementAgent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnManagementAgent {
      val address = segment.toRawLongValue()
      return makeIVpnManagementAgent(Pointer(address))
    }

    public override fun toNative(obj: IVpnManagementAgent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__177834222_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnManagementAgent): Array<IVpnManagementAgent?> =
        (elements as
        Array<IVpnManagementAgent?>).castToImpl<IVpnManagementAgent,IVpnManagementAgent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnManagementAgent?> =
        arrayOfNulls<IVpnManagementAgent_Impl>(size) as Array<IVpnManagementAgent?>
  }
}
