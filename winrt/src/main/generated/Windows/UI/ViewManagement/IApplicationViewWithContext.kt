package Windows.UI.ViewManagement

import Windows.UI.UIContext
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

@ABIMarker(IApplicationViewWithContext.ABI::class)
@Signature("{bd55d512-9dc1-44fc-8501-666625df60dc}")
@Guid("bd55d5129dc144fc8501666625df60dc")
@WinRTInterface("bd55d5129dc144fc8501666625df60dc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationViewWithContext.ByReference::class)
public interface IApplicationViewWithContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UIContext(): UIContext?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationViewWithContext> {
    public override fun getValue() = ABI.makeIApplicationViewWithContext(pointer.getPointer(0))

    public fun setValue(value: IApplicationViewWithContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationViewWithContext {
    public val __1651301062_Ptr: Pointer?

    public val _1651301062_VtblPtr: Pointer?
      get() = __1651301062_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UIContext(): UIContext? {
      val fnPtr = _1651301062_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIContext>()
      val hr = fn.invokeHR(arrayOf(__1651301062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIContext>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationViewWithContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1651301062_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationViewWithContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bd55d5129dc144fc8501666625df60dc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationViewWithContext(ptr: Pointer?): WithDefault =
        IApplicationViewWithContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationViewWithContext {
      val address = segment.toRawLongValue()
      return makeIApplicationViewWithContext(Pointer(address))
    }

    public override fun toNative(obj: IApplicationViewWithContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1651301062_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationViewWithContext):
        Array<IApplicationViewWithContext?> = (elements as
        Array<IApplicationViewWithContext?>).castToImpl<IApplicationViewWithContext,IApplicationViewWithContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationViewWithContext?> =
        arrayOfNulls<IApplicationViewWithContext_Impl>(size) as Array<IApplicationViewWithContext?>
  }
}
