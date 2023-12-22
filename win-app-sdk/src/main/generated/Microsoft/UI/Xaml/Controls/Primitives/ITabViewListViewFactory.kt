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

@ABIMarker(ITabViewListViewFactory.ABI::class)
@Signature("{8a084fdd-86f0-51ee-98df-5fbd0b5669be}")
@Guid("8a084fdd86f051ee98df5fbd0b5669be")
@WinRTInterface("8a084fdd86f051ee98df5fbd0b5669be")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewListViewFactory.ByReference::class)
public interface ITabViewListViewFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): TabViewListView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewListViewFactory> {
    public override fun getValue() = ABI.makeITabViewListViewFactory(pointer.getPointer(0))

    public fun setValue(value: ITabViewListViewFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewListViewFactory {
    public val __1066573182_Ptr: Pointer?

    public val _1066573182_VtblPtr: Pointer?
      get() = __1066573182_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        TabViewListView? {
      val fnPtr = _1066573182_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TabViewListView>()
      val hr = fn.invokeHR(arrayOf(__1066573182_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TabViewListView>(result.getValue())
      return resultValue
    }
  }

  public class ITabViewListViewFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1066573182_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewListViewFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8a084fdd86f051ee98df5fbd0b5669be")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewListViewFactory(ptr: Pointer?): WithDefault =
        ITabViewListViewFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewListViewFactory {
      val address = segment.toRawLongValue()
      return makeITabViewListViewFactory(Pointer(address))
    }

    public override fun toNative(obj: ITabViewListViewFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1066573182_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewListViewFactory): Array<ITabViewListViewFactory?>
        = (elements as
        Array<ITabViewListViewFactory?>).castToImpl<ITabViewListViewFactory,ITabViewListViewFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewListViewFactory?> =
        arrayOfNulls<ITabViewListViewFactory_Impl>(size) as Array<ITabViewListViewFactory?>
  }
}
