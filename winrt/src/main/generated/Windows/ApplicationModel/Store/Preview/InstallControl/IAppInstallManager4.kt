package Windows.ApplicationModel.Store.Preview.InstallControl

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

@ABIMarker(IAppInstallManager4.ABI::class)
@Signature("{260a2a16-5a9e-4ebd-b944-f2ba75c31159}")
@Guid("260a2a165a9e4ebdb944f2ba75c31159")
@WinRTInterface("260a2a165a9e4ebdb944f2ba75c31159")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallManager4.ByReference::class)
public interface IAppInstallManager4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFreeUserEntitlementAsync(
    storeId: String?,
    campaignId: String?,
    correlationVector: String?
  ): IAsyncOperation<GetEntitlementResult?>?

  @InterfaceMethod(1)
  public fun GetFreeUserEntitlementForUserAsync(
    user: User?,
    storeId: String?,
    campaignId: String?,
    correlationVector: String?
  ): IAsyncOperation<GetEntitlementResult?>?

  @InterfaceMethod(2)
  public fun GetFreeDeviceEntitlementAsync(
    storeId: String?,
    campaignId: String?,
    correlationVector: String?
  ): IAsyncOperation<GetEntitlementResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallManager4> {
    public override fun getValue() = ABI.makeIAppInstallManager4(pointer.getPointer(0))

    public fun setValue(value: IAppInstallManager4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallManager4 {
    public val __697290133_Ptr: Pointer?

    public val _697290133_VtblPtr: Pointer?
      get() = __697290133_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFreeUserEntitlementAsync(
      storeId: String?,
      campaignId: String?,
      correlationVector: String?
    ): IAsyncOperation<GetEntitlementResult?>? {
      val fnPtr = _697290133_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GetEntitlementResult?>>()
      val hr = fn.invokeHR(arrayOf(__697290133_Ptr, marshalToNative(storeId),
          marshalToNative(campaignId), marshalToNative(correlationVector), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GetEntitlementResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetFreeUserEntitlementForUserAsync(
      user: User?,
      storeId: String?,
      campaignId: String?,
      correlationVector: String?
    ): IAsyncOperation<GetEntitlementResult?>? {
      val fnPtr = _697290133_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GetEntitlementResult?>>()
      val hr = fn.invokeHR(arrayOf(__697290133_Ptr, marshalToNative(user), marshalToNative(storeId),
          marshalToNative(campaignId), marshalToNative(correlationVector), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GetEntitlementResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetFreeDeviceEntitlementAsync(
      storeId: String?,
      campaignId: String?,
      correlationVector: String?
    ): IAsyncOperation<GetEntitlementResult?>? {
      val fnPtr = _697290133_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GetEntitlementResult?>>()
      val hr = fn.invokeHR(arrayOf(__697290133_Ptr, marshalToNative(storeId),
          marshalToNative(campaignId), marshalToNative(correlationVector), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GetEntitlementResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppInstallManager4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __697290133_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallManager4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("260a2a165a9e4ebdb944f2ba75c31159")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallManager4(ptr: Pointer?): WithDefault = IAppInstallManager4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallManager4 {
      val address = segment.toRawLongValue()
      return makeIAppInstallManager4(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallManager4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__697290133_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallManager4): Array<IAppInstallManager4?> =
        (elements as
        Array<IAppInstallManager4?>).castToImpl<IAppInstallManager4,IAppInstallManager4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallManager4?> =
        arrayOfNulls<IAppInstallManager4_Impl>(size) as Array<IAppInstallManager4?>
  }
}
