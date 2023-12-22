package Microsoft.UI.Xaml.Markup

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

@ABIMarker(IMarkupExtensionFactory.ABI::class)
@Signature("{20651afa-5f3a-5f0c-adb1-b6551f53a6a0}")
@Guid("20651afa5f3a5f0cadb1b6551f53a6a0")
@WinRTInterface("20651afa5f3a5f0cadb1b6551f53a6a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMarkupExtensionFactory.ByReference::class)
public interface IMarkupExtensionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): MarkupExtension?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMarkupExtensionFactory> {
    public override fun getValue() = ABI.makeIMarkupExtensionFactory(pointer.getPointer(0))

    public fun setValue(value: IMarkupExtensionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMarkupExtensionFactory {
    public val __696457752_Ptr: Pointer?

    public val _696457752_VtblPtr: Pointer?
      get() = __696457752_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MarkupExtension? {
      val fnPtr = _696457752_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MarkupExtension>()
      val hr = fn.invokeHR(arrayOf(__696457752_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MarkupExtension>(result.getValue())
      return resultValue
    }
  }

  public class IMarkupExtensionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __696457752_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMarkupExtensionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20651afa5f3a5f0cadb1b6551f53a6a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMarkupExtensionFactory(ptr: Pointer?): WithDefault =
        IMarkupExtensionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMarkupExtensionFactory {
      val address = segment.toRawLongValue()
      return makeIMarkupExtensionFactory(Pointer(address))
    }

    public override fun toNative(obj: IMarkupExtensionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__696457752_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMarkupExtensionFactory): Array<IMarkupExtensionFactory?>
        = (elements as
        Array<IMarkupExtensionFactory?>).castToImpl<IMarkupExtensionFactory,IMarkupExtensionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMarkupExtensionFactory?> =
        arrayOfNulls<IMarkupExtensionFactory_Impl>(size) as Array<IMarkupExtensionFactory?>
  }
}
