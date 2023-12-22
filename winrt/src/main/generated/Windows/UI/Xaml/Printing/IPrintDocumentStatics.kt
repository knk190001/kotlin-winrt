package Windows.UI.Xaml.Printing

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IPrintDocumentStatics.ABI::class)
@Signature("{fd970a3c-b152-49e0-a6bd-6aa6477e43c7}")
@Guid("fd970a3cb15249e0a6bd6aa6477e43c7")
@WinRTInterface("fd970a3cb15249e0a6bd6aa6477e43c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintDocumentStatics.ByReference::class)
public interface IPrintDocumentStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DocumentSourceProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintDocumentStatics> {
    public override fun getValue() = ABI.makeIPrintDocumentStatics(pointer.getPointer(0))

    public fun setValue(value: IPrintDocumentStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintDocumentStatics {
    public val __1047303206_Ptr: Pointer?

    public val _1047303206_VtblPtr: Pointer?
      get() = __1047303206_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DocumentSourceProperty(): DependencyProperty? {
      val fnPtr = _1047303206_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1047303206_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPrintDocumentStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1047303206_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintDocumentStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fd970a3cb15249e0a6bd6aa6477e43c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintDocumentStatics(ptr: Pointer?): WithDefault =
        IPrintDocumentStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintDocumentStatics {
      val address = segment.toRawLongValue()
      return makeIPrintDocumentStatics(Pointer(address))
    }

    public override fun toNative(obj: IPrintDocumentStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1047303206_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintDocumentStatics): Array<IPrintDocumentStatics?> =
        (elements as
        Array<IPrintDocumentStatics?>).castToImpl<IPrintDocumentStatics,IPrintDocumentStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintDocumentStatics?> =
        arrayOfNulls<IPrintDocumentStatics_Impl>(size) as Array<IPrintDocumentStatics?>
  }
}
