package Microsoft.Windows.PushNotifications

import Windows.Foundation.DateTime
import Windows.Foundation.Uri
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPushNotificationChannel.ABI::class)
@Signature("{da28bbcb-7695-5d38-af82-f30b72fef1f6}")
@Guid("da28bbcb76955d38af82f30b72fef1f6")
@WinRTInterface("da28bbcb76955d38af82f30b72fef1f6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPushNotificationChannel.ByReference::class)
public interface IPushNotificationChannel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun get_ExpirationTime(): DateTime?

  @InterfaceMethod(2)
  public fun Close(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPushNotificationChannel> {
    public override fun getValue() = ABI.makeIPushNotificationChannel(pointer.getPointer(0))

    public fun setValue(value: IPushNotificationChannel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPushNotificationChannel {
    public val __150613112_Ptr: Pointer?

    public val _150613112_VtblPtr: Pointer?
      get() = __150613112_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _150613112_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__150613112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExpirationTime(): DateTime? {
      val fnPtr = _150613112_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__150613112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Close(): Unit {
      val fnPtr = _150613112_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__150613112_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPushNotificationChannel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __150613112_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPushNotificationChannel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da28bbcb76955d38af82f30b72fef1f6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPushNotificationChannel(ptr: Pointer?): WithDefault =
        IPushNotificationChannel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPushNotificationChannel {
      val address = segment.toRawLongValue()
      return makeIPushNotificationChannel(Pointer(address))
    }

    public override fun toNative(obj: IPushNotificationChannel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__150613112_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPushNotificationChannel):
        Array<IPushNotificationChannel?> = (elements as
        Array<IPushNotificationChannel?>).castToImpl<IPushNotificationChannel,IPushNotificationChannel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPushNotificationChannel?> =
        arrayOfNulls<IPushNotificationChannel_Impl>(size) as Array<IPushNotificationChannel?>
  }
}
