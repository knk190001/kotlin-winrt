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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IManipulationStartedEventArgs2.ABI::class)
@Signature("{2da3db4e-e583-5055-afaa-16fd986531a6}")
@Guid("2da3db4ee5835055afaa16fd986531a6")
@WinRTInterface("2da3db4ee5835055afaa16fd986531a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IManipulationStartedEventArgs2.ByReference::class)
public interface IManipulationStartedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContactCount(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IManipulationStartedEventArgs2> {
    public override fun getValue() = ABI.makeIManipulationStartedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IManipulationStartedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IManipulationStartedEventArgs2 {
    public val __1736153167_Ptr: Pointer?

    public val _1736153167_VtblPtr: Pointer?
      get() = __1736153167_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactCount(): WinDef.UINT {
      val fnPtr = _1736153167_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1736153167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IManipulationStartedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1736153167_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IManipulationStartedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2da3db4ee5835055afaa16fd986531a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIManipulationStartedEventArgs2(ptr: Pointer?): WithDefault =
        IManipulationStartedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IManipulationStartedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIManipulationStartedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IManipulationStartedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1736153167_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IManipulationStartedEventArgs2):
        Array<IManipulationStartedEventArgs2?> = (elements as
        Array<IManipulationStartedEventArgs2?>).castToImpl<IManipulationStartedEventArgs2,IManipulationStartedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IManipulationStartedEventArgs2?> =
        arrayOfNulls<IManipulationStartedEventArgs2_Impl>(size) as
        Array<IManipulationStartedEventArgs2?>
  }
}
