package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IGridViewItemFactory.ABI::class)
@Signature("{96a56215-230c-5efb-8401-0ce01617c657}")
@Guid("96a56215230c5efb84010ce01617c657")
@WinRTInterface("96a56215230c5efb84010ce01617c657")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridViewItemFactory.ByReference::class)
public interface IGridViewItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): GridViewItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridViewItemFactory> {
    public override fun getValue() = ABI.makeIGridViewItemFactory(pointer.getPointer(0))

    public fun setValue(value: IGridViewItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridViewItemFactory {
    public val __1552927419_Ptr: Pointer?

    public val _1552927419_VtblPtr: Pointer?
      get() = __1552927419_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        GridViewItem? {
      val fnPtr = _1552927419_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridViewItem>()
      val hr = fn.invokeHR(arrayOf(__1552927419_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridViewItem>(result.getValue())
      return resultValue
    }
  }

  public class IGridViewItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1552927419_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridViewItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96a56215230c5efb84010ce01617c657")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridViewItemFactory(ptr: Pointer?): WithDefault = IGridViewItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridViewItemFactory {
      val address = segment.toRawLongValue()
      return makeIGridViewItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IGridViewItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1552927419_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridViewItemFactory): Array<IGridViewItemFactory?> =
        (elements as
        Array<IGridViewItemFactory?>).castToImpl<IGridViewItemFactory,IGridViewItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridViewItemFactory?> =
        arrayOfNulls<IGridViewItemFactory_Impl>(size) as Array<IGridViewItemFactory?>
  }
}
