package Windows.Devices.Printers

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

@ABIMarker(IIppTextWithLanguage.ABI::class)
@Signature("{326447a6-5149-5936-90e8-0c736036bf77}")
@Guid("326447a65149593690e80c736036bf77")
@WinRTInterface("326447a65149593690e80c736036bf77")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIppTextWithLanguage.ByReference::class)
public interface IIppTextWithLanguage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Language(): String?

  @InterfaceMethod(1)
  public fun get_Value(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIppTextWithLanguage> {
    public override fun getValue() = ABI.makeIIppTextWithLanguage(pointer.getPointer(0))

    public fun setValue(value: IIppTextWithLanguage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIppTextWithLanguage {
    public val __1087097664_Ptr: Pointer?

    public val _1087097664_VtblPtr: Pointer?
      get() = __1087097664_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Language(): String? {
      val fnPtr = _1087097664_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1087097664_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): String? {
      val fnPtr = _1087097664_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1087097664_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IIppTextWithLanguage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1087097664_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIppTextWithLanguage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("326447a65149593690e80c736036bf77")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIppTextWithLanguage(ptr: Pointer?): WithDefault = IIppTextWithLanguage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIppTextWithLanguage {
      val address = segment.toRawLongValue()
      return makeIIppTextWithLanguage(Pointer(address))
    }

    public override fun toNative(obj: IIppTextWithLanguage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1087097664_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIppTextWithLanguage): Array<IIppTextWithLanguage?> =
        (elements as
        Array<IIppTextWithLanguage?>).castToImpl<IIppTextWithLanguage,IIppTextWithLanguage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIppTextWithLanguage?> =
        arrayOfNulls<IIppTextWithLanguage_Impl>(size) as Array<IIppTextWithLanguage?>
  }
}
