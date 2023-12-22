package Windows.ApplicationModel.DataTransfer

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHtmlFormatHelperStatics.ABI::class)
@Signature("{e22e7749-dd70-446f-aefc-61cee59f655e}")
@Guid("e22e7749dd70446faefc61cee59f655e")
@WinRTInterface("e22e7749dd70446faefc61cee59f655e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHtmlFormatHelperStatics.ByReference::class)
public interface IHtmlFormatHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetStaticFragment(htmlFormat: String?): String?

  @InterfaceMethod(1)
  public fun CreateHtmlFormat(htmlFragment: String?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHtmlFormatHelperStatics> {
    public override fun getValue() = ABI.makeIHtmlFormatHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IHtmlFormatHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHtmlFormatHelperStatics {
    public val __775842869_Ptr: Pointer?

    public val _775842869_VtblPtr: Pointer?
      get() = __775842869_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetStaticFragment(htmlFormat: String?): String? {
      val fnPtr = _775842869_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__775842869_Ptr, marshalToNative(htmlFormat), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateHtmlFormat(htmlFragment: String?): String? {
      val fnPtr = _775842869_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__775842869_Ptr, marshalToNative(htmlFragment), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IHtmlFormatHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __775842869_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHtmlFormatHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e22e7749dd70446faefc61cee59f655e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHtmlFormatHelperStatics(ptr: Pointer?): WithDefault =
        IHtmlFormatHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHtmlFormatHelperStatics {
      val address = segment.toRawLongValue()
      return makeIHtmlFormatHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IHtmlFormatHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__775842869_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHtmlFormatHelperStatics):
        Array<IHtmlFormatHelperStatics?> = (elements as
        Array<IHtmlFormatHelperStatics?>).castToImpl<IHtmlFormatHelperStatics,IHtmlFormatHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHtmlFormatHelperStatics?> =
        arrayOfNulls<IHtmlFormatHelperStatics_Impl>(size) as Array<IHtmlFormatHelperStatics?>
  }
}
