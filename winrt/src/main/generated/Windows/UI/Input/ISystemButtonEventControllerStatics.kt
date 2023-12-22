package Windows.UI.Input

import Windows.System.DispatcherQueue
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

@ABIMarker(ISystemButtonEventControllerStatics.ABI::class)
@Signature("{632fb07b-20bd-5e15-af4a-00dbf2064ffa}")
@Guid("632fb07b20bd5e15af4a00dbf2064ffa")
@WinRTInterface("632fb07b20bd5e15af4a00dbf2064ffa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemButtonEventControllerStatics.ByReference::class)
public interface ISystemButtonEventControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForDispatcherQueue(queue: DispatcherQueue?): SystemButtonEventController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemButtonEventControllerStatics> {
    public override fun getValue() =
        ABI.makeISystemButtonEventControllerStatics(pointer.getPointer(0))

    public fun setValue(value: ISystemButtonEventControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemButtonEventControllerStatics {
    public val __944379390_Ptr: Pointer?

    public val _944379390_VtblPtr: Pointer?
      get() = __944379390_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForDispatcherQueue(queue: DispatcherQueue?):
        SystemButtonEventController? {
      val fnPtr = _944379390_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemButtonEventController>()
      val hr = fn.invokeHR(arrayOf(__944379390_Ptr, marshalToNative(queue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemButtonEventController>(result.getValue())
      return resultValue
    }
  }

  public class ISystemButtonEventControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __944379390_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemButtonEventControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("632fb07b20bd5e15af4a00dbf2064ffa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemButtonEventControllerStatics(ptr: Pointer?): WithDefault =
        ISystemButtonEventControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemButtonEventControllerStatics {
      val address = segment.toRawLongValue()
      return makeISystemButtonEventControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: ISystemButtonEventControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__944379390_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemButtonEventControllerStatics):
        Array<ISystemButtonEventControllerStatics?> = (elements as
        Array<ISystemButtonEventControllerStatics?>).castToImpl<ISystemButtonEventControllerStatics,ISystemButtonEventControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemButtonEventControllerStatics?> =
        arrayOfNulls<ISystemButtonEventControllerStatics_Impl>(size) as
        Array<ISystemButtonEventControllerStatics?>
  }
}
