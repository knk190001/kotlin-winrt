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

@ABIMarker(IShapeVisual.ABI::class)
@Signature("{a911c80b-a5a5-5aca-b8ff-c43f08f06143}")
@Guid("a911c80ba5a55acab8ffc43f08f06143")
@WinRTInterface("a911c80ba5a55acab8ffc43f08f06143")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShapeVisual.ByReference::class)
public interface IShapeVisual : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Shapes(): CompositionShapeCollection?

  @InterfaceMethod(1)
  public fun get_ViewBox(): CompositionViewBox?

  @InterfaceMethod(2)
  public fun put_ViewBox(value: CompositionViewBox?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IShapeVisual> {
    public override fun getValue() = ABI.makeIShapeVisual(pointer.getPointer(0))

    public fun setValue(value: IShapeVisual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShapeVisual {
    public val __1428628616_Ptr: Pointer?

    public val _1428628616_VtblPtr: Pointer?
      get() = __1428628616_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Shapes(): CompositionShapeCollection? {
      val fnPtr = _1428628616_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionShapeCollection>()
      val hr = fn.invokeHR(arrayOf(__1428628616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionShapeCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ViewBox(): CompositionViewBox? {
      val fnPtr = _1428628616_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionViewBox>()
      val hr = fn.invokeHR(arrayOf(__1428628616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionViewBox>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_ViewBox(value: CompositionViewBox?): Unit {
      val fnPtr = _1428628616_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1428628616_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IShapeVisual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1428628616_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShapeVisual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a911c80ba5a55acab8ffc43f08f06143")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShapeVisual(ptr: Pointer?): WithDefault = IShapeVisual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShapeVisual {
      val address = segment.toRawLongValue()
      return makeIShapeVisual(Pointer(address))
    }

    public override fun toNative(obj: IShapeVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1428628616_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShapeVisual): Array<IShapeVisual?> = (elements as
        Array<IShapeVisual?>).castToImpl<IShapeVisual,IShapeVisual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShapeVisual?> =
        arrayOfNulls<IShapeVisual_Impl>(size) as Array<IShapeVisual?>
  }
}
