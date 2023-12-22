package Windows.UI.Input.Inking

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

@ABIMarker(IInkDrawingAttributes5.ABI::class)
@Signature("{d11aa0bb-0775-4852-ae64-41143a7ae6c9}")
@Guid("d11aa0bb07754852ae6441143a7ae6c9")
@WinRTInterface("d11aa0bb07754852ae6441143a7ae6c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkDrawingAttributes5.ByReference::class)
public interface IInkDrawingAttributes5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ModelerAttributes(): InkModelerAttributes?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkDrawingAttributes5> {
    public override fun getValue() = ABI.makeIInkDrawingAttributes5(pointer.getPointer(0))

    public fun setValue(value: IInkDrawingAttributes5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkDrawingAttributes5 {
    public val __1946136556_Ptr: Pointer?

    public val _1946136556_VtblPtr: Pointer?
      get() = __1946136556_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ModelerAttributes(): InkModelerAttributes? {
      val fnPtr = _1946136556_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkModelerAttributes>()
      val hr = fn.invokeHR(arrayOf(__1946136556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkModelerAttributes>(result.getValue())
      return resultValue
    }
  }

  public class IInkDrawingAttributes5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1946136556_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkDrawingAttributes5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d11aa0bb07754852ae6441143a7ae6c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkDrawingAttributes5(ptr: Pointer?): WithDefault =
        IInkDrawingAttributes5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkDrawingAttributes5 {
      val address = segment.toRawLongValue()
      return makeIInkDrawingAttributes5(Pointer(address))
    }

    public override fun toNative(obj: IInkDrawingAttributes5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1946136556_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkDrawingAttributes5): Array<IInkDrawingAttributes5?> =
        (elements as
        Array<IInkDrawingAttributes5?>).castToImpl<IInkDrawingAttributes5,IInkDrawingAttributes5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkDrawingAttributes5?> =
        arrayOfNulls<IInkDrawingAttributes5_Impl>(size) as Array<IInkDrawingAttributes5?>
  }
}
