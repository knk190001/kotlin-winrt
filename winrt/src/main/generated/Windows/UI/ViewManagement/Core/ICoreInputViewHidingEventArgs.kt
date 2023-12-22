package Windows.UI.ViewManagement.Core

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreInputViewHidingEventArgs.ABI::class)
@Signature("{eada47bd-bac5-5336-848d-41083584daad}")
@Guid("eada47bdbac55336848d41083584daad")
@WinRTInterface("eada47bdbac55336848d41083584daad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreInputViewHidingEventArgs.ByReference::class)
public interface ICoreInputViewHidingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCancel(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreInputViewHidingEventArgs> {
    public override fun getValue() = ABI.makeICoreInputViewHidingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreInputViewHidingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreInputViewHidingEventArgs {
    public val __1464776933_Ptr: Pointer?

    public val _1464776933_VtblPtr: Pointer?
      get() = __1464776933_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCancel(): Boolean {
      val fnPtr = _1464776933_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1464776933_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreInputViewHidingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1464776933_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreInputViewHidingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eada47bdbac55336848d41083584daad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreInputViewHidingEventArgs(ptr: Pointer?): WithDefault =
        ICoreInputViewHidingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreInputViewHidingEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreInputViewHidingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreInputViewHidingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1464776933_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreInputViewHidingEventArgs):
        Array<ICoreInputViewHidingEventArgs?> = (elements as
        Array<ICoreInputViewHidingEventArgs?>).castToImpl<ICoreInputViewHidingEventArgs,ICoreInputViewHidingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreInputViewHidingEventArgs?> =
        arrayOfNulls<ICoreInputViewHidingEventArgs_Impl>(size) as
        Array<ICoreInputViewHidingEventArgs?>
  }
}
