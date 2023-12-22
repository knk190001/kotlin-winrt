package Windows.UI.Notifications

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

@ABIMarker(IToastNotification3.ABI::class)
@Signature("{31e8aed8-8141-4f99-bc0a-c4ed21297d77}")
@Guid("31e8aed881414f99bc0ac4ed21297d77")
@WinRTInterface("31e8aed881414f99bc0ac4ed21297d77")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotification3.ByReference::class)
public interface IToastNotification3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NotificationMirroring(): NotificationMirroring?

  @InterfaceMethod(1)
  public fun put_NotificationMirroring(value: NotificationMirroring?): Unit

  @InterfaceMethod(2)
  public fun get_RemoteId(): String?

  @InterfaceMethod(3)
  public fun put_RemoteId(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotification3> {
    public override fun getValue() = ABI.makeIToastNotification3(pointer.getPointer(0))

    public fun setValue(value: IToastNotification3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotification3 {
    public val __108921295_Ptr: Pointer?

    public val _108921295_VtblPtr: Pointer?
      get() = __108921295_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NotificationMirroring(): NotificationMirroring? {
      val fnPtr = _108921295_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NotificationMirroring>()
      val hr = fn.invokeHR(arrayOf(__108921295_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NotificationMirroring>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_NotificationMirroring(value: NotificationMirroring?): Unit {
      val fnPtr = _108921295_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__108921295_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RemoteId(): String? {
      val fnPtr = _108921295_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__108921295_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RemoteId(value: String?): Unit {
      val fnPtr = _108921295_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__108921295_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IToastNotification3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __108921295_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotification3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("31e8aed881414f99bc0ac4ed21297d77")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotification3(ptr: Pointer?): WithDefault = IToastNotification3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotification3 {
      val address = segment.toRawLongValue()
      return makeIToastNotification3(Pointer(address))
    }

    public override fun toNative(obj: IToastNotification3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__108921295_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotification3): Array<IToastNotification3?> =
        (elements as
        Array<IToastNotification3?>).castToImpl<IToastNotification3,IToastNotification3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotification3?> =
        arrayOfNulls<IToastNotification3_Impl>(size) as Array<IToastNotification3?>
  }
}
