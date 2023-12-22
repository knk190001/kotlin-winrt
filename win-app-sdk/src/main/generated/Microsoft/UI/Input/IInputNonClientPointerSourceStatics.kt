package Microsoft.UI.Input

import Microsoft.UI.WindowId
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

@ABIMarker(IInputNonClientPointerSourceStatics.ABI::class)
@Signature("{7d0b775c-1903-5dc7-bd2f-7a4b31f0cff2}")
@Guid("7d0b775c19035dc7bd2f7a4b31f0cff2")
@WinRTInterface("7d0b775c19035dc7bd2f7a4b31f0cff2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputNonClientPointerSourceStatics.ByReference::class)
public interface IInputNonClientPointerSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForWindowId(windowId: WindowId?): InputNonClientPointerSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputNonClientPointerSourceStatics> {
    public override fun getValue() =
        ABI.makeIInputNonClientPointerSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IInputNonClientPointerSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputNonClientPointerSourceStatics {
    public val __830649196_Ptr: Pointer?

    public val _830649196_VtblPtr: Pointer?
      get() = __830649196_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForWindowId(windowId: WindowId?): InputNonClientPointerSource? {
      val fnPtr = _830649196_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputNonClientPointerSource>()
      val hr = fn.invokeHR(arrayOf(__830649196_Ptr, marshalToNative(windowId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputNonClientPointerSource>(result.getValue())
      return resultValue
    }
  }

  public class IInputNonClientPointerSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __830649196_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputNonClientPointerSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d0b775c19035dc7bd2f7a4b31f0cff2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputNonClientPointerSourceStatics(ptr: Pointer?): WithDefault =
        IInputNonClientPointerSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputNonClientPointerSourceStatics {
      val address = segment.toRawLongValue()
      return makeIInputNonClientPointerSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IInputNonClientPointerSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__830649196_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputNonClientPointerSourceStatics):
        Array<IInputNonClientPointerSourceStatics?> = (elements as
        Array<IInputNonClientPointerSourceStatics?>).castToImpl<IInputNonClientPointerSourceStatics,IInputNonClientPointerSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputNonClientPointerSourceStatics?> =
        arrayOfNulls<IInputNonClientPointerSourceStatics_Impl>(size) as
        Array<IInputNonClientPointerSourceStatics?>
  }
}
