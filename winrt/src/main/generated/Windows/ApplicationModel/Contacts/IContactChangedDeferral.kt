package Windows.ApplicationModel.Contacts

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

@ABIMarker(IContactChangedDeferral.ABI::class)
@Signature("{c5143ae8-1b03-46f8-b694-a523e83cfcb6}")
@Guid("c5143ae81b0346f8b694a523e83cfcb6")
@WinRTInterface("c5143ae81b0346f8b694a523e83cfcb6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactChangedDeferral.ByReference::class)
public interface IContactChangedDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactChangedDeferral> {
    public override fun getValue() = ABI.makeIContactChangedDeferral(pointer.getPointer(0))

    public fun setValue(value: IContactChangedDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactChangedDeferral {
    public val __526068245_Ptr: Pointer?

    public val _526068245_VtblPtr: Pointer?
      get() = __526068245_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _526068245_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__526068245_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactChangedDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __526068245_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactChangedDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c5143ae81b0346f8b694a523e83cfcb6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactChangedDeferral(ptr: Pointer?): WithDefault =
        IContactChangedDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactChangedDeferral {
      val address = segment.toRawLongValue()
      return makeIContactChangedDeferral(Pointer(address))
    }

    public override fun toNative(obj: IContactChangedDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__526068245_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactChangedDeferral): Array<IContactChangedDeferral?>
        = (elements as
        Array<IContactChangedDeferral?>).castToImpl<IContactChangedDeferral,IContactChangedDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactChangedDeferral?> =
        arrayOfNulls<IContactChangedDeferral_Impl>(size) as Array<IContactChangedDeferral?>
  }
}
