package Windows.UI.Xaml.Controls

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

@ABIMarker(IItemsControlFactory.ABI::class)
@Signature("{f7bbc359-f8fd-471c-bcb2-2c74be8ebf8c}")
@Guid("f7bbc359f8fd471cbcb22c74be8ebf8c")
@WinRTInterface("f7bbc359f8fd471cbcb22c74be8ebf8c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsControlFactory.ByReference::class)
public interface IItemsControlFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ItemsControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsControlFactory> {
    public override fun getValue() = ABI.makeIItemsControlFactory(pointer.getPointer(0))

    public fun setValue(value: IItemsControlFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsControlFactory {
    public val __293483727_Ptr: Pointer?

    public val _293483727_VtblPtr: Pointer?
      get() = __293483727_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ItemsControl? {
      val fnPtr = _293483727_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemsControl>()
      val hr = fn.invokeHR(arrayOf(__293483727_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemsControl>(result.getValue())
      return resultValue
    }
  }

  public class IItemsControlFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __293483727_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsControlFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f7bbc359f8fd471cbcb22c74be8ebf8c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsControlFactory(ptr: Pointer?): WithDefault = IItemsControlFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsControlFactory {
      val address = segment.toRawLongValue()
      return makeIItemsControlFactory(Pointer(address))
    }

    public override fun toNative(obj: IItemsControlFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__293483727_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsControlFactory): Array<IItemsControlFactory?> =
        (elements as
        Array<IItemsControlFactory?>).castToImpl<IItemsControlFactory,IItemsControlFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsControlFactory?> =
        arrayOfNulls<IItemsControlFactory_Impl>(size) as Array<IItemsControlFactory?>
  }
}
