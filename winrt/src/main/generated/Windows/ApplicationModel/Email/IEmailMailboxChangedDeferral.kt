package Windows.ApplicationModel.Email

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

@ABIMarker(IEmailMailboxChangedDeferral.ABI::class)
@Signature("{779a74c1-97c5-4b54-b30d-306232623e6d}")
@Guid("779a74c197c54b54b30d306232623e6d")
@WinRTInterface("779a74c197c54b54b30d306232623e6d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxChangedDeferral.ByReference::class)
public interface IEmailMailboxChangedDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxChangedDeferral> {
    public override fun getValue() = ABI.makeIEmailMailboxChangedDeferral(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxChangedDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxChangedDeferral {
    public val __992582224_Ptr: Pointer?

    public val _992582224_VtblPtr: Pointer?
      get() = __992582224_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _992582224_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__992582224_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEmailMailboxChangedDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __992582224_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxChangedDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("779a74c197c54b54b30d306232623e6d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxChangedDeferral(ptr: Pointer?): WithDefault =
        IEmailMailboxChangedDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxChangedDeferral {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxChangedDeferral(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxChangedDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__992582224_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxChangedDeferral):
        Array<IEmailMailboxChangedDeferral?> = (elements as
        Array<IEmailMailboxChangedDeferral?>).castToImpl<IEmailMailboxChangedDeferral,IEmailMailboxChangedDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxChangedDeferral?> =
        arrayOfNulls<IEmailMailboxChangedDeferral_Impl>(size) as
        Array<IEmailMailboxChangedDeferral?>
  }
}
