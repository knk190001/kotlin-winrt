package Windows.ApplicationModel.Calls

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
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

@ABIMarker(IPhoneCallHistoryEntry.ABI::class)
@Signature("{fab0e129-32a4-4b85-83d1-f90d8c23a857}")
@Guid("fab0e12932a44b8583d1f90d8c23a857")
@WinRTInterface("fab0e12932a44b8583d1f90d8c23a857")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallHistoryEntry.ByReference::class)
public interface IPhoneCallHistoryEntry : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_Address(): PhoneCallHistoryEntryAddress?

  @InterfaceMethod(2)
  public fun put_Address(value: PhoneCallHistoryEntryAddress?): Unit

  @InterfaceMethod(3)
  public fun get_Duration(): IReference<TimeSpan?>?

  @InterfaceMethod(4)
  public fun put_Duration(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(5)
  public fun get_IsCallerIdBlocked(): Boolean

  @InterfaceMethod(6)
  public fun put_IsCallerIdBlocked(value: Boolean): Unit

  @InterfaceMethod(7)
  public fun get_IsEmergency(): Boolean

  @InterfaceMethod(8)
  public fun put_IsEmergency(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun get_IsIncoming(): Boolean

  @InterfaceMethod(10)
  public fun put_IsIncoming(value: Boolean): Unit

  @InterfaceMethod(11)
  public fun get_IsMissed(): Boolean

  @InterfaceMethod(12)
  public fun put_IsMissed(value: Boolean): Unit

  @InterfaceMethod(13)
  public fun get_IsRinging(): Boolean

  @InterfaceMethod(14)
  public fun put_IsRinging(value: Boolean): Unit

  @InterfaceMethod(15)
  public fun get_IsSeen(): Boolean

  @InterfaceMethod(16)
  public fun put_IsSeen(value: Boolean): Unit

  @InterfaceMethod(17)
  public fun get_IsSuppressed(): Boolean

  @InterfaceMethod(18)
  public fun put_IsSuppressed(value: Boolean): Unit

  @InterfaceMethod(19)
  public fun get_IsVoicemail(): Boolean

  @InterfaceMethod(20)
  public fun put_IsVoicemail(value: Boolean): Unit

  @InterfaceMethod(21)
  public fun get_Media(): PhoneCallHistoryEntryMedia?

  @InterfaceMethod(22)
  public fun put_Media(value: PhoneCallHistoryEntryMedia?): Unit

  @InterfaceMethod(23)
  public fun get_OtherAppReadAccess(): PhoneCallHistoryEntryOtherAppReadAccess?

  @InterfaceMethod(24)
  public fun put_OtherAppReadAccess(value: PhoneCallHistoryEntryOtherAppReadAccess?): Unit

  @InterfaceMethod(25)
  public fun get_RemoteId(): String?

  @InterfaceMethod(26)
  public fun put_RemoteId(value: String?): Unit

  @InterfaceMethod(27)
  public fun get_SourceDisplayName(): String?

  @InterfaceMethod(28)
  public fun get_SourceId(): String?

  @InterfaceMethod(29)
  public fun put_SourceId(value: String?): Unit

  @InterfaceMethod(30)
  public fun get_SourceIdKind(): PhoneCallHistorySourceIdKind?

  @InterfaceMethod(31)
  public fun put_SourceIdKind(value: PhoneCallHistorySourceIdKind?): Unit

  @InterfaceMethod(32)
  public fun get_StartTime(): DateTime?

  @InterfaceMethod(33)
  public fun put_StartTime(value: DateTime?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallHistoryEntry> {
    public override fun getValue() = ABI.makeIPhoneCallHistoryEntry(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallHistoryEntry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallHistoryEntry {
    public val __1819305868_Ptr: Pointer?

    public val _1819305868_VtblPtr: Pointer?
      get() = __1819305868_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Address(): PhoneCallHistoryEntryAddress? {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallHistoryEntryAddress>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallHistoryEntryAddress>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Address(value: PhoneCallHistoryEntryAddress?): Unit {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Duration(): IReference<TimeSpan?>? {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Duration(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_IsCallerIdBlocked(): Boolean {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_IsCallerIdBlocked(value: Boolean): Unit {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_IsEmergency(): Boolean {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_IsEmergency(value: Boolean): Unit {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_IsIncoming(): Boolean {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_IsIncoming(value: Boolean): Unit {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_IsMissed(): Boolean {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_IsMissed(value: Boolean): Unit {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_IsRinging(): Boolean {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun put_IsRinging(value: Boolean): Unit {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_IsSeen(): Boolean {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun put_IsSeen(value: Boolean): Unit {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_IsSuppressed(): Boolean {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun put_IsSuppressed(value: Boolean): Unit {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_IsVoicemail(): Boolean {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun put_IsVoicemail(value: Boolean): Unit {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_Media(): PhoneCallHistoryEntryMedia? {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallHistoryEntryMedia>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallHistoryEntryMedia>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun put_Media(value: PhoneCallHistoryEntryMedia?): Unit {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_OtherAppReadAccess(): PhoneCallHistoryEntryOtherAppReadAccess? {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallHistoryEntryOtherAppReadAccess>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<PhoneCallHistoryEntryOtherAppReadAccess>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun put_OtherAppReadAccess(value: PhoneCallHistoryEntryOtherAppReadAccess?):
        Unit {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun get_RemoteId(): String? {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun put_RemoteId(value: String?): Unit {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_SourceDisplayName(): String? {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun get_SourceId(): String? {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_SourceId(value: String?): Unit {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_SourceIdKind(): PhoneCallHistorySourceIdKind? {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallHistorySourceIdKind>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallHistorySourceIdKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_SourceIdKind(value: PhoneCallHistorySourceIdKind?): Unit {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_StartTime(): DateTime? {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun put_StartTime(value: DateTime?): Unit {
      val fnPtr = _1819305868_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1819305868_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPhoneCallHistoryEntry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1819305868_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallHistoryEntry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fab0e12932a44b8583d1f90d8c23a857")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallHistoryEntry(ptr: Pointer?): WithDefault =
        IPhoneCallHistoryEntry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallHistoryEntry {
      val address = segment.toRawLongValue()
      return makeIPhoneCallHistoryEntry(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallHistoryEntry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1819305868_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallHistoryEntry): Array<IPhoneCallHistoryEntry?> =
        (elements as
        Array<IPhoneCallHistoryEntry?>).castToImpl<IPhoneCallHistoryEntry,IPhoneCallHistoryEntry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallHistoryEntry?> =
        arrayOfNulls<IPhoneCallHistoryEntry_Impl>(size) as Array<IPhoneCallHistoryEntry?>
  }
}
