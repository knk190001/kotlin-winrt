package Microsoft.Windows.AppNotifications.Builder

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

@ABIMarker(IAppNotificationBuilderStatics.ABI::class)
@Signature("{c7042d2a-d319-520e-a314-50081c8888cc}")
@Guid("c7042d2ad319520ea31450081c8888cc")
@WinRTInterface("c7042d2ad319520ea31450081c8888cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotificationBuilderStatics.ByReference::class)
public interface IAppNotificationBuilderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsUrgentScenarioSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotificationBuilderStatics> {
    public override fun getValue() = ABI.makeIAppNotificationBuilderStatics(pointer.getPointer(0))

    public fun setValue(value: IAppNotificationBuilderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotificationBuilderStatics {
    public val __236670892_Ptr: Pointer?

    public val _236670892_VtblPtr: Pointer?
      get() = __236670892_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsUrgentScenarioSupported(): Boolean {
      val fnPtr = _236670892_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__236670892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppNotificationBuilderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __236670892_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotificationBuilderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c7042d2ad319520ea31450081c8888cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotificationBuilderStatics(ptr: Pointer?): WithDefault =
        IAppNotificationBuilderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotificationBuilderStatics {
      val address = segment.toRawLongValue()
      return makeIAppNotificationBuilderStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppNotificationBuilderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__236670892_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotificationBuilderStatics):
        Array<IAppNotificationBuilderStatics?> = (elements as
        Array<IAppNotificationBuilderStatics?>).castToImpl<IAppNotificationBuilderStatics,IAppNotificationBuilderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotificationBuilderStatics?> =
        arrayOfNulls<IAppNotificationBuilderStatics_Impl>(size) as
        Array<IAppNotificationBuilderStatics?>
  }
}
