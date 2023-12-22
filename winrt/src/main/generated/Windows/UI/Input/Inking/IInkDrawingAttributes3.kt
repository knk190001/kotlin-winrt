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

@ABIMarker(IInkDrawingAttributes3.ABI::class)
@Signature("{72020002-7d5b-4690-8af4-e664cbe2b74f}")
@Guid("720200027d5b46908af4e664cbe2b74f")
@WinRTInterface("720200027d5b46908af4e664cbe2b74f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkDrawingAttributes3.ByReference::class)
public interface IInkDrawingAttributes3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): InkDrawingAttributesKind?

  @InterfaceMethod(1)
  public fun get_PencilProperties(): InkDrawingAttributesPencilProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkDrawingAttributes3> {
    public override fun getValue() = ABI.makeIInkDrawingAttributes3(pointer.getPointer(0))

    public fun setValue(value: IInkDrawingAttributes3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkDrawingAttributes3 {
    public val __1946136554_Ptr: Pointer?

    public val _1946136554_VtblPtr: Pointer?
      get() = __1946136554_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): InkDrawingAttributesKind? {
      val fnPtr = _1946136554_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkDrawingAttributesKind>()
      val hr = fn.invokeHR(arrayOf(__1946136554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkDrawingAttributesKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PencilProperties(): InkDrawingAttributesPencilProperties? {
      val fnPtr = _1946136554_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkDrawingAttributesPencilProperties>()
      val hr = fn.invokeHR(arrayOf(__1946136554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkDrawingAttributesPencilProperties>(result.getValue())
      return resultValue
    }
  }

  public class IInkDrawingAttributes3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1946136554_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkDrawingAttributes3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("720200027d5b46908af4e664cbe2b74f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkDrawingAttributes3(ptr: Pointer?): WithDefault =
        IInkDrawingAttributes3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkDrawingAttributes3 {
      val address = segment.toRawLongValue()
      return makeIInkDrawingAttributes3(Pointer(address))
    }

    public override fun toNative(obj: IInkDrawingAttributes3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1946136554_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkDrawingAttributes3): Array<IInkDrawingAttributes3?> =
        (elements as
        Array<IInkDrawingAttributes3?>).castToImpl<IInkDrawingAttributes3,IInkDrawingAttributes3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkDrawingAttributes3?> =
        arrayOfNulls<IInkDrawingAttributes3_Impl>(size) as Array<IInkDrawingAttributes3?>
  }
}
