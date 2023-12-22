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

@ABIMarker(IListViewHeaderItemFactory.ABI::class)
@Signature("{68d2c96a-96b0-4f08-a7a5-f1086720a0fa}")
@Guid("68d2c96a96b04f08a7a5f1086720a0fa")
@WinRTInterface("68d2c96a96b04f08a7a5f1086720a0fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewHeaderItemFactory.ByReference::class)
public interface IListViewHeaderItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      ListViewHeaderItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewHeaderItemFactory> {
    public override fun getValue() = ABI.makeIListViewHeaderItemFactory(pointer.getPointer(0))

    public fun setValue(value: IListViewHeaderItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewHeaderItemFactory {
    public val __1895896341_Ptr: Pointer?

    public val _1895896341_VtblPtr: Pointer?
      get() = __1895896341_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ListViewHeaderItem? {
      val fnPtr = _1895896341_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewHeaderItem>()
      val hr = fn.invokeHR(arrayOf(__1895896341_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewHeaderItem>(result.getValue())
      return resultValue
    }
  }

  public class IListViewHeaderItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1895896341_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewHeaderItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("68d2c96a96b04f08a7a5f1086720a0fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewHeaderItemFactory(ptr: Pointer?): WithDefault =
        IListViewHeaderItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewHeaderItemFactory {
      val address = segment.toRawLongValue()
      return makeIListViewHeaderItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IListViewHeaderItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1895896341_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewHeaderItemFactory):
        Array<IListViewHeaderItemFactory?> = (elements as
        Array<IListViewHeaderItemFactory?>).castToImpl<IListViewHeaderItemFactory,IListViewHeaderItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewHeaderItemFactory?> =
        arrayOfNulls<IListViewHeaderItemFactory_Impl>(size) as Array<IListViewHeaderItemFactory?>
  }
}
