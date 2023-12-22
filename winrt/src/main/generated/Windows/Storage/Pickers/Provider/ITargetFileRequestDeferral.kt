package Windows.Storage.Pickers.Provider

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

@ABIMarker(ITargetFileRequestDeferral.ABI::class)
@Signature("{4aee9d91-bf15-4da9-95f6-f6b7d558225b}")
@Guid("4aee9d91bf154da995f6f6b7d558225b")
@WinRTInterface("4aee9d91bf154da995f6f6b7d558225b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetFileRequestDeferral.ByReference::class)
public interface ITargetFileRequestDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetFileRequestDeferral> {
    public override fun getValue() = ABI.makeITargetFileRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: ITargetFileRequestDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetFileRequestDeferral {
    public val __90339556_Ptr: Pointer?

    public val _90339556_VtblPtr: Pointer?
      get() = __90339556_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _90339556_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__90339556_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITargetFileRequestDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __90339556_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetFileRequestDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4aee9d91bf154da995f6f6b7d558225b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetFileRequestDeferral(ptr: Pointer?): WithDefault =
        ITargetFileRequestDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetFileRequestDeferral {
      val address = segment.toRawLongValue()
      return makeITargetFileRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: ITargetFileRequestDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__90339556_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetFileRequestDeferral):
        Array<ITargetFileRequestDeferral?> = (elements as
        Array<ITargetFileRequestDeferral?>).castToImpl<ITargetFileRequestDeferral,ITargetFileRequestDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetFileRequestDeferral?> =
        arrayOfNulls<ITargetFileRequestDeferral_Impl>(size) as Array<ITargetFileRequestDeferral?>
  }
}
