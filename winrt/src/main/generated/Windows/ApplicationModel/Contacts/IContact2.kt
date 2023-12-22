package Windows.ApplicationModel.Contacts

import Windows.ApplicationModel.Contacts.IContact.ABI.IID
import Windows.Foundation.Collections.IPropertySet
import Windows.Foundation.Collections.IVector
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IContact2.ABI::class)
@Signature("{f312f365-bb77-4c94-802d-8328cee40c08}")
@Guid("f312f365bb774c94802d8328cee40c08")
@WinRTInterface("f312f365bb774c94802d8328cee40c08")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContact2.ByReference::class)
public interface IContact2 : NativeMapped, IWinRTInterface, IContact {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun put_Id(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Notes(): String?

  @InterfaceMethod(3)
  public fun put_Notes(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Phones(): IVector<ContactPhone?>?

  @InterfaceMethod(5)
  public fun get_Emails(): IVector<ContactEmail?>?

  @InterfaceMethod(6)
  public fun get_Addresses(): IVector<ContactAddress?>?

  @InterfaceMethod(7)
  public fun get_ConnectedServiceAccounts(): IVector<ContactConnectedServiceAccount?>?

  @InterfaceMethod(8)
  public fun get_ImportantDates(): IVector<ContactDate?>?

  @InterfaceMethod(9)
  public fun get_DataSuppliers(): IVector<String?>?

  @InterfaceMethod(10)
  public fun get_JobInfo(): IVector<ContactJobInfo?>?

  @InterfaceMethod(11)
  public fun get_SignificantOthers(): IVector<ContactSignificantOther?>?

  @InterfaceMethod(12)
  public fun get_Websites(): IVector<ContactWebsite?>?

  @InterfaceMethod(13)
  public fun get_ProviderProperties(): IPropertySet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContact2> {
    public override fun getValue() = ABI.makeIContact2(pointer.getPointer(0))

    public fun setValue(value: IContact2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContact2, IContact.WithDefault {
    public val __1656514306_Ptr: Pointer?

    public val _1656514306_VtblPtr: Pointer?
      get() = __1656514306_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1656514306_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1656514306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Id(value: String?): Unit {
      val fnPtr = _1656514306_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656514306_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Notes(): String? {
      val fnPtr = _1656514306_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1656514306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Notes(value: String?): Unit {
      val fnPtr = _1656514306_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656514306_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Phones(): IVector<ContactPhone?>? {
      val fnPtr = _1656514306_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ContactPhone?>>()
      val hr = fn.invokeHR(arrayOf(__1656514306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ContactPhone?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Emails(): IVector<ContactEmail?>? {
      val fnPtr = _1656514306_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ContactEmail?>>()
      val hr = fn.invokeHR(arrayOf(__1656514306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ContactEmail?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Addresses(): IVector<ContactAddress?>? {
      val fnPtr = _1656514306_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ContactAddress?>>()
      val hr = fn.invokeHR(arrayOf(__1656514306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ContactAddress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ConnectedServiceAccounts(): IVector<ContactConnectedServiceAccount?>? {
      val fnPtr = _1656514306_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ContactConnectedServiceAccount?>>()
      val hr = fn.invokeHR(arrayOf(__1656514306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<ContactConnectedServiceAccount?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ImportantDates(): IVector<ContactDate?>? {
      val fnPtr = _1656514306_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ContactDate?>>()
      val hr = fn.invokeHR(arrayOf(__1656514306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ContactDate?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_DataSuppliers(): IVector<String?>? {
      val fnPtr = _1656514306_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1656514306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_JobInfo(): IVector<ContactJobInfo?>? {
      val fnPtr = _1656514306_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ContactJobInfo?>>()
      val hr = fn.invokeHR(arrayOf(__1656514306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ContactJobInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_SignificantOthers(): IVector<ContactSignificantOther?>? {
      val fnPtr = _1656514306_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ContactSignificantOther?>>()
      val hr = fn.invokeHR(arrayOf(__1656514306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ContactSignificantOther?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_Websites(): IVector<ContactWebsite?>? {
      val fnPtr = _1656514306_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ContactWebsite?>>()
      val hr = fn.invokeHR(arrayOf(__1656514306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ContactWebsite?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_ProviderProperties(): IPropertySet? {
      val fnPtr = _1656514306_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1656514306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }
  }

  public class IContact2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IContact {
    public override val __1161814604_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1656514306_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1656514306_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContact2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f312f365bb774c94802d8328cee40c08")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContact2(ptr: Pointer?): WithDefault = IContact2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContact2 {
      val address = segment.toRawLongValue()
      return makeIContact2(Pointer(address))
    }

    public override fun toNative(obj: IContact2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1656514306_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContact2): Array<IContact2?> = (elements as
        Array<IContact2?>).castToImpl<IContact2,IContact2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContact2?> = arrayOfNulls<IContact2_Impl>(size)
        as Array<IContact2?>
  }
}
