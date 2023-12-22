package Windows.UI.Composition

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

@ABIMarker(ICompositionLight.ABI::class)
@Signature("{41a6d7c2-2e5d-4bc1-b09e-8f0a03e3d8d3}")
@Guid("41a6d7c22e5d4bc1b09e8f0a03e3d8d3")
@WinRTInterface("41a6d7c22e5d4bc1b09e8f0a03e3d8d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionLight.ByReference::class)
public interface ICompositionLight : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Targets(): VisualUnorderedCollection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionLight> {
    public override fun getValue() = ABI.makeICompositionLight(pointer.getPointer(0))

    public fun setValue(value: ICompositionLight_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionLight {
    public val __1350926022_Ptr: Pointer?

    public val _1350926022_VtblPtr: Pointer?
      get() = __1350926022_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Targets(): VisualUnorderedCollection? {
      val fnPtr = _1350926022_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VisualUnorderedCollection>()
      val hr = fn.invokeHR(arrayOf(__1350926022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VisualUnorderedCollection>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionLight_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1350926022_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionLight, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("41a6d7c22e5d4bc1b09e8f0a03e3d8d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionLight(ptr: Pointer?): WithDefault = ICompositionLight_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionLight {
      val address = segment.toRawLongValue()
      return makeICompositionLight(Pointer(address))
    }

    public override fun toNative(obj: ICompositionLight): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1350926022_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionLight): Array<ICompositionLight?> = (elements
        as Array<ICompositionLight?>).castToImpl<ICompositionLight,ICompositionLight_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionLight?> =
        arrayOfNulls<ICompositionLight_Impl>(size) as Array<ICompositionLight?>
  }
}
