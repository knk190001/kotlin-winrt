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

@ABIMarker(ISplitButtonFactory.ABI::class)
@Signature("{07510092-2612-55e7-981c-a536ddd4570e}")
@Guid("07510092261255e7981ca536ddd4570e")
@WinRTInterface("07510092261255e7981ca536ddd4570e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitButtonFactory.ByReference::class)
public interface ISplitButtonFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): SplitButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplitButtonFactory> {
    public override fun getValue() = ABI.makeISplitButtonFactory(pointer.getPointer(0))

    public fun setValue(value: ISplitButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitButtonFactory {
    public val __241992059_Ptr: Pointer?

    public val _241992059_VtblPtr: Pointer?
      get() = __241992059_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        SplitButton? {
      val fnPtr = _241992059_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SplitButton>()
      val hr = fn.invokeHR(arrayOf(__241992059_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SplitButton>(result.getValue())
      return resultValue
    }
  }

  public class ISplitButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __241992059_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("07510092261255e7981ca536ddd4570e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitButtonFactory(ptr: Pointer?): WithDefault = ISplitButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitButtonFactory {
      val address = segment.toRawLongValue()
      return makeISplitButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: ISplitButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__241992059_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitButtonFactory): Array<ISplitButtonFactory?> =
        (elements as
        Array<ISplitButtonFactory?>).castToImpl<ISplitButtonFactory,ISplitButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitButtonFactory?> =
        arrayOfNulls<ISplitButtonFactory_Impl>(size) as Array<ISplitButtonFactory?>
  }
}
