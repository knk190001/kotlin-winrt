package Windows.Media.Capture

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

@ABIMarker(IGameBarServicesManagerStatics.ABI::class)
@Signature("{34c1b616-ff25-4792-98f2-d3753f15ac13}")
@Guid("34c1b616ff25479298f2d3753f15ac13")
@WinRTInterface("34c1b616ff25479298f2d3753f15ac13")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameBarServicesManagerStatics.ByReference::class)
public interface IGameBarServicesManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): GameBarServicesManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameBarServicesManagerStatics> {
    public override fun getValue() = ABI.makeIGameBarServicesManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IGameBarServicesManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameBarServicesManagerStatics {
    public val __280119649_Ptr: Pointer?

    public val _280119649_VtblPtr: Pointer?
      get() = __280119649_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): GameBarServicesManager? {
      val fnPtr = _280119649_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameBarServicesManager>()
      val hr = fn.invokeHR(arrayOf(__280119649_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameBarServicesManager>(result.getValue())
      return resultValue
    }
  }

  public class IGameBarServicesManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __280119649_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameBarServicesManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("34c1b616ff25479298f2d3753f15ac13")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameBarServicesManagerStatics(ptr: Pointer?): WithDefault =
        IGameBarServicesManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameBarServicesManagerStatics {
      val address = segment.toRawLongValue()
      return makeIGameBarServicesManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IGameBarServicesManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__280119649_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameBarServicesManagerStatics):
        Array<IGameBarServicesManagerStatics?> = (elements as
        Array<IGameBarServicesManagerStatics?>).castToImpl<IGameBarServicesManagerStatics,IGameBarServicesManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameBarServicesManagerStatics?> =
        arrayOfNulls<IGameBarServicesManagerStatics_Impl>(size) as
        Array<IGameBarServicesManagerStatics?>
  }
}
