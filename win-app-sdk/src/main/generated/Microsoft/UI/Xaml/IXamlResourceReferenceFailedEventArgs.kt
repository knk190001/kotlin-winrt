package Microsoft.UI.Xaml

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

@ABIMarker(IXamlResourceReferenceFailedEventArgs.ABI::class)
@Signature("{1b175ee6-d08b-50ff-8f89-a1ff27edef66}")
@Guid("1b175ee6d08b50ff8f89a1ff27edef66")
@WinRTInterface("1b175ee6d08b50ff8f89a1ff27edef66")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlResourceReferenceFailedEventArgs.ByReference::class)
public interface IXamlResourceReferenceFailedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Message(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlResourceReferenceFailedEventArgs> {
    public override fun getValue() =
        ABI.makeIXamlResourceReferenceFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IXamlResourceReferenceFailedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlResourceReferenceFailedEventArgs {
    public val __749216404_Ptr: Pointer?

    public val _749216404_VtblPtr: Pointer?
      get() = __749216404_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Message(): String? {
      val fnPtr = _749216404_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__749216404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IXamlResourceReferenceFailedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __749216404_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlResourceReferenceFailedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b175ee6d08b50ff8f89a1ff27edef66")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlResourceReferenceFailedEventArgs(ptr: Pointer?): WithDefault =
        IXamlResourceReferenceFailedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlResourceReferenceFailedEventArgs {
      val address = segment.toRawLongValue()
      return makeIXamlResourceReferenceFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IXamlResourceReferenceFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__749216404_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlResourceReferenceFailedEventArgs):
        Array<IXamlResourceReferenceFailedEventArgs?> = (elements as
        Array<IXamlResourceReferenceFailedEventArgs?>).castToImpl<IXamlResourceReferenceFailedEventArgs,IXamlResourceReferenceFailedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlResourceReferenceFailedEventArgs?> =
        arrayOfNulls<IXamlResourceReferenceFailedEventArgs_Impl>(size) as
        Array<IXamlResourceReferenceFailedEventArgs?>
  }
}
