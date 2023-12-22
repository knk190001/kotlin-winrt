package Windows.ApplicationModel.Chat

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IChatMessageAttachment.ABI::class)
@Signature("{c7c4fd74-bf63-58eb-508c-8b863ff16b67}")
@Guid("c7c4fd74bf6358eb508c8b863ff16b67")
@WinRTInterface("c7c4fd74bf6358eb508c8b863ff16b67")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageAttachment.ByReference::class)
public interface IChatMessageAttachment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DataStreamReference(): IRandomAccessStreamReference?

  @InterfaceMethod(1)
  public fun put_DataStreamReference(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(2)
  public fun get_GroupId(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_GroupId(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun get_MimeType(): String?

  @InterfaceMethod(5)
  public fun put_MimeType(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_Text(): String?

  @InterfaceMethod(7)
  public fun put_Text(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageAttachment> {
    public override fun getValue() = ABI.makeIChatMessageAttachment(pointer.getPointer(0))

    public fun setValue(value: IChatMessageAttachment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageAttachment {
    public val __1691112213_Ptr: Pointer?

    public val _1691112213_VtblPtr: Pointer?
      get() = __1691112213_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DataStreamReference(): IRandomAccessStreamReference? {
      val fnPtr = _1691112213_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1691112213_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DataStreamReference(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _1691112213_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691112213_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_GroupId(): WinDef.UINT {
      val fnPtr = _1691112213_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1691112213_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_GroupId(value: WinDef.UINT): Unit {
      val fnPtr = _1691112213_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691112213_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MimeType(): String? {
      val fnPtr = _1691112213_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1691112213_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_MimeType(value: String?): Unit {
      val fnPtr = _1691112213_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691112213_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Text(): String? {
      val fnPtr = _1691112213_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1691112213_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _1691112213_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691112213_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IChatMessageAttachment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1691112213_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageAttachment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c7c4fd74bf6358eb508c8b863ff16b67")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageAttachment(ptr: Pointer?): WithDefault =
        IChatMessageAttachment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageAttachment {
      val address = segment.toRawLongValue()
      return makeIChatMessageAttachment(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageAttachment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1691112213_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageAttachment): Array<IChatMessageAttachment?> =
        (elements as
        Array<IChatMessageAttachment?>).castToImpl<IChatMessageAttachment,IChatMessageAttachment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageAttachment?> =
        arrayOfNulls<IChatMessageAttachment_Impl>(size) as Array<IChatMessageAttachment?>
  }
}
