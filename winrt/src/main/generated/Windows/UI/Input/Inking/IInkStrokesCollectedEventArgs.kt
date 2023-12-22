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

@ABIMarker(IInkStrokesCollectedEventArgs.ABI::class)
@Signature("{c4f3f229-1938-495c-b4d9-6de4b08d4811}")
@Guid("c4f3f2291938495cb4d96de4b08d4811")
@WinRTInterface("c4f3f2291938495cb4d96de4b08d4811")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkStrokesCollectedEventArgs.ByReference::class)
public interface IInkStrokesCollectedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Strokes(): IVectorView<InkStroke?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkStrokesCollectedEventArgs> {
    public override fun getValue() = ABI.makeIInkStrokesCollectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IInkStrokesCollectedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkStrokesCollectedEventArgs {
    public val __1972101949_Ptr: Pointer?

    public val _1972101949_VtblPtr: Pointer?
      get() = __1972101949_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Strokes(): IVectorView<InkStroke?>? {
      val fnPtr = _1972101949_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<InkStroke?>>()
      val hr = fn.invokeHR(arrayOf(__1972101949_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<InkStroke?>>(result.getValue())
      return resultValue
    }
  }

  public class IInkStrokesCollectedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1972101949_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkStrokesCollectedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4f3f2291938495cb4d96de4b08d4811")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkStrokesCollectedEventArgs(ptr: Pointer?): WithDefault =
        IInkStrokesCollectedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkStrokesCollectedEventArgs {
      val address = segment.toRawLongValue()
      return makeIInkStrokesCollectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IInkStrokesCollectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1972101949_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkStrokesCollectedEventArgs):
        Array<IInkStrokesCollectedEventArgs?> = (elements as
        Array<IInkStrokesCollectedEventArgs?>).castToImpl<IInkStrokesCollectedEventArgs,IInkStrokesCollectedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkStrokesCollectedEventArgs?> =
        arrayOfNulls<IInkStrokesCollectedEventArgs_Impl>(size) as
        Array<IInkStrokesCollectedEventArgs?>
  }
}
