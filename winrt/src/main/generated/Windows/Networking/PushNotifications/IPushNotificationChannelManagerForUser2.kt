package Windows.Networking.PushNotifications

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IPushNotificationChannelManagerForUser2.ABI::class)
@Signature("{c38b066a-7cc1-4dac-87fd-be6e920414a4}")
@Guid("c38b066a7cc14dac87fdbe6e920414a4")
@WinRTInterface("c38b066a7cc14dac87fdbe6e920414a4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPushNotificationChannelManagerForUser2.ByReference::class)
public interface IPushNotificationChannelManagerForUser2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun CreateRawPushNotificationChannelWithAlternateKeyForApplicationAsync(appServerKey: IBuffer?,
      channelId: String?): IAsyncOperation<PushNotificationChannel?>?

  @InterfaceMethod(1)
  public fun CreateRawPushNotificationChannelWithAlternateKeyForApplicationAsync(
    appServerKey: IBuffer?,
    channelId: String?,
    appId: String?
  ): IAsyncOperation<PushNotificationChannel?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPushNotificationChannelManagerForUser2> {
    public override fun getValue() =
        ABI.makeIPushNotificationChannelManagerForUser2(pointer.getPointer(0))

    public fun setValue(value: IPushNotificationChannelManagerForUser2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPushNotificationChannelManagerForUser2 {
    public val __677373687_Ptr: Pointer?

    public val _677373687_VtblPtr: Pointer?
      get() = __677373687_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun CreateRawPushNotificationChannelWithAlternateKeyForApplicationAsync(appServerKey: IBuffer?,
        channelId: String?): IAsyncOperation<PushNotificationChannel?>? {
      val fnPtr = _677373687_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PushNotificationChannel?>>()
      val hr = fn.invokeHR(arrayOf(__677373687_Ptr, marshalToNative(appServerKey),
          marshalToNative(channelId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PushNotificationChannel?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateRawPushNotificationChannelWithAlternateKeyForApplicationAsync(
      appServerKey: IBuffer?,
      channelId: String?,
      appId: String?
    ): IAsyncOperation<PushNotificationChannel?>? {
      val fnPtr = _677373687_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PushNotificationChannel?>>()
      val hr = fn.invokeHR(arrayOf(__677373687_Ptr, marshalToNative(appServerKey),
          marshalToNative(channelId), marshalToNative(appId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PushNotificationChannel?>>(result.getValue())
      return resultValue
    }
  }

  public class IPushNotificationChannelManagerForUser2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __677373687_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPushNotificationChannelManagerForUser2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c38b066a7cc14dac87fdbe6e920414a4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPushNotificationChannelManagerForUser2(ptr: Pointer?): WithDefault =
        IPushNotificationChannelManagerForUser2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPushNotificationChannelManagerForUser2 {
      val address = segment.toRawLongValue()
      return makeIPushNotificationChannelManagerForUser2(Pointer(address))
    }

    public override fun toNative(obj: IPushNotificationChannelManagerForUser2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__677373687_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPushNotificationChannelManagerForUser2):
        Array<IPushNotificationChannelManagerForUser2?> = (elements as
        Array<IPushNotificationChannelManagerForUser2?>).castToImpl<IPushNotificationChannelManagerForUser2,IPushNotificationChannelManagerForUser2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPushNotificationChannelManagerForUser2?> =
        arrayOfNulls<IPushNotificationChannelManagerForUser2_Impl>(size) as
        Array<IPushNotificationChannelManagerForUser2?>
  }
}
