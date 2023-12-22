package Microsoft.UI.Composition

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

@ABIMarker(ICompositionMaskBrush.ABI::class)
@Signature("{c9502786-65aa-5be5-a679-c3b5dbfb0dc6}")
@Guid("c950278665aa5be5a679c3b5dbfb0dc6")
@WinRTInterface("c950278665aa5be5a679c3b5dbfb0dc6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionMaskBrush.ByReference::class)
public interface ICompositionMaskBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mask(): CompositionBrush?

  @InterfaceMethod(1)
  public fun put_Mask(value: CompositionBrush?): Unit

  @InterfaceMethod(2)
  public fun get_Source(): CompositionBrush?

  @InterfaceMethod(3)
  public fun put_Source(value: CompositionBrush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionMaskBrush> {
    public override fun getValue() = ABI.makeICompositionMaskBrush(pointer.getPointer(0))

    public fun setValue(value: ICompositionMaskBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionMaskBrush {
    public val __228272829_Ptr: Pointer?

    public val _228272829_VtblPtr: Pointer?
      get() = __228272829_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mask(): CompositionBrush? {
      val fnPtr = _228272829_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__228272829_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Mask(value: CompositionBrush?): Unit {
      val fnPtr = _228272829_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__228272829_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Source(): CompositionBrush? {
      val fnPtr = _228272829_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__228272829_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Source(value: CompositionBrush?): Unit {
      val fnPtr = _228272829_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__228272829_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionMaskBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __228272829_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionMaskBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c950278665aa5be5a679c3b5dbfb0dc6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionMaskBrush(ptr: Pointer?): WithDefault =
        ICompositionMaskBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionMaskBrush {
      val address = segment.toRawLongValue()
      return makeICompositionMaskBrush(Pointer(address))
    }

    public override fun toNative(obj: ICompositionMaskBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__228272829_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionMaskBrush): Array<ICompositionMaskBrush?> =
        (elements as
        Array<ICompositionMaskBrush?>).castToImpl<ICompositionMaskBrush,ICompositionMaskBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionMaskBrush?> =
        arrayOfNulls<ICompositionMaskBrush_Impl>(size) as Array<ICompositionMaskBrush?>
  }
}
