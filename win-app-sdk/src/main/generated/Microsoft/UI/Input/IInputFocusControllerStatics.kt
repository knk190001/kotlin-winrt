package Microsoft.UI.Input

import Microsoft.UI.Content.ContentIsland
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

@ABIMarker(IInputFocusControllerStatics.ABI::class)
@Signature("{aeb311da-da9b-5a1b-92f4-83ddde933e00}")
@Guid("aeb311dada9b5a1b92f483ddde933e00")
@WinRTInterface("aeb311dada9b5a1b92f483ddde933e00")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputFocusControllerStatics.ByReference::class)
public interface IInputFocusControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForIsland(island: ContentIsland?): InputFocusController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputFocusControllerStatics> {
    public override fun getValue() = ABI.makeIInputFocusControllerStatics(pointer.getPointer(0))

    public fun setValue(value: IInputFocusControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputFocusControllerStatics {
    public val __1778379294_Ptr: Pointer?

    public val _1778379294_VtblPtr: Pointer?
      get() = __1778379294_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForIsland(island: ContentIsland?): InputFocusController? {
      val fnPtr = _1778379294_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputFocusController>()
      val hr = fn.invokeHR(arrayOf(__1778379294_Ptr, marshalToNative(island), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputFocusController>(result.getValue())
      return resultValue
    }
  }

  public class IInputFocusControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1778379294_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputFocusControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aeb311dada9b5a1b92f483ddde933e00")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputFocusControllerStatics(ptr: Pointer?): WithDefault =
        IInputFocusControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputFocusControllerStatics {
      val address = segment.toRawLongValue()
      return makeIInputFocusControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: IInputFocusControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1778379294_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputFocusControllerStatics):
        Array<IInputFocusControllerStatics?> = (elements as
        Array<IInputFocusControllerStatics?>).castToImpl<IInputFocusControllerStatics,IInputFocusControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputFocusControllerStatics?> =
        arrayOfNulls<IInputFocusControllerStatics_Impl>(size) as
        Array<IInputFocusControllerStatics?>
  }
}
