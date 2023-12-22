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

@ABIMarker(IItemsViewFactory.ABI::class)
@Signature("{aeeec7b9-3cc8-52df-8e2e-99a295c253aa}")
@Guid("aeeec7b93cc852df8e2e99a295c253aa")
@WinRTInterface("aeeec7b93cc852df8e2e99a295c253aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsViewFactory.ByReference::class)
public interface IItemsViewFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ItemsView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsViewFactory> {
    public override fun getValue() = ABI.makeIItemsViewFactory(pointer.getPointer(0))

    public fun setValue(value: IItemsViewFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsViewFactory {
    public val __516685172_Ptr: Pointer?

    public val _516685172_VtblPtr: Pointer?
      get() = __516685172_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ItemsView? {
      val fnPtr = _516685172_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemsView>()
      val hr = fn.invokeHR(arrayOf(__516685172_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemsView>(result.getValue())
      return resultValue
    }
  }

  public class IItemsViewFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __516685172_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsViewFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aeeec7b93cc852df8e2e99a295c253aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsViewFactory(ptr: Pointer?): WithDefault = IItemsViewFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsViewFactory {
      val address = segment.toRawLongValue()
      return makeIItemsViewFactory(Pointer(address))
    }

    public override fun toNative(obj: IItemsViewFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__516685172_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsViewFactory): Array<IItemsViewFactory?> = (elements
        as Array<IItemsViewFactory?>).castToImpl<IItemsViewFactory,IItemsViewFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsViewFactory?> =
        arrayOfNulls<IItemsViewFactory_Impl>(size) as Array<IItemsViewFactory?>
  }
}
