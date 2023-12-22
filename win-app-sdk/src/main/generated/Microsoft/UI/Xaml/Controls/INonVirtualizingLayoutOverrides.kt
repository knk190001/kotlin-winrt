package Microsoft.UI.Xaml.Controls

import Windows.Foundation.Size
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

@ABIMarker(INonVirtualizingLayoutOverrides.ABI::class)
@Signature("{3c28b831-35c1-5182-a843-a43f339b6687}")
@Guid("3c28b83135c15182a843a43f339b6687")
@WinRTInterface("3c28b83135c15182a843a43f339b6687")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INonVirtualizingLayoutOverrides.ByReference::class)
public interface INonVirtualizingLayoutOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InitializeForContextCore(context: NonVirtualizingLayoutContext?): Unit

  @InterfaceMethod(1)
  public fun UninitializeForContextCore(context: NonVirtualizingLayoutContext?): Unit

  @InterfaceMethod(2)
  public fun MeasureOverride(context: NonVirtualizingLayoutContext?, availableSize: Size?): Size?

  @InterfaceMethod(3)
  public fun ArrangeOverride(context: NonVirtualizingLayoutContext?, finalSize: Size?): Size?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INonVirtualizingLayoutOverrides> {
    public override fun getValue() = ABI.makeINonVirtualizingLayoutOverrides(pointer.getPointer(0))

    public fun setValue(value: INonVirtualizingLayoutOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INonVirtualizingLayoutOverrides {
    public val __1731583185_Ptr: Pointer?

    public val _1731583185_VtblPtr: Pointer?
      get() = __1731583185_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InitializeForContextCore(context: NonVirtualizingLayoutContext?): Unit {
      val fnPtr = _1731583185_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1731583185_Ptr, marshalToNative(context),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun UninitializeForContextCore(context: NonVirtualizingLayoutContext?): Unit {
      val fnPtr = _1731583185_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1731583185_Ptr, marshalToNative(context),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun MeasureOverride(context: NonVirtualizingLayoutContext?,
        availableSize: Size?): Size? {
      val fnPtr = _1731583185_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1731583185_Ptr, marshalToNative(context),
          marshalToNative(availableSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ArrangeOverride(context: NonVirtualizingLayoutContext?, finalSize: Size?):
        Size? {
      val fnPtr = _1731583185_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1731583185_Ptr, marshalToNative(context),
          marshalToNative(finalSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }
  }

  public class INonVirtualizingLayoutOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1731583185_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INonVirtualizingLayoutOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c28b83135c15182a843a43f339b6687")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINonVirtualizingLayoutOverrides(ptr: Pointer?): WithDefault =
        INonVirtualizingLayoutOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INonVirtualizingLayoutOverrides {
      val address = segment.toRawLongValue()
      return makeINonVirtualizingLayoutOverrides(Pointer(address))
    }

    public override fun toNative(obj: INonVirtualizingLayoutOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1731583185_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INonVirtualizingLayoutOverrides):
        Array<INonVirtualizingLayoutOverrides?> = (elements as
        Array<INonVirtualizingLayoutOverrides?>).castToImpl<INonVirtualizingLayoutOverrides,INonVirtualizingLayoutOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INonVirtualizingLayoutOverrides?> =
        arrayOfNulls<INonVirtualizingLayoutOverrides_Impl>(size) as
        Array<INonVirtualizingLayoutOverrides?>
  }
}
