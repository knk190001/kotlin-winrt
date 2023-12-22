package Windows.UI.Notifications

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IToastNotificationHistory2.ABI::class)
@Signature("{3bc3d253-2f31-4092-9129-8ad5abf067da}")
@Guid("3bc3d2532f31409291298ad5abf067da")
@WinRTInterface("3bc3d2532f31409291298ad5abf067da")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotificationHistory2.ByReference::class)
public interface IToastNotificationHistory2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetHistory(): IVectorView<ToastNotification?>?

  @InterfaceMethod(1)
  public fun GetHistory(applicationId: String?): IVectorView<ToastNotification?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotificationHistory2> {
    public override fun getValue() = ABI.makeIToastNotificationHistory2(pointer.getPointer(0))

    public fun setValue(value: IToastNotificationHistory2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotificationHistory2 {
    public val __759629184_Ptr: Pointer?

    public val _759629184_VtblPtr: Pointer?
      get() = __759629184_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetHistory(): IVectorView<ToastNotification?>? {
      val fnPtr = _759629184_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ToastNotification?>>()
      val hr = fn.invokeHR(arrayOf(__759629184_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ToastNotification?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetHistory(applicationId: String?): IVectorView<ToastNotification?>? {
      val fnPtr = _759629184_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ToastNotification?>>()
      val hr = fn.invokeHR(arrayOf(__759629184_Ptr, marshalToNative(applicationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ToastNotification?>>(result.getValue())
      return resultValue
    }
  }

  public class IToastNotificationHistory2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __759629184_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotificationHistory2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3bc3d2532f31409291298ad5abf067da")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotificationHistory2(ptr: Pointer?): WithDefault =
        IToastNotificationHistory2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotificationHistory2 {
      val address = segment.toRawLongValue()
      return makeIToastNotificationHistory2(Pointer(address))
    }

    public override fun toNative(obj: IToastNotificationHistory2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__759629184_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationHistory2):
        Array<IToastNotificationHistory2?> = (elements as
        Array<IToastNotificationHistory2?>).castToImpl<IToastNotificationHistory2,IToastNotificationHistory2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationHistory2?> =
        arrayOfNulls<IToastNotificationHistory2_Impl>(size) as Array<IToastNotificationHistory2?>
  }
}
