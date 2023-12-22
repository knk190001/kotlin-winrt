package Windows.UI.ViewManagement

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

@ABIMarker(IApplicationViewTransferContext.ABI::class)
@Signature("{8574bc63-3c17-408e-9408-8a1a9ea81bfa}")
@Guid("8574bc633c17408e94088a1a9ea81bfa")
@WinRTInterface("8574bc633c17408e94088a1a9ea81bfa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationViewTransferContext.ByReference::class)
public interface IApplicationViewTransferContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ViewId(): Int

  @InterfaceMethod(1)
  public fun put_ViewId(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationViewTransferContext> {
    public override fun getValue() = ABI.makeIApplicationViewTransferContext(pointer.getPointer(0))

    public fun setValue(value: IApplicationViewTransferContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationViewTransferContext {
    public val __317404799_Ptr: Pointer?

    public val _317404799_VtblPtr: Pointer?
      get() = __317404799_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ViewId(): Int {
      val fnPtr = _317404799_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__317404799_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ViewId(value: Int): Unit {
      val fnPtr = _317404799_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__317404799_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IApplicationViewTransferContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __317404799_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationViewTransferContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8574bc633c17408e94088a1a9ea81bfa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationViewTransferContext(ptr: Pointer?): WithDefault =
        IApplicationViewTransferContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationViewTransferContext {
      val address = segment.toRawLongValue()
      return makeIApplicationViewTransferContext(Pointer(address))
    }

    public override fun toNative(obj: IApplicationViewTransferContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__317404799_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationViewTransferContext):
        Array<IApplicationViewTransferContext?> = (elements as
        Array<IApplicationViewTransferContext?>).castToImpl<IApplicationViewTransferContext,IApplicationViewTransferContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationViewTransferContext?> =
        arrayOfNulls<IApplicationViewTransferContext_Impl>(size) as
        Array<IApplicationViewTransferContext?>
  }
}
