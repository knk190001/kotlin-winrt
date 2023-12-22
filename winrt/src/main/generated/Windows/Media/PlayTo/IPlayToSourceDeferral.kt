package Windows.Media.PlayTo

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

@ABIMarker(IPlayToSourceDeferral.ABI::class)
@Signature("{4100891d-278e-4f29-859b-a9e501053e7d}")
@Guid("4100891d278e4f29859ba9e501053e7d")
@WinRTInterface("4100891d278e4f29859ba9e501053e7d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayToSourceDeferral.ByReference::class)
public interface IPlayToSourceDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayToSourceDeferral> {
    public override fun getValue() = ABI.makeIPlayToSourceDeferral(pointer.getPointer(0))

    public fun setValue(value: IPlayToSourceDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayToSourceDeferral {
    public val __397780922_Ptr: Pointer?

    public val _397780922_VtblPtr: Pointer?
      get() = __397780922_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _397780922_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__397780922_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPlayToSourceDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __397780922_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayToSourceDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4100891d278e4f29859ba9e501053e7d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayToSourceDeferral(ptr: Pointer?): WithDefault =
        IPlayToSourceDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayToSourceDeferral {
      val address = segment.toRawLongValue()
      return makeIPlayToSourceDeferral(Pointer(address))
    }

    public override fun toNative(obj: IPlayToSourceDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__397780922_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayToSourceDeferral): Array<IPlayToSourceDeferral?> =
        (elements as
        Array<IPlayToSourceDeferral?>).castToImpl<IPlayToSourceDeferral,IPlayToSourceDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayToSourceDeferral?> =
        arrayOfNulls<IPlayToSourceDeferral_Impl>(size) as Array<IPlayToSourceDeferral?>
  }
}
