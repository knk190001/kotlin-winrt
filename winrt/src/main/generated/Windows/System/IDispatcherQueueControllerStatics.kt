package Windows.System

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

@ABIMarker(IDispatcherQueueControllerStatics.ABI::class)
@Signature("{0a6c98e0-5198-49a2-a313-3f70d1f13c27}")
@Guid("0a6c98e0519849a2a3133f70d1f13c27")
@WinRTInterface("0a6c98e0519849a2a3133f70d1f13c27")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDispatcherQueueControllerStatics.ByReference::class)
public interface IDispatcherQueueControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateOnDedicatedThread(): DispatcherQueueController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDispatcherQueueControllerStatics> {
    public override fun getValue() =
        ABI.makeIDispatcherQueueControllerStatics(pointer.getPointer(0))

    public fun setValue(value: IDispatcherQueueControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDispatcherQueueControllerStatics {
    public val __502963602_Ptr: Pointer?

    public val _502963602_VtblPtr: Pointer?
      get() = __502963602_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateOnDedicatedThread(): DispatcherQueueController? {
      val fnPtr = _502963602_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueueController>()
      val hr = fn.invokeHR(arrayOf(__502963602_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueueController>(result.getValue())
      return resultValue
    }
  }

  public class IDispatcherQueueControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __502963602_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDispatcherQueueControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0a6c98e0519849a2a3133f70d1f13c27")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDispatcherQueueControllerStatics(ptr: Pointer?): WithDefault =
        IDispatcherQueueControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDispatcherQueueControllerStatics {
      val address = segment.toRawLongValue()
      return makeIDispatcherQueueControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: IDispatcherQueueControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__502963602_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDispatcherQueueControllerStatics):
        Array<IDispatcherQueueControllerStatics?> = (elements as
        Array<IDispatcherQueueControllerStatics?>).castToImpl<IDispatcherQueueControllerStatics,IDispatcherQueueControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDispatcherQueueControllerStatics?> =
        arrayOfNulls<IDispatcherQueueControllerStatics_Impl>(size) as
        Array<IDispatcherQueueControllerStatics?>
  }
}
