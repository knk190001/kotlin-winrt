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

@ABIMarker(ICompositionSupportsSystemBackdrop.ABI::class)
@Signature("{397dafe4-b6c2-5bb9-951d-f5707de8b7bc}")
@Guid("397dafe4b6c25bb9951df5707de8b7bc")
@WinRTInterface("397dafe4b6c25bb9951df5707de8b7bc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionSupportsSystemBackdrop.ByReference::class)
public interface ICompositionSupportsSystemBackdrop : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SystemBackdrop(): CompositionBrush?

  @InterfaceMethod(1)
  public fun put_SystemBackdrop(value: CompositionBrush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionSupportsSystemBackdrop> {
    public override fun getValue() =
        ABI.makeICompositionSupportsSystemBackdrop(pointer.getPointer(0))

    public fun setValue(value: ICompositionSupportsSystemBackdrop_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionSupportsSystemBackdrop {
    public val __1723805605_Ptr: Pointer?

    public val _1723805605_VtblPtr: Pointer?
      get() = __1723805605_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SystemBackdrop(): CompositionBrush? {
      val fnPtr = _1723805605_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__1723805605_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SystemBackdrop(value: CompositionBrush?): Unit {
      val fnPtr = _1723805605_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1723805605_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionSupportsSystemBackdrop_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1723805605_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionSupportsSystemBackdrop, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("397dafe4b6c25bb9951df5707de8b7bc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionSupportsSystemBackdrop(ptr: Pointer?): WithDefault =
        ICompositionSupportsSystemBackdrop_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionSupportsSystemBackdrop {
      val address = segment.toRawLongValue()
      return makeICompositionSupportsSystemBackdrop(Pointer(address))
    }

    public override fun toNative(obj: ICompositionSupportsSystemBackdrop): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1723805605_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionSupportsSystemBackdrop):
        Array<ICompositionSupportsSystemBackdrop?> = (elements as
        Array<ICompositionSupportsSystemBackdrop?>).castToImpl<ICompositionSupportsSystemBackdrop,ICompositionSupportsSystemBackdrop_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionSupportsSystemBackdrop?> =
        arrayOfNulls<ICompositionSupportsSystemBackdrop_Impl>(size) as
        Array<ICompositionSupportsSystemBackdrop?>
  }
}
