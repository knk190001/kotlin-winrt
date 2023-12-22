package Windows.ApplicationModel.SocialInfo

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

@ABIMarker(ISocialFeedContent.ABI::class)
@Signature("{a234e429-3e39-494d-a37c-f462a2494514}")
@Guid("a234e4293e39494da37cf462a2494514")
@WinRTInterface("a234e4293e39494da37cf462a2494514")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISocialFeedContent.ByReference::class)
public interface ISocialFeedContent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Title(): String?

  @InterfaceMethod(1)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Message(): String?

  @InterfaceMethod(3)
  public fun put_Message(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_TargetUri(): Uri?

  @InterfaceMethod(5)
  public fun put_TargetUri(value: Uri?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISocialFeedContent> {
    public override fun getValue() = ABI.makeISocialFeedContent(pointer.getPointer(0))

    public fun setValue(value: ISocialFeedContent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISocialFeedContent {
    public val __88817866_Ptr: Pointer?

    public val _88817866_VtblPtr: Pointer?
      get() = __88817866_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): String? {
      val fnPtr = _88817866_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__88817866_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _88817866_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__88817866_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Message(): String? {
      val fnPtr = _88817866_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__88817866_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Message(value: String?): Unit {
      val fnPtr = _88817866_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__88817866_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TargetUri(): Uri? {
      val fnPtr = _88817866_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__88817866_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_TargetUri(value: Uri?): Unit {
      val fnPtr = _88817866_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__88817866_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISocialFeedContent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __88817866_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISocialFeedContent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a234e4293e39494da37cf462a2494514")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISocialFeedContent(ptr: Pointer?): WithDefault = ISocialFeedContent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISocialFeedContent {
      val address = segment.toRawLongValue()
      return makeISocialFeedContent(Pointer(address))
    }

    public override fun toNative(obj: ISocialFeedContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__88817866_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISocialFeedContent): Array<ISocialFeedContent?> =
        (elements as
        Array<ISocialFeedContent?>).castToImpl<ISocialFeedContent,ISocialFeedContent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISocialFeedContent?> =
        arrayOfNulls<ISocialFeedContent_Impl>(size) as Array<ISocialFeedContent?>
  }
}
