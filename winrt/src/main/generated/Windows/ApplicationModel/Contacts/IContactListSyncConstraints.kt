package Windows.ApplicationModel.Contacts

import Windows.Foundation.IReference
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

@ABIMarker(IContactListSyncConstraints.ABI::class)
@Signature("{b2b0bf01-3062-4e2e-969d-018d1987f314}")
@Guid("b2b0bf0130624e2e969d018d1987f314")
@WinRTInterface("b2b0bf0130624e2e969d018d1987f314")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactListSyncConstraints.ByReference::class)
public interface IContactListSyncConstraints : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanSyncDescriptions(): Boolean

  @InterfaceMethod(1)
  public fun put_CanSyncDescriptions(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_MaxHomePhoneNumbers(): IReference<Int>?

  @InterfaceMethod(3)
  public fun put_MaxHomePhoneNumbers(value: IReference<Int>?): Unit

  @InterfaceMethod(4)
  public fun get_MaxMobilePhoneNumbers(): IReference<Int>?

  @InterfaceMethod(5)
  public fun put_MaxMobilePhoneNumbers(value: IReference<Int>?): Unit

  @InterfaceMethod(6)
  public fun get_MaxWorkPhoneNumbers(): IReference<Int>?

  @InterfaceMethod(7)
  public fun put_MaxWorkPhoneNumbers(value: IReference<Int>?): Unit

  @InterfaceMethod(8)
  public fun get_MaxOtherPhoneNumbers(): IReference<Int>?

  @InterfaceMethod(9)
  public fun put_MaxOtherPhoneNumbers(value: IReference<Int>?): Unit

  @InterfaceMethod(10)
  public fun get_MaxPagerPhoneNumbers(): IReference<Int>?

  @InterfaceMethod(11)
  public fun put_MaxPagerPhoneNumbers(value: IReference<Int>?): Unit

  @InterfaceMethod(12)
  public fun get_MaxBusinessFaxPhoneNumbers(): IReference<Int>?

  @InterfaceMethod(13)
  public fun put_MaxBusinessFaxPhoneNumbers(value: IReference<Int>?): Unit

  @InterfaceMethod(14)
  public fun get_MaxHomeFaxPhoneNumbers(): IReference<Int>?

  @InterfaceMethod(15)
  public fun put_MaxHomeFaxPhoneNumbers(value: IReference<Int>?): Unit

  @InterfaceMethod(16)
  public fun get_MaxCompanyPhoneNumbers(): IReference<Int>?

  @InterfaceMethod(17)
  public fun put_MaxCompanyPhoneNumbers(value: IReference<Int>?): Unit

  @InterfaceMethod(18)
  public fun get_MaxAssistantPhoneNumbers(): IReference<Int>?

  @InterfaceMethod(19)
  public fun put_MaxAssistantPhoneNumbers(value: IReference<Int>?): Unit

  @InterfaceMethod(20)
  public fun get_MaxRadioPhoneNumbers(): IReference<Int>?

  @InterfaceMethod(21)
  public fun put_MaxRadioPhoneNumbers(value: IReference<Int>?): Unit

  @InterfaceMethod(22)
  public fun get_MaxPersonalEmailAddresses(): IReference<Int>?

  @InterfaceMethod(23)
  public fun put_MaxPersonalEmailAddresses(value: IReference<Int>?): Unit

  @InterfaceMethod(24)
  public fun get_MaxWorkEmailAddresses(): IReference<Int>?

  @InterfaceMethod(25)
  public fun put_MaxWorkEmailAddresses(value: IReference<Int>?): Unit

  @InterfaceMethod(26)
  public fun get_MaxOtherEmailAddresses(): IReference<Int>?

  @InterfaceMethod(27)
  public fun put_MaxOtherEmailAddresses(value: IReference<Int>?): Unit

  @InterfaceMethod(28)
  public fun get_MaxHomeAddresses(): IReference<Int>?

  @InterfaceMethod(29)
  public fun put_MaxHomeAddresses(value: IReference<Int>?): Unit

  @InterfaceMethod(30)
  public fun get_MaxWorkAddresses(): IReference<Int>?

  @InterfaceMethod(31)
  public fun put_MaxWorkAddresses(value: IReference<Int>?): Unit

  @InterfaceMethod(32)
  public fun get_MaxOtherAddresses(): IReference<Int>?

  @InterfaceMethod(33)
  public fun put_MaxOtherAddresses(value: IReference<Int>?): Unit

  @InterfaceMethod(34)
  public fun get_MaxBirthdayDates(): IReference<Int>?

  @InterfaceMethod(35)
  public fun put_MaxBirthdayDates(value: IReference<Int>?): Unit

  @InterfaceMethod(36)
  public fun get_MaxAnniversaryDates(): IReference<Int>?

  @InterfaceMethod(37)
  public fun put_MaxAnniversaryDates(value: IReference<Int>?): Unit

  @InterfaceMethod(38)
  public fun get_MaxOtherDates(): IReference<Int>?

  @InterfaceMethod(39)
  public fun put_MaxOtherDates(value: IReference<Int>?): Unit

  @InterfaceMethod(40)
  public fun get_MaxOtherRelationships(): IReference<Int>?

  @InterfaceMethod(41)
  public fun put_MaxOtherRelationships(value: IReference<Int>?): Unit

  @InterfaceMethod(42)
  public fun get_MaxSpouseRelationships(): IReference<Int>?

  @InterfaceMethod(43)
  public fun put_MaxSpouseRelationships(value: IReference<Int>?): Unit

  @InterfaceMethod(44)
  public fun get_MaxPartnerRelationships(): IReference<Int>?

  @InterfaceMethod(45)
  public fun put_MaxPartnerRelationships(value: IReference<Int>?): Unit

  @InterfaceMethod(46)
  public fun get_MaxSiblingRelationships(): IReference<Int>?

  @InterfaceMethod(47)
  public fun put_MaxSiblingRelationships(value: IReference<Int>?): Unit

  @InterfaceMethod(48)
  public fun get_MaxParentRelationships(): IReference<Int>?

  @InterfaceMethod(49)
  public fun put_MaxParentRelationships(value: IReference<Int>?): Unit

  @InterfaceMethod(50)
  public fun get_MaxChildRelationships(): IReference<Int>?

  @InterfaceMethod(51)
  public fun put_MaxChildRelationships(value: IReference<Int>?): Unit

  @InterfaceMethod(52)
  public fun get_MaxJobInfo(): IReference<Int>?

  @InterfaceMethod(53)
  public fun put_MaxJobInfo(value: IReference<Int>?): Unit

  @InterfaceMethod(54)
  public fun get_MaxWebsites(): IReference<Int>?

  @InterfaceMethod(55)
  public fun put_MaxWebsites(value: IReference<Int>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactListSyncConstraints> {
    public override fun getValue() = ABI.makeIContactListSyncConstraints(pointer.getPointer(0))

    public fun setValue(value: IContactListSyncConstraints_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactListSyncConstraints {
    public val __2126664137_Ptr: Pointer?

    public val _2126664137_VtblPtr: Pointer?
      get() = __2126664137_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanSyncDescriptions(): Boolean {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_CanSyncDescriptions(value: Boolean): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MaxHomePhoneNumbers(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_MaxHomePhoneNumbers(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MaxMobilePhoneNumbers(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_MaxMobilePhoneNumbers(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_MaxWorkPhoneNumbers(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_MaxWorkPhoneNumbers(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_MaxOtherPhoneNumbers(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_MaxOtherPhoneNumbers(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_MaxPagerPhoneNumbers(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_MaxPagerPhoneNumbers(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_MaxBusinessFaxPhoneNumbers(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_MaxBusinessFaxPhoneNumbers(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_MaxHomeFaxPhoneNumbers(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_MaxHomeFaxPhoneNumbers(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_MaxCompanyPhoneNumbers(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_MaxCompanyPhoneNumbers(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_MaxAssistantPhoneNumbers(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_MaxAssistantPhoneNumbers(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_MaxRadioPhoneNumbers(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_MaxRadioPhoneNumbers(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_MaxPersonalEmailAddresses(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_MaxPersonalEmailAddresses(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_MaxWorkEmailAddresses(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_MaxWorkEmailAddresses(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_MaxOtherEmailAddresses(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_MaxOtherEmailAddresses(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_MaxHomeAddresses(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_MaxHomeAddresses(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_MaxWorkAddresses(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_MaxWorkAddresses(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_MaxOtherAddresses(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun put_MaxOtherAddresses(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_MaxBirthdayDates(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun put_MaxBirthdayDates(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_MaxAnniversaryDates(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun put_MaxAnniversaryDates(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_MaxOtherDates(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun put_MaxOtherDates(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_MaxOtherRelationships(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun put_MaxOtherRelationships(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_MaxSpouseRelationships(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun put_MaxSpouseRelationships(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun get_MaxPartnerRelationships(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun put_MaxPartnerRelationships(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun get_MaxSiblingRelationships(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun put_MaxSiblingRelationships(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun get_MaxParentRelationships(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun put_MaxParentRelationships(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun get_MaxChildRelationships(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun put_MaxChildRelationships(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun get_MaxJobInfo(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun put_MaxJobInfo(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(54)
    public override fun get_MaxWebsites(): IReference<Int>? {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(55)
    public override fun put_MaxWebsites(value: IReference<Int>?): Unit {
      val fnPtr = _2126664137_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126664137_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactListSyncConstraints_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2126664137_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactListSyncConstraints, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2b0bf0130624e2e969d018d1987f314")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactListSyncConstraints(ptr: Pointer?): WithDefault =
        IContactListSyncConstraints_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactListSyncConstraints {
      val address = segment.toRawLongValue()
      return makeIContactListSyncConstraints(Pointer(address))
    }

    public override fun toNative(obj: IContactListSyncConstraints): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2126664137_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactListSyncConstraints):
        Array<IContactListSyncConstraints?> = (elements as
        Array<IContactListSyncConstraints?>).castToImpl<IContactListSyncConstraints,IContactListSyncConstraints_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactListSyncConstraints?> =
        arrayOfNulls<IContactListSyncConstraints_Impl>(size) as Array<IContactListSyncConstraints?>
  }
}
