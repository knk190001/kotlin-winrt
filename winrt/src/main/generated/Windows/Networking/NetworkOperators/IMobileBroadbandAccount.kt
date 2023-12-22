package Windows.Networking.NetworkOperators

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

@ABIMarker(IMobileBroadbandAccount.ABI::class)
@Signature("{36c24ccd-cee2-43e0-a603-ee86a36d6570}")
@Guid("36c24ccdcee243e0a603ee86a36d6570")
@WinRTInterface("36c24ccdcee243e0a603ee86a36d6570")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandAccount.ByReference::class)
public interface IMobileBroadbandAccount : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NetworkAccountId(): String?

  @InterfaceMethod(1)
  public fun get_ServiceProviderGuid(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun get_ServiceProviderName(): String?

  @InterfaceMethod(3)
  public fun get_CurrentNetwork(): MobileBroadbandNetwork?

  @InterfaceMethod(4)
  public fun get_CurrentDeviceInformation(): MobileBroadbandDeviceInformation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandAccount> {
    public override fun getValue() = ABI.makeIMobileBroadbandAccount(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandAccount_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandAccount {
    public val __1423766641_Ptr: Pointer?

    public val _1423766641_VtblPtr: Pointer?
      get() = __1423766641_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NetworkAccountId(): String? {
      val fnPtr = _1423766641_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1423766641_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ServiceProviderGuid(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1423766641_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1423766641_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ServiceProviderName(): String? {
      val fnPtr = _1423766641_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1423766641_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CurrentNetwork(): MobileBroadbandNetwork? {
      val fnPtr = _1423766641_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandNetwork>()
      val hr = fn.invokeHR(arrayOf(__1423766641_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandNetwork>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CurrentDeviceInformation(): MobileBroadbandDeviceInformation? {
      val fnPtr = _1423766641_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandDeviceInformation>()
      val hr = fn.invokeHR(arrayOf(__1423766641_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandDeviceInformation>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandAccount_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1423766641_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandAccount, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("36c24ccdcee243e0a603ee86a36d6570")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandAccount(ptr: Pointer?): WithDefault =
        IMobileBroadbandAccount_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandAccount {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandAccount(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandAccount): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1423766641_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandAccount): Array<IMobileBroadbandAccount?>
        = (elements as
        Array<IMobileBroadbandAccount?>).castToImpl<IMobileBroadbandAccount,IMobileBroadbandAccount_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandAccount?> =
        arrayOfNulls<IMobileBroadbandAccount_Impl>(size) as Array<IMobileBroadbandAccount?>
  }
}
