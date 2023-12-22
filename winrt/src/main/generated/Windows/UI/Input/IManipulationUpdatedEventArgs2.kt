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

@ABIMarker(IManipulationUpdatedEventArgs2.ABI::class)
@Signature("{f3dfb96a-3306-5903-a1c5-ff9757a8689e}")
@Guid("f3dfb96a33065903a1c5ff9757a8689e")
@WinRTInterface("f3dfb96a33065903a1c5ff9757a8689e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IManipulationUpdatedEventArgs2.ByReference::class)
public interface IManipulationUpdatedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContactCount(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_CurrentContactCount(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IManipulationUpdatedEventArgs2> {
    public override fun getValue() = ABI.makeIManipulationUpdatedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IManipulationUpdatedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IManipulationUpdatedEventArgs2 {
    public val __1050114197_Ptr: Pointer?

    public val _1050114197_VtblPtr: Pointer?
      get() = __1050114197_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactCount(): WinDef.UINT {
      val fnPtr = _1050114197_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1050114197_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CurrentContactCount(): WinDef.UINT {
      val fnPtr = _1050114197_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1050114197_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IManipulationUpdatedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1050114197_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IManipulationUpdatedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3dfb96a33065903a1c5ff9757a8689e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIManipulationUpdatedEventArgs2(ptr: Pointer?): WithDefault =
        IManipulationUpdatedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IManipulationUpdatedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIManipulationUpdatedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IManipulationUpdatedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1050114197_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IManipulationUpdatedEventArgs2):
        Array<IManipulationUpdatedEventArgs2?> = (elements as
        Array<IManipulationUpdatedEventArgs2?>).castToImpl<IManipulationUpdatedEventArgs2,IManipulationUpdatedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IManipulationUpdatedEventArgs2?> =
        arrayOfNulls<IManipulationUpdatedEventArgs2_Impl>(size) as
        Array<IManipulationUpdatedEventArgs2?>
  }
}
