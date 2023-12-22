package Windows.Security.Authorization.AppCapabilityAccess

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IMapView
import Windows.Foundation.IAsyncOperation
import Windows.System.User
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppCapabilityStatics.ABI::class)
@Signature("{7c353e2a-46ee-44e5-af3d-6ad3fc49bd22}")
@Guid("7c353e2a46ee44e5af3d6ad3fc49bd22")
@WinRTInterface("7c353e2a46ee44e5af3d6ad3fc49bd22")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCapabilityStatics.ByReference::class)
public interface IAppCapabilityStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAccessForCapabilitiesAsync(capabilityNames: IIterable<String?>?):
      IAsyncOperation<IMapView<String?, AppCapabilityAccessStatus?>?>?

  @InterfaceMethod(1)
  public fun RequestAccessForCapabilitiesForUserAsync(user: User?,
      capabilityNames: IIterable<String?>?): IAsyncOperation<IMapView<String?,
      AppCapabilityAccessStatus?>?>?

  @InterfaceMethod(2)
  public fun Create(capabilityName: String?): AppCapability?

  @InterfaceMethod(3)
  public fun CreateWithProcessIdForUser(
    user: User?,
    capabilityName: String?,
    pid: WinDef.UINT
  ): AppCapability?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCapabilityStatics> {
    public override fun getValue() = ABI.makeIAppCapabilityStatics(pointer.getPointer(0))

    public fun setValue(value: IAppCapabilityStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCapabilityStatics {
    public val __992863888_Ptr: Pointer?

    public val _992863888_VtblPtr: Pointer?
      get() = __992863888_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAccessForCapabilitiesAsync(capabilityNames: IIterable<String?>?):
        IAsyncOperation<IMapView<String?, AppCapabilityAccessStatus?>?>? {
      val fnPtr = _992863888_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IMapView<String?,
          AppCapabilityAccessStatus?>?>>()
      val hr = fn.invokeHR(arrayOf(__992863888_Ptr, marshalToNative(capabilityNames), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IMapView<String?,
          AppCapabilityAccessStatus?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestAccessForCapabilitiesForUserAsync(user: User?,
        capabilityNames: IIterable<String?>?): IAsyncOperation<IMapView<String?,
        AppCapabilityAccessStatus?>?>? {
      val fnPtr = _992863888_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IMapView<String?,
          AppCapabilityAccessStatus?>?>>()
      val hr = fn.invokeHR(arrayOf(__992863888_Ptr, marshalToNative(user),
          marshalToNative(capabilityNames), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IMapView<String?,
          AppCapabilityAccessStatus?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Create(capabilityName: String?): AppCapability? {
      val fnPtr = _992863888_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCapability>()
      val hr = fn.invokeHR(arrayOf(__992863888_Ptr, marshalToNative(capabilityName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCapability>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateWithProcessIdForUser(
      user: User?,
      capabilityName: String?,
      pid: WinDef.UINT
    ): AppCapability? {
      val fnPtr = _992863888_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCapability>()
      val hr = fn.invokeHR(arrayOf(__992863888_Ptr, marshalToNative(user),
          marshalToNative(capabilityName), pid, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCapability>(result.getValue())
      return resultValue
    }
  }

  public class IAppCapabilityStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __992863888_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCapabilityStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c353e2a46ee44e5af3d6ad3fc49bd22")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCapabilityStatics(ptr: Pointer?): WithDefault =
        IAppCapabilityStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCapabilityStatics {
      val address = segment.toRawLongValue()
      return makeIAppCapabilityStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppCapabilityStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__992863888_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCapabilityStatics): Array<IAppCapabilityStatics?> =
        (elements as
        Array<IAppCapabilityStatics?>).castToImpl<IAppCapabilityStatics,IAppCapabilityStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCapabilityStatics?> =
        arrayOfNulls<IAppCapabilityStatics_Impl>(size) as Array<IAppCapabilityStatics?>
  }
}
