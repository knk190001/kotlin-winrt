package Windows.UI.Input.Inking

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IInkStrokesErasedEventArgs.ABI::class)
@Signature("{a4216a22-1503-4ebf-8ff5-2de84584a8aa}")
@Guid("a4216a2215034ebf8ff52de84584a8aa")
@WinRTInterface("a4216a2215034ebf8ff52de84584a8aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkStrokesErasedEventArgs.ByReference::class)
public interface IInkStrokesErasedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Strokes(): IVectorView<InkStroke?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkStrokesErasedEventArgs> {
    public override fun getValue() = ABI.makeIInkStrokesErasedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IInkStrokesErasedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkStrokesErasedEventArgs {
    public val __878054870_Ptr: Pointer?

    public val _878054870_VtblPtr: Pointer?
      get() = __878054870_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Strokes(): IVectorView<InkStroke?>? {
      val fnPtr = _878054870_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<InkStroke?>>()
      val hr = fn.invokeHR(arrayOf(__878054870_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<InkStroke?>>(result.getValue())
      return resultValue
    }
  }

  public class IInkStrokesErasedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __878054870_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkStrokesErasedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4216a2215034ebf8ff52de84584a8aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkStrokesErasedEventArgs(ptr: Pointer?): WithDefault =
        IInkStrokesErasedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkStrokesErasedEventArgs {
      val address = segment.toRawLongValue()
      return makeIInkStrokesErasedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IInkStrokesErasedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__878054870_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkStrokesErasedEventArgs):
        Array<IInkStrokesErasedEventArgs?> = (elements as
        Array<IInkStrokesErasedEventArgs?>).castToImpl<IInkStrokesErasedEventArgs,IInkStrokesErasedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkStrokesErasedEventArgs?> =
        arrayOfNulls<IInkStrokesErasedEventArgs_Impl>(size) as Array<IInkStrokesErasedEventArgs?>
  }
}
