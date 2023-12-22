package Windows.UI.Core

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

@ABIMarker(ICoreWindowResizeManagerStatics.ABI::class)
@Signature("{ae4a9045-6d70-49db-8e68-46ffbd17d38d}")
@Guid("ae4a90456d7049db8e6846ffbd17d38d")
@WinRTInterface("ae4a90456d7049db8e6846ffbd17d38d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWindowResizeManagerStatics.ByReference::class)
public interface ICoreWindowResizeManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): CoreWindowResizeManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWindowResizeManagerStatics> {
    public override fun getValue() = ABI.makeICoreWindowResizeManagerStatics(pointer.getPointer(0))

    public fun setValue(value: ICoreWindowResizeManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWindowResizeManagerStatics {
    public val __2057706198_Ptr: Pointer?

    public val _2057706198_VtblPtr: Pointer?
      get() = __2057706198_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): CoreWindowResizeManager? {
      val fnPtr = _2057706198_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWindowResizeManager>()
      val hr = fn.invokeHR(arrayOf(__2057706198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWindowResizeManager>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWindowResizeManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2057706198_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWindowResizeManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae4a90456d7049db8e6846ffbd17d38d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWindowResizeManagerStatics(ptr: Pointer?): WithDefault =
        ICoreWindowResizeManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWindowResizeManagerStatics {
      val address = segment.toRawLongValue()
      return makeICoreWindowResizeManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: ICoreWindowResizeManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2057706198_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWindowResizeManagerStatics):
        Array<ICoreWindowResizeManagerStatics?> = (elements as
        Array<ICoreWindowResizeManagerStatics?>).castToImpl<ICoreWindowResizeManagerStatics,ICoreWindowResizeManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWindowResizeManagerStatics?> =
        arrayOfNulls<ICoreWindowResizeManagerStatics_Impl>(size) as
        Array<ICoreWindowResizeManagerStatics?>
  }
}
