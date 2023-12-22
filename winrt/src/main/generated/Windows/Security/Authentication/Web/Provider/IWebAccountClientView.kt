package Windows.Security.Authentication.Web.Provider

import Windows.Foundation.Uri
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

@ABIMarker(IWebAccountClientView.ABI::class)
@Signature("{e7bd66ba-0bc7-4c66-bfd4-65d3082cbca8}")
@Guid("e7bd66ba0bc74c66bfd465d3082cbca8")
@WinRTInterface("e7bd66ba0bc74c66bfd465d3082cbca8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountClientView.ByReference::class)
public interface IWebAccountClientView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ApplicationCallbackUri(): Uri?

  @InterfaceMethod(1)
  public fun get_Type(): WebAccountClientViewType?

  @InterfaceMethod(2)
  public fun get_AccountPairwiseId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountClientView> {
    public override fun getValue() = ABI.makeIWebAccountClientView(pointer.getPointer(0))

    public fun setValue(value: IWebAccountClientView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountClientView {
    public val __2041313428_Ptr: Pointer?

    public val _2041313428_VtblPtr: Pointer?
      get() = __2041313428_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ApplicationCallbackUri(): Uri? {
      val fnPtr = _2041313428_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__2041313428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Type(): WebAccountClientViewType? {
      val fnPtr = _2041313428_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccountClientViewType>()
      val hr = fn.invokeHR(arrayOf(__2041313428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccountClientViewType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AccountPairwiseId(): String? {
      val fnPtr = _2041313428_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2041313428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountClientView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2041313428_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountClientView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e7bd66ba0bc74c66bfd465d3082cbca8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountClientView(ptr: Pointer?): WithDefault =
        IWebAccountClientView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountClientView {
      val address = segment.toRawLongValue()
      return makeIWebAccountClientView(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountClientView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2041313428_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountClientView): Array<IWebAccountClientView?> =
        (elements as
        Array<IWebAccountClientView?>).castToImpl<IWebAccountClientView,IWebAccountClientView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountClientView?> =
        arrayOfNulls<IWebAccountClientView_Impl>(size) as Array<IWebAccountClientView?>
  }
}
