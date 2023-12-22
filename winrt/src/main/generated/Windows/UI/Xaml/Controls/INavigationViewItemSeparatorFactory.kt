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

@ABIMarker(INavigationViewItemSeparatorFactory.ABI::class)
@Signature("{71cf3a66-db86-49e0-8154-5fd356aedec0}")
@Guid("71cf3a66db8649e081545fd356aedec0")
@WinRTInterface("71cf3a66db8649e081545fd356aedec0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemSeparatorFactory.ByReference::class)
public interface INavigationViewItemSeparatorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      NavigationViewItemSeparator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemSeparatorFactory> {
    public override fun getValue() =
        ABI.makeINavigationViewItemSeparatorFactory(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemSeparatorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemSeparatorFactory {
    public val __1359689005_Ptr: Pointer?

    public val _1359689005_VtblPtr: Pointer?
      get() = __1359689005_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        NavigationViewItemSeparator? {
      val fnPtr = _1359689005_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewItemSeparator>()
      val hr = fn.invokeHR(arrayOf(__1359689005_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewItemSeparator>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewItemSeparatorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1359689005_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemSeparatorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71cf3a66db8649e081545fd356aedec0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemSeparatorFactory(ptr: Pointer?): WithDefault =
        INavigationViewItemSeparatorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemSeparatorFactory {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemSeparatorFactory(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemSeparatorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1359689005_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemSeparatorFactory):
        Array<INavigationViewItemSeparatorFactory?> = (elements as
        Array<INavigationViewItemSeparatorFactory?>).castToImpl<INavigationViewItemSeparatorFactory,INavigationViewItemSeparatorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemSeparatorFactory?> =
        arrayOfNulls<INavigationViewItemSeparatorFactory_Impl>(size) as
        Array<INavigationViewItemSeparatorFactory?>
  }
}
