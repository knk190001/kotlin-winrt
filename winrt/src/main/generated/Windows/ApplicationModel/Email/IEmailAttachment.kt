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

@ABIMarker(IEmailAttachment.ABI::class)
@Signature("{f353caf9-57c8-4adb-b992-60fceb584f54}")
@Guid("f353caf957c84adbb99260fceb584f54")
@WinRTInterface("f353caf957c84adbb99260fceb584f54")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailAttachment.ByReference::class)
public interface IEmailAttachment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FileName(): String?

  @InterfaceMethod(1)
  public fun put_FileName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Data(): IRandomAccessStreamReference?

  @InterfaceMethod(3)
  public fun put_Data(value: IRandomAccessStreamReference?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailAttachment> {
    public override fun getValue() = ABI.makeIEmailAttachment(pointer.getPointer(0))

    public fun setValue(value: IEmailAttachment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailAttachment {
    public val __589696152_Ptr: Pointer?

    public val _589696152_VtblPtr: Pointer?
      get() = __589696152_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FileName(): String? {
      val fnPtr = _589696152_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__589696152_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_FileName(value: String?): Unit {
      val fnPtr = _589696152_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__589696152_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Data(): IRandomAccessStreamReference? {
      val fnPtr = _589696152_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__589696152_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Data(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _589696152_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__589696152_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEmailAttachment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __589696152_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailAttachment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f353caf957c84adbb99260fceb584f54")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailAttachment(ptr: Pointer?): WithDefault = IEmailAttachment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailAttachment {
      val address = segment.toRawLongValue()
      return makeIEmailAttachment(Pointer(address))
    }

    public override fun toNative(obj: IEmailAttachment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__589696152_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailAttachment): Array<IEmailAttachment?> = (elements as
        Array<IEmailAttachment?>).castToImpl<IEmailAttachment,IEmailAttachment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailAttachment?> =
        arrayOfNulls<IEmailAttachment_Impl>(size) as Array<IEmailAttachment?>
  }
}
