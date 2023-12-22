package Windows.UI.Xaml.Printing

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

@ABIMarker(IPrintDocumentFactory.ABI::class)
@Signature("{fb87b18f-2606-4a2f-99d4-a7cdbc35d7c7}")
@Guid("fb87b18f26064a2f99d4a7cdbc35d7c7")
@WinRTInterface("fb87b18f26064a2f99d4a7cdbc35d7c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintDocumentFactory.ByReference::class)
public interface IPrintDocumentFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): PrintDocument?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintDocumentFactory> {
    public override fun getValue() = ABI.makeIPrintDocumentFactory(pointer.getPointer(0))

    public fun setValue(value: IPrintDocumentFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintDocumentFactory {
    public val __242049761_Ptr: Pointer?

    public val _242049761_VtblPtr: Pointer?
      get() = __242049761_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        PrintDocument? {
      val fnPtr = _242049761_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintDocument>()
      val hr = fn.invokeHR(arrayOf(__242049761_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintDocument>(result.getValue())
      return resultValue
    }
  }

  public class IPrintDocumentFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __242049761_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintDocumentFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb87b18f26064a2f99d4a7cdbc35d7c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintDocumentFactory(ptr: Pointer?): WithDefault =
        IPrintDocumentFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintDocumentFactory {
      val address = segment.toRawLongValue()
      return makeIPrintDocumentFactory(Pointer(address))
    }

    public override fun toNative(obj: IPrintDocumentFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__242049761_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintDocumentFactory): Array<IPrintDocumentFactory?> =
        (elements as
        Array<IPrintDocumentFactory?>).castToImpl<IPrintDocumentFactory,IPrintDocumentFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintDocumentFactory?> =
        arrayOfNulls<IPrintDocumentFactory_Impl>(size) as Array<IPrintDocumentFactory?>
  }
}
