package Windows.UI.Input

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

@ABIMarker(IRadialControllerStatics.ABI::class)
@Signature("{faded0b7-b84c-4894-87aa-8f25aa5f288b}")
@Guid("faded0b7b84c489487aa8f25aa5f288b")
@WinRTInterface("faded0b7b84c489487aa8f25aa5f288b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerStatics.ByReference::class)
public interface IRadialControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupported(): Boolean

  @InterfaceMethod(1)
  public fun CreateForCurrentView(): RadialController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerStatics> {
    public override fun getValue() = ABI.makeIRadialControllerStatics(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerStatics {
    public val __1803579492_Ptr: Pointer?

    public val _1803579492_VtblPtr: Pointer?
      get() = __1803579492_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupported(): Boolean {
      val fnPtr = _1803579492_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1803579492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun CreateForCurrentView(): RadialController? {
      val fnPtr = _1803579492_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialController>()
      val hr = fn.invokeHR(arrayOf(__1803579492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialController>(result.getValue())
      return resultValue
    }
  }

  public class IRadialControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1803579492_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("faded0b7b84c489487aa8f25aa5f288b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerStatics(ptr: Pointer?): WithDefault =
        IRadialControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadialControllerStatics {
      val address = segment.toRawLongValue()
      return makeIRadialControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1803579492_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerStatics):
        Array<IRadialControllerStatics?> = (elements as
        Array<IRadialControllerStatics?>).castToImpl<IRadialControllerStatics,IRadialControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerStatics?> =
        arrayOfNulls<IRadialControllerStatics_Impl>(size) as Array<IRadialControllerStatics?>
  }
}
