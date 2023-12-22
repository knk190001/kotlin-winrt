package Windows.Media.Capture

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IGameBarServices.ABI::class)
@Signature("{2dbead57-50a6-499e-8c6c-d330a7311796}")
@Guid("2dbead5750a6499e8c6cd330a7311796")
@WinRTInterface("2dbead5750a6499e8c6cd330a7311796")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameBarServices.ByReference::class)
public interface IGameBarServices : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetCapturePolicy(): GameBarTargetCapturePolicy?

  @InterfaceMethod(1)
  public fun EnableCapture(): Unit

  @InterfaceMethod(2)
  public fun DisableCapture(): Unit

  @InterfaceMethod(3)
  public fun get_TargetInfo(): GameBarServicesTargetInfo?

  @InterfaceMethod(4)
  public fun get_SessionId(): String?

  @InterfaceMethod(5)
  public fun get_AppBroadcastServices(): AppBroadcastServices?

  @InterfaceMethod(6)
  public fun get_AppCaptureServices(): AppCaptureServices?

  @InterfaceMethod(7)
  public fun add_CommandReceived(value: TypedEventHandler<GameBarServices?,
      GameBarServicesCommandEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_CommandReceived(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameBarServices> {
    public override fun getValue() = ABI.makeIGameBarServices(pointer.getPointer(0))

    public fun setValue(value: IGameBarServices_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameBarServices {
    public val __1268420761_Ptr: Pointer?

    public val _1268420761_VtblPtr: Pointer?
      get() = __1268420761_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetCapturePolicy(): GameBarTargetCapturePolicy? {
      val fnPtr = _1268420761_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameBarTargetCapturePolicy>()
      val hr = fn.invokeHR(arrayOf(__1268420761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameBarTargetCapturePolicy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun EnableCapture(): Unit {
      val fnPtr = _1268420761_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1268420761_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun DisableCapture(): Unit {
      val fnPtr = _1268420761_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1268420761_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_TargetInfo(): GameBarServicesTargetInfo? {
      val fnPtr = _1268420761_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameBarServicesTargetInfo>()
      val hr = fn.invokeHR(arrayOf(__1268420761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameBarServicesTargetInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SessionId(): String? {
      val fnPtr = _1268420761_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1268420761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_AppBroadcastServices(): AppBroadcastServices? {
      val fnPtr = _1268420761_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastServices>()
      val hr = fn.invokeHR(arrayOf(__1268420761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastServices>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_AppCaptureServices(): AppCaptureServices? {
      val fnPtr = _1268420761_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCaptureServices>()
      val hr = fn.invokeHR(arrayOf(__1268420761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCaptureServices>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun add_CommandReceived(value: TypedEventHandler<GameBarServices?,
        GameBarServicesCommandEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1268420761_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1268420761_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_CommandReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1268420761_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1268420761_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGameBarServices_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1268420761_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameBarServices, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2dbead5750a6499e8c6cd330a7311796")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameBarServices(ptr: Pointer?): WithDefault = IGameBarServices_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameBarServices {
      val address = segment.toRawLongValue()
      return makeIGameBarServices(Pointer(address))
    }

    public override fun toNative(obj: IGameBarServices): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1268420761_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameBarServices): Array<IGameBarServices?> = (elements as
        Array<IGameBarServices?>).castToImpl<IGameBarServices,IGameBarServices_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameBarServices?> =
        arrayOfNulls<IGameBarServices_Impl>(size) as Array<IGameBarServices?>
  }
}
