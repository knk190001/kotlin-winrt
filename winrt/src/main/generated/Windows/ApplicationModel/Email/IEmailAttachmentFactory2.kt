package Windows.ApplicationModel.Email

import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(IEmailAttachmentFactory2.ABI::class)
@Signature("{23259435-51f9-427d-adcd-241023c8cfb7}")
@Guid("2325943551f9427dadcd241023c8cfb7")
@WinRTInterface("2325943551f9427dadcd241023c8cfb7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailAttachmentFactory2.ByReference::class)
public interface IEmailAttachmentFactory2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    fileName: String?,
    `data`: IRandomAccessStreamReference?,
    mimeType: String?
  ): EmailAttachment?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailAttachmentFactory2> {
    public override fun getValue() = ABI.makeIEmailAttachmentFactory2(pointer.getPointer(0))

    public fun setValue(value: IEmailAttachmentFactory2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailAttachmentFactory2 {
    public val __1197039600_Ptr: Pointer?

    public val _1197039600_VtblPtr: Pointer?
      get() = __1197039600_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      fileName: String?,
      `data`: IRandomAccessStreamReference?,
      mimeType: String?
    ): EmailAttachment? {
      val fnPtr = _1197039600_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailAttachment>()
      val hr = fn.invokeHR(arrayOf(__1197039600_Ptr, marshalToNative(fileName),
          marshalToNative(data), marshalToNative(mimeType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailAttachment>(result.getValue())
      return resultValue
    }
  }

  public class IEmailAttachmentFactory2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1197039600_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailAttachmentFactory2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2325943551f9427dadcd241023c8cfb7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailAttachmentFactory2(ptr: Pointer?): WithDefault =
        IEmailAttachmentFactory2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailAttachmentFactory2 {
      val address = segment.toRawLongValue()
      return makeIEmailAttachmentFactory2(Pointer(address))
    }

    public override fun toNative(obj: IEmailAttachmentFactory2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1197039600_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailAttachmentFactory2):
        Array<IEmailAttachmentFactory2?> = (elements as
        Array<IEmailAttachmentFactory2?>).castToImpl<IEmailAttachmentFactory2,IEmailAttachmentFactory2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailAttachmentFactory2?> =
        arrayOfNulls<IEmailAttachmentFactory2_Impl>(size) as Array<IEmailAttachmentFactory2?>
  }
}
