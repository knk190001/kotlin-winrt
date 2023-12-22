package Windows.Media.Capture

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Size
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

@ABIMarker(IAppBroadcastServices.ABI::class)
@Signature("{8660b4d6-969b-4e3c-ac3a-8b042ee4ee63}")
@Guid("8660b4d6969b4e3cac3a8b042ee4ee63")
@WinRTInterface("8660b4d6969b4e3cac3a8b042ee4ee63")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastServices.ByReference::class)
public interface IAppBroadcastServices : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CaptureTargetType(): AppBroadcastCaptureTargetType?

  @InterfaceMethod(1)
  public fun put_CaptureTargetType(value: AppBroadcastCaptureTargetType?): Unit

  @InterfaceMethod(2)
  public fun get_BroadcastTitle(): String?

  @InterfaceMethod(3)
  public fun put_BroadcastTitle(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_BroadcastLanguage(): String?

  @InterfaceMethod(5)
  public fun put_BroadcastLanguage(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_UserName(): String?

  @InterfaceMethod(7)
  public fun get_CanCapture(): Boolean

  @InterfaceMethod(8)
  public fun EnterBroadcastModeAsync(plugIn: AppBroadcastPlugIn?): IAsyncOperation<WinDef.UINT>?

  @InterfaceMethod(9)
  public fun ExitBroadcastMode(reason: AppBroadcastExitBroadcastModeReason?): Unit

  @InterfaceMethod(10)
  public fun StartBroadcast(): Unit

  @InterfaceMethod(11)
  public fun PauseBroadcast(): Unit

  @InterfaceMethod(12)
  public fun ResumeBroadcast(): Unit

  @InterfaceMethod(13)
  public fun StartPreview(desiredSize: Size?): AppBroadcastPreview?

  @InterfaceMethod(14)
  public fun get_State(): AppBroadcastState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastServices> {
    public override fun getValue() = ABI.makeIAppBroadcastServices(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastServices_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastServices {
    public val __1691631606_Ptr: Pointer?

    public val _1691631606_VtblPtr: Pointer?
      get() = __1691631606_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CaptureTargetType(): AppBroadcastCaptureTargetType? {
      val fnPtr = _1691631606_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastCaptureTargetType>()
      val hr = fn.invokeHR(arrayOf(__1691631606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastCaptureTargetType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CaptureTargetType(value: AppBroadcastCaptureTargetType?): Unit {
      val fnPtr = _1691631606_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691631606_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BroadcastTitle(): String? {
      val fnPtr = _1691631606_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1691631606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_BroadcastTitle(value: String?): Unit {
      val fnPtr = _1691631606_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691631606_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_BroadcastLanguage(): String? {
      val fnPtr = _1691631606_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1691631606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_BroadcastLanguage(value: String?): Unit {
      val fnPtr = _1691631606_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691631606_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_UserName(): String? {
      val fnPtr = _1691631606_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1691631606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_CanCapture(): Boolean {
      val fnPtr = _1691631606_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1691631606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun EnterBroadcastModeAsync(plugIn: AppBroadcastPlugIn?):
        IAsyncOperation<WinDef.UINT>? {
      val fnPtr = _1691631606_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1691631606_Ptr, marshalToNative(plugIn), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun ExitBroadcastMode(reason: AppBroadcastExitBroadcastModeReason?): Unit {
      val fnPtr = _1691631606_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691631606_Ptr, marshalToNative(reason),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun StartBroadcast(): Unit {
      val fnPtr = _1691631606_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691631606_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun PauseBroadcast(): Unit {
      val fnPtr = _1691631606_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691631606_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun ResumeBroadcast(): Unit {
      val fnPtr = _1691631606_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691631606_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun StartPreview(desiredSize: Size?): AppBroadcastPreview? {
      val fnPtr = _1691631606_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastPreview>()
      val hr = fn.invokeHR(arrayOf(__1691631606_Ptr, marshalToNative(desiredSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastPreview>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_State(): AppBroadcastState? {
      val fnPtr = _1691631606_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastState>()
      val hr = fn.invokeHR(arrayOf(__1691631606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastState>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastServices_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1691631606_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastServices, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8660b4d6969b4e3cac3a8b042ee4ee63")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastServices(ptr: Pointer?): WithDefault =
        IAppBroadcastServices_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastServices {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastServices(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastServices): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1691631606_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastServices): Array<IAppBroadcastServices?> =
        (elements as
        Array<IAppBroadcastServices?>).castToImpl<IAppBroadcastServices,IAppBroadcastServices_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastServices?> =
        arrayOfNulls<IAppBroadcastServices_Impl>(size) as Array<IAppBroadcastServices?>
  }
}
