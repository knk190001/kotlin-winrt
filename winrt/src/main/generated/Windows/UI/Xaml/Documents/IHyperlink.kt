package Windows.UI.Xaml.Documents

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHyperlink.ABI::class)
@Signature("{0fe2363b-14e9-4152-9e58-5aea5b21f08d}")
@Guid("0fe2363b14e941529e585aea5b21f08d")
@WinRTInterface("0fe2363b14e941529e585aea5b21f08d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHyperlink.ByReference::class)
public interface IHyperlink : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NavigateUri(): Uri?

  @InterfaceMethod(1)
  public fun put_NavigateUri(value: Uri?): Unit

  @InterfaceMethod(2)
  public fun add_Click(handler: TypedEventHandler<Hyperlink?, HyperlinkClickEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Click(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHyperlink> {
    public override fun getValue() = ABI.makeIHyperlink(pointer.getPointer(0))

    public fun setValue(value: IHyperlink_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHyperlink {
    public val __1909591870_Ptr: Pointer?

    public val _1909591870_VtblPtr: Pointer?
      get() = __1909591870_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NavigateUri(): Uri? {
      val fnPtr = _1909591870_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1909591870_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_NavigateUri(value: Uri?): Unit {
      val fnPtr = _1909591870_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1909591870_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_Click(handler: TypedEventHandler<Hyperlink?,
        HyperlinkClickEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1909591870_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1909591870_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Click(token: EventRegistrationToken?): Unit {
      val fnPtr = _1909591870_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1909591870_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHyperlink_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1909591870_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHyperlink, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0fe2363b14e941529e585aea5b21f08d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHyperlink(ptr: Pointer?): WithDefault = IHyperlink_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHyperlink {
      val address = segment.toRawLongValue()
      return makeIHyperlink(Pointer(address))
    }

    public override fun toNative(obj: IHyperlink): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1909591870_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHyperlink): Array<IHyperlink?> = (elements as
        Array<IHyperlink?>).castToImpl<IHyperlink,IHyperlink_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHyperlink?> = arrayOfNulls<IHyperlink_Impl>(size)
        as Array<IHyperlink?>
  }
}
