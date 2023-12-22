package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ILayoutContext.ABI::class)
@Signature("{b45a2e55-2ecc-5462-bb26-d47c455bb48e}")
@Guid("b45a2e552ecc5462bb26d47c455bb48e")
@WinRTInterface("b45a2e552ecc5462bb26d47c455bb48e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILayoutContext.ByReference::class)
public interface ILayoutContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LayoutState(): IUnknown?

  @InterfaceMethod(1)
  public fun put_LayoutState(value: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILayoutContext>
      {
    public override fun getValue() = ABI.makeILayoutContext(pointer.getPointer(0))

    public fun setValue(value: ILayoutContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILayoutContext {
    public val __1464148802_Ptr: Pointer?

    public val _1464148802_VtblPtr: Pointer?
      get() = __1464148802_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LayoutState(): IUnknown? {
      val fnPtr = _1464148802_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1464148802_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_LayoutState(value: IUnknown?): Unit {
      val fnPtr = _1464148802_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1464148802_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILayoutContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1464148802_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILayoutContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b45a2e552ecc5462bb26d47c455bb48e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILayoutContext(ptr: Pointer?): WithDefault = ILayoutContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILayoutContext {
      val address = segment.toRawLongValue()
      return makeILayoutContext(Pointer(address))
    }

    public override fun toNative(obj: ILayoutContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1464148802_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILayoutContext): Array<ILayoutContext?> = (elements as
        Array<ILayoutContext?>).castToImpl<ILayoutContext,ILayoutContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILayoutContext?> =
        arrayOfNulls<ILayoutContext_Impl>(size) as Array<ILayoutContext?>
  }
}
