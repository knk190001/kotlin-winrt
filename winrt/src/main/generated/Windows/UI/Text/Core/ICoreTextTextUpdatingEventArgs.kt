package Windows.UI.Text.Core

import Windows.Foundation.Deferral
import Windows.Globalization.Language
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreTextTextUpdatingEventArgs.ABI::class)
@Signature("{eea7918d-cc2b-4f03-8ff6-02fd217db450}")
@Guid("eea7918dcc2b4f038ff602fd217db450")
@WinRTInterface("eea7918dcc2b4f038ff602fd217db450")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTextTextUpdatingEventArgs.ByReference::class)
public interface ICoreTextTextUpdatingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Range(): CoreTextRange?

  @InterfaceMethod(1)
  public fun get_Text(): String?

  @InterfaceMethod(2)
  public fun get_NewSelection(): CoreTextRange?

  @InterfaceMethod(3)
  public fun get_InputLanguage(): Language?

  @InterfaceMethod(4)
  public fun get_Result(): CoreTextTextUpdatingResult?

  @InterfaceMethod(5)
  public fun put_Result(value: CoreTextTextUpdatingResult?): Unit

  @InterfaceMethod(6)
  public fun get_IsCanceled(): Boolean

  @InterfaceMethod(7)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTextTextUpdatingEventArgs> {
    public override fun getValue() = ABI.makeICoreTextTextUpdatingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreTextTextUpdatingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTextTextUpdatingEventArgs {
    public val __1822825792_Ptr: Pointer?

    public val _1822825792_VtblPtr: Pointer?
      get() = __1822825792_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Range(): CoreTextRange? {
      val fnPtr = _1822825792_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextRange>()
      val hr = fn.invokeHR(arrayOf(__1822825792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextRange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Text(): String? {
      val fnPtr = _1822825792_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1822825792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NewSelection(): CoreTextRange? {
      val fnPtr = _1822825792_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextRange>()
      val hr = fn.invokeHR(arrayOf(__1822825792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextRange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_InputLanguage(): Language? {
      val fnPtr = _1822825792_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Language>()
      val hr = fn.invokeHR(arrayOf(__1822825792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Language>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Result(): CoreTextTextUpdatingResult? {
      val fnPtr = _1822825792_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextTextUpdatingResult>()
      val hr = fn.invokeHR(arrayOf(__1822825792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextTextUpdatingResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Result(value: CoreTextTextUpdatingResult?): Unit {
      val fnPtr = _1822825792_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1822825792_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsCanceled(): Boolean {
      val fnPtr = _1822825792_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1822825792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1822825792_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1822825792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICoreTextTextUpdatingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1822825792_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTextTextUpdatingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eea7918dcc2b4f038ff602fd217db450")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTextTextUpdatingEventArgs(ptr: Pointer?): WithDefault =
        ICoreTextTextUpdatingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTextTextUpdatingEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreTextTextUpdatingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreTextTextUpdatingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1822825792_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTextTextUpdatingEventArgs):
        Array<ICoreTextTextUpdatingEventArgs?> = (elements as
        Array<ICoreTextTextUpdatingEventArgs?>).castToImpl<ICoreTextTextUpdatingEventArgs,ICoreTextTextUpdatingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTextTextUpdatingEventArgs?> =
        arrayOfNulls<ICoreTextTextUpdatingEventArgs_Impl>(size) as
        Array<ICoreTextTextUpdatingEventArgs?>
  }
}
