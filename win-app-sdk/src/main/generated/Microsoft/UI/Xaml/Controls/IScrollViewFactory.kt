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

@ABIMarker(IScrollViewFactory.ABI::class)
@Signature("{f3547344-22e4-5e6c-9ece-66504ef733ed}")
@Guid("f354734422e45e6c9ece66504ef733ed")
@WinRTInterface("f354734422e45e6c9ece66504ef733ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollViewFactory.ByReference::class)
public interface IScrollViewFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ScrollView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollViewFactory> {
    public override fun getValue() = ABI.makeIScrollViewFactory(pointer.getPointer(0))

    public fun setValue(value: IScrollViewFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollViewFactory {
    public val __1985658191_Ptr: Pointer?

    public val _1985658191_VtblPtr: Pointer?
      get() = __1985658191_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ScrollView? {
      val fnPtr = _1985658191_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollView>()
      val hr = fn.invokeHR(arrayOf(__1985658191_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollView>(result.getValue())
      return resultValue
    }
  }

  public class IScrollViewFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1985658191_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollViewFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f354734422e45e6c9ece66504ef733ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollViewFactory(ptr: Pointer?): WithDefault = IScrollViewFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollViewFactory {
      val address = segment.toRawLongValue()
      return makeIScrollViewFactory(Pointer(address))
    }

    public override fun toNative(obj: IScrollViewFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1985658191_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollViewFactory): Array<IScrollViewFactory?> =
        (elements as
        Array<IScrollViewFactory?>).castToImpl<IScrollViewFactory,IScrollViewFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollViewFactory?> =
        arrayOfNulls<IScrollViewFactory_Impl>(size) as Array<IScrollViewFactory?>
  }
}
