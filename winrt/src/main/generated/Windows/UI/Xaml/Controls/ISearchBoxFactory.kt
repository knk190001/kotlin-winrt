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

@ABIMarker(ISearchBoxFactory.ABI::class)
@Signature("{cd743f6d-8685-46b4-9ddd-202f6941b701}")
@Guid("cd743f6d868546b49ddd202f6941b701")
@WinRTInterface("cd743f6d868546b49ddd202f6941b701")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchBoxFactory.ByReference::class)
public interface ISearchBoxFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): SearchBox?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchBoxFactory> {
    public override fun getValue() = ABI.makeISearchBoxFactory(pointer.getPointer(0))

    public fun setValue(value: ISearchBoxFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchBoxFactory {
    public val __1237568349_Ptr: Pointer?

    public val _1237568349_VtblPtr: Pointer?
      get() = __1237568349_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        SearchBox? {
      val fnPtr = _1237568349_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SearchBox>()
      val hr = fn.invokeHR(arrayOf(__1237568349_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SearchBox>(result.getValue())
      return resultValue
    }
  }

  public class ISearchBoxFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1237568349_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchBoxFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd743f6d868546b49ddd202f6941b701")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchBoxFactory(ptr: Pointer?): WithDefault = ISearchBoxFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchBoxFactory {
      val address = segment.toRawLongValue()
      return makeISearchBoxFactory(Pointer(address))
    }

    public override fun toNative(obj: ISearchBoxFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1237568349_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchBoxFactory): Array<ISearchBoxFactory?> = (elements
        as Array<ISearchBoxFactory?>).castToImpl<ISearchBoxFactory,ISearchBoxFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchBoxFactory?> =
        arrayOfNulls<ISearchBoxFactory_Impl>(size) as Array<ISearchBoxFactory?>
  }
}
