package Microsoft.UI.Xaml.Controls

import Windows.Foundation.Rect
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

@ABIMarker(IVirtualizingLayoutContextOverrides2.ABI::class)
@Signature("{da384c25-5d8f-5ede-ae54-c318813ae784}")
@Guid("da384c255d8f5edeae54c318813ae784")
@WinRTInterface("da384c255d8f5edeae54c318813ae784")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVirtualizingLayoutContextOverrides2.ByReference::class)
public interface IVirtualizingLayoutContextOverrides2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun VisibleRectCore(): Rect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVirtualizingLayoutContextOverrides2> {
    public override fun getValue() =
        ABI.makeIVirtualizingLayoutContextOverrides2(pointer.getPointer(0))

    public fun setValue(value: IVirtualizingLayoutContextOverrides2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVirtualizingLayoutContextOverrides2 {
    public val __920846595_Ptr: Pointer?

    public val _920846595_VtblPtr: Pointer?
      get() = __920846595_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun VisibleRectCore(): Rect? {
      val fnPtr = _920846595_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__920846595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }
  }

  public class IVirtualizingLayoutContextOverrides2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __920846595_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVirtualizingLayoutContextOverrides2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da384c255d8f5edeae54c318813ae784")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVirtualizingLayoutContextOverrides2(ptr: Pointer?): WithDefault =
        IVirtualizingLayoutContextOverrides2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVirtualizingLayoutContextOverrides2 {
      val address = segment.toRawLongValue()
      return makeIVirtualizingLayoutContextOverrides2(Pointer(address))
    }

    public override fun toNative(obj: IVirtualizingLayoutContextOverrides2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__920846595_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVirtualizingLayoutContextOverrides2):
        Array<IVirtualizingLayoutContextOverrides2?> = (elements as
        Array<IVirtualizingLayoutContextOverrides2?>).castToImpl<IVirtualizingLayoutContextOverrides2,IVirtualizingLayoutContextOverrides2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVirtualizingLayoutContextOverrides2?> =
        arrayOfNulls<IVirtualizingLayoutContextOverrides2_Impl>(size) as
        Array<IVirtualizingLayoutContextOverrides2?>
  }
}
