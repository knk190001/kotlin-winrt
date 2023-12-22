package Windows.UI.Xaml.Hosting

import Windows.UI.Xaml.ResourceDictionary
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

@ABIMarker(IXamlUIPresenterHost3.ABI::class)
@Signature("{b14292bf-7320-41bb-9f26-4d6fd34db45a}")
@Guid("b14292bf732041bb9f264d6fd34db45a")
@WinRTInterface("b14292bf732041bb9f264d6fd34db45a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlUIPresenterHost3.ByReference::class)
public interface IXamlUIPresenterHost3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ResolveDictionaryResource(
    dictionary: ResourceDictionary?,
    dictionaryKey: IUnknown?,
    suggestedValue: IUnknown?
  ): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlUIPresenterHost3> {
    public override fun getValue() = ABI.makeIXamlUIPresenterHost3(pointer.getPointer(0))

    public fun setValue(value: IXamlUIPresenterHost3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlUIPresenterHost3 {
    public val __815183259_Ptr: Pointer?

    public val _815183259_VtblPtr: Pointer?
      get() = __815183259_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ResolveDictionaryResource(
      dictionary: ResourceDictionary?,
      dictionaryKey: IUnknown?,
      suggestedValue: IUnknown?
    ): IUnknown? {
      val fnPtr = _815183259_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__815183259_Ptr, marshalToNative(dictionary),
          marshalToNative(dictionaryKey), marshalToNative(suggestedValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IXamlUIPresenterHost3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __815183259_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlUIPresenterHost3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b14292bf732041bb9f264d6fd34db45a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlUIPresenterHost3(ptr: Pointer?): WithDefault =
        IXamlUIPresenterHost3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlUIPresenterHost3 {
      val address = segment.toRawLongValue()
      return makeIXamlUIPresenterHost3(Pointer(address))
    }

    public override fun toNative(obj: IXamlUIPresenterHost3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__815183259_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlUIPresenterHost3): Array<IXamlUIPresenterHost3?> =
        (elements as
        Array<IXamlUIPresenterHost3?>).castToImpl<IXamlUIPresenterHost3,IXamlUIPresenterHost3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlUIPresenterHost3?> =
        arrayOfNulls<IXamlUIPresenterHost3_Impl>(size) as Array<IXamlUIPresenterHost3?>
  }
}
