package Microsoft.UI.Composition

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

@ABIMarker(IContainerVisual.ABI::class)
@Signature("{c70dbce1-2c2f-5d8e-91a4-aae1121e6186}")
@Guid("c70dbce12c2f5d8e91a4aae1121e6186")
@WinRTInterface("c70dbce12c2f5d8e91a4aae1121e6186")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContainerVisual.ByReference::class)
public interface IContainerVisual : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Children(): VisualCollection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContainerVisual> {
    public override fun getValue() = ABI.makeIContainerVisual(pointer.getPointer(0))

    public fun setValue(value: IContainerVisual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContainerVisual {
    public val __1967948312_Ptr: Pointer?

    public val _1967948312_VtblPtr: Pointer?
      get() = __1967948312_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Children(): VisualCollection? {
      val fnPtr = _1967948312_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VisualCollection>()
      val hr = fn.invokeHR(arrayOf(__1967948312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VisualCollection>(result.getValue())
      return resultValue
    }
  }

  public class IContainerVisual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1967948312_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContainerVisual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c70dbce12c2f5d8e91a4aae1121e6186")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContainerVisual(ptr: Pointer?): WithDefault = IContainerVisual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContainerVisual {
      val address = segment.toRawLongValue()
      return makeIContainerVisual(Pointer(address))
    }

    public override fun toNative(obj: IContainerVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1967948312_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContainerVisual): Array<IContainerVisual?> = (elements as
        Array<IContainerVisual?>).castToImpl<IContainerVisual,IContainerVisual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContainerVisual?> =
        arrayOfNulls<IContainerVisual_Impl>(size) as Array<IContainerVisual?>
  }
}
