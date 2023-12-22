package Windows.ApplicationModel.Store.Preview.InstallControl

import Windows.Foundation.HResult
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppInstallStatus.ABI::class)
@Signature("{936dccfa-2450-4126-88b1-6127a644dd5c}")
@Guid("936dccfa2450412688b16127a644dd5c")
@WinRTInterface("936dccfa2450412688b16127a644dd5c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallStatus.ByReference::class)
public interface IAppInstallStatus : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InstallState(): AppInstallState?

  @InterfaceMethod(1)
  public fun get_DownloadSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun get_BytesDownloaded(): WinDef.ULONG

  @InterfaceMethod(3)
  public fun get_PercentComplete(): Double

  @InterfaceMethod(4)
  public fun get_ErrorCode(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallStatus> {
    public override fun getValue() = ABI.makeIAppInstallStatus(pointer.getPointer(0))

    public fun setValue(value: IAppInstallStatus_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallStatus {
    public val __353590582_Ptr: Pointer?

    public val _353590582_VtblPtr: Pointer?
      get() = __353590582_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InstallState(): AppInstallState? {
      val fnPtr = _353590582_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInstallState>()
      val hr = fn.invokeHR(arrayOf(__353590582_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInstallState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DownloadSizeInBytes(): WinDef.ULONG {
      val fnPtr = _353590582_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__353590582_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_BytesDownloaded(): WinDef.ULONG {
      val fnPtr = _353590582_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__353590582_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_PercentComplete(): Double {
      val fnPtr = _353590582_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__353590582_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ErrorCode(): HResult? {
      val fnPtr = _353590582_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__353590582_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IAppInstallStatus_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __353590582_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallStatus, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("936dccfa2450412688b16127a644dd5c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallStatus(ptr: Pointer?): WithDefault = IAppInstallStatus_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallStatus {
      val address = segment.toRawLongValue()
      return makeIAppInstallStatus(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__353590582_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallStatus): Array<IAppInstallStatus?> = (elements
        as Array<IAppInstallStatus?>).castToImpl<IAppInstallStatus,IAppInstallStatus_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallStatus?> =
        arrayOfNulls<IAppInstallStatus_Impl>(size) as Array<IAppInstallStatus?>
  }
}
