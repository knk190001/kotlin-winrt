package Windows.UI.Xaml.Controls

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

@ABIMarker(IInkToolbarIsStencilButtonCheckedChangedEventArgs.ABI::class)
@Signature("{026edd26-d32b-4e28-a033-d5097662b292}")
@Guid("026edd26d32b4e28a033d5097662b292")
@WinRTInterface("026edd26d32b4e28a033d5097662b292")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarIsStencilButtonCheckedChangedEventArgs.ByReference::class)
public interface IInkToolbarIsStencilButtonCheckedChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StencilButton(): InkToolbarStencilButton?

  @InterfaceMethod(1)
  public fun get_StencilKind(): InkToolbarStencilKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarIsStencilButtonCheckedChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIInkToolbarIsStencilButtonCheckedChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarIsStencilButtonCheckedChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarIsStencilButtonCheckedChangedEventArgs {
    public val __711044503_Ptr: Pointer?

    public val _711044503_VtblPtr: Pointer?
      get() = __711044503_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StencilButton(): InkToolbarStencilButton? {
      val fnPtr = _711044503_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarStencilButton>()
      val hr = fn.invokeHR(arrayOf(__711044503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarStencilButton>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StencilKind(): InkToolbarStencilKind? {
      val fnPtr = _711044503_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarStencilKind>()
      val hr = fn.invokeHR(arrayOf(__711044503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarStencilKind>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarIsStencilButtonCheckedChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __711044503_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarIsStencilButtonCheckedChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("026edd26d32b4e28a033d5097662b292")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarIsStencilButtonCheckedChangedEventArgs(ptr: Pointer?): WithDefault =
        IInkToolbarIsStencilButtonCheckedChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInkToolbarIsStencilButtonCheckedChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIInkToolbarIsStencilButtonCheckedChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarIsStencilButtonCheckedChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__711044503_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarIsStencilButtonCheckedChangedEventArgs):
        Array<IInkToolbarIsStencilButtonCheckedChangedEventArgs?> = (elements as
        Array<IInkToolbarIsStencilButtonCheckedChangedEventArgs?>).castToImpl<IInkToolbarIsStencilButtonCheckedChangedEventArgs,IInkToolbarIsStencilButtonCheckedChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IInkToolbarIsStencilButtonCheckedChangedEventArgs?> =
        arrayOfNulls<IInkToolbarIsStencilButtonCheckedChangedEventArgs_Impl>(size) as
        Array<IInkToolbarIsStencilButtonCheckedChangedEventArgs?>
  }
}
