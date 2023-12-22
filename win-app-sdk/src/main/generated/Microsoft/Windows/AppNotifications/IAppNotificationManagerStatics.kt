package Microsoft.Windows.AppNotifications

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

@ABIMarker(IAppNotificationManagerStatics.ABI::class)
@Signature("{6cfc0d8d-84a3-5592-b4c6-e3e7e7c680e4}")
@Guid("6cfc0d8d84a35592b4c6e3e7e7c680e4")
@WinRTInterface("6cfc0d8d84a35592b4c6e3e7e7c680e4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotificationManagerStatics.ByReference::class)
public interface IAppNotificationManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Default(): AppNotificationManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotificationManagerStatics> {
    public override fun getValue() = ABI.makeIAppNotificationManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IAppNotificationManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotificationManagerStatics {
    public val __986642803_Ptr: Pointer?

    public val _986642803_VtblPtr: Pointer?
      get() = __986642803_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Default(): AppNotificationManager? {
      val fnPtr = _986642803_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationManager>()
      val hr = fn.invokeHR(arrayOf(__986642803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationManager>(result.getValue())
      return resultValue
    }
  }

  public class IAppNotificationManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __986642803_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotificationManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6cfc0d8d84a35592b4c6e3e7e7c680e4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotificationManagerStatics(ptr: Pointer?): WithDefault =
        IAppNotificationManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotificationManagerStatics {
      val address = segment.toRawLongValue()
      return makeIAppNotificationManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppNotificationManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__986642803_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotificationManagerStatics):
        Array<IAppNotificationManagerStatics?> = (elements as
        Array<IAppNotificationManagerStatics?>).castToImpl<IAppNotificationManagerStatics,IAppNotificationManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotificationManagerStatics?> =
        arrayOfNulls<IAppNotificationManagerStatics_Impl>(size) as
        Array<IAppNotificationManagerStatics?>
  }
}
