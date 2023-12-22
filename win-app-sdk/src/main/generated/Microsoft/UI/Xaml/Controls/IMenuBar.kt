package Microsoft.UI.Xaml.Controls

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IMenuBar.ABI::class)
@Signature("{ba97f337-8f1e-5141-b53f-e77a8ba3ebbd}")
@Guid("ba97f3378f1e5141b53fe77a8ba3ebbd")
@WinRTInterface("ba97f3378f1e5141b53fe77a8ba3ebbd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuBar.ByReference::class)
public interface IMenuBar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Items(): IVector<MenuBarItem?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMenuBar> {
    public override fun getValue() = ABI.makeIMenuBar(pointer.getPointer(0))

    public fun setValue(value: IMenuBar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuBar {
    public val __998870387_Ptr: Pointer?

    public val _998870387_VtblPtr: Pointer?
      get() = __998870387_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Items(): IVector<MenuBarItem?>? {
      val fnPtr = _998870387_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<MenuBarItem?>>()
      val hr = fn.invokeHR(arrayOf(__998870387_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<MenuBarItem?>>(result.getValue())
      return resultValue
    }
  }

  public class IMenuBar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __998870387_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuBar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ba97f3378f1e5141b53fe77a8ba3ebbd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuBar(ptr: Pointer?): WithDefault = IMenuBar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuBar {
      val address = segment.toRawLongValue()
      return makeIMenuBar(Pointer(address))
    }

    public override fun toNative(obj: IMenuBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__998870387_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuBar): Array<IMenuBar?> = (elements as
        Array<IMenuBar?>).castToImpl<IMenuBar,IMenuBar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuBar?> = arrayOfNulls<IMenuBar_Impl>(size) as
        Array<IMenuBar?>
  }
}
