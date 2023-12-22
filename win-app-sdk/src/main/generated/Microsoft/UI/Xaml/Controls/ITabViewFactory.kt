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

@ABIMarker(ITabViewFactory.ABI::class)
@Signature("{e7e83685-eedf-5106-9429-884435ab166b}")
@Guid("e7e83685eedf51069429884435ab166b")
@WinRTInterface("e7e83685eedf51069429884435ab166b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewFactory.ByReference::class)
public interface ITabViewFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): TabView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewFactory> {
    public override fun getValue() = ABI.makeITabViewFactory(pointer.getPointer(0))

    public fun setValue(value: ITabViewFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewFactory {
    public val __1466586793_Ptr: Pointer?

    public val _1466586793_VtblPtr: Pointer?
      get() = __1466586793_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        TabView? {
      val fnPtr = _1466586793_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TabView>()
      val hr = fn.invokeHR(arrayOf(__1466586793_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TabView>(result.getValue())
      return resultValue
    }
  }

  public class ITabViewFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1466586793_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e7e83685eedf51069429884435ab166b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewFactory(ptr: Pointer?): WithDefault = ITabViewFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewFactory {
      val address = segment.toRawLongValue()
      return makeITabViewFactory(Pointer(address))
    }

    public override fun toNative(obj: ITabViewFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1466586793_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewFactory): Array<ITabViewFactory?> = (elements as
        Array<ITabViewFactory?>).castToImpl<ITabViewFactory,ITabViewFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewFactory?> =
        arrayOfNulls<ITabViewFactory_Impl>(size) as Array<ITabViewFactory?>
  }
}
