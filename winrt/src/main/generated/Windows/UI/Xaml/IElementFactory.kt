package Windows.UI.Xaml

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IElementFactory.ABI::class)
@Signature("{17d2ad90-1370-55c8-80e1-78b49004a9e1}")
@Guid("17d2ad90137055c880e178b49004a9e1")
@WinRTInterface("17d2ad90137055c880e178b49004a9e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IElementFactory.ByReference::class)
public interface IElementFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetElement(args: ElementFactoryGetArgs?): UIElement?

  @InterfaceMethod(1)
  public fun RecycleElement(args: ElementFactoryRecycleArgs?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IElementFactory> {
    public override fun getValue() = ABI.makeIElementFactory(pointer.getPointer(0))

    public fun setValue(value: IElementFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IElementFactory {
    public val __1017931072_Ptr: Pointer?

    public val _1017931072_VtblPtr: Pointer?
      get() = __1017931072_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetElement(args: ElementFactoryGetArgs?): UIElement? {
      val fnPtr = _1017931072_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1017931072_Ptr, marshalToNative(args), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RecycleElement(args: ElementFactoryRecycleArgs?): Unit {
      val fnPtr = _1017931072_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1017931072_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IElementFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1017931072_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IElementFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17d2ad90137055c880e178b49004a9e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIElementFactory(ptr: Pointer?): WithDefault = IElementFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IElementFactory {
      val address = segment.toRawLongValue()
      return makeIElementFactory(Pointer(address))
    }

    public override fun toNative(obj: IElementFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1017931072_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IElementFactory): Array<IElementFactory?> = (elements as
        Array<IElementFactory?>).castToImpl<IElementFactory,IElementFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IElementFactory?> =
        arrayOfNulls<IElementFactory_Impl>(size) as Array<IElementFactory?>
  }
}
