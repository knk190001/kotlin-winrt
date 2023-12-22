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

@ABIMarker(IManipulationCompletedEventArgs2.ABI::class)
@Signature("{f0c0dce7-30a9-5b96-886f-6560a85e4757}")
@Guid("f0c0dce730a95b96886f6560a85e4757")
@WinRTInterface("f0c0dce730a95b96886f6560a85e4757")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IManipulationCompletedEventArgs2.ByReference::class)
public interface IManipulationCompletedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContactCount(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_CurrentContactCount(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IManipulationCompletedEventArgs2> {
    public override fun getValue() = ABI.makeIManipulationCompletedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IManipulationCompletedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IManipulationCompletedEventArgs2 {
    public val __1000323141_Ptr: Pointer?

    public val _1000323141_VtblPtr: Pointer?
      get() = __1000323141_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactCount(): WinDef.UINT {
      val fnPtr = _1000323141_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1000323141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CurrentContactCount(): WinDef.UINT {
      val fnPtr = _1000323141_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1000323141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IManipulationCompletedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1000323141_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IManipulationCompletedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f0c0dce730a95b96886f6560a85e4757")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIManipulationCompletedEventArgs2(ptr: Pointer?): WithDefault =
        IManipulationCompletedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IManipulationCompletedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIManipulationCompletedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IManipulationCompletedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1000323141_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IManipulationCompletedEventArgs2):
        Array<IManipulationCompletedEventArgs2?> = (elements as
        Array<IManipulationCompletedEventArgs2?>).castToImpl<IManipulationCompletedEventArgs2,IManipulationCompletedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IManipulationCompletedEventArgs2?> =
        arrayOfNulls<IManipulationCompletedEventArgs2_Impl>(size) as
        Array<IManipulationCompletedEventArgs2?>
  }
}
