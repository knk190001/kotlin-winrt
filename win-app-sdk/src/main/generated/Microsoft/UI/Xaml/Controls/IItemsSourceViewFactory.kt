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

@ABIMarker(IItemsSourceViewFactory.ABI::class)
@Signature("{aadc6fdd-eb00-5e58-b95d-120f891d733f}")
@Guid("aadc6fddeb005e58b95d120f891d733f")
@WinRTInterface("aadc6fddeb005e58b95d120f891d733f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsSourceViewFactory.ByReference::class)
public interface IItemsSourceViewFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    source: IUnknown?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ItemsSourceView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsSourceViewFactory> {
    public override fun getValue() = ABI.makeIItemsSourceViewFactory(pointer.getPointer(0))

    public fun setValue(value: IItemsSourceViewFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsSourceViewFactory {
    public val __481891791_Ptr: Pointer?

    public val _481891791_VtblPtr: Pointer?
      get() = __481891791_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      source: IUnknown?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ItemsSourceView? {
      val fnPtr = _481891791_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemsSourceView>()
      val hr = fn.invokeHR(arrayOf(__481891791_Ptr, marshalToNative(source),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemsSourceView>(result.getValue())
      return resultValue
    }
  }

  public class IItemsSourceViewFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __481891791_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsSourceViewFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aadc6fddeb005e58b95d120f891d733f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsSourceViewFactory(ptr: Pointer?): WithDefault =
        IItemsSourceViewFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsSourceViewFactory {
      val address = segment.toRawLongValue()
      return makeIItemsSourceViewFactory(Pointer(address))
    }

    public override fun toNative(obj: IItemsSourceViewFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__481891791_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsSourceViewFactory): Array<IItemsSourceViewFactory?>
        = (elements as
        Array<IItemsSourceViewFactory?>).castToImpl<IItemsSourceViewFactory,IItemsSourceViewFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsSourceViewFactory?> =
        arrayOfNulls<IItemsSourceViewFactory_Impl>(size) as Array<IItemsSourceViewFactory?>
  }
}
