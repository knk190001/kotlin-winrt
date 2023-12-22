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

@ABIMarker(IContentControlFactory.ABI::class)
@Signature("{ab017b19-196e-4ed5-a27f-55c58fb1673f}")
@Guid("ab017b19196e4ed5a27f55c58fb1673f")
@WinRTInterface("ab017b19196e4ed5a27f55c58fb1673f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentControlFactory.ByReference::class)
public interface IContentControlFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ContentControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentControlFactory> {
    public override fun getValue() = ABI.makeIContentControlFactory(pointer.getPointer(0))

    public fun setValue(value: IContentControlFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentControlFactory {
    public val __1527371562_Ptr: Pointer?

    public val _1527371562_VtblPtr: Pointer?
      get() = __1527371562_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ContentControl? {
      val fnPtr = _1527371562_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentControl>()
      val hr = fn.invokeHR(arrayOf(__1527371562_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentControl>(result.getValue())
      return resultValue
    }
  }

  public class IContentControlFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1527371562_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentControlFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab017b19196e4ed5a27f55c58fb1673f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentControlFactory(ptr: Pointer?): WithDefault =
        IContentControlFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentControlFactory {
      val address = segment.toRawLongValue()
      return makeIContentControlFactory(Pointer(address))
    }

    public override fun toNative(obj: IContentControlFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1527371562_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentControlFactory): Array<IContentControlFactory?> =
        (elements as
        Array<IContentControlFactory?>).castToImpl<IContentControlFactory,IContentControlFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentControlFactory?> =
        arrayOfNulls<IContentControlFactory_Impl>(size) as Array<IContentControlFactory?>
  }
}
