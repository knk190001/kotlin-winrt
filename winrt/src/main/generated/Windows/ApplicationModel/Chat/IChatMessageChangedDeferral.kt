package Windows.ApplicationModel.Chat

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

@ABIMarker(IChatMessageChangedDeferral.ABI::class)
@Signature("{fbc6b30c-788c-4dcc-ace7-6282382968cf}")
@Guid("fbc6b30c788c4dccace76282382968cf")
@WinRTInterface("fbc6b30c788c4dccace76282382968cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageChangedDeferral.ByReference::class)
public interface IChatMessageChangedDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageChangedDeferral> {
    public override fun getValue() = ABI.makeIChatMessageChangedDeferral(pointer.getPointer(0))

    public fun setValue(value: IChatMessageChangedDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageChangedDeferral {
    public val __988324727_Ptr: Pointer?

    public val _988324727_VtblPtr: Pointer?
      get() = __988324727_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _988324727_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__988324727_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IChatMessageChangedDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __988324727_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageChangedDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbc6b30c788c4dccace76282382968cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageChangedDeferral(ptr: Pointer?): WithDefault =
        IChatMessageChangedDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageChangedDeferral {
      val address = segment.toRawLongValue()
      return makeIChatMessageChangedDeferral(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageChangedDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__988324727_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageChangedDeferral):
        Array<IChatMessageChangedDeferral?> = (elements as
        Array<IChatMessageChangedDeferral?>).castToImpl<IChatMessageChangedDeferral,IChatMessageChangedDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageChangedDeferral?> =
        arrayOfNulls<IChatMessageChangedDeferral_Impl>(size) as Array<IChatMessageChangedDeferral?>
  }
}
