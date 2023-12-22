package Windows.UI.Notifications

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IToastNotificationManagerForUser2.ABI::class)
@Signature("{679c64b7-81ab-42c2-8819-c958767753f4}")
@Guid("679c64b781ab42c28819c958767753f4")
@WinRTInterface("679c64b781ab42c28819c958767753f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotificationManagerForUser2.ByReference::class)
public interface IToastNotificationManagerForUser2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetToastNotifierForToastCollectionIdAsync(collectionId: String?):
      IAsyncOperation<ToastNotifier?>?

  @InterfaceMethod(1)
  public fun GetHistoryForToastCollectionIdAsync(collectionId: String?):
      IAsyncOperation<ToastNotificationHistory?>?

  @InterfaceMethod(2)
  public fun GetToastCollectionManager(): ToastCollectionManager?

  @InterfaceMethod(3)
  public fun GetToastCollectionManager(appId: String?): ToastCollectionManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotificationManagerForUser2> {
    public override fun getValue() =
        ABI.makeIToastNotificationManagerForUser2(pointer.getPointer(0))

    public fun setValue(value: IToastNotificationManagerForUser2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotificationManagerForUser2 {
    public val __879001257_Ptr: Pointer?

    public val _879001257_VtblPtr: Pointer?
      get() = __879001257_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetToastNotifierForToastCollectionIdAsync(collectionId: String?):
        IAsyncOperation<ToastNotifier?>? {
      val fnPtr = _879001257_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ToastNotifier?>>()
      val hr = fn.invokeHR(arrayOf(__879001257_Ptr, marshalToNative(collectionId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ToastNotifier?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetHistoryForToastCollectionIdAsync(collectionId: String?):
        IAsyncOperation<ToastNotificationHistory?>? {
      val fnPtr = _879001257_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ToastNotificationHistory?>>()
      val hr = fn.invokeHR(arrayOf(__879001257_Ptr, marshalToNative(collectionId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ToastNotificationHistory?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetToastCollectionManager(): ToastCollectionManager? {
      val fnPtr = _879001257_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastCollectionManager>()
      val hr = fn.invokeHR(arrayOf(__879001257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastCollectionManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetToastCollectionManager(appId: String?): ToastCollectionManager? {
      val fnPtr = _879001257_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastCollectionManager>()
      val hr = fn.invokeHR(arrayOf(__879001257_Ptr, marshalToNative(appId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastCollectionManager>(result.getValue())
      return resultValue
    }
  }

  public class IToastNotificationManagerForUser2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __879001257_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotificationManagerForUser2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("679c64b781ab42c28819c958767753f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotificationManagerForUser2(ptr: Pointer?): WithDefault =
        IToastNotificationManagerForUser2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotificationManagerForUser2 {
      val address = segment.toRawLongValue()
      return makeIToastNotificationManagerForUser2(Pointer(address))
    }

    public override fun toNative(obj: IToastNotificationManagerForUser2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__879001257_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationManagerForUser2):
        Array<IToastNotificationManagerForUser2?> = (elements as
        Array<IToastNotificationManagerForUser2?>).castToImpl<IToastNotificationManagerForUser2,IToastNotificationManagerForUser2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationManagerForUser2?> =
        arrayOfNulls<IToastNotificationManagerForUser2_Impl>(size) as
        Array<IToastNotificationManagerForUser2?>
  }
}
