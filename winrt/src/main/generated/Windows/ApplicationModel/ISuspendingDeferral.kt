package Windows.ApplicationModel

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

@ABIMarker(ISuspendingDeferral.ABI::class)
@Signature("{59140509-8bc9-4eb4-b636-dabdc4f46f66}")
@Guid("591405098bc94eb4b636dabdc4f46f66")
@WinRTInterface("591405098bc94eb4b636dabdc4f46f66")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISuspendingDeferral.ByReference::class)
public interface ISuspendingDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISuspendingDeferral> {
    public override fun getValue() = ABI.makeISuspendingDeferral(pointer.getPointer(0))

    public fun setValue(value: ISuspendingDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISuspendingDeferral {
    public val __644456790_Ptr: Pointer?

    public val _644456790_VtblPtr: Pointer?
      get() = __644456790_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _644456790_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__644456790_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISuspendingDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __644456790_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISuspendingDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("591405098bc94eb4b636dabdc4f46f66")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISuspendingDeferral(ptr: Pointer?): WithDefault = ISuspendingDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISuspendingDeferral {
      val address = segment.toRawLongValue()
      return makeISuspendingDeferral(Pointer(address))
    }

    public override fun toNative(obj: ISuspendingDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__644456790_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISuspendingDeferral): Array<ISuspendingDeferral?> =
        (elements as
        Array<ISuspendingDeferral?>).castToImpl<ISuspendingDeferral,ISuspendingDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISuspendingDeferral?> =
        arrayOfNulls<ISuspendingDeferral_Impl>(size) as Array<ISuspendingDeferral?>
  }
}
