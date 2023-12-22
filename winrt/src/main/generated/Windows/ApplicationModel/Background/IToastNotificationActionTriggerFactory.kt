package Windows.ApplicationModel.Background

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

@ABIMarker(IToastNotificationActionTriggerFactory.ABI::class)
@Signature("{b09dfc27-6480-4349-8125-97b3efaa0a3a}")
@Guid("b09dfc2764804349812597b3efaa0a3a")
@WinRTInterface("b09dfc2764804349812597b3efaa0a3a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotificationActionTriggerFactory.ByReference::class)
public interface IToastNotificationActionTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(applicationId: String?): ToastNotificationActionTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotificationActionTriggerFactory> {
    public override fun getValue() =
        ABI.makeIToastNotificationActionTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: IToastNotificationActionTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotificationActionTriggerFactory {
    public val __327904393_Ptr: Pointer?

    public val _327904393_VtblPtr: Pointer?
      get() = __327904393_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(applicationId: String?): ToastNotificationActionTrigger? {
      val fnPtr = _327904393_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotificationActionTrigger>()
      val hr = fn.invokeHR(arrayOf(__327904393_Ptr, marshalToNative(applicationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotificationActionTrigger>(result.getValue())
      return resultValue
    }
  }

  public class IToastNotificationActionTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __327904393_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotificationActionTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b09dfc2764804349812597b3efaa0a3a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotificationActionTriggerFactory(ptr: Pointer?): WithDefault =
        IToastNotificationActionTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotificationActionTriggerFactory {
      val address = segment.toRawLongValue()
      return makeIToastNotificationActionTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: IToastNotificationActionTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__327904393_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationActionTriggerFactory):
        Array<IToastNotificationActionTriggerFactory?> = (elements as
        Array<IToastNotificationActionTriggerFactory?>).castToImpl<IToastNotificationActionTriggerFactory,IToastNotificationActionTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationActionTriggerFactory?> =
        arrayOfNulls<IToastNotificationActionTriggerFactory_Impl>(size) as
        Array<IToastNotificationActionTriggerFactory?>
  }
}
