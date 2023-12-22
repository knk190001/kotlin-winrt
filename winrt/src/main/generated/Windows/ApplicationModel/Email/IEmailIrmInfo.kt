package Windows.ApplicationModel.Email

import Windows.Foundation.DateTime
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEmailIrmInfo.ABI::class)
@Signature("{90f52193-b1a0-4ebd-a6b6-ddca55606e0e}")
@Guid("90f52193b1a04ebda6b6ddca55606e0e")
@WinRTInterface("90f52193b1a04ebda6b6ddca55606e0e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailIrmInfo.ByReference::class)
public interface IEmailIrmInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanEdit(): Boolean

  @InterfaceMethod(1)
  public fun put_CanEdit(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_CanExtractData(): Boolean

  @InterfaceMethod(3)
  public fun put_CanExtractData(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_CanForward(): Boolean

  @InterfaceMethod(5)
  public fun put_CanForward(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_CanModifyRecipientsOnResponse(): Boolean

  @InterfaceMethod(7)
  public fun put_CanModifyRecipientsOnResponse(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_CanPrintData(): Boolean

  @InterfaceMethod(9)
  public fun put_CanPrintData(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_CanRemoveIrmOnResponse(): Boolean

  @InterfaceMethod(11)
  public fun put_CanRemoveIrmOnResponse(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_CanReply(): Boolean

  @InterfaceMethod(13)
  public fun put_CanReply(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_CanReplyAll(): Boolean

  @InterfaceMethod(15)
  public fun put_CanReplyAll(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_ExpirationDate(): DateTime?

  @InterfaceMethod(17)
  public fun put_ExpirationDate(value: DateTime?): Unit

  @InterfaceMethod(18)
  public fun get_IsIrmOriginator(): Boolean

  @InterfaceMethod(19)
  public fun put_IsIrmOriginator(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun get_IsProgramaticAccessAllowed(): Boolean

  @InterfaceMethod(21)
  public fun put_IsProgramaticAccessAllowed(value: Boolean): Unit

  @InterfaceMethod(22)
  public fun get_Template(): EmailIrmTemplate?

  @InterfaceMethod(23)
  public fun put_Template(value: EmailIrmTemplate?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEmailIrmInfo>
      {
    public override fun getValue() = ABI.makeIEmailIrmInfo(pointer.getPointer(0))

    public fun setValue(value: IEmailIrmInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailIrmInfo {
    public val __1069396749_Ptr: Pointer?

    public val _1069396749_VtblPtr: Pointer?
      get() = __1069396749_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanEdit(): Boolean {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_CanEdit(value: Boolean): Unit {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CanExtractData(): Boolean {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_CanExtractData(value: Boolean): Unit {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CanForward(): Boolean {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_CanForward(value: Boolean): Unit {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CanModifyRecipientsOnResponse(): Boolean {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_CanModifyRecipientsOnResponse(value: Boolean): Unit {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_CanPrintData(): Boolean {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_CanPrintData(value: Boolean): Unit {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_CanRemoveIrmOnResponse(): Boolean {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_CanRemoveIrmOnResponse(value: Boolean): Unit {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_CanReply(): Boolean {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_CanReply(value: Boolean): Unit {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_CanReplyAll(): Boolean {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_CanReplyAll(value: Boolean): Unit {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ExpirationDate(): DateTime? {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_ExpirationDate(value: DateTime?): Unit {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_IsIrmOriginator(): Boolean {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_IsIrmOriginator(value: Boolean): Unit {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_IsProgramaticAccessAllowed(): Boolean {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_IsProgramaticAccessAllowed(value: Boolean): Unit {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_Template(): EmailIrmTemplate? {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailIrmTemplate>()
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailIrmTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_Template(value: EmailIrmTemplate?): Unit {
      val fnPtr = _1069396749_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1069396749_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEmailIrmInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1069396749_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailIrmInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90f52193b1a04ebda6b6ddca55606e0e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailIrmInfo(ptr: Pointer?): WithDefault = IEmailIrmInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailIrmInfo {
      val address = segment.toRawLongValue()
      return makeIEmailIrmInfo(Pointer(address))
    }

    public override fun toNative(obj: IEmailIrmInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1069396749_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailIrmInfo): Array<IEmailIrmInfo?> = (elements as
        Array<IEmailIrmInfo?>).castToImpl<IEmailIrmInfo,IEmailIrmInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailIrmInfo?> =
        arrayOfNulls<IEmailIrmInfo_Impl>(size) as Array<IEmailIrmInfo?>
  }
}
