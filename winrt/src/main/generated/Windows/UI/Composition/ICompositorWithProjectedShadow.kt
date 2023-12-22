package Windows.UI.Composition

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

@ABIMarker(ICompositorWithProjectedShadow.ABI::class)
@Signature("{a2e6330e-8a60-5a38-bb85-b44ea901677c}")
@Guid("a2e6330e8a605a38bb85b44ea901677c")
@WinRTInterface("a2e6330e8a605a38bb85b44ea901677c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositorWithProjectedShadow.ByReference::class)
public interface ICompositorWithProjectedShadow : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateProjectedShadowCaster(): CompositionProjectedShadowCaster?

  @InterfaceMethod(1)
  public fun CreateProjectedShadow(): CompositionProjectedShadow?

  @InterfaceMethod(2)
  public fun CreateProjectedShadowReceiver(): CompositionProjectedShadowReceiver?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositorWithProjectedShadow> {
    public override fun getValue() = ABI.makeICompositorWithProjectedShadow(pointer.getPointer(0))

    public fun setValue(value: ICompositorWithProjectedShadow_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositorWithProjectedShadow {
    public val __466362269_Ptr: Pointer?

    public val _466362269_VtblPtr: Pointer?
      get() = __466362269_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateProjectedShadowCaster(): CompositionProjectedShadowCaster? {
      val fnPtr = _466362269_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionProjectedShadowCaster>()
      val hr = fn.invokeHR(arrayOf(__466362269_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionProjectedShadowCaster>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateProjectedShadow(): CompositionProjectedShadow? {
      val fnPtr = _466362269_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionProjectedShadow>()
      val hr = fn.invokeHR(arrayOf(__466362269_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionProjectedShadow>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateProjectedShadowReceiver(): CompositionProjectedShadowReceiver? {
      val fnPtr = _466362269_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionProjectedShadowReceiver>()
      val hr = fn.invokeHR(arrayOf(__466362269_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionProjectedShadowReceiver>(result.getValue())
      return resultValue
    }
  }

  public class ICompositorWithProjectedShadow_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __466362269_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositorWithProjectedShadow, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a2e6330e8a605a38bb85b44ea901677c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositorWithProjectedShadow(ptr: Pointer?): WithDefault =
        ICompositorWithProjectedShadow_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositorWithProjectedShadow {
      val address = segment.toRawLongValue()
      return makeICompositorWithProjectedShadow(Pointer(address))
    }

    public override fun toNative(obj: ICompositorWithProjectedShadow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__466362269_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositorWithProjectedShadow):
        Array<ICompositorWithProjectedShadow?> = (elements as
        Array<ICompositorWithProjectedShadow?>).castToImpl<ICompositorWithProjectedShadow,ICompositorWithProjectedShadow_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositorWithProjectedShadow?> =
        arrayOfNulls<ICompositorWithProjectedShadow_Impl>(size) as
        Array<ICompositorWithProjectedShadow?>
  }
}
