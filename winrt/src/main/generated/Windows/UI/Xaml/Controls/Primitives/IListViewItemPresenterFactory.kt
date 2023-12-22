package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IListViewItemPresenterFactory.ABI::class)
@Signature("{e0777cfd-f7e4-4a67-9ac0-a994fcacd020}")
@Guid("e0777cfdf7e44a679ac0a994fcacd020")
@WinRTInterface("e0777cfdf7e44a679ac0a994fcacd020")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItemPresenterFactory.ByReference::class)
public interface IListViewItemPresenterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      ListViewItemPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemPresenterFactory> {
    public override fun getValue() = ABI.makeIListViewItemPresenterFactory(pointer.getPointer(0))

    public fun setValue(value: IListViewItemPresenterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemPresenterFactory {
    public val __988340140_Ptr: Pointer?

    public val _988340140_VtblPtr: Pointer?
      get() = __988340140_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ListViewItemPresenter? {
      val fnPtr = _988340140_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewItemPresenter>()
      val hr = fn.invokeHR(arrayOf(__988340140_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewItemPresenter>(result.getValue())
      return resultValue
    }
  }

  public class IListViewItemPresenterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __988340140_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemPresenterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e0777cfdf7e44a679ac0a994fcacd020")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemPresenterFactory(ptr: Pointer?): WithDefault =
        IListViewItemPresenterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemPresenterFactory {
      val address = segment.toRawLongValue()
      return makeIListViewItemPresenterFactory(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemPresenterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__988340140_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItemPresenterFactory):
        Array<IListViewItemPresenterFactory?> = (elements as
        Array<IListViewItemPresenterFactory?>).castToImpl<IListViewItemPresenterFactory,IListViewItemPresenterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItemPresenterFactory?> =
        arrayOfNulls<IListViewItemPresenterFactory_Impl>(size) as
        Array<IListViewItemPresenterFactory?>
  }
}
