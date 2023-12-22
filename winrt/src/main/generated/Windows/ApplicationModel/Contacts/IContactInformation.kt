package Windows.ApplicationModel.Contacts

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStreamWithContentType
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

@ABIMarker(IContactInformation.ABI::class)
@Signature("{275eb6d4-6a2e-4278-a914-e460d5f088f6}")
@Guid("275eb6d46a2e4278a914e460d5f088f6")
@WinRTInterface("275eb6d46a2e4278a914e460d5f088f6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactInformation.ByReference::class)
public interface IContactInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun GetThumbnailAsync(): IAsyncOperation<IRandomAccessStreamWithContentType?>?

  @InterfaceMethod(2)
  public fun get_Emails(): IVectorView<ContactField?>?

  @InterfaceMethod(3)
  public fun get_PhoneNumbers(): IVectorView<ContactField?>?

  @InterfaceMethod(4)
  public fun get_Locations(): IVectorView<ContactLocationField?>?

  @InterfaceMethod(5)
  public fun get_InstantMessages(): IVectorView<ContactInstantMessageField?>?

  @InterfaceMethod(6)
  public fun get_CustomFields(): IVectorView<ContactField?>?

  @InterfaceMethod(7)
  public fun QueryCustomFields(customName: String?): IVectorView<ContactField?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactInformation> {
    public override fun getValue() = ABI.makeIContactInformation(pointer.getPointer(0))

    public fun setValue(value: IContactInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactInformation {
    public val __1856251608_Ptr: Pointer?

    public val _1856251608_VtblPtr: Pointer?
      get() = __1856251608_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1856251608_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1856251608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetThumbnailAsync(): IAsyncOperation<IRandomAccessStreamWithContentType?>? {
      val fnPtr = _1856251608_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStreamWithContentType?>>()
      val hr = fn.invokeHR(arrayOf(__1856251608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IRandomAccessStreamWithContentType?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Emails(): IVectorView<ContactField?>? {
      val fnPtr = _1856251608_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ContactField?>>()
      val hr = fn.invokeHR(arrayOf(__1856251608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ContactField?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PhoneNumbers(): IVectorView<ContactField?>? {
      val fnPtr = _1856251608_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ContactField?>>()
      val hr = fn.invokeHR(arrayOf(__1856251608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ContactField?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Locations(): IVectorView<ContactLocationField?>? {
      val fnPtr = _1856251608_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ContactLocationField?>>()
      val hr = fn.invokeHR(arrayOf(__1856251608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ContactLocationField?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_InstantMessages(): IVectorView<ContactInstantMessageField?>? {
      val fnPtr = _1856251608_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ContactInstantMessageField?>>()
      val hr = fn.invokeHR(arrayOf(__1856251608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<ContactInstantMessageField?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_CustomFields(): IVectorView<ContactField?>? {
      val fnPtr = _1856251608_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ContactField?>>()
      val hr = fn.invokeHR(arrayOf(__1856251608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ContactField?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun QueryCustomFields(customName: String?): IVectorView<ContactField?>? {
      val fnPtr = _1856251608_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ContactField?>>()
      val hr = fn.invokeHR(arrayOf(__1856251608_Ptr, marshalToNative(customName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ContactField?>>(result.getValue())
      return resultValue
    }
  }

  public class IContactInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1856251608_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("275eb6d46a2e4278a914e460d5f088f6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactInformation(ptr: Pointer?): WithDefault = IContactInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactInformation {
      val address = segment.toRawLongValue()
      return makeIContactInformation(Pointer(address))
    }

    public override fun toNative(obj: IContactInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1856251608_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactInformation): Array<IContactInformation?> =
        (elements as
        Array<IContactInformation?>).castToImpl<IContactInformation,IContactInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactInformation?> =
        arrayOfNulls<IContactInformation_Impl>(size) as Array<IContactInformation?>
  }
}
