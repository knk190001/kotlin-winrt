package Microsoft.Windows.PushNotifications

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPushNotificationManagerStatics.ABI::class)
@Signature("{71329470-1b55-58dc-a00c-68c26f2d8bd9}")
@Guid("713294701b5558dca00c68c26f2d8bd9")
@WinRTInterface("713294701b5558dca00c68c26f2d8bd9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPushNotificationManagerStatics.ByReference::class)
public interface IPushNotificationManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_Default(): PushNotificationManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPushNotificationManagerStatics> {
    public override fun getValue() = ABI.makeIPushNotificationManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IPushNotificationManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPushNotificationManagerStatics {
    public val __66055747_Ptr: Pointer?

    public val _66055747_VtblPtr: Pointer?
      get() = __66055747_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupported(): Boolean {
      val fnPtr = _66055747_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__66055747_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Default(): PushNotificationManager? {
      val fnPtr = _66055747_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PushNotificationManager>()
      val hr = fn.invokeHR(arrayOf(__66055747_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PushNotificationManager>(result.getValue())
      return resultValue
    }
  }

  public class IPushNotificationManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __66055747_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPushNotificationManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("713294701b5558dca00c68c26f2d8bd9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPushNotificationManagerStatics(ptr: Pointer?): WithDefault =
        IPushNotificationManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPushNotificationManagerStatics {
      val address = segment.toRawLongValue()
      return makeIPushNotificationManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPushNotificationManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__66055747_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPushNotificationManagerStatics):
        Array<IPushNotificationManagerStatics?> = (elements as
        Array<IPushNotificationManagerStatics?>).castToImpl<IPushNotificationManagerStatics,IPushNotificationManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPushNotificationManagerStatics?> =
        arrayOfNulls<IPushNotificationManagerStatics_Impl>(size) as
        Array<IPushNotificationManagerStatics?>
  }
}
