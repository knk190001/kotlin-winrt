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

@ABIMarker(IHyperlinkButtonFactory.ABI::class)
@Signature("{01f775ea-c5ed-514a-a23d-89c494a8f09d}")
@Guid("01f775eac5ed514aa23d89c494a8f09d")
@WinRTInterface("01f775eac5ed514aa23d89c494a8f09d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHyperlinkButtonFactory.ByReference::class)
public interface IHyperlinkButtonFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): HyperlinkButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHyperlinkButtonFactory> {
    public override fun getValue() = ABI.makeIHyperlinkButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IHyperlinkButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHyperlinkButtonFactory {
    public val __617963833_Ptr: Pointer?

    public val _617963833_VtblPtr: Pointer?
      get() = __617963833_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        HyperlinkButton? {
      val fnPtr = _617963833_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HyperlinkButton>()
      val hr = fn.invokeHR(arrayOf(__617963833_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HyperlinkButton>(result.getValue())
      return resultValue
    }
  }

  public class IHyperlinkButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __617963833_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHyperlinkButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("01f775eac5ed514aa23d89c494a8f09d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHyperlinkButtonFactory(ptr: Pointer?): WithDefault =
        IHyperlinkButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHyperlinkButtonFactory {
      val address = segment.toRawLongValue()
      return makeIHyperlinkButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IHyperlinkButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__617963833_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHyperlinkButtonFactory): Array<IHyperlinkButtonFactory?>
        = (elements as
        Array<IHyperlinkButtonFactory?>).castToImpl<IHyperlinkButtonFactory,IHyperlinkButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHyperlinkButtonFactory?> =
        arrayOfNulls<IHyperlinkButtonFactory_Impl>(size) as Array<IHyperlinkButtonFactory?>
  }
}
