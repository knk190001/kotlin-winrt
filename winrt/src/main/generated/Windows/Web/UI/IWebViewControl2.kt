package Windows.Web.UI

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

@ABIMarker(IWebViewControl2.ABI::class)
@Signature("{4d3c06f9-c8df-41cc-8bd5-2a947b204503}")
@Guid("4d3c06f9c8df41cc8bd52a947b204503")
@WinRTInterface("4d3c06f9c8df41cc8bd52a947b204503")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControl2.ByReference::class)
public interface IWebViewControl2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddInitializeScript(script: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControl2> {
    public override fun getValue() = ABI.makeIWebViewControl2(pointer.getPointer(0))

    public fun setValue(value: IWebViewControl2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControl2 {
    public val __2053256802_Ptr: Pointer?

    public val _2053256802_VtblPtr: Pointer?
      get() = __2053256802_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddInitializeScript(script: String?): Unit {
      val fnPtr = _2053256802_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2053256802_Ptr, marshalToNative(script),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewControl2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2053256802_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControl2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d3c06f9c8df41cc8bd52a947b204503")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControl2(ptr: Pointer?): WithDefault = IWebViewControl2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewControl2 {
      val address = segment.toRawLongValue()
      return makeIWebViewControl2(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControl2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2053256802_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControl2): Array<IWebViewControl2?> = (elements as
        Array<IWebViewControl2?>).castToImpl<IWebViewControl2,IWebViewControl2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControl2?> =
        arrayOfNulls<IWebViewControl2_Impl>(size) as Array<IWebViewControl2?>
  }
}
