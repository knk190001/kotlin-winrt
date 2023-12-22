package Windows.Storage.Provider

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

@ABIMarker(IFileUpdateRequestDeferral.ABI::class)
@Signature("{ffcedb2b-8ade-44a5-bb00-164c4e72f13a}")
@Guid("ffcedb2b8ade44a5bb00164c4e72f13a")
@WinRTInterface("ffcedb2b8ade44a5bb00164c4e72f13a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileUpdateRequestDeferral.ByReference::class)
public interface IFileUpdateRequestDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileUpdateRequestDeferral> {
    public override fun getValue() = ABI.makeIFileUpdateRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: IFileUpdateRequestDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileUpdateRequestDeferral {
    public val __709976485_Ptr: Pointer?

    public val _709976485_VtblPtr: Pointer?
      get() = __709976485_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _709976485_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__709976485_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFileUpdateRequestDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __709976485_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileUpdateRequestDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ffcedb2b8ade44a5bb00164c4e72f13a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileUpdateRequestDeferral(ptr: Pointer?): WithDefault =
        IFileUpdateRequestDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileUpdateRequestDeferral {
      val address = segment.toRawLongValue()
      return makeIFileUpdateRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: IFileUpdateRequestDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__709976485_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileUpdateRequestDeferral):
        Array<IFileUpdateRequestDeferral?> = (elements as
        Array<IFileUpdateRequestDeferral?>).castToImpl<IFileUpdateRequestDeferral,IFileUpdateRequestDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileUpdateRequestDeferral?> =
        arrayOfNulls<IFileUpdateRequestDeferral_Impl>(size) as Array<IFileUpdateRequestDeferral?>
  }
}
