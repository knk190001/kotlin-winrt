package Microsoft.UI.Xaml

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

@ABIMarker(IElementFactoryGetArgsFactory.ABI::class)
@Signature("{a88e401b-9fe5-5960-87a3-89a3cfe2531c}")
@Guid("a88e401b9fe5596087a389a3cfe2531c")
@WinRTInterface("a88e401b9fe5596087a389a3cfe2531c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IElementFactoryGetArgsFactory.ByReference::class)
public interface IElementFactoryGetArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      ElementFactoryGetArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IElementFactoryGetArgsFactory> {
    public override fun getValue() = ABI.makeIElementFactoryGetArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IElementFactoryGetArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IElementFactoryGetArgsFactory {
    public val __1592779252_Ptr: Pointer?

    public val _1592779252_VtblPtr: Pointer?
      get() = __1592779252_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ElementFactoryGetArgs? {
      val fnPtr = _1592779252_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ElementFactoryGetArgs>()
      val hr = fn.invokeHR(arrayOf(__1592779252_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ElementFactoryGetArgs>(result.getValue())
      return resultValue
    }
  }

  public class IElementFactoryGetArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1592779252_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IElementFactoryGetArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a88e401b9fe5596087a389a3cfe2531c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIElementFactoryGetArgsFactory(ptr: Pointer?): WithDefault =
        IElementFactoryGetArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IElementFactoryGetArgsFactory {
      val address = segment.toRawLongValue()
      return makeIElementFactoryGetArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IElementFactoryGetArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1592779252_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IElementFactoryGetArgsFactory):
        Array<IElementFactoryGetArgsFactory?> = (elements as
        Array<IElementFactoryGetArgsFactory?>).castToImpl<IElementFactoryGetArgsFactory,IElementFactoryGetArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IElementFactoryGetArgsFactory?> =
        arrayOfNulls<IElementFactoryGetArgsFactory_Impl>(size) as
        Array<IElementFactoryGetArgsFactory?>
  }
}
