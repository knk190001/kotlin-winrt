package Windows.UI.Core

import Windows.Foundation.Size
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

@ABIMarker(ICoreWindowPopupShowingEventArgs.ABI::class)
@Signature("{26155fa2-5ba5-4ea4-a3b4-2dc7d63c8e26}")
@Guid("26155fa25ba54ea4a3b42dc7d63c8e26")
@WinRTInterface("26155fa25ba54ea4a3b42dc7d63c8e26")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWindowPopupShowingEventArgs.ByReference::class)
public interface ICoreWindowPopupShowingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetDesiredSize(value: Size?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWindowPopupShowingEventArgs> {
    public override fun getValue() = ABI.makeICoreWindowPopupShowingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWindowPopupShowingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWindowPopupShowingEventArgs {
    public val __668170420_Ptr: Pointer?

    public val _668170420_VtblPtr: Pointer?
      get() = __668170420_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetDesiredSize(value: Size?): Unit {
      val fnPtr = _668170420_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__668170420_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWindowPopupShowingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __668170420_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWindowPopupShowingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("26155fa25ba54ea4a3b42dc7d63c8e26")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWindowPopupShowingEventArgs(ptr: Pointer?): WithDefault =
        ICoreWindowPopupShowingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWindowPopupShowingEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWindowPopupShowingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWindowPopupShowingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__668170420_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWindowPopupShowingEventArgs):
        Array<ICoreWindowPopupShowingEventArgs?> = (elements as
        Array<ICoreWindowPopupShowingEventArgs?>).castToImpl<ICoreWindowPopupShowingEventArgs,ICoreWindowPopupShowingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWindowPopupShowingEventArgs?> =
        arrayOfNulls<ICoreWindowPopupShowingEventArgs_Impl>(size) as
        Array<ICoreWindowPopupShowingEventArgs?>
  }
}
