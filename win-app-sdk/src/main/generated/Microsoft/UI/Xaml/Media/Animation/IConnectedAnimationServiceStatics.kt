package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IConnectedAnimationServiceStatics.ABI::class)
@Signature("{f30ad68d-3426-5564-92c6-288b819e652a}")
@Guid("f30ad68d3426556492c6288b819e652a")
@WinRTInterface("f30ad68d3426556492c6288b819e652a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectedAnimationServiceStatics.ByReference::class)
public interface IConnectedAnimationServiceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): ConnectedAnimationService?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectedAnimationServiceStatics> {
    public override fun getValue() =
        ABI.makeIConnectedAnimationServiceStatics(pointer.getPointer(0))

    public fun setValue(value: IConnectedAnimationServiceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectedAnimationServiceStatics {
    public val __488720550_Ptr: Pointer?

    public val _488720550_VtblPtr: Pointer?
      get() = __488720550_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): ConnectedAnimationService? {
      val fnPtr = _488720550_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConnectedAnimationService>()
      val hr = fn.invokeHR(arrayOf(__488720550_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConnectedAnimationService>(result.getValue())
      return resultValue
    }
  }

  public class IConnectedAnimationServiceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __488720550_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectedAnimationServiceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f30ad68d3426556492c6288b819e652a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectedAnimationServiceStatics(ptr: Pointer?): WithDefault =
        IConnectedAnimationServiceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectedAnimationServiceStatics {
      val address = segment.toRawLongValue()
      return makeIConnectedAnimationServiceStatics(Pointer(address))
    }

    public override fun toNative(obj: IConnectedAnimationServiceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__488720550_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectedAnimationServiceStatics):
        Array<IConnectedAnimationServiceStatics?> = (elements as
        Array<IConnectedAnimationServiceStatics?>).castToImpl<IConnectedAnimationServiceStatics,IConnectedAnimationServiceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectedAnimationServiceStatics?> =
        arrayOfNulls<IConnectedAnimationServiceStatics_Impl>(size) as
        Array<IConnectedAnimationServiceStatics?>
  }
}
