package Windows.UI.Xaml.Media

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

@ABIMarker(IXamlLightFactory.ABI::class)
@Signature("{87ded768-3055-43b8-8ef6-798dc4c2329a}")
@Guid("87ded768305543b88ef6798dc4c2329a")
@WinRTInterface("87ded768305543b88ef6798dc4c2329a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlLightFactory.ByReference::class)
public interface IXamlLightFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): XamlLight?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlLightFactory> {
    public override fun getValue() = ABI.makeIXamlLightFactory(pointer.getPointer(0))

    public fun setValue(value: IXamlLightFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlLightFactory {
    public val __63084408_Ptr: Pointer?

    public val _63084408_VtblPtr: Pointer?
      get() = __63084408_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        XamlLight? {
      val fnPtr = _63084408_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlLight>()
      val hr = fn.invokeHR(arrayOf(__63084408_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlLight>(result.getValue())
      return resultValue
    }
  }

  public class IXamlLightFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __63084408_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlLightFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("87ded768305543b88ef6798dc4c2329a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlLightFactory(ptr: Pointer?): WithDefault = IXamlLightFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlLightFactory {
      val address = segment.toRawLongValue()
      return makeIXamlLightFactory(Pointer(address))
    }

    public override fun toNative(obj: IXamlLightFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__63084408_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlLightFactory): Array<IXamlLightFactory?> = (elements
        as Array<IXamlLightFactory?>).castToImpl<IXamlLightFactory,IXamlLightFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlLightFactory?> =
        arrayOfNulls<IXamlLightFactory_Impl>(size) as Array<IXamlLightFactory?>
  }
}
