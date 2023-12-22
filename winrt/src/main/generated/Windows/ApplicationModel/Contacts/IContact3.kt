package Windows.ApplicationModel.Contacts

import Windows.ApplicationModel.Contacts.IContact2.ABI.IID
import Windows.Foundation.DateTime
import Windows.Storage.Streams.IRandomAccessStreamReference
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContact3.ABI::class)
@Signature("{48201e67-e08e-42a4-b561-41d08ca9575d}")
@Guid("48201e67e08e42a4b56141d08ca9575d")
@WinRTInterface("48201e67e08e42a4b56141d08ca9575d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContact3.ByReference::class)
public interface IContact3 : NativeMapped, IWinRTInterface, IContact2, IContact {
  @InterfaceMethod(0)
  public fun get_ContactListId(): String?

  @InterfaceMethod(1)
  public fun get_DisplayPictureUserUpdateTime(): DateTime?

  @InterfaceMethod(2)
  public fun put_DisplayPictureUserUpdateTime(value: DateTime?): Unit

  @InterfaceMethod(3)
  public fun get_IsMe(): Boolean

  @InterfaceMethod(4)
  public fun get_AggregateId(): String?

  @InterfaceMethod(5)
  public fun get_RemoteId(): String?

  @InterfaceMethod(6)
  public fun put_RemoteId(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_RingToneToken(): String?

  @InterfaceMethod(8)
  public fun put_RingToneToken(value: String?): Unit

  @InterfaceMethod(9)
  public fun get_IsDisplayPictureManuallySet(): Boolean

  @InterfaceMethod(10)
  public fun get_LargeDisplayPicture(): IRandomAccessStreamReference?

  @InterfaceMethod(11)
  public fun get_SmallDisplayPicture(): IRandomAccessStreamReference?

  @InterfaceMethod(12)
  public fun get_SourceDisplayPicture(): IRandomAccessStreamReference?

  @InterfaceMethod(13)
  public fun put_SourceDisplayPicture(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(14)
  public fun get_TextToneToken(): String?

  @InterfaceMethod(15)
  public fun put_TextToneToken(value: String?): Unit

  @InterfaceMethod(16)
  public fun get_IsAggregate(): Boolean

  @InterfaceMethod(17)
  public fun get_FullName(): String?

  @InterfaceMethod(18)
  public fun get_DisplayNameOverride(): String?

  @InterfaceMethod(19)
  public fun put_DisplayNameOverride(value: String?): Unit

  @InterfaceMethod(20)
  public fun get_Nickname(): String?

  @InterfaceMethod(21)
  public fun put_Nickname(value: String?): Unit

  @InterfaceMethod(22)
  public fun get_SortName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContact3> {
    public override fun getValue() = ABI.makeIContact3(pointer.getPointer(0))

    public fun setValue(value: IContact3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContact3, IContact2.WithDefault, IContact.WithDefault {
    public val __1656514305_Ptr: Pointer?

    public val _1656514305_VtblPtr: Pointer?
      get() = __1656514305_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactListId(): String? {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayPictureUserUpdateTime(): DateTime? {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_DisplayPictureUserUpdateTime(value: DateTime?): Unit {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsMe(): Boolean {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_AggregateId(): String? {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_RemoteId(): String? {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_RemoteId(value: String?): Unit {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_RingToneToken(): String? {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_RingToneToken(value: String?): Unit {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_IsDisplayPictureManuallySet(): Boolean {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_LargeDisplayPicture(): IRandomAccessStreamReference? {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_SmallDisplayPicture(): IRandomAccessStreamReference? {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_SourceDisplayPicture(): IRandomAccessStreamReference? {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_SourceDisplayPicture(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_TextToneToken(): String? {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_TextToneToken(value: String?): Unit {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_IsAggregate(): Boolean {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun get_FullName(): String? {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_DisplayNameOverride(): String? {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_DisplayNameOverride(value: String?): Unit {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_Nickname(): String? {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_Nickname(value: String?): Unit {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_SortName(): String? {
      val fnPtr = _1656514305_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1656514305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IContact3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IContact2, IContact {
    public override val __1656514306_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1656514305_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1161814604_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IContact.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1656514305_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1656514305_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContact3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("48201e67e08e42a4b56141d08ca9575d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContact3(ptr: Pointer?): WithDefault = IContact3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContact3 {
      val address = segment.toRawLongValue()
      return makeIContact3(Pointer(address))
    }

    public override fun toNative(obj: IContact3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1656514305_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContact3): Array<IContact3?> = (elements as
        Array<IContact3?>).castToImpl<IContact3,IContact3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContact3?> = arrayOfNulls<IContact3_Impl>(size)
        as Array<IContact3?>
  }
}
