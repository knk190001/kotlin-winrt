package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IGridViewItemPresenterFactory.ABI::class)
@Signature("{d1f47760-c353-5a10-8a6b-9a1e3b52f934}")
@Guid("d1f47760c3535a108a6b9a1e3b52f934")
@WinRTInterface("d1f47760c3535a108a6b9a1e3b52f934")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridViewItemPresenterFactory.ByReference::class)
public interface IGridViewItemPresenterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      GridViewItemPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridViewItemPresenterFactory> {
    public override fun getValue() = ABI.makeIGridViewItemPresenterFactory(pointer.getPointer(0))

    public fun setValue(value: IGridViewItemPresenterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridViewItemPresenterFactory {
    public val __29546225_Ptr: Pointer?

    public val _29546225_VtblPtr: Pointer?
      get() = __29546225_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        GridViewItemPresenter? {
      val fnPtr = _29546225_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridViewItemPresenter>()
      val hr = fn.invokeHR(arrayOf(__29546225_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridViewItemPresenter>(result.getValue())
      return resultValue
    }
  }

  public class IGridViewItemPresenterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __29546225_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridViewItemPresenterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d1f47760c3535a108a6b9a1e3b52f934")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridViewItemPresenterFactory(ptr: Pointer?): WithDefault =
        IGridViewItemPresenterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridViewItemPresenterFactory {
      val address = segment.toRawLongValue()
      return makeIGridViewItemPresenterFactory(Pointer(address))
    }

    public override fun toNative(obj: IGridViewItemPresenterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__29546225_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridViewItemPresenterFactory):
        Array<IGridViewItemPresenterFactory?> = (elements as
        Array<IGridViewItemPresenterFactory?>).castToImpl<IGridViewItemPresenterFactory,IGridViewItemPresenterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridViewItemPresenterFactory?> =
        arrayOfNulls<IGridViewItemPresenterFactory_Impl>(size) as
        Array<IGridViewItemPresenterFactory?>
  }
}
